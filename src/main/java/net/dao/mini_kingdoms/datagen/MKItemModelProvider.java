package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.dao.mini_kingdoms.items.MKItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MKItemModelProvider extends ItemModelProvider {

    public MKItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Mini_kingdoms.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ResourceLocation core = modLoc("item/core");
        ResourceLocation meat = modLoc("item/beef");
        ResourceLocation scute1 = modLoc("item/armadillo_scute");
        ResourceLocation scute2 = modLoc("item/turtle_scute");
        ResourceLocation foot = modLoc("item/rabbit_foot");
        basicItem(MKItems.AGGRESSIVE_MOB_CATCHER.get());
        basicItem(MKItems.PASSIVE_MOB_CATCHER.get());
        basicItem(MKItems.VILLAGER_CATCHER.get());
        basicItem(MKItems.STRENGTHENED_LEATHER_NET.get());
        basicItem(MKItems.NET_SOFTENER.get());
        basicItem(MKItems.LEATHER_NET.get());
        basicItem(MKItems.SOFT_LEATHER_NET.get());
        basicItem(MKItems.GROWTH_BASE.get());

        basicItem(MKItems.BONE_MARROW.get());
        basicItem(MKItems.LIVER.get());
        basicItem(MKItems.BLAZE_BLOOD.get());
        basicItem(MKItems.HEART.get());
        basicItem(MKItems.LUNGS.get());
        basicItem(MKItems.DOLPHIN_FIN.get());
        basicItem(MKItems.STOMACH.get());
        basicItem(MKItems.CRAZY_BLOOD.get());
        basicItem(MKItems.CAT_FEET.get());
        basicItem(MKItems.GLOW_SQUID_EYE.get());
        itemWithTexture(MKItems.BEAR_MEAT, meat);
        itemWithTexture(MKItems.HORSE_MEAT, meat);
        itemWithTexture(MKItems.DONKEY_MULE_MEAT, meat);
        itemWithTexture(MKItems.ARMADILLO_SCALE, scute1);
        itemWithTexture(MKItems.TURTLE_SCALE, scute2);
        itemWithTexture(MKItems.RABBIT_FOOT_FOOD, foot);


        itemWithTexture(MKItems.MINE_TINY_CORE, core);
        itemWithTexture(MKItems.FARM_TINY_CORE, core);
        itemWithTexture(MKItems.BIOME_TINY_CORE, core);
        itemWithTexture(MKItems.BUILDING_TINY_CORE, core);
        itemWithTexture(MKItems.VILLAGE_TINY_CORE, core);
        itemWithTexture(MKItems.TOWN_TINY_CORE, core);
        itemWithTexture(MKItems.CITY_TINY_CORE, core);
        itemWithTexture(MKItems.LARGE_CITY_TINY_CORE, core);
        itemWithTexture(MKItems.REGIONAL_CAPITAL_TINY_CORE, core);
        itemWithTexture(MKItems.CAPITAL_TINY_CORE, core);
        itemWithTexture(MKItems.KINGDOM_TINY_CORE, core);

        itemWithTexture(MKItems.MINE_SMALL_CORE, core);
        itemWithTexture(MKItems.FARM_SMALL_CORE, core);
        itemWithTexture(MKItems.BIOME_SMALL_CORE, core);
        itemWithTexture(MKItems.BUILDING_SMALL_CORE, core);
        itemWithTexture(MKItems.VILLAGE_SMALL_CORE, core);
        itemWithTexture(MKItems.TOWN_SMALL_CORE, core);
        itemWithTexture(MKItems.CITY_SMALL_CORE, core);
        itemWithTexture(MKItems.LARGE_CITY_SMALL_CORE, core);
        itemWithTexture(MKItems.REGIONAL_CAPITAL_SMALL_CORE, core);
        itemWithTexture(MKItems.CAPITAL_SMALL_CORE, core);
        itemWithTexture(MKItems.KINGDOM_SMALL_CORE, core);

        itemWithTexture(MKItems.MINE_BELOW_AVERAGE_CORE, core);
        itemWithTexture(MKItems.FARM_BELOW_AVERAGE_CORE, core);
        itemWithTexture(MKItems.BIOME_BELOW_AVERAGE_CORE, core);
        itemWithTexture(MKItems.BUILDING_BELOW_AVERAGE_CORE, core);
        itemWithTexture(MKItems.VILLAGE_BELOW_AVERAGE_CORE, core);
        itemWithTexture(MKItems.TOWN_BELOW_AVERAGE_CORE, core);
        itemWithTexture(MKItems.CITY_BELOW_AVERAGE_CORE, core);
        itemWithTexture(MKItems.LARGE_CITY_BELOW_AVERAGE_CORE, core);
        itemWithTexture(MKItems.REGIONAL_CAPITAL_BELOW_AVERAGE_CORE, core);
        itemWithTexture(MKItems.CAPITAL_BELOW_AVERAGE_CORE, core);
        itemWithTexture(MKItems.KINGDOM_BELOW_AVERAGE_CORE, core);

        itemWithTexture(MKItems.MINE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.FARM_AVERAGE_CORE, core);
        itemWithTexture(MKItems.BIOME_AVERAGE_CORE, core);
        itemWithTexture(MKItems.BUILDING_AVERAGE_CORE, core);
        itemWithTexture(MKItems.VILLAGE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.TOWN_AVERAGE_CORE, core);
        itemWithTexture(MKItems.CITY_AVERAGE_CORE, core);
        itemWithTexture(MKItems.LARGE_CITY_AVERAGE_CORE, core);
        itemWithTexture(MKItems.REGIONAL_CAPITAL_AVERAGE_CORE, core);
        itemWithTexture(MKItems.CAPITAL_AVERAGE_CORE, core);
        itemWithTexture(MKItems.KINGDOM_AVERAGE_CORE, core);

        itemWithTexture(MKItems.MINE_ABOVE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.FARM_ABOVE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.BIOME_ABOVE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.BUILDING_ABOVE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.VILLAGE_ABOVE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.TOWN_ABOVE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.CITY_ABOVE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.LARGE_CITY_ABOVE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.REGIONAL_CAPITAL_ABOVE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.CAPITAL_ABOVE_AVERAGE_CORE, core);
        itemWithTexture(MKItems.KINGDOM_ABOVE_AVERAGE_CORE, core);

        itemWithTexture(MKItems.MINE_BIG_CORE, core);
        itemWithTexture(MKItems.FARM_BIG_CORE, core);
        itemWithTexture(MKItems.BIOME_BIG_CORE, core);
        itemWithTexture(MKItems.BUILDING_BIG_CORE, core);
        itemWithTexture(MKItems.VILLAGE_BIG_CORE, core);
        itemWithTexture(MKItems.TOWN_BIG_CORE, core);
        itemWithTexture(MKItems.CITY_BIG_CORE, core);
        itemWithTexture(MKItems.LARGE_CITY_BIG_CORE, core);
        itemWithTexture(MKItems.REGIONAL_CAPITAL_BIG_CORE, core);
        itemWithTexture(MKItems.CAPITAL_BIG_CORE, core);
        itemWithTexture(MKItems.KINGDOM_BIG_CORE, core);

        itemWithTexture(MKItems.MINE_LARGE_CORE, core);
        itemWithTexture(MKItems.FARM_LARGE_CORE, core);
        itemWithTexture(MKItems.BIOME_LARGE_CORE, core);
        itemWithTexture(MKItems.BUILDING_LARGE_CORE, core);
        itemWithTexture(MKItems.VILLAGE_LARGE_CORE, core);
        itemWithTexture(MKItems.TOWN_LARGE_CORE, core);
        itemWithTexture(MKItems.CITY_LARGE_CORE, core);
        itemWithTexture(MKItems.LARGE_CITY_LARGE_CORE, core);
        itemWithTexture(MKItems.REGIONAL_CAPITAL_LARGE_CORE, core);
        itemWithTexture(MKItems.CAPITAL_LARGE_CORE, core);
        itemWithTexture(MKItems.KINGDOM_LARGE_CORE, core);

        itemWithTexture(MKItems.MINE_HUGE_CORE, core);
        itemWithTexture(MKItems.FARM_HUGE_CORE, core);
        itemWithTexture(MKItems.BIOME_HUGE_CORE, core);
        itemWithTexture(MKItems.BUILDING_HUGE_CORE, core);
        itemWithTexture(MKItems.VILLAGE_HUGE_CORE, core);
        itemWithTexture(MKItems.TOWN_HUGE_CORE, core);
        itemWithTexture(MKItems.CITY_HUGE_CORE, core);
        itemWithTexture(MKItems.LARGE_CITY_HUGE_CORE, core);
        itemWithTexture(MKItems.REGIONAL_CAPITAL_HUGE_CORE, core);
        itemWithTexture(MKItems.CAPITAL_HUGE_CORE, core);
        itemWithTexture(MKItems.KINGDOM_HUGE_CORE, core);

        itemWithTexture(MKItems.MINE_GIANT_CORE, core);
        itemWithTexture(MKItems.FARM_GIANT_CORE, core);
        itemWithTexture(MKItems.BIOME_GIANT_CORE, core);
        itemWithTexture(MKItems.BUILDING_GIANT_CORE, core);
        itemWithTexture(MKItems.VILLAGE_GIANT_CORE, core);
        itemWithTexture(MKItems.TOWN_GIANT_CORE, core);
        itemWithTexture(MKItems.CITY_GIANT_CORE, core);
        itemWithTexture(MKItems.LARGE_CITY_GIANT_CORE, core);
        itemWithTexture(MKItems.REGIONAL_CAPITAL_GIANT_CORE, core);
        itemWithTexture(MKItems.CAPITAL_GIANT_CORE, core);
        itemWithTexture(MKItems.KINGDOM_GIANT_CORE, core);

        itemWithTexture(MKItems.MINE_SUPER_CORE, core);
        itemWithTexture(MKItems.FARM_SUPER_CORE, core);
        itemWithTexture(MKItems.BIOME_SUPER_CORE, core);
        itemWithTexture(MKItems.BUILDING_SUPER_CORE, core);
        itemWithTexture(MKItems.VILLAGE_SUPER_CORE, core);
        itemWithTexture(MKItems.TOWN_SUPER_CORE, core);
        itemWithTexture(MKItems.CITY_SUPER_CORE, core);
        itemWithTexture(MKItems.LARGE_CITY_SUPER_CORE, core);
        itemWithTexture(MKItems.REGIONAL_CAPITAL_SUPER_CORE, core);
        itemWithTexture(MKItems.CAPITAL_SUPER_CORE, core);
        itemWithTexture(MKItems.KINGDOM_SUPER_CORE, core);
    }

    private void itemWithTexture(RegistryObject<Item> itemRegistryObject, ResourceLocation texture) {
        ResourceLocation itemRegistryName = ForgeRegistries.ITEMS.getKey(itemRegistryObject.get());

        // Ensure the item has a registry name
        if (itemRegistryName != null) {
            getBuilder(itemRegistryName.getPath())
                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                    .texture("layer0", texture);
        }
    }

}
