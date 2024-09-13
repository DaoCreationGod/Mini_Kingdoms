package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.dao.mini_kingdoms.blocks.MKBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MKBlockStateProvider extends BlockStateProvider {
    public MKBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, Mini_kingdoms.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){
        ResourceLocation coreOre = modLoc("block/core_ore");
        blockWithItem(MKBlocks.TINY_CORE_ORE_BIOME, coreOre);
        blockWithItem(MKBlocks.TINY_CORE_ORE_BUILDING, coreOre);
        blockWithItem(MKBlocks.TINY_CORE_ORE_FARM, coreOre);
        blockWithItem(MKBlocks.TINY_CORE_ORE_MINE, coreOre);

        blockWithItem(MKBlocks.SMALL_CORE_ORE_BIOME, coreOre);
        blockWithItem(MKBlocks.SMALL_CORE_ORE_BUILDING, coreOre);
        blockWithItem(MKBlocks.SMALL_CORE_ORE_FARM, coreOre);
        blockWithItem(MKBlocks.SMALL_CORE_ORE_MINE, coreOre);

        blockWithItem(MKBlocks.BELOW_AVERAGE_CORE_ORE_BIOME, coreOre);
        blockWithItem(MKBlocks.BELOW_AVERAGE_CORE_ORE_BUILDING, coreOre);
        blockWithItem(MKBlocks.BELOW_AVERAGE_CORE_ORE_FARM, coreOre);
        blockWithItem(MKBlocks.BELOW_AVERAGE_CORE_ORE_MINE, coreOre);

        blockWithItem(MKBlocks.AVERAGE_CORE_ORE_BIOME, coreOre);
        blockWithItem(MKBlocks.AVERAGE_CORE_ORE_BUILDING, coreOre);
        blockWithItem(MKBlocks.AVERAGE_CORE_ORE_FARM, coreOre);
        blockWithItem(MKBlocks.AVERAGE_CORE_ORE_MINE, coreOre);

        blockWithItem(MKBlocks.ABOVE_AVERAGE_CORE_ORE_BIOME, coreOre);
        blockWithItem(MKBlocks.ABOVE_AVERAGE_CORE_ORE_BUILDING, coreOre);
        blockWithItem(MKBlocks.ABOVE_AVERAGE_CORE_ORE_FARM, coreOre);
        blockWithItem(MKBlocks.ABOVE_AVERAGE_CORE_ORE_MINE, coreOre);

        blockWithItem(MKBlocks.BIG_CORE_ORE_BIOME, coreOre);
        blockWithItem(MKBlocks.BIG_CORE_ORE_BUILDING, coreOre);
        blockWithItem(MKBlocks.BIG_CORE_ORE_FARM, coreOre);
        blockWithItem(MKBlocks.BIG_CORE_ORE_MINE, coreOre);

        blockWithItem(MKBlocks.LARGE_CORE_ORE_BIOME, coreOre);
        blockWithItem(MKBlocks.LARGE_CORE_ORE_BUILDING, coreOre);
        blockWithItem(MKBlocks.LARGE_CORE_ORE_FARM, coreOre);
        blockWithItem(MKBlocks.LARGE_CORE_ORE_MINE, coreOre);

        blockWithItem(MKBlocks.HUGE_CORE_ORE_BIOME, coreOre);
        blockWithItem(MKBlocks.HUGE_CORE_ORE_BUILDING, coreOre);
        blockWithItem(MKBlocks.HUGE_CORE_ORE_FARM, coreOre);
        blockWithItem(MKBlocks.HUGE_CORE_ORE_MINE, coreOre);

        blockWithItem(MKBlocks.GIANT_CORE_ORE_BIOME, coreOre);
        blockWithItem(MKBlocks.GIANT_CORE_ORE_BUILDING, coreOre);
        blockWithItem(MKBlocks.GIANT_CORE_ORE_FARM, coreOre);
        blockWithItem(MKBlocks.GIANT_CORE_ORE_MINE, coreOre);

        blockWithItem(MKBlocks.SUPER_CORE_ORE_BIOME, coreOre);
        blockWithItem(MKBlocks.SUPER_CORE_ORE_BUILDING, coreOre);
        blockWithItem(MKBlocks.SUPER_CORE_ORE_FARM, coreOre);
        blockWithItem(MKBlocks.SUPER_CORE_ORE_MINE, coreOre);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject, ResourceLocation texture) {
        Block block = blockRegistryObject.get();
        ResourceLocation blockRegistryName = ForgeRegistries.BLOCKS.getKey(block);

        // Ensure the block has a registry name
        if (blockRegistryName != null) {
            simpleBlockWithItem(block, models().cubeAll(blockRegistryName.getPath(), texture));
        }
    }

}
