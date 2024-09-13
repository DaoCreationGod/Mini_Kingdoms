package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.blocks.MKBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MKBlockLootTableProvider extends BlockLootSubProvider {
    protected MKBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(MKBlocks.KINGDOM_CRAFTER.get());
        dropSelf(MKBlocks.TINY_CORE_ORE_MINE.get());
        dropSelf(MKBlocks.TINY_CORE_ORE_BIOME.get());
        dropSelf(MKBlocks.TINY_CORE_ORE_BUILDING.get());
        dropSelf(MKBlocks.TINY_CORE_ORE_FARM.get());
        dropSelf(MKBlocks.SMALL_CORE_ORE_BIOME.get());
        dropSelf(MKBlocks.SMALL_CORE_ORE_BUILDING.get());
        dropSelf(MKBlocks.SMALL_CORE_ORE_FARM.get());
        dropSelf(MKBlocks.SMALL_CORE_ORE_MINE.get());
        dropSelf(MKBlocks.BELOW_AVERAGE_CORE_ORE_BIOME.get());
        dropSelf(MKBlocks.BELOW_AVERAGE_CORE_ORE_BUILDING.get());
        dropSelf(MKBlocks.BELOW_AVERAGE_CORE_ORE_FARM.get());
        dropSelf(MKBlocks.BELOW_AVERAGE_CORE_ORE_MINE.get());
        dropSelf(MKBlocks.AVERAGE_CORE_ORE_BIOME.get());
        dropSelf(MKBlocks.AVERAGE_CORE_ORE_BUILDING.get());
        dropSelf(MKBlocks.AVERAGE_CORE_ORE_FARM.get());
        dropSelf(MKBlocks.AVERAGE_CORE_ORE_MINE.get());
        dropSelf(MKBlocks.ABOVE_AVERAGE_CORE_ORE_BIOME.get());
        dropSelf(MKBlocks.ABOVE_AVERAGE_CORE_ORE_BUILDING.get());
        dropSelf(MKBlocks.ABOVE_AVERAGE_CORE_ORE_MINE.get());
        dropSelf(MKBlocks.ABOVE_AVERAGE_CORE_ORE_FARM.get());
        dropSelf(MKBlocks.BIG_CORE_ORE_BIOME.get());
        dropSelf(MKBlocks.BIG_CORE_ORE_BUILDING.get());
        dropSelf(MKBlocks.BIG_CORE_ORE_FARM.get());
        dropSelf(MKBlocks.BIG_CORE_ORE_MINE.get());
        dropSelf(MKBlocks.LARGE_CORE_ORE_BIOME.get());
        dropSelf(MKBlocks.LARGE_CORE_ORE_BUILDING.get());
        dropSelf(MKBlocks.LARGE_CORE_ORE_FARM.get());
        dropSelf(MKBlocks.LARGE_CORE_ORE_MINE.get());
        dropSelf(MKBlocks.HUGE_CORE_ORE_BIOME.get());
        dropSelf(MKBlocks.HUGE_CORE_ORE_BUILDING.get());
        dropSelf(MKBlocks.HUGE_CORE_ORE_FARM.get());
        dropSelf(MKBlocks.HUGE_CORE_ORE_MINE.get());
        dropSelf(MKBlocks.GIANT_CORE_ORE_BIOME.get());
        dropSelf(MKBlocks.GIANT_CORE_ORE_BUILDING.get());
        dropSelf(MKBlocks.GIANT_CORE_ORE_FARM.get());
        dropSelf(MKBlocks.GIANT_CORE_ORE_MINE.get());
        dropSelf(MKBlocks.SUPER_CORE_ORE_BIOME.get());
        dropSelf(MKBlocks.SUPER_CORE_ORE_BUILDING.get());
        dropSelf(MKBlocks.SUPER_CORE_ORE_FARM.get());
        dropSelf(MKBlocks.SUPER_CORE_ORE_MINE.get());
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks(){
        return MKBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
