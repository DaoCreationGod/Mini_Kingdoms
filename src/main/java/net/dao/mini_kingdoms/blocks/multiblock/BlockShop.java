package net.dao.mini_kingdoms.blocks.multiblock;

import net.dao.mini_kingdoms.blocks.multiblock.typefiles.ShopType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BlockShop extends Block {
    private final ShopType shopType;

    public BlockShop(Properties properties, ShopType shopType) {
        super(properties);
        this.shopType = shopType;
    }

    public ShopType getShopType() {
        return shopType;
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, world, pos, oldState, isMoving);
        // Logic for distributing items based on the type of farm or resources in the multiblock
    }

    // Method to distribute items
    private void distributeItems(Level world, BlockPos pos) {
        // This logic can pull item lists from datacomponents based on the connected blocks
    }
}
