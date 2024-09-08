package net.dao.mini_kingdoms.blocks.structure;

import net.dao.mini_kingdoms.blocks.multiblock.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashSet;
import java.util.Set;

public class KingdomStructureManager {

    // Define the maximum number of villages allowed in a chain based on size
    private static final int MAX_KINGDOM_TINY = 1;
    private static final int MAX_KINGDOM_SMALL = 1;
    private static final int MAX_KINGDOM_BELOW_AVERAGE = 1;
    private static final int MAX_KINGDOM_AVERAGE = 1;
    private static final int MAX_KINGDOM_ABOVE_AVERAGE = 1;
    private static final int MAX_KINGDOM_BIG = 1;
    private static final int MAX_KINGDOM_LARGE = 1;
    private static final int MAX_KINGDOM_HUGE = 1;
    private static final int MAX_KINGDOM_GIANT = 1;
    private static final int MAX_KINGDOM_SUPER = 1;

    // Define the forbidden blocks
    private static final Set<Class<? extends Block>> FORBIDDEN_BLOCKS = new HashSet<>();

    static {
        FORBIDDEN_BLOCKS.add(BlockBuilding.class);
        FORBIDDEN_BLOCKS.add(BlockVillage.class);
        FORBIDDEN_BLOCKS.add(BlockTown.class);
        FORBIDDEN_BLOCKS.add(BlockCity.class);
        FORBIDDEN_BLOCKS.add(BlockLargeCity.class);
        FORBIDDEN_BLOCKS.add(BlockRegionalCapital.class);
        FORBIDDEN_BLOCKS.add(BlockCapital.class);
        FORBIDDEN_BLOCKS.add(BlockKingdom.class);
    }

    public boolean canPlaceKingdom(Level world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (!(block instanceof BlockKingdom)) {
            return false;
        }

        enforceSizeAndAdjacencyRules(world, pos, state);

        boolean hasRequiredBlocks = checkAdjacentBlocks(world, pos);
        boolean validChainLength = checkChainLength(world, pos, state);

        return hasRequiredBlocks && validChainLength;
    }

    private void enforceSizeAndAdjacencyRules(Level world, BlockPos pos, BlockState state) {
        BlockPos[] adjacentPositions = {
                pos.north(), pos.south(), pos.east(), pos.west()
        };

        BlockKingdom.KingdomSize currentSize = state.getValue(BlockKingdom.SIZE);

        for (BlockPos adjacentPos : adjacentPositions) {
            BlockState adjacentState = world.getBlockState(adjacentPos);
            Block adjacentBlock = adjacentState.getBlock();

            if (adjacentBlock instanceof BlockShop) {
                continue;
            }

            if (FORBIDDEN_BLOCKS.contains(adjacentBlock.getClass())) {
                world.destroyBlock(pos, true);
                break;
            }

            if (adjacentBlock instanceof BlockKingdom) {
                BlockKingdom adjacentKingdom = (BlockKingdom) adjacentBlock;
                BlockKingdom.KingdomSize adjacentSize = adjacentState.getValue(BlockKingdom.SIZE);

                if (currentSize.compareTo(adjacentSize) < 0) {
                    world.destroyBlock(pos, true);
                    break;
                } else if (currentSize.compareTo(adjacentSize) > 0) {
                    world.destroyBlock(adjacentPos, true);
                }
            }
        }
    }

    private boolean checkAdjacentBlocks(Level world, BlockPos pos) {
        BlockPos[] adjacentPositions = {
                pos.north(), pos.south(), pos.east(), pos.west()
        };

        Set<Class<? extends Block>> adjacentBlockTypes = new HashSet<>();

        for (BlockPos adjacentPos : adjacentPositions) {
            BlockState adjacentState = world.getBlockState(adjacentPos);
            Block adjacentBlock = adjacentState.getBlock();

            if (adjacentBlock instanceof BlockBiome ||
                    adjacentBlock instanceof BlockFarm ||
                    adjacentBlock instanceof BlockMine ||
                    adjacentBlock instanceof BlockShop) {
                adjacentBlockTypes.add(adjacentBlock.getClass());
            } else if (FORBIDDEN_BLOCKS.contains(adjacentBlock.getClass())) {
                return false;
            }
        }

        return adjacentBlockTypes.contains(BlockBiome.class) &&
                adjacentBlockTypes.contains(BlockFarm.class) &&
                adjacentBlockTypes.contains(BlockMine.class) &&
                adjacentBlockTypes.contains(BlockShop.class);
    }

    private boolean checkChainLength(Level world, BlockPos pos, BlockState state) {
        BlockKingdom.KingdomSize currentSize = state.getValue(BlockKingdom.SIZE);

        int maxChainLength = getMaxChainLengthForSize(currentSize);

        BlockPos[] adjacentPositions = {
                pos.north(), pos.south(), pos.east(), pos.west()
        };

        int kingdomCount = 0;

        for (BlockPos adjacentPos : adjacentPositions) {
            BlockState adjacentState = world.getBlockState(adjacentPos);
            Block adjacentBlock = adjacentState.getBlock();
            if (adjacentBlock instanceof BlockKingdom) {
                kingdomCount++;
            }
        }

        return kingdomCount < maxChainLength;
    }

    private int getMaxChainLengthForSize(BlockKingdom.KingdomSize kingdomSize) {
        switch (kingdomSize) {
            case TINY:
                return MAX_KINGDOM_TINY;
            case SMALL:
                return MAX_KINGDOM_SMALL;
            case BELOW_AVERAGE:
                return MAX_KINGDOM_BELOW_AVERAGE;
            case AVERAGE:
                return MAX_KINGDOM_AVERAGE;
            case ABOVE_AVERAGE:
                return MAX_KINGDOM_ABOVE_AVERAGE;
            case BIG:
                return MAX_KINGDOM_BIG;
            case LARGE:
                return MAX_KINGDOM_LARGE;
            case HUGE:
                return MAX_KINGDOM_HUGE;
            case GIANT:
                return MAX_KINGDOM_GIANT;
            case SUPER:
                return MAX_KINGDOM_SUPER;
            default:
                return 0;
        }
    }
}
