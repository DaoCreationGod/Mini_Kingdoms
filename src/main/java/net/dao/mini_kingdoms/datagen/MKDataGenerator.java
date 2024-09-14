package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Mini_kingdoms.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MKDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(MKBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));

        generator.addProvider(event.includeServer(), new MKRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new MKEntityLootTableProvider(packOutput, Collections.emptySet(),List.of(new LootTableProvider.SubProviderEntry(MKEntityLootTableProvider::new, LootContextParamSets.ENTITY)), lookupProvider));

        BlockTagsProvider blockTagsProvider = new MKBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new MKItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        EntityTypeTagsProvider entityTypeTagsProvider = new MKEntityTagProvider(packOutput, lookupProvider);


        generator.addProvider(event.includeClient(), new MKBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new MKItemModelProvider(packOutput, existingFileHelper));
    }
}
