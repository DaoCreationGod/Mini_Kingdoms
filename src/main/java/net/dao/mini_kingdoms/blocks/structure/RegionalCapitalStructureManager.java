package net.dao.mini_kingdoms.blocks.structure;

import net.dao.mini_kingdoms.blocks.multiblock.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashSet;
import java.util.Set;

public class RegionalCapitalStructureManager {

    // Define the maximum number of villages allowed in a chain based on size
    private static final int MAX_REGIONAL_CAPITAL_TINY = 5;
    private static final int MAX_REGIONAL_CAPITAL_SMALL = 7;
    private static final int MAX_REGIONAL_CAPITAL_BELOW_AVERAGE = 10;
    private static final int MAX_REGIONAL_CAPITAL_AVERAGE = 12;
    private static final int MAX_REGIONAL_CAPITAL_ABOVE_AVERAGE = 15;
    private static final int MAX_REGIONAL_CAPITAL_BIG = 17;
    private static final int MAX_REGIONAL_CAPITAL_LARGE = 20;
    private static final int MAX_REGIONAL_CAPITAL_HUGE = 25;
    private static final int MAX_REGIONAL_CAPITAL_GIANT = 35;
    private static final int MAX_REGIONAL_CAPITAL_SUPER = 50;

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

    public boolean canPlaceRegionalCapital(Level world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (!(block instanceof BlockRegionalCapital)) {
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

        BlockRegionalCapital.RegionalCapitalSize currentSize = state.getValue(BlockRegionalCapital.SIZE);

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

            if (adjacentBlock instanceof BlockRegionalCapital) {
                BlockRegionalCapital adjacentRegionalCapital = (BlockRegionalCapital) adjacentBlock;
                BlockRegionalCapital.RegionalCapitalSize adjacentSize = adjacentState.getValue(BlockRegionalCapital.SIZE);

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
        BlockRegionalCapital.RegionalCapitalSize currentSize = state.getValue(BlockRegionalCapital.SIZE);

        int maxChainLength = getMaxChainLengthForSize(currentSize);

        BlockPos[] adjacentPositions = {
                pos.north(), pos.south(), pos.east(), pos.west()
        };

        int regionalCapitalCount = 0;

        for (BlockPos adjacentPos : adjacentPositions) {
            BlockState adjacentState = world.getBlockState(adjacentPos);
            Block adjacentBlock = adjacentState.getBlock();
            if (adjacentBlock instanceof BlockRegionalCapital) {
                regionalCapitalCount++;
            }
        }

        return regionalCapitalCount < maxChainLength;
    }

    private int getMaxChainLengthForSize(BlockRegionalCapital.RegionalCapitalSize regionalCapitalSize) {
        switch (regionalCapitalSize) {
            case TINY:
                return MAX_REGIONAL_CAPITAL_TINY;
            case SMALL:
                return MAX_REGIONAL_CAPITAL_SMALL;
            case BELOW_AVERAGE:
                return MAX_REGIONAL_CAPITAL_BELOW_AVERAGE;
            case AVERAGE:
                return MAX_REGIONAL_CAPITAL_AVERAGE;
            case ABOVE_AVERAGE:
                return MAX_REGIONAL_CAPITAL_ABOVE_AVERAGE;
            case BIG:
                return MAX_REGIONAL_CAPITAL_BIG;
            case LARGE:
                return MAX_REGIONAL_CAPITAL_LARGE;
            case HUGE:
                return MAX_REGIONAL_CAPITAL_HUGE;
            case GIANT:
                return MAX_REGIONAL_CAPITAL_GIANT;
            case SUPER:
                return MAX_REGIONAL_CAPITAL_SUPER;
            default:
                return 0;
        }
    }
}
