package net.dao.mini_kingdoms.blocks.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.Level;

public class BlockShop extends Block {

    // EnumProperty to handle the single size of the shop block
    public static final EnumProperty<ShopSize> SIZE = EnumProperty.create("size", ShopSize.class);

    // Constructor which sets default properties for the block
    public BlockShop(Properties properties) {
        super(properties);
        // Set default block state to the smallest size (example: SMALL)
        this.registerDefaultState(this.defaultBlockState().setValue(SIZE, ShopSize.SMALL));
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

        // No special rules for placement; Shop blocks can be placed next to any other block
        // Add any additional behavior for BlockShop here if needed
    }

    // Enum to define the single size for the BlockShop
    public enum ShopSize implements StringRepresentable {
        SMALL("small",100); // Assuming only one size for simplicity

        private final String name;
        private final int chainLimit;

        ShopSize(String name, int chainLimit) {
            this.name = name;
            this.chainLimit = chainLimit;
        }

        @Override
        public String getSerializedName() {
            return name;
        }

        public int getChainLimit(){
            return chainLimit;
        }
    }
}
