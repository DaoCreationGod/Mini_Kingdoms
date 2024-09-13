package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.dao.mini_kingdoms.util.MKTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MKItemTagProvider extends ItemTagsProvider {
    public MKItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, Mini_kingdoms.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(MKTags.MKItems.CLOTHS)
                .add(Items.CYAN_CARPET)
                .add(Items.BLUE_CARPET)
                .add(Items.LIGHT_BLUE_CARPET)
                .add(Items.BLACK_CARPET)
                .add(Items.BROWN_CARPET)
                .add(Items.GRAY_CARPET)
                .add(Items.GREEN_CARPET)
                .add(Items.LIGHT_GRAY_CARPET)
                .add(Items.LIME_CARPET)
                .add(Items.MAGENTA_CARPET)
                .add(Items.MOSS_CARPET)
                .add(Items.ORANGE_CARPET)
                .add(Items.PINK_CARPET)
                .add(Items.PURPLE_CARPET)
                .add(Items.RED_CARPET)
                .add(Items.WHITE_CARPET)
                .add(Items.YELLOW_CARPET);

        tag(MKTags.MKItems.SEEDS)
                .add(Items.BEETROOT_SEEDS)
                .add(Items.WHEAT_SEEDS)
                .add(Items.MELON_SEEDS)
                .add(Items.PUMPKIN_SEEDS)
                .add(Items.TORCHFLOWER_SEEDS);

        tag(MKTags.MKItems.ORES);

        tag(MKTags.MKItems.FOODS);
    }

}
