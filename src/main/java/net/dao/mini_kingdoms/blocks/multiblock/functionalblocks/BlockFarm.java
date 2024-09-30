package net.dao.mini_kingdoms.blocks.multiblock.functionalblocks;

import net.dao.mini_kingdoms.blocks.multiblock.BlockFunctionalBase;
import net.dao.mini_kingdoms.blocks.multiblock.typefiles.BlockSizes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class BlockFarm extends BlockFunctionalBase {
    public BlockFarm(Properties properties, BlockSizes size) {
        super(properties, size);
    }

    @Override
    protected void interactWithCoreBuilding(Level world, BlockPos pos) {
        // Specific logic for interacting with core buildings (village, town, etc.)
        super.interactWithCoreBuilding(world, pos);
    }
}
