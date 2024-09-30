package net.dao.mini_kingdoms.blocks.multiblock;

import net.dao.mini_kingdoms.blocks.multiblock.typefiles.BlockSizes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BlockCoreBase extends Block {
    private final BlockSizes coreSize;

    public BlockCoreBase(Properties properties, BlockSizes size) {
        super(properties);
        this.coreSize = size;
    }

    public BlockSizes getCoreSize() {
        return coreSize;
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, world, pos, oldState, isMoving);
        interactWithAdjacentBuildings(world, pos);
    }

    protected void interactWithAdjacentBuildings(Level world, BlockPos pos) {
        // Logic to check and interact with functional blocks
        // This logic can be extended in each subclass if needed
    }
}
