package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.dao.mini_kingdoms.blocks.MKBlocks;
import net.dao.mini_kingdoms.items.MKItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MKBlockTagProvider extends BlockTagsProvider {
    public MKBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Mini_kingdoms.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .add(MKBlocks.TINY_CORE_ORE_MINE.get())
        .add(MKBlocks.SMALL_CORE_ORE_MINE.get())
        .add(MKBlocks.BELOW_AVERAGE_CORE_ORE_MINE.get())
        .add(MKBlocks.AVERAGE_CORE_ORE_MINE.get())
        .add(MKBlocks.ABOVE_AVERAGE_CORE_ORE_MINE.get())
        .add(MKBlocks.BIG_CORE_ORE_MINE.get())
        .add(MKBlocks.LARGE_CORE_ORE_MINE.get())
        .add(MKBlocks.HUGE_CORE_ORE_MINE.get())
        .add(MKBlocks.GIANT_CORE_ORE_MINE.get())
        .add(MKBlocks.SUPER_CORE_ORE_MINE.get())
        .add(MKBlocks.TINY_CORE_ORE_FARM.get())
        .add(MKBlocks.SMALL_CORE_ORE_FARM.get())
        .add(MKBlocks.BELOW_AVERAGE_CORE_ORE_FARM.get())
        .add(MKBlocks.AVERAGE_CORE_ORE_FARM.get())
        .add(MKBlocks.ABOVE_AVERAGE_CORE_ORE_FARM.get())
        .add(MKBlocks.BIG_CORE_ORE_FARM.get())
        .add(MKBlocks.LARGE_CORE_ORE_FARM.get())
        .add(MKBlocks.HUGE_CORE_ORE_FARM.get())
        .add(MKBlocks.GIANT_CORE_ORE_FARM.get())
        .add(MKBlocks.SUPER_CORE_ORE_FARM.get())
        .add(MKBlocks.TINY_CORE_ORE_BIOME.get())
        .add(MKBlocks.SMALL_CORE_ORE_BIOME.get())
        .add(MKBlocks.BELOW_AVERAGE_CORE_ORE_BIOME.get())
        .add(MKBlocks.AVERAGE_CORE_ORE_BIOME.get())
        .add(MKBlocks.ABOVE_AVERAGE_CORE_ORE_BIOME.get())
        .add(MKBlocks.BIG_CORE_ORE_BIOME.get())
        .add(MKBlocks.LARGE_CORE_ORE_BIOME.get())
        .add(MKBlocks.HUGE_CORE_ORE_BIOME.get())
        .add(MKBlocks.GIANT_CORE_ORE_BIOME.get())
        .add(MKBlocks.SUPER_CORE_ORE_BIOME.get())
        .add(MKBlocks.TINY_CORE_ORE_BUILDING.get())
        .add(MKBlocks.SMALL_CORE_ORE_BUILDING.get())
        .add(MKBlocks.BELOW_AVERAGE_CORE_ORE_BUILDING.get())
        .add(MKBlocks.AVERAGE_CORE_ORE_BUILDING.get())
        .add(MKBlocks.ABOVE_AVERAGE_CORE_ORE_BUILDING.get())
        .add(MKBlocks.BIG_CORE_ORE_BUILDING.get())
        .add(MKBlocks.LARGE_CORE_ORE_BUILDING.get())
        .add(MKBlocks.HUGE_CORE_ORE_BUILDING.get())
        .add(MKBlocks.GIANT_CORE_ORE_BUILDING.get())
        .add(MKBlocks.SUPER_CORE_ORE_BUILDING.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(MKBlocks.TINY_CORE_ORE_MINE.get())
                .add(MKBlocks.SMALL_CORE_ORE_MINE.get())
                .add(MKBlocks.BELOW_AVERAGE_CORE_ORE_MINE.get())
                .add(MKBlocks.AVERAGE_CORE_ORE_MINE.get())
                .add(MKBlocks.ABOVE_AVERAGE_CORE_ORE_MINE.get())
                .add(MKBlocks.BIG_CORE_ORE_MINE.get())
                .add(MKBlocks.LARGE_CORE_ORE_MINE.get())
                .add(MKBlocks.HUGE_CORE_ORE_MINE.get())
                .add(MKBlocks.GIANT_CORE_ORE_MINE.get())
                .add(MKBlocks.SUPER_CORE_ORE_MINE.get())
                .add(MKBlocks.TINY_CORE_ORE_FARM.get())
                .add(MKBlocks.SMALL_CORE_ORE_FARM.get())
                .add(MKBlocks.BELOW_AVERAGE_CORE_ORE_FARM.get())
                .add(MKBlocks.AVERAGE_CORE_ORE_FARM.get())
                .add(MKBlocks.ABOVE_AVERAGE_CORE_ORE_FARM.get())
                .add(MKBlocks.BIG_CORE_ORE_FARM.get())
                .add(MKBlocks.LARGE_CORE_ORE_FARM.get())
                .add(MKBlocks.HUGE_CORE_ORE_FARM.get())
                .add(MKBlocks.GIANT_CORE_ORE_FARM.get())
                .add(MKBlocks.SUPER_CORE_ORE_FARM.get())
                .add(MKBlocks.TINY_CORE_ORE_BIOME.get())
                .add(MKBlocks.SMALL_CORE_ORE_BIOME.get())
                .add(MKBlocks.BELOW_AVERAGE_CORE_ORE_BIOME.get())
                .add(MKBlocks.AVERAGE_CORE_ORE_BIOME.get())
                .add(MKBlocks.ABOVE_AVERAGE_CORE_ORE_BIOME.get())
                .add(MKBlocks.BIG_CORE_ORE_BIOME.get())
                .add(MKBlocks.LARGE_CORE_ORE_BIOME.get())
                .add(MKBlocks.HUGE_CORE_ORE_BIOME.get())
                .add(MKBlocks.GIANT_CORE_ORE_BIOME.get())
                .add(MKBlocks.SUPER_CORE_ORE_BIOME.get())
                .add(MKBlocks.TINY_CORE_ORE_BUILDING.get())
                .add(MKBlocks.SMALL_CORE_ORE_BUILDING.get())
                .add(MKBlocks.BELOW_AVERAGE_CORE_ORE_BUILDING.get())
                .add(MKBlocks.AVERAGE_CORE_ORE_BUILDING.get())
                .add(MKBlocks.ABOVE_AVERAGE_CORE_ORE_BUILDING.get())
                .add(MKBlocks.BIG_CORE_ORE_BUILDING.get())
                .add(MKBlocks.LARGE_CORE_ORE_BUILDING.get())
                .add(MKBlocks.HUGE_CORE_ORE_BUILDING.get())
                .add(MKBlocks.GIANT_CORE_ORE_BUILDING.get())
                .add(MKBlocks.SUPER_CORE_ORE_BUILDING.get());

    }
}
