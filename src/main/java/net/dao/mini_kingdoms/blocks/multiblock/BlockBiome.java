package net.dao.mini_kingdoms.blocks.multiblock;

import net.dao.mini_kingdoms.blocks.multiblock.typefiles.BiomeType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BlockBiome extends Block {

    private final BiomeType biomeType;

    public BlockBiome(Properties properties, BiomeType biomeType) {
        super(properties);
        this.biomeType = biomeType;
    }

    public BiomeType getBiomeType() {
        return biomeType;
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, world, pos, oldState, isMoving);
        // Handle biome-specific logic using datacomponents
    }
}
