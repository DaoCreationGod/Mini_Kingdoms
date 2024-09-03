package net.dao.mini_kingdoms.items;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MKItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mini_kingdoms.MODID);
    
    //Random Items
    public static final RegistryObject<Item> GROWTH_BASE = ITEMS.register("growth_base",
            () -> new Item(new Item.Properties().stacksTo(32)));

    //Catchers and associated items
    public static final RegistryObject<Item> LEATHER_NET = ITEMS.register("leather_net",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOFT_LEATHER_NET = ITEMS.register("soft_leather_net",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRENGTHENED_LEATHER_NET = ITEMS.register("strengthened_leather_net",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VILLAGER_CATCHER = ITEMS.register("villager_catcher",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PASSIVE_MOB_CATCHER = ITEMS.register("passive_mob_catcher",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AGGRESSIVE_MOB_CATCHER = ITEMS.register("aggressive_mob_catcher",
            () -> new Item(new Item.Properties()));

    //Cores
    //Tiny
    public static final RegistryObject<Item> MINE_TINY_CORE = ITEMS.register("mine_tiny_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARM_TINY_CORE = ITEMS.register("farm_tiny_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIOME_TINY_CORE = ITEMS.register("biome_tiny_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDING_TINY_CORE = ITEMS.register("building_tiny_core",
            () -> new Item(new Item.Properties())); //This is a drop item
    public static final RegistryObject<Item> VILLAGE_TINY_CORE = ITEMS.register("village_tiny_core",
            () -> new Item(new Item.Properties())); //This is a crafting item made by 5 building cores
    public static final RegistryObject<Item> TOWN_TINY_CORE = ITEMS.register("town_tiny_core",
            () -> new Item(new Item.Properties())); //5 village cores
    public static final RegistryObject<Item> CITY_TINY_CORE = ITEMS.register("city_tiny_core",
            () -> new Item(new Item.Properties())); //5 towns
    public static final RegistryObject<Item> LARGE_CITY_TINY_CORE = ITEMS.register("large_city_tiny_core",
            () -> new Item(new Item.Properties())); //5 cities
    public static final RegistryObject<Item> REGIONAL_CAPITAL_TINY_CORE = ITEMS.register("regional_capital_tiny_core",
            () -> new Item(new Item.Properties()));//5 large cities
    public static final RegistryObject<Item> CAPITAL_TINY_CORE = ITEMS.register("capital_tiny_core",
            () -> new Item(new Item.Properties()));//5 regional capitals
    public static final RegistryObject<Item> KINGDOM_TINY_CORE = ITEMS.register("kingdom_tiny_core",
            () -> new Item(new Item.Properties()));//5 capitals
    //Small
    public static final RegistryObject<Item> MINE_SMALL_CORE = ITEMS.register("mine_small_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARM_SMALL_CORE = ITEMS.register("farm_small_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIOME_SMALL_CORE = ITEMS.register("biome_small_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDING_SMALL_CORE = ITEMS.register("building_small_core",
            () -> new Item(new Item.Properties())); //This is a drop item
    public static final RegistryObject<Item> VILLAGE_SMALL_CORE = ITEMS.register("village_small_core",
            () -> new Item(new Item.Properties())); //This is a crafting item made by 5 building cores
    public static final RegistryObject<Item> TOWN_SMALL_CORE = ITEMS.register("town_small_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITY_SMALL_CORE = ITEMS.register("city_small_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_CITY_SMALL_CORE = ITEMS.register("large_city_small_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGIONAL_CAPITAL_SMALL_CORE = ITEMS.register("regional_capital_small_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPITAL_SMALL_CORE = ITEMS.register("capital_small_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KINGDOM_SMALL_CORE = ITEMS.register("kingdom_small_core",
            () -> new Item(new Item.Properties()));
    //Below Average
    public static final RegistryObject<Item> MINE_BELOW_AVERAGE_CORE = ITEMS.register("mine_below_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARM_BELOW_AVERAGE_CORE = ITEMS.register("farm_below_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIOME_BELOW_AVERAGE_CORE = ITEMS.register("biome_below_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDING_BELOW_AVERAGE_CORE = ITEMS.register("building_below_average_core",
            () -> new Item(new Item.Properties())); //This is a drop item
    public static final RegistryObject<Item> VILLAGE_BELOW_AVERAGE_CORE = ITEMS.register("village_below_average_core",
            () -> new Item(new Item.Properties())); //This is a crafting item made by 5 building cores
    public static final RegistryObject<Item> TOWN_BELOW_AVERAGE_CORE = ITEMS.register("town_below_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITY_BELOW_AVERAGE_CORE = ITEMS.register("city_below_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_CITY_BELOW_AVERAGE_CORE = ITEMS.register("large_city_below_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGIONAL_CAPITAL_BELOW_AVERAGE_CORE = ITEMS.register("regional_capital_below_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPITAL_BELOW_AVERAGE_CORE = ITEMS.register("capital_below_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KINGDOM_BELOW_AVERAGE_CORE = ITEMS.register("kingdom_below_average_core",
            () -> new Item(new Item.Properties()));
    //Average
    public static final RegistryObject<Item> MINE_AVERAGE_CORE = ITEMS.register("mine_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARM_AVERAGE_CORE = ITEMS.register("farm_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIOME_AVERAGE_CORE = ITEMS.register("biome_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDING_AVERAGE_CORE = ITEMS.register("building_average_core",
            () -> new Item(new Item.Properties())); //This is a drop item
    public static final RegistryObject<Item> VILLAGE_AVERAGE_CORE = ITEMS.register("village_average_core",
            () -> new Item(new Item.Properties())); //This is a crafting item made by 5 building cores
    public static final RegistryObject<Item> TOWN_AVERAGE_CORE = ITEMS.register("town_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITY_AVERAGE_CORE = ITEMS.register("city_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_CITY_AVERAGE_CORE = ITEMS.register("large_city_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGIONAL_CAPITAL_AVERAGE_CORE = ITEMS.register("regional_capital_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPITAL_AVERAGE_CORE = ITEMS.register("capital_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KINGDOM_AVERAGE_CORE = ITEMS.register("kingdom_average_core",
            () -> new Item(new Item.Properties()));
    //Above Average
    public static final RegistryObject<Item> MINE_ABOVE_AVERAGE_CORE = ITEMS.register("mine_above_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARM_ABOVE_AVERAGE_CORE = ITEMS.register("farm_above_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIOME_ABOVE_AVERAGE_CORE = ITEMS.register("biome_above_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDING_ABOVE_AVERAGE_CORE = ITEMS.register("building_above_average_core",
            () -> new Item(new Item.Properties())); //This is a drop item
    public static final RegistryObject<Item> VILLAGE_ABOVE_AVERAGE_CORE = ITEMS.register("village_above_average_core",
            () -> new Item(new Item.Properties())); //This is a crafting item made by 5 building cores
    public static final RegistryObject<Item> TOWN_ABOVE_AVERAGE_CORE = ITEMS.register("town_above_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITY_ABOVE_AVERAGE_CORE = ITEMS.register("city_above_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_CITY_ABOVE_AVERAGE_CORE = ITEMS.register("large_city_above_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGIONAL_CAPITAL_ABOVE_AVERAGE_CORE = ITEMS.register("regional_capital_above_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPITAL_ABOVE_AVERAGE_CORE = ITEMS.register("capital_above_average_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KINGDOM_ABOVE_AVERAGE_CORE = ITEMS.register("kingdom_above_average_core",
            () -> new Item(new Item.Properties()));
    //Big
    public static final RegistryObject<Item> MINE_BIG_CORE = ITEMS.register("mine_big_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARM_BIG_CORE = ITEMS.register("farm_big_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIOME_BIG_CORE = ITEMS.register("biome_big_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDING_BIG_CORE = ITEMS.register("building_big_core",
            () -> new Item(new Item.Properties())); //This is a drop item
    public static final RegistryObject<Item> VILLAGE_BIG_CORE = ITEMS.register("village_big_core",
            () -> new Item(new Item.Properties())); //This is a crafting item made by 5 building cores
    public static final RegistryObject<Item> TOWN_BIG_CORE = ITEMS.register("town_big_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITY_BIG_CORE = ITEMS.register("city_big_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_CITY_BIG_CORE = ITEMS.register("large_city_big_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGIONAL_CAPITAL_BIG_CORE = ITEMS.register("regional_capital_big_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPITAL_BIG_CORE = ITEMS.register("capital_big_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KINGDOM_BIG_CORE = ITEMS.register("kingdom_big_core",
            () -> new Item(new Item.Properties()));
    //Large
    public static final RegistryObject<Item> MINE_LARGE_CORE = ITEMS.register("mine_large_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARM_LARGE_CORE = ITEMS.register("farm_large_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIOME_LARGE_CORE = ITEMS.register("biome_large_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDING_LARGE_CORE = ITEMS.register("building_large_core",
            () -> new Item(new Item.Properties())); //This is a drop item
    public static final RegistryObject<Item> VILLAGE_LARGE_CORE = ITEMS.register("village_large_core",
            () -> new Item(new Item.Properties())); //This is a crafting item made by 5 building cores
    public static final RegistryObject<Item> TOWN_LARGE_CORE = ITEMS.register("town_large_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITY_LARGE_CORE = ITEMS.register("city_large_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_CITY_LARGE_CORE = ITEMS.register("large_city_large_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGIONAL_CAPITAL_LARGE_CORE = ITEMS.register("regional_capital_large_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPITAL_LARGE_CORE = ITEMS.register("capital_large_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KINGDOM_LARGE_CORE = ITEMS.register("kingdom_large_core",
            () -> new Item(new Item.Properties()));
    //Huge
    public static final RegistryObject<Item> MINE_HUGE_CORE = ITEMS.register("mine_huge_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARM_HUGE_CORE = ITEMS.register("farm_huge_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIOME_HUGE_CORE = ITEMS.register("biome_huge_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDING_HUGE_CORE = ITEMS.register("building_huge_core",
            () -> new Item(new Item.Properties())); //This is a drop item
    public static final RegistryObject<Item> VILLAGE_HUGE_CORE = ITEMS.register("village_huge_core",
            () -> new Item(new Item.Properties())); //This is a crafting item made by 5 building cores
    public static final RegistryObject<Item> TOWN_HUGE_CORE = ITEMS.register("town_huge_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITY_HUGE_CORE = ITEMS.register("city_huge_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_CITY_HUGE_CORE = ITEMS.register("large_city_huge_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGIONAL_CAPITAL_HUGE_CORE = ITEMS.register("regional_capital_huge_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPITAL_HUGE_CORE = ITEMS.register("capital_huge_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KINGDOM_HUGE_CORE = ITEMS.register("kingdom_huge_core",
            () -> new Item(new Item.Properties()));
    //Giant
    public static final RegistryObject<Item> MINE_GIANT_CORE = ITEMS.register("mine_giant_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARM_GIANT_CORE = ITEMS.register("farm_giant_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIOME_GIANT_CORE = ITEMS.register("biome_giant_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDING_GIANT_CORE = ITEMS.register("building_giant_core",
            () -> new Item(new Item.Properties())); //This is a drop item
    public static final RegistryObject<Item> VILLAGE_GIANT_CORE = ITEMS.register("village_giant_core",
            () -> new Item(new Item.Properties())); //This is a crafting item made by 5 building cores
    public static final RegistryObject<Item> TOWN_GIANT_CORE = ITEMS.register("town_giant_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITY_GIANT_CORE = ITEMS.register("city_giant_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_CITY_GIANT_CORE = ITEMS.register("large_city_giant_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGIONAL_CAPITAL_GIANT_CORE = ITEMS.register("regional_capital_giant_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPITAL_GIANT_CORE = ITEMS.register("capital_giant_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KINGDOM_GIANT_CORE = ITEMS.register("kingdom_giant_core",
            () -> new Item(new Item.Properties()));
    //Super
    public static final RegistryObject<Item> MINE_SUPER_CORE = ITEMS.register("mine_super_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FARM_SUPER_CORE = ITEMS.register("farm_super_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIOME_SUPER_CORE = ITEMS.register("biome_super_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUILDING_SUPER_CORE = ITEMS.register("building_super_core",
            () -> new Item(new Item.Properties())); //This is a drop item
    public static final RegistryObject<Item> VILLAGE_SUPER_CORE = ITEMS.register("village_super_core",
            () -> new Item(new Item.Properties())); //This is a crafting item made by 5 building cores
    public static final RegistryObject<Item> TOWN_SUPER_CORE = ITEMS.register("town_super_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITY_SUPER_CORE = ITEMS.register("city_super_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_CITY_SUPER_CORE = ITEMS.register("large_city_super_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REGIONAL_CAPITAL_SUPER_CORE = ITEMS.register("regional_capital_super_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPITAL_SUPER_CORE = ITEMS.register("capital_super_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KINGDOM_SUPER_CORE = ITEMS.register("kingdom_super_core",
            () -> new Item(new Item.Properties()));

    //Cornerstones
    public static final RegistryObject<Item> BADLANDS_BIOME_CORNERSTONE = ITEMS.register("badlands_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_BIOME_CORNERSTONE = ITEMS.register("bamboo_jungle_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEACH_BIOME_CORNERSTONE = ITEMS.register("beach_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_FOREST_BIOME_CORNERSTONE = ITEMS.register("birch_forest_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_GROVE_BIOME_CORNERSTONE = ITEMS.register("cherry_grove_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COLD_OCEAN_BIOME_CORNERSTONE = ITEMS.register("cold_ocean_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_FOREST_BIOME_CORNERSTONE = ITEMS.register("dark_forest_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_COLD_OCEAN_BIOME_CORNERSTONE = ITEMS.register("deep_cold_ocean_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_DARK_BIOME_CORNERSTONE = ITEMS.register("deep_dark_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_FROZEN_OCEAN_BIOME_CORNERSTONE = ITEMS.register("deep_frozen_ocean_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_LUKEWARM_OCEAN_BIOME_CORNERSTONE = ITEMS.register("deep_lukewarm_ocean_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_OCEAN_BIOME_CORNERSTONE = ITEMS.register("deep_ocean_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESERT_BIOME_CORNERSTONE = ITEMS.register("desert_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIPSTONE_CAVES_BIOME_CORNERSTONE = ITEMS.register("dripstone_caves_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ERODED_BADLANDS_BIOME_CORNERSTONE = ITEMS.register("eroded_badlands_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLOWER_FOREST_BIOME_CORNERSTONE = ITEMS.register("flower_forest_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOREST_BIOME_CORNERSTONE = ITEMS.register("forest_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROZEN_OCEAN_BIOME_CORNERSTONE = ITEMS.register("frozen_ocean_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROZEN_PEAKS_BIOME_CORNERSTONE = ITEMS.register("frozen_peaks_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROZEN_RIVER_BIOME_CORNERSTONE = ITEMS.register("frozen_river_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GROVE_BIOME_CORNERSTONE = ITEMS.register("grove_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICE_SPIKES_BIOME_CORNERSTONE = ITEMS.register("ice_spikes_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JAGGED_PEAKS_BIOME_CORNERSTONE = ITEMS.register("jagged_peaks_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIOME_CORNERSTONE = ITEMS.register("jungle_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUKEWARM_OCEANS_BIOME_CORNERSTONE = ITEMS.register("lukewarm_ocean_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUSH_CAVES_BIOME_CORNERSTONE = ITEMS.register("lush_caves_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_SWAMP_BIOME_CORNERSTONE = ITEMS.register("mangrove_swamp_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEADOW_BIOME_CORNERSTONE = ITEMS.register("meadow_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUSHROOM_FIELDS_BIOME_CORNERSTONE = ITEMS.register("mushroom_fields_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OCEAN_BIOME_CORNERSTONE = ITEMS.register("ocean_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLD_GROWTH_BIRCH_FOREST_BIOME_CORNERSTONE = ITEMS.register("old_growth_birch_forest_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLD_GROWTH_PINE_TAIGA_BIOME_CORNERSTONE = ITEMS.register("old_growth_pine_taiga_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLD_GROWTH_SPRUCE_TAIGA_BIOME_CORNERSTONE = ITEMS.register("old_growth_spruce_taiga_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLAINS_BIOME_CORNERSTONE = ITEMS.register("plains_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIVER_BIOME_CORNERSTONE = ITEMS.register("river_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAVANNA_BIOME_CORNERSTONE = ITEMS.register("savanna_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAVANNA_PLATEAU_BIOME_CORNERSTONE = ITEMS.register("savanna_plateau_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SNOWY_BEACH_BIOME_CORNERSTONE = ITEMS.register("snowy_beach_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SNOWY_PLAINS_BIOME_CORNERSTONE = ITEMS.register("snowy_plains_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SNOWY_SLOPES_BIOME_CORNERSTONE = ITEMS.register("snowy_slopes_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SNOWY_TAIGA_BIOME_CORNERSTONE = ITEMS.register("snowy_taiga_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPARSE_JUNGLE_BIOME_CORNERSTONE = ITEMS.register("sparse_jungle_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONY_PEAKS_BIOME_CORNERSTONE = ITEMS.register("stony_peaks_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONY_SHORES_BIOME_CORNERSTONE = ITEMS.register("stony_shores_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUNFLOWER_PLAINS_BIOME_CORNERSTONE = ITEMS.register("sunflower_plains_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SWAMP_BIOME_CORNERSTONE = ITEMS.register("swamp_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAIGA_BIOME_CORNERSTONE = ITEMS.register("taiga_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WARM_OCEAN_BIOME_CORNERSTONE = ITEMS.register("warm_ocean_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WINDSWEPT_FOREST_BIOME_CORNERSTONE = ITEMS.register("windswept_forest_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WINDSWEPT_GRAVELLY_HILLS_BIOME_CORNERSTONE = ITEMS.register("windswept_gravelly_hills_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WINDSWEPT_HILLS_BIOME_CORNERSTONE = ITEMS.register("windswept_hills_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WINDSWEPT_SAVANNA_BIOME_CORNERSTONE = ITEMS.register("windswept_savanna_biome_cornerstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODED_BADLANDS_BIOME_CORNERSTONE = ITEMS.register("wooded_badlands_biome_cornerstone",
            () -> new Item(new Item.Properties()));

    //Block Items
    public static final RegistryObject<Item> KINGDOM_CRAFTER = ITEMS.register("kingdom_crafter",
            () -> new Item(new Item.Properties())); //This is a block item

    //"Stores"
    public static final RegistryObject<Item> GROCERY_STORE = ITEMS.register("grocery_store",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> WEAPONS_SHOP = ITEMS.register("weapon_shop",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ARMOUR_SHOP = ITEMS.register("armour_shop",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> TOOL_SHOP = ITEMS.register("tool_shop",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GENERAL_STORE = ITEMS.register("general_shop",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> JEWELERY_STORE = ITEMS.register("jewelery_shop",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BAKERY = ITEMS.register("bakery",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BUTCHER = ITEMS.register("butcher",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> FURNITURE_STORE = ITEMS.register("furniture_store",
            () -> new Item(new Item.Properties())); //This is a block item, this block makes nothing, just for internal function
    public static final RegistryObject<Item> FLOWER_SHOP = ITEMS.register("flower_shop",
            () -> new Item(new Item.Properties())); //This is a block item
    //Craftman shop
    public static final RegistryObject<Item> TOOLSMITH = ITEMS.register("toolsmith",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> WEAPONSMITH = ITEMS.register("weaponsmith",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ARMOURSMITH = ITEMS.register("armoursmith",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> JEWELER = ITEMS.register("jeweler",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LOG_YARD = ITEMS.register("log_yard",
            () -> new Item(new Item.Properties())); //This is a block item, this gives logs and sticks

    //Ore Mines
    public static final RegistryObject<Item> TINY_ORE_MINE = ITEMS.register("tiny_ore_mine",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_ORE_MINE = ITEMS.register("small_ore_mine",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_ORE_MINE = ITEMS.register("below_average_ore_mine",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_ORE_MINE = ITEMS.register("average_ore_mine",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_ORE_MINE = ITEMS.register("above_average_ore_mine",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_ORE_MINE = ITEMS.register("big_ore_mine",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_ORE_MINE = ITEMS.register("large_ore_mine",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_ORE_MINE = ITEMS.register("huge_ore_mine",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_ORE_MINE = ITEMS.register("giant_ore_mine",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_ORE_MINE = ITEMS.register("super_ore_mine",
            () -> new Item(new Item.Properties())); //This is a block item
    //Farms
    //Veggie
    public static final RegistryObject<Item> TINY_VEGGIE_FARM = ITEMS.register("tiny_veggie_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_VEGGIE_FARM = ITEMS.register("small_veggie_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_VEGGIE_FARM = ITEMS.register("below_average_veggie_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_VEGGIE_FARM = ITEMS.register("average_veggie_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_VEGGIE_FARM = ITEMS.register("above_average_veggie_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_VEGGIE_FARM = ITEMS.register("big_veggie_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_VEGGIE_FARM = ITEMS.register("large_veggie_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_VEGGIE_FARM = ITEMS.register("huge_veggie_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_VEGGIE_FARM = ITEMS.register("giant_veggie_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_VEGGIE_FARM = ITEMS.register("super_veggie_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    //Monster
    public static final RegistryObject<Item> TINY_MONSTER_FARM = ITEMS.register("tiny_monster_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_MONSTER_FARM = ITEMS.register("small_monster_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_MONSTER_FARM = ITEMS.register("below_average_monster_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_MONSTER_FARM = ITEMS.register("average_monster_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_MONSTER_FARM = ITEMS.register("above_average_monster_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_MONSTER_FARM = ITEMS.register("big_monster_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_MONSTER_FARM = ITEMS.register("large_monster_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_MONSTER_FARM = ITEMS.register("huge_monster_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_MONSTER_FARM = ITEMS.register("giant_monster_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_MONSTER_FARM = ITEMS.register("super_monster_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    //Animal
    public static final RegistryObject<Item> TINY_ANIMAL_FARM = ITEMS.register("tiny_animal_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_ANIMAL_FARM = ITEMS.register("small_animal_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_ANIMAL_FARM = ITEMS.register("below_average_animal_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_ANIMAL_FARM = ITEMS.register("average_animal_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_ANIMAL_FARM = ITEMS.register("above_average_animal_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_ANIMAL_FARM = ITEMS.register("big_animal_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_ANIMAL_FARM = ITEMS.register("large_animal_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_ANIMAL_FARM = ITEMS.register("huge_animal_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_ANIMAL_FARM = ITEMS.register("giant_animal_farm",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_ANIMAL_FARM = ITEMS.register("super_animal_farm",
            () -> new Item(new Item.Properties())); //This is a block item

    //House
    public static final RegistryObject<Item> TINY_HOUSE = ITEMS.register("tiny_house",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_HOUSE = ITEMS.register("small_house",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_HOUSE = ITEMS.register("below_average_house",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_HOUSE = ITEMS.register("average_house",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_HOUSE = ITEMS.register("above_average_house",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_HOUSE = ITEMS.register("big_house",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_HOUSE = ITEMS.register("large_house",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_HOUSE = ITEMS.register("huge_house",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_HOUSE = ITEMS.register("giant_house",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_HOUSE = ITEMS.register("super_house",
            () -> new Item(new Item.Properties())); //This is a block item
    //Village
    public static final RegistryObject<Item> TINY_VILLAGE = ITEMS.register("tiny_village",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_VILLAGE = ITEMS.register("small_village",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_VILLAGE = ITEMS.register("below_average_village",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_VILLAGE = ITEMS.register("average_village",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_VILLAGE = ITEMS.register("above_average_village",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_VILLAGE = ITEMS.register("big_village",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_VILLAGE = ITEMS.register("large_village",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_VILLAGE = ITEMS.register("huge_village",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_VILLAGE = ITEMS.register("giant_village",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_VILLAGE = ITEMS.register("super_village",
            () -> new Item(new Item.Properties())); //This is a block item
    //Town
    public static final RegistryObject<Item> TINY_TOWN = ITEMS.register("tiny_town",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_TOWN = ITEMS.register("small_town",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_TOWN = ITEMS.register("below_average_town",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_TOWN = ITEMS.register("average_town",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_TOWN = ITEMS.register("above_average_town",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_TOWN = ITEMS.register("big_town",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_TOWN = ITEMS.register("large_town",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_TOWN = ITEMS.register("huge_town",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_TOWN = ITEMS.register("giant_town",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_TOWN = ITEMS.register("super_town",
            () -> new Item(new Item.Properties())); //This is a block item
    //City
    public static final RegistryObject<Item> TINY_CITY = ITEMS.register("tiny_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_CITY = ITEMS.register("small_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_CITY = ITEMS.register("below_average_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_CITY = ITEMS.register("average_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_CITY = ITEMS.register("above_average_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_CITY = ITEMS.register("big_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_CITY = ITEMS.register("large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_CITY = ITEMS.register("huge_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_CITY = ITEMS.register("giant_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_CITY = ITEMS.register("super_city",
            () -> new Item(new Item.Properties())); //This is a block item
    //Large City
    public static final RegistryObject<Item> TINY_LARGE_CITY = ITEMS.register("tiny_large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_LARGE_CITY = ITEMS.register("small_large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_LARGE_CITY = ITEMS.register("below_average_large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_LARGE_CITY = ITEMS.register("average_large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_LARGE_CITY = ITEMS.register("above_average_large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_LARGE_CITY = ITEMS.register("big_large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_LARGE_CITY = ITEMS.register("large_large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_LARGE_CITY = ITEMS.register("huge_large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_LARGE_CITY = ITEMS.register("giant_large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_LARGE_CITY = ITEMS.register("super_large_city",
            () -> new Item(new Item.Properties())); //This is a block item
    //Regional Capital
    public static final RegistryObject<Item> TINY_REGIONAL_CAPITAL = ITEMS.register("tiny_regional_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_REGIONAL_CAPITAL = ITEMS.register("small_regional_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_REGIONAL_CAPITAL = ITEMS.register("below_average_regional_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_REGIONAL_CAPITAL = ITEMS.register("average_regional_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_REGIONAL_CAPITAL = ITEMS.register("above_average_regional_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_REGIONAL_CAPITAL = ITEMS.register("big_regional_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_REGIONAL_CAPITAL = ITEMS.register("large_regional_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_REGIONAL_CAPITAL = ITEMS.register("huge_regional_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_REGIONAL_CAPITAL = ITEMS.register("giant_regional_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_REGIONAL_CAPITAL = ITEMS.register("super_regional_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    //Capital
    public static final RegistryObject<Item> TINY_CAPITAL = ITEMS.register("tiny_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_CAPITAL = ITEMS.register("small_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_CAPITAL = ITEMS.register("below_average_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_CAPITAL = ITEMS.register("average_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_CAPITAL = ITEMS.register("above_average_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_CAPITAL = ITEMS.register("big_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_CAPITAL = ITEMS.register("large_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_CAPITAL = ITEMS.register("huge_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_CAPITAL = ITEMS.register("giant_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_CAPITAL = ITEMS.register("super_capital",
            () -> new Item(new Item.Properties())); //This is a block item
    //Kingdom
    public static final RegistryObject<Item> TINY_KINGDOM = ITEMS.register("tiny_kingdom",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SMALL_KINGDOM = ITEMS.register("small_kingdom",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BELOW_AVERAGE_KINGDOM = ITEMS.register("below_average_kingdom",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> AVERAGE_KINGDOM = ITEMS.register("average_kingdom",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> ABOVE_AVERAGE_KINGDOM = ITEMS.register("above_average_kingdom",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> BIG_KINGDOM = ITEMS.register("big_kingdom",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> LARGE_KINGDOM = ITEMS.register("large_kingdom",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> HUGE_KINGDOM = ITEMS.register("huge_kingdom",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> GIANT_KINGDOM = ITEMS.register("giant_kingdom",
            () -> new Item(new Item.Properties())); //This is a block item
    public static final RegistryObject<Item> SUPER_KINGDOM = ITEMS.register("super_kingdom",
            () -> new Item(new Item.Properties())); //This is a block item
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}