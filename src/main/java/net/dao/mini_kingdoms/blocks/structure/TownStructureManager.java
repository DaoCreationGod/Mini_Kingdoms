package net.dao.mini_kingdoms.blocks.structure;

import net.dao.mini_kingdoms.blocks.multiblock.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashSet;
import java.util.Set;

public class TownStructureManager {

    // Define the maximum number of villages allowed in a chain based on size
    private static final int MAX_TOWN_TINY = 5;
    private static final int MAX_TOWN_SMALL = 7;
    private static final int MAX_TOWN_BELOW_AVERAGE = 10;
    private static final int MAX_TOWN_AVERAGE = 12;
    private static final int MAX_TOWN_ABOVE_AVERAGE = 15;
    private static final int MAX_TOWN_BIG = 17;
    private static final int MAX_TOWN_LARGE = 20;
    private static final int MAX_TOWN_HUGE = 25;
    private static final int MAX_TOWN_GIANT = 35;
    private static final int MAX_TOWN_SUPER = 50;

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

    public boolean canPlaceTown(Level world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (!(block instanceof BlockTown)) {
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

        BlockTown.TownSize currentSize = state.getValue(BlockTown.SIZE);

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

            if (adjacentBlock instanceof BlockTown) {
                BlockTown adjacentTown = (BlockTown) adjacentBlock;
                BlockTown.TownSize adjacentSize = adjacentState.getValue(BlockTown.SIZE);

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
        BlockTown.TownSize currentSize = state.getValue(BlockTown.SIZE);

        int maxChainLength = getMaxChainLengthForSize(currentSize);

        BlockPos[] adjacentPositions = {
                pos.north(), pos.south(), pos.east(), pos.west()
        };

        int townCount = 0;

        for (BlockPos adjacentPos : adjacentPositions) {
            BlockState adjacentState = world.getBlockState(adjacentPos);
            Block adjacentBlock = adjacentState.getBlock();
            if (adjacentBlock instanceof BlockTown) {
                townCount++;
            }
        }

        return townCount < maxChainLength;
    }

    private int getMaxChainLengthForSize(BlockTown.TownSize TownSize) {
        switch (TownSize) {
            case TINY:
                return MAX_TOWN_TINY;
            case SMALL:
                return MAX_TOWN_SMALL;
            case BELOW_AVERAGE:
                return MAX_TOWN_BELOW_AVERAGE;
            case AVERAGE:
                return MAX_TOWN_AVERAGE;
            case ABOVE_AVERAGE:
                return MAX_TOWN_ABOVE_AVERAGE;
            case BIG:
                return MAX_TOWN_BIG;
            case LARGE:
                return MAX_TOWN_LARGE;
            case HUGE:
                return MAX_TOWN_HUGE;
            case GIANT:
                return MAX_TOWN_GIANT;
            case SUPER:
                return MAX_TOWN_SUPER;
            default:
                return 0;
        }
    }
}
