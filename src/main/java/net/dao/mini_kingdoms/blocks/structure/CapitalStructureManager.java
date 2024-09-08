package net.dao.mini_kingdoms.blocks.structure;

import net.dao.mini_kingdoms.blocks.multiblock.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashSet;
import java.util.Set;

public class CapitalStructureManager {

    // Define the maximum number of villages allowed in a chain based on size
    private static final int MAX_CAPITAL_TINY = 1;
    private static final int MAX_CAPITAL_SMALL = 1;
    private static final int MAX_CAPITAL_BELOW_AVERAGE = 1;
    private static final int MAX_CAPITAL_AVERAGE = 1;
    private static final int MAX_CAPITAL_ABOVE_AVERAGE = 1;
    private static final int MAX_CAPITAL_BIG = 1;
    private static final int MAX_CAPITAL_LARGE = 1;
    private static final int MAX_CAPITAL_HUGE = 1;
    private static final int MAX_CAPITAL_GIANT = 1;
    private static final int MAX_CAPITAL_SUPER = 1;

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

    public boolean canPlaceCapital(Level world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (!(block instanceof BlockCapital)) {
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

        BlockCapital.CapitalSize currentSize = state.getValue(BlockCapital.SIZE);

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

            if (adjacentBlock instanceof BlockCapital) {
                BlockCapital adjacentCapital = (BlockCapital) adjacentBlock;
                BlockCapital.CapitalSize adjacentSize = adjacentState.getValue(BlockCapital.SIZE);

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
        BlockCapital.CapitalSize currentSize = state.getValue(BlockCapital.SIZE);

        int maxChainLength = getMaxChainLengthForSize(currentSize);

        BlockPos[] adjacentPositions = {
                pos.north(), pos.south(), pos.east(), pos.west()
        };

        int capitalCount = 0;

        for (BlockPos adjacentPos : adjacentPositions) {
            BlockState adjacentState = world.getBlockState(adjacentPos);
            Block adjacentBlock = adjacentState.getBlock();
            if (adjacentBlock instanceof BlockCapital) {
                capitalCount++;
            }
        }

        return capitalCount < maxChainLength;
    }

    private int getMaxChainLengthForSize(BlockCapital.CapitalSize capitalSize) {
        switch (capitalSize) {
            case TINY:
                return MAX_CAPITAL_TINY;
            case SMALL:
                return MAX_CAPITAL_SMALL;
            case BELOW_AVERAGE:
                return MAX_CAPITAL_BELOW_AVERAGE;
            case AVERAGE:
                return MAX_CAPITAL_AVERAGE;
            case ABOVE_AVERAGE:
                return MAX_CAPITAL_ABOVE_AVERAGE;
            case BIG:
                return MAX_CAPITAL_BIG;
            case LARGE:
                return MAX_CAPITAL_LARGE;
            case HUGE:
                return MAX_CAPITAL_HUGE;
            case GIANT:
                return MAX_CAPITAL_GIANT;
            case SUPER:
                return MAX_CAPITAL_SUPER;
            default:
                return 0;
        }
    }
}
