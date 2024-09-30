package net.dao.mini_kingdoms.blocks.multiblock;

import net.dao.mini_kingdoms.blocks.multiblock.typefiles.CraftmenShopType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BlockCraftmenShop extends Block {
    private final CraftmenShopType craftmenShopType;

    public BlockCraftmenShop(Properties properties, CraftmenShopType craftmenShopType) {
        super(properties);
        this.craftmenShopType = craftmenShopType;
    }

    public CraftmenShopType getCraftmenShopType() {
        return craftmenShopType;
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, world, pos, oldState, isMoving);
        // Logic for crafting items based on the biome, mines, or other available resources
    }

    // Method to craft items
    private void craftItems(Level world, BlockPos pos) {
        // Logic for crafting items based on resources (biome, mine, etc.)
    }
}
