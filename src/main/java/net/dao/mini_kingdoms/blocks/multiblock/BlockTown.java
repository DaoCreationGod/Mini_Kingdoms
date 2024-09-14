package net.dao.mini_kingdoms.blocks.multiblock;

import net.dao.mini_kingdoms.blocks.structure.TownStructureManager;
import net.minecraft.core.BlockPos;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.Level;

public class BlockTown extends Block {

    // EnumProperty to handle different sizes of mine blocks
    public static final EnumProperty<TownSize> SIZE = EnumProperty.create("size", TownSize.class);

    // Town structure manager for chaining villages, mines, and other related blocks
    private static final TownStructureManager townManager = new TownStructureManager();

    // Constructor which sets default properties for the block
    public BlockTown(Properties properties) {
        super(properties);
        // Set default block state to TINY size
        this.registerDefaultState(this.defaultBlockState().setValue(SIZE, TownSize.TINY));
    }

    // Fills the block's state container with the SIZE property
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(SIZE);
    }

    // Called when the block is added to the world (i.e., placed by a player)
    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, world, pos, oldState, isMoving);

        // Check if the village chaining logic is satisfied for placement
        if (!townManager.canPlaceTown(world, pos)) {
            // Destroy the block if the village placement rules are violated
            world.destroyBlock(pos, true);
        }

        // Check for adjacent blocks and enforce size requirements
        enforceSizeRequirement(world, pos, state);
    }

    // Method to enforce absolute size requirement for adjacent blocks and handle chaining
    private void enforceSizeRequirement(Level world, BlockPos pos, BlockState state) {
        BlockPos[] adjacentPositions = {
                pos.north(), pos.south(), pos.east(), pos.west()
        };

        // Get the size of the current block
        TownSize currentSize = state.getValue(SIZE);

        for (BlockPos adjacentPos : adjacentPositions) {
            BlockState adjacentState = world.getBlockState(adjacentPos);
            Block adjacentBlock = adjacentState.getBlock();

            // Allow BlockShop to be adjacent to any block
            if (adjacentBlock instanceof BlockShop) {
                continue;
            }

            // Check if adjacent block is forbidden
            if (isForbiddenAdjacent(adjacentBlock)) {
                // Destroy the current block if forbidden adjacency is detected
                world.destroyBlock(pos, true);
                break; // Exit loop after destruction
            } else if (adjacentBlock instanceof BlockTown) {
                // Destroy the current block if adjacent to another BlockTown
                world.destroyBlock(pos, true);
                break; // Exit loop after destruction
            }
        }
    }

    // Method to check if an adjacent block is forbidden
    private boolean isForbiddenAdjacent(Block block) {
        return  block instanceof BlockBuilding ||
                block instanceof BlockVillage ||
                block instanceof BlockTown ||
                block instanceof BlockCity ||
                block instanceof BlockLargeCity ||
                block instanceof BlockRegionalCapital ||
                block instanceof BlockCapital ||
                block instanceof BlockKingdom;
    }

    // Enum to define different sizes for the BlockTown
    public enum TownSize implements StringRepresentable {
        TINY("tiny", 1),
        SMALL("small",2 ),
        BELOW_AVERAGE("below_average", 3),
        AVERAGE("average",4),
        ABOVE_AVERAGE("above_average",5),
        BIG("big",6),
        LARGE("large",7),
        HUGE("huge",8),
        GIANT("giant",9),
        SUPER("super",10);

        private final String name;
        private final int chainLimit;

        TownSize(String name, int chainLimit){
            this.name = name;
            this.chainLimit = chainLimit;
        }

        @Override
        public String getSerializedName(){
            return name;
        }

        public int getChainLimit(){
            return chainLimit;
        }
    }
}