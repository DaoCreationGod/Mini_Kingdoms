package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.dao.mini_kingdoms.items.MKItems;
import net.dao.mini_kingdoms.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class MKGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public MKGlobalLootModifiersProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, Mini_kingdoms.MODID, registries);
    }

    @Override
    protected void start(HolderLookup.Provider registries) {
        add("dolphin_fin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/dolphin")).build(), LootItemRandomChanceCondition.randomChance(0.5f).build()
        }, MKItems.DOLPHIN_FIN.get()));
        add("blaze_blood_from_blaze", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/blaze")).build(), LootItemRandomChanceCondition.randomChance(0.175f).build()
        }, MKItems.BLAZE_BLOOD.get()));
        add("glow_squid_eye_from_glow_squid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/glow_squid")).build(), LootItemRandomChanceCondition.randomChance(0.225f).build()
        }, MKItems.GLOW_SQUID_EYE.get()));
        add("rabbit_foot_food_from_rabbit", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/rabbit")).build(), LootItemRandomChanceCondition.randomChance(0.19f).build()
        }, MKItems.RABBIT_FOOT_FOOD.get()));
        add("armadillo_scale_from_armadillo", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/armadillo")).build(), LootItemRandomChanceCondition.randomChance(0.9f).build()
        }, MKItems.ARMADILLO_SCALE.get()));
        add("turtle_scale_from_turtle", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/turtle")).build(), LootItemRandomChanceCondition.randomChance(0.9f).build()
        }, MKItems.TURTLE_SCALE.get()));
        add("horse_meat_from_horse", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/horse")).build(), LootItemRandomChanceCondition.randomChance(0.75f).build()
        }, MKItems.HORSE_MEAT.get()));
        add("cat_feet_from_ocelot", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ocelot")).build(), LootItemRandomChanceCondition.randomChance(0.6f).build()
        }, MKItems.CAT_FEET.get()));
        add("cat_feet_from_cat", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cat")).build(), LootItemRandomChanceCondition.randomChance(0.65f).build()
        }, MKItems.CAT_FEET.get()));
        add("bear_meat_from_panda", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/panda")).build(), LootItemRandomChanceCondition.randomChance(0.11f).build()
        }, MKItems.BEAR_MEAT.get()));
        add("bear_meat_from_polar_bear", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/polar_bear")).build(), LootItemRandomChanceCondition.randomChance(0.11f).build()
        }, MKItems.BEAR_MEAT.get()));
        add("dm_meat_from_donkey", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/donkey")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build(), new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/mule")).build(), LootItemRandomChanceCondition.randomChance(0.45f).build()
        }, MKItems.DONKEY_MULE_MEAT.get()));
        add("dm_meat_from_mule", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/mule")).build(), LootItemRandomChanceCondition.randomChance(0.45f).build()
        }, MKItems.DONKEY_MULE_MEAT.get()));
        add("crazy_blood_from_zombie", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.CRAZY_BLOOD.get()));
        add("crazy_blood_from_zombie_villager", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_villager")).build(), LootItemRandomChanceCondition.randomChance(0.60f).build()
        }, MKItems.CRAZY_BLOOD.get()));
        add("crazy_blood_from_husk", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/husk")).build(), LootItemRandomChanceCondition.randomChance(0.40f).build()
        }, MKItems.CRAZY_BLOOD.get()));
        add("crazy_blood_from_drowned", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/drowned")).build(), LootItemRandomChanceCondition.randomChance(0.35f).build()
        }, MKItems.CRAZY_BLOOD.get()));
        add("crazy_blood_from_zombiefied_piglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombiefied_piglin")).build(), LootItemRandomChanceCondition.randomChance(0.80f).build()
        }, MKItems.CRAZY_BLOOD.get()));
        add("crazy_blood_from_zoglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zoglin")).build(), LootItemRandomChanceCondition.randomChance(0.70f).build()
        }, MKItems.CRAZY_BLOOD.get()));
        add("crazy_blood_from_zombie_horse", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_horse")).build(), LootItemRandomChanceCondition.randomChance(0.50f).build()
        }, MKItems.CRAZY_BLOOD.get()));
        add("stomach_from_creature_zombie", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_zombie_villager", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_villager")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_husk", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/husk")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_drowned", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/drowned")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_zombiefied_piglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombiefied_piglin")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_zoglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zoglin")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_zombie_horse", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_horse")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_cow", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cow")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_pig", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/pig")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_armadillo", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/armadillo")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_camel", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/camel")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_cave_spider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cave_spider")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_spider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/spider")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_creeper", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_dolphin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/dolphin")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_enderman", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/enderman")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_sheep", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/sheep")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_strider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/strider")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_squid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/squid")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_glow_squid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/glow_squid")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_hoglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/hoglin")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_piglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/piglin")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_ravager", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ravager")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_llama", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/llama")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_trader_llama", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/trader_llama")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_fox", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/fox")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_sniffer", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/sniffer")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_mooshroom", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/mooshroom")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_cat", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cat")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_ocelot", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ocelot")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_donkey", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/donkey")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_mule", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/mule")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_panda", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/panda")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_polar_bear", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/polar_bear")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("stomach_from_creature_horse", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/horse")).build(), LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MKItems.STOMACH.get()));
        add("liver_from_creature_zombie", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_zombie_villager", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_villager")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_husk", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/husk")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_drowned", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/drowned")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_zombiefied_piglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombiefied_piglin")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_zoglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zoglin")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_zombie_horse", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_horse")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_cow", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cow")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_pig", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/pig")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_armadillo", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/armadillo")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_camel", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/camel")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_cave_spider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cave_spider")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_spider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/spider")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_creeper", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_dolphin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/dolphin")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_enderman", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/enderman")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_sheep", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/sheep")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_strider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/strider")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_squid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/squid")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_glow_squid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/glow_squid")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_hoglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/hoglin")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_piglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/piglin")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_ravager", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ravager")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_llama", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/llama")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_trader_llama", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/trader_llama")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_fox", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/fox")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_sniffer", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/sniffer")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_mooshroom", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/mooshroom")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_cat", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cat")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_ocelot", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ocelot")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_donkey", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/donkey")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_mule", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/mule")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_panda", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/panda")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_polar_bear", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/polar_bear")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("liver_from_creature_horse", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/horse")).build(), LootItemRandomChanceCondition.randomChance(0.20f).build()
        }, MKItems.LIVER.get()));
        add("lungs_from_creature_zombie", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_zombie_villager", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_villager")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_husk", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/husk")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_drowned", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/drowned")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_zombiefied_piglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombiefied_piglin")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_zoglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zoglin")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_zombie_horse", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_horse")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_cow", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cow")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_pig", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/pig")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_armadillo", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/armadillo")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_camel", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/camel")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_cave_spider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cave_spider")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_spider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/spider")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_creeper", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_dolphin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/dolphin")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_enderman", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/enderman")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_sheep", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/sheep")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_strider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/strider")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_squid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/squid")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_glow_squid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/glow_squid")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_hoglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/hoglin")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_piglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/piglin")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_ravager", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ravager")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_llama", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/llama")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_trader_llama", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/trader_llama")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_fox", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/fox")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_sniffer", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/sniffer")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_mooshroom", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/mooshroom")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_cat", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cat")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_ocelot", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ocelot")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_donkey", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/donkey")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_mule", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/mule")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_panda", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/panda")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_polar_bear", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/polar_bear")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("lungs_from_creature_horse", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/horse")).build(), LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, MKItems.LUNGS.get()));
        add("heart_from_creature_zombie", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_zombie_villager", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_villager")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_husk", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/husk")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_drowned", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/drowned")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_zombiefied_piglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombiefied_piglin")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_zoglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zoglin")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_zombie_horse", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_horse")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_cow", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cow")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_pig", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/pig")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_armadillo", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/armadillo")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_camel", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/camel")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_cave_spider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cave_spider")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_spider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/spider")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_creeper", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_dolphin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/dolphin")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_enderman", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/enderman")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_sheep", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/sheep")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_strider", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/strider")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_squid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/squid")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_glow_squid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/glow_squid")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_hoglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/hoglin")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_piglin", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/piglin")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_ravager", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ravager")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_llama", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/llama")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_trader_llama", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/trader_llama")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_fox", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/fox")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_sniffer", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/sniffer")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_mooshroom", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/mooshroom")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_cat", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cat")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_ocelot", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ocelot")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_donkey", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/donkey")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_mule", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/mule")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_panda", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/panda")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_polar_bear", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/polar_bear")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
        add("heart_from_creature_horse", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/horse")).build(), LootItemRandomChanceCondition.randomChance(0.10f).build()
        }, MKItems.HEART.get()));
    }
}
