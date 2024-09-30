package net.dao.mini_kingdoms.blocks.multiblock.baseblocks;

import net.dao.mini_kingdoms.blocks.multiblock.BlockCoreBase;
import net.dao.mini_kingdoms.blocks.multiblock.typefiles.BlockSizes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class BlockTown extends BlockCoreBase {
    public BlockTown(Properties properties, BlockSizes size) {
        super(properties, size);
    }

    @Override
    protected void interactWithAdjacentBuildings(Level world, BlockPos pos) {
        // Specific logic for interacting with adjacent buildings (farms, mines)
        // Here you can call the base class method or override for Village-specific behavior
        super.interactWithAdjacentBuildings(world, pos);
    }
}
