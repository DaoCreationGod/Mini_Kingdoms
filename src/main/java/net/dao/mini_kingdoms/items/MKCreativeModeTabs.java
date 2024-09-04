package net.dao.mini_kingdoms.items;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MKCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mini_kingdoms.MODID);

    public static final RegistryObject<CreativeModeTab> CATCHERS_AND_ASSOCIATED_ITEMS = CREATIVE_MODE_TABS.register("catchers_and_associated_items", ()-> CreativeModeTab.builder().icon(()-> new ItemStack(MKItems.LEATHER_NET.get()))
            .title(Component.translatable("creativetab.mini_kingdoms.catchers_and_associated_items"))
            .displayItems((ItemDisplayParameters, output) -> {
              output.accept(MKItems.LEATHER_NET.get());
              output.accept(MKItems.SOFT_LEATHER_NET.get());
              output.accept(MKItems.STRENGTHENED_LEATHER_NET.get());
              output.accept(MKItems.VILLAGER_CATCHER.get());
              output.accept(MKItems.PASSIVE_MOB_CATCHER.get());
              output.accept(MKItems.AGGRESSIVE_MOB_CATCHER.get());
            }).build());

    public static final RegistryObject<CreativeModeTab> CORES = CREATIVE_MODE_TABS.register("cores", ()-> CreativeModeTab.builder().icon(()-> new ItemStack(MKItems.MINE_SUPER_CORE.get()))
            .title(Component.translatable("creativetab.mini_kingdoms.cores"))
            .displayItems((ItemDisplayParameters, output) -> {
                output.accept(MKItems.MINE_TINY_CORE.get());
                output.accept(MKItems.MINE_SMALL_CORE.get());
                output.accept(MKItems.MINE_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.MINE_AVERAGE_CORE.get());
                output.accept(MKItems.MINE_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.MINE_BIG_CORE.get());
                output.accept(MKItems.MINE_LARGE_CORE.get());
                output.accept(MKItems.MINE_HUGE_CORE.get());
                output.accept(MKItems.MINE_GIANT_CORE.get());
                output.accept(MKItems.MINE_SUPER_CORE.get());
                output.accept(MKItems.FARM_SUPER_CORE.get());
                output.accept(MKItems.BIOME_SUPER_CORE.get());
                output.accept(MKItems.BUILDING_SUPER_CORE.get());
                output.accept(MKItems.VILLAGE_SUPER_CORE.get());
                output.accept(MKItems.TOWN_SUPER_CORE.get());
                output.accept(MKItems.CITY_SUPER_CORE.get());
                output.accept(MKItems.LARGE_CITY_SUPER_CORE.get());
                output.accept(MKItems.KINGDOM_SUPER_CORE.get());
                output.accept(MKItems.REGIONAL_CAPITAL_SUPER_CORE.get());
                output.accept(MKItems.CAPITAL_SUPER_CORE.get());
                output.accept(MKItems.FARM_GIANT_CORE.get());
                output.accept(MKItems.BIOME_GIANT_CORE.get());
                output.accept(MKItems.BUILDING_GIANT_CORE.get());
                output.accept(MKItems.VILLAGE_GIANT_CORE.get());
                output.accept(MKItems.TOWN_GIANT_CORE.get());
                output.accept(MKItems.CITY_GIANT_CORE.get());
                output.accept(MKItems.LARGE_CITY_GIANT_CORE.get());
                output.accept(MKItems.KINGDOM_GIANT_CORE.get());
                output.accept(MKItems.REGIONAL_CAPITAL_GIANT_CORE.get());
                output.accept(MKItems.CAPITAL_GIANT_CORE.get());
                output.accept(MKItems.FARM_HUGE_CORE.get());
                output.accept(MKItems.BIOME_HUGE_CORE.get());
                output.accept(MKItems.BUILDING_HUGE_CORE.get());
                output.accept(MKItems.VILLAGE_HUGE_CORE.get());
                output.accept(MKItems.TOWN_HUGE_CORE.get());
                output.accept(MKItems.CITY_HUGE_CORE.get());
                output.accept(MKItems.LARGE_CITY_HUGE_CORE.get());
                output.accept(MKItems.KINGDOM_HUGE_CORE.get());
                output.accept(MKItems.REGIONAL_CAPITAL_HUGE_CORE.get());
                output.accept(MKItems.CAPITAL_HUGE_CORE.get());
                output.accept(MKItems.FARM_LARGE_CORE.get());
                output.accept(MKItems.BIOME_LARGE_CORE.get());
                output.accept(MKItems.BUILDING_LARGE_CORE.get());
                output.accept(MKItems.VILLAGE_LARGE_CORE.get());
                output.accept(MKItems.TOWN_LARGE_CORE.get());
                output.accept(MKItems.CITY_LARGE_CORE.get());
                output.accept(MKItems.LARGE_CITY_LARGE_CORE.get());
                output.accept(MKItems.KINGDOM_LARGE_CORE.get());
                output.accept(MKItems.REGIONAL_CAPITAL_LARGE_CORE.get());
                output.accept(MKItems.CAPITAL_LARGE_CORE.get());
                output.accept(MKItems.FARM_BIG_CORE.get());
                output.accept(MKItems.BIOME_BIG_CORE.get());
                output.accept(MKItems.BUILDING_BIG_CORE.get());
                output.accept(MKItems.VILLAGE_BIG_CORE.get());
                output.accept(MKItems.TOWN_BIG_CORE.get());
                output.accept(MKItems.CITY_BIG_CORE.get());
                output.accept(MKItems.LARGE_CITY_BIG_CORE.get());
                output.accept(MKItems.KINGDOM_BIG_CORE.get());
                output.accept(MKItems.REGIONAL_CAPITAL_BIG_CORE.get());
                output.accept(MKItems.CAPITAL_BIG_CORE.get());
                output.accept(MKItems.FARM_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.BIOME_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.BUILDING_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.VILLAGE_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.TOWN_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.CITY_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.LARGE_CITY_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.KINGDOM_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.REGIONAL_CAPITAL_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.CAPITAL_ABOVE_AVERAGE_CORE.get());
                output.accept(MKItems.FARM_AVERAGE_CORE.get());
                output.accept(MKItems.BIOME_AVERAGE_CORE.get());
                output.accept(MKItems.BUILDING_AVERAGE_CORE.get());
                output.accept(MKItems.VILLAGE_AVERAGE_CORE.get());
                output.accept(MKItems.TOWN_AVERAGE_CORE.get());
                output.accept(MKItems.CITY_AVERAGE_CORE.get());
                output.accept(MKItems.LARGE_CITY_AVERAGE_CORE.get());
                output.accept(MKItems.KINGDOM_AVERAGE_CORE.get());
                output.accept(MKItems.REGIONAL_CAPITAL_AVERAGE_CORE.get());
                output.accept(MKItems.CAPITAL_AVERAGE_CORE.get());
                output.accept(MKItems.FARM_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.BIOME_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.BUILDING_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.VILLAGE_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.TOWN_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.CITY_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.LARGE_CITY_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.KINGDOM_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.REGIONAL_CAPITAL_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.CAPITAL_BELOW_AVERAGE_CORE.get());
                output.accept(MKItems.FARM_SMALL_CORE.get());
                output.accept(MKItems.BIOME_SMALL_CORE.get());
                output.accept(MKItems.BUILDING_SMALL_CORE.get());
                output.accept(MKItems.VILLAGE_SMALL_CORE.get());
                output.accept(MKItems.TOWN_SMALL_CORE.get());
                output.accept(MKItems.CITY_SMALL_CORE.get());
                output.accept(MKItems.LARGE_CITY_SMALL_CORE.get());
                output.accept(MKItems.KINGDOM_SMALL_CORE.get());
                output.accept(MKItems.REGIONAL_CAPITAL_SMALL_CORE.get());
                output.accept(MKItems.CAPITAL_SMALL_CORE.get());
                output.accept(MKItems.FARM_TINY_CORE.get());
                output.accept(MKItems.BIOME_TINY_CORE.get());
                output.accept(MKItems.BUILDING_TINY_CORE.get());
                output.accept(MKItems.VILLAGE_TINY_CORE.get());
                output.accept(MKItems.TOWN_TINY_CORE.get());
                output.accept(MKItems.CITY_TINY_CORE.get());
                output.accept(MKItems.LARGE_CITY_TINY_CORE.get());
                output.accept(MKItems.KINGDOM_TINY_CORE.get());
                output.accept(MKItems.REGIONAL_CAPITAL_TINY_CORE.get());
                output.accept(MKItems.CAPITAL_TINY_CORE.get());
            }).build());

    public static final RegistryObject<CreativeModeTab> CORNERSTONES = CREATIVE_MODE_TABS.register("cornerstones", ()-> CreativeModeTab.builder().icon(()-> new ItemStack(MKItems.BADLANDS_BIOME_CORNERSTONE.get()))
            .withTabsBefore(CORES.getId())
            .withTabsAfter(CATCHERS_AND_ASSOCIATED_ITEMS.getId())
            .title(Component.translatable("creativetab.mini_kingdoms.cornerstones"))
            .displayItems((ItemDisplayParameters, output) -> {
                output.accept(MKItems.BADLANDS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.BAMBOO_JUNGLE_BIOME_CORNERSTONE.get());
                output.accept(MKItems.BEACH_BIOME_CORNERSTONE.get());
                output.accept(MKItems.BIRCH_FOREST_BIOME_CORNERSTONE.get());
                output.accept(MKItems.CHERRY_GROVE_BIOME_CORNERSTONE.get());
                output.accept(MKItems.COLD_OCEAN_BIOME_CORNERSTONE.get());
                output.accept(MKItems.DARK_FOREST_BIOME_CORNERSTONE.get());
                output.accept(MKItems.DEEP_COLD_OCEAN_BIOME_CORNERSTONE.get());
                output.accept(MKItems.DEEP_DARK_BIOME_CORNERSTONE.get());
                output.accept(MKItems.DEEP_FROZEN_OCEAN_BIOME_CORNERSTONE.get());
                output.accept(MKItems.DEEP_LUKEWARM_OCEAN_BIOME_CORNERSTONE.get());
                output.accept(MKItems.DEEP_OCEAN_BIOME_CORNERSTONE.get());
                output.accept(MKItems.DESERT_BIOME_CORNERSTONE.get());
                output.accept(MKItems.DRIPSTONE_CAVES_BIOME_CORNERSTONE.get());
                output.accept(MKItems.ERODED_BADLANDS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.FLOWER_FOREST_BIOME_CORNERSTONE.get());
                output.accept(MKItems.FOREST_BIOME_CORNERSTONE.get());
                output.accept(MKItems.FROZEN_OCEAN_BIOME_CORNERSTONE.get());
                output.accept(MKItems.FROZEN_PEAKS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.FROZEN_RIVER_BIOME_CORNERSTONE.get());
                output.accept(MKItems.GROVE_BIOME_CORNERSTONE.get());
                output.accept(MKItems.ICE_SPIKES_BIOME_CORNERSTONE.get());
                output.accept(MKItems.JAGGED_PEAKS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.JUNGLE_BIOME_CORNERSTONE.get());
                output.accept(MKItems.LUKEWARM_OCEANS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.LUSH_CAVES_BIOME_CORNERSTONE.get());
                output.accept(MKItems.MANGROVE_SWAMP_BIOME_CORNERSTONE.get());
                output.accept(MKItems.MEADOW_BIOME_CORNERSTONE.get());
                output.accept(MKItems.MUSHROOM_FIELDS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.OCEAN_BIOME_CORNERSTONE.get());
                output.accept(MKItems.OLD_GROWTH_BIRCH_FOREST_BIOME_CORNERSTONE.get());
                output.accept(MKItems.OLD_GROWTH_PINE_TAIGA_BIOME_CORNERSTONE.get());
                output.accept(MKItems.OLD_GROWTH_SPRUCE_TAIGA_BIOME_CORNERSTONE.get());
                output.accept(MKItems.PLAINS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.RIVER_BIOME_CORNERSTONE.get());
                output.accept(MKItems.SAVANNA_BIOME_CORNERSTONE.get());
                output.accept(MKItems.SAVANNA_PLATEAU_BIOME_CORNERSTONE.get());
                output.accept(MKItems.SNOWY_BEACH_BIOME_CORNERSTONE.get());
                output.accept(MKItems.SNOWY_SLOPES_BIOME_CORNERSTONE.get());
                output.accept(MKItems.SNOWY_PLAINS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.SNOWY_TAIGA_BIOME_CORNERSTONE.get());
                output.accept(MKItems.SPARSE_JUNGLE_BIOME_CORNERSTONE.get());
                output.accept(MKItems.STONY_PEAKS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.STONY_SHORES_BIOME_CORNERSTONE.get());
                output.accept(MKItems.SUNFLOWER_PLAINS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.SWAMP_BIOME_CORNERSTONE.get());
                output.accept(MKItems.TAIGA_BIOME_CORNERSTONE.get());
                output.accept(MKItems.WARM_OCEAN_BIOME_CORNERSTONE.get());
                output.accept(MKItems.WINDSWEPT_GRAVELLY_HILLS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.WINDSWEPT_HILLS_BIOME_CORNERSTONE.get());
                output.accept(MKItems.WINDSWEPT_SAVANNA_BIOME_CORNERSTONE.get());
                output.accept(MKItems.WINDSWEPT_FOREST_BIOME_CORNERSTONE.get());
                output.accept(MKItems.WOODED_BADLANDS_BIOME_CORNERSTONE.get());
            }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
