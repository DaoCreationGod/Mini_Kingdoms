package net.dao.mini_kingdoms.blocks.multiblock;

import net.dao.mini_kingdoms.blocks.multiblock.typefiles.BlockSizes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BlockFunctionalBase extends Block {
    private final BlockSizes functionalSize;

    public BlockFunctionalBase(Properties properties, BlockSizes size) {
        super(properties);
        this.functionalSize = size;
    }

    public BlockSizes getFunctionalSize() {
        return functionalSize;
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, world, pos, oldState, isMoving);
        interactWithCoreBuilding(world, pos);
    }

    protected void interactWithCoreBuilding(Level world, BlockPos pos) {
        // Logic to check and interact with core blocks
        // This logic can be extended in each subclass if needed
    }
}
