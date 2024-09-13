package net.dao.mini_kingdoms.items;

import net.dao.mini_kingdoms.Mini_kingdoms;
//import net.dao.mini_kingdoms.items.customs.VillageCatcherItem;
//import net.dao.mini_kingdoms.items.customs.CatchersItem;
import net.dao.mini_kingdoms.util.MKTags;
import net.minecraft.world.item.Item;
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
            () -> new Item(new Item.Properties().stacksTo(8) /*MKTags.MKEntity.VILLAGERS*/));
    public static final RegistryObject<Item> PASSIVE_MOB_CATCHER = ITEMS.register("passive_mob_catcher",
            () -> new Item(new Item.Properties().stacksTo(24) /*MKTags.MKEntity.ANIMALS*/));
    public static final RegistryObject<Item> AGGRESSIVE_MOB_CATCHER = ITEMS.register("aggressive_mob_catcher",
            () -> new Item(new Item.Properties().stacksTo(16) /*MKTags.MKEntity.MONSTERS*/));
    public static final RegistryObject<Item> NET_SOFTENER = ITEMS.register("net_softener",
            () -> new Item(new Item.Properties()));

    //Food
    public static final RegistryObject<Item> BONE_MARROW = ITEMS.register("bone_marrow",
            () -> new Item(new Item.Properties().food(MKFoodProperties.BONE_MARROW)));
    public static final RegistryObject<Item> BEAR_MEAT = ITEMS.register("bear_meat",
            () -> new Item(new Item.Properties().food(MKFoodProperties.BEAR_MEAT)));
    public static final RegistryObject<Item> BLAZE_BLOOD = ITEMS.register("blaze_blood",
            () -> new Item(new Item.Properties().food(MKFoodProperties.BLAZE_BLOOD)));
    public static final RegistryObject<Item> DOLPHIN_FIN = ITEMS.register("dolphin_fin",
            () -> new Item(new Item.Properties().food(MKFoodProperties.DOLPHIN_FIN)));
    public static final RegistryObject<Item> GLOW_SQUID_EYE = ITEMS.register("glow_squid_eye",
            () -> new Item(new Item.Properties().food(MKFoodProperties.GLOW_SQUID_EYE)));
    public static final RegistryObject<Item> DONKEY_MULE_MEAT = ITEMS.register("donkey_mule_meat",
            () -> new Item(new Item.Properties().food(MKFoodProperties.DONKEY_MULE_MEAT)));
    public static final RegistryObject<Item> HORSE_MEAT = ITEMS.register("horse_meat",
            () -> new Item(new Item.Properties().food(MKFoodProperties.HORSE_MEAT)));
    public static final RegistryObject<Item> RABBIT_FOOT_FOOD = ITEMS.register("rabbit_foot_food",
            () -> new Item(new Item.Properties().food(MKFoodProperties.RABBIT_FOOT_FOOD)));
    public static final RegistryObject<Item> TURTLE_SCALE = ITEMS.register("turtle_scale",
            () -> new Item(new Item.Properties().food(MKFoodProperties.TURTLE_SCALE)));
    public static final RegistryObject<Item> CAT_FEET = ITEMS.register("cat_feet",
            () -> new Item(new Item.Properties().food(MKFoodProperties.CAT_FEET)));
    public static final RegistryObject<Item> ARMADILLO_SCALE = ITEMS.register("armadillo_scale",
            () -> new Item(new Item.Properties().food(MKFoodProperties.ARMADILLO_SCALE)));
    public static final RegistryObject<Item> STOMACH = ITEMS.register("stomach",
            () -> new Item(new Item.Properties().food(MKFoodProperties.STOMACH)));
    public static final RegistryObject<Item> LIVER = ITEMS.register("liver",
            () -> new Item(new Item.Properties().food(MKFoodProperties.LIVER)));
    public static final RegistryObject<Item> LUNGS = ITEMS.register("lungs",
            () -> new Item(new Item.Properties().food(MKFoodProperties.LUNGS)));
    public static final RegistryObject<Item> HEART = ITEMS.register("heart",
            () -> new Item(new Item.Properties().food(MKFoodProperties.HEART)));
    public static final RegistryObject<Item> CRAZY_BLOOD = ITEMS.register("crazy_blood",
            () -> new Item(new Item.Properties().food(MKFoodProperties.CRAZY_BLOOD)));
    //Food-related
    public static final RegistryObject<Item> SMALL_EXPERIENCE_ORB = ITEMS.register("small_experience_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_EXPERIENCE_ORB = ITEMS.register("big_experience_orb",
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
