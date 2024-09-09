package net.dao.mini_kingdoms.blocks.structure;

import net.dao.mini_kingdoms.blocks.multiblock.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashSet;
import java.util.Set;

public class CityStructureManager {

    // Define the maximum number of villages allowed in a chain based on size
    private static final int MAX_CITY_TINY = 5;
    private static final int MAX_CITY_SMALL = 7;
    private static final int MAX_CITY_BELOW_AVERAGE = 10;
    private static final int MAX_CITY_AVERAGE = 12;
    private static final int MAX_CITY_ABOVE_AVERAGE = 15;
    private static final int MAX_CITY_BIG = 17;
    private static final int MAX_CITY_LARGE = 20;
    private static final int MAX_CITY_HUGE = 25;
    private static final int MAX_CITY_GIANT = 35;
    private static final int MAX_CITY_SUPER = 50;

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

    public boolean canPlaceCity(Level world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (!(block instanceof BlockCity)) {
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

        BlockCity.CitySize currentSize = state.getValue(BlockCity.SIZE);

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

            if (adjacentBlock instanceof BlockCity) {
                BlockCity adjacentCity = (BlockCity) adjacentBlock;
                BlockCity.CitySize adjacentSize = adjacentState.getValue(BlockCity.SIZE);

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
        BlockCity.CitySize currentSize = state.getValue(BlockCity.SIZE);

        int maxChainLength = getMaxChainLengthForSize(currentSize);

        BlockPos[] adjacentPositions = {
                pos.north(), pos.south(), pos.east(), pos.west()
        };

        int cityCount = 0;

        for (BlockPos adjacentPos : adjacentPositions) {
            BlockState adjacentState = world.getBlockState(adjacentPos);
            Block adjacentBlock = adjacentState.getBlock();
            if (adjacentBlock instanceof BlockCity) {
                cityCount++;
            }
        }

        return cityCount < maxChainLength;
    }

    private int getMaxChainLengthForSize(BlockCity.CitySize CitySize) {
        switch (CitySize) {
            case CitySize.TINY:
                return MAX_CITY_TINY;
            case CitySize.SMALL:
                return MAX_CITY_SMALL;
            case CitySize.BELOW_AVERAGE:
                return MAX_CITY_BELOW_AVERAGE;
            case CitySize.AVERAGE:
                return MAX_CITY_AVERAGE;
            case CitySize.ABOVE_AVERAGE:
                return MAX_CITY_ABOVE_AVERAGE;
            case CitySize.BIG:
                return MAX_CITY_BIG;
            case CitySize.LARGE:
                return MAX_CITY_LARGE;
            case CitySize.HUGE:
                return MAX_CITY_HUGE;
            case CitySize.GIANT:
                return MAX_CITY_GIANT;
            case CitySize.SUPER:
                return MAX_CITY_SUPER;
            default:
                return 0;
        }
    }
}
