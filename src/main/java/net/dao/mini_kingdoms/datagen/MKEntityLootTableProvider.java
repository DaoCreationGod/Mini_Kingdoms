package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.items.MKItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import org.jetbrains.annotations.NotNull;

import java.util.Set;


public class MKEntityLootTableProvider extends EntityLootSubProvider {

    protected MKEntityLootTableProvider(HolderLookup.Provider pRegistries) {
        super(FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    public void generate(){
        //Base mobs
        this.add(EntityType.ARMADILLO, EntityType.ARMADILLO.getDefaultLootTable(), createArmadilloLootTable());
        this.add(EntityType.TURTLE, EntityType.TURTLE.getDefaultLootTable(), createTurtleLootTable());
        this.add(EntityType.HORSE, EntityType.HORSE.getDefaultLootTable(), createHorseLootTable());
        this.add(EntityType.DOLPHIN, EntityType.DOLPHIN.getDefaultLootTable(), createDolphinLootTable());
        this.add(EntityType.BLAZE, EntityType.BLAZE.getDefaultLootTable(), createBlazeLootTable());
        this.add(EntityType.RABBIT, EntityType.RABBIT.getDefaultLootTable(), createRabbitLootTable());
        this.add(EntityType.GLOW_SQUID, EntityType.GLOW_SQUID.getDefaultLootTable(), createGlowSquidLootTable());

        //Shared extra loot
        //Feet
        this.add(EntityType.CAT, EntityType.CAT.getDefaultLootTable(), createFeetLootTable());
        this.add(EntityType.OCELOT, EntityType.OCELOT.getDefaultLootTable(), createFeetLootTable());

        //Bearmeat (pa - bamboo, po - salmon & cod)
        this.add(EntityType.PANDA, EntityType.PANDA.getDefaultLootTable(), createBearMeatPandaLootTable());
        this.add(EntityType.POLAR_BEAR, EntityType.POLAR_BEAR.getDefaultLootTable(), createBearMeatPolarBearLootTable());

        //DMmeat (normal leather)
        this.add(EntityType.DONKEY, EntityType.DONKEY.getDefaultLootTable(), createDMMeatLootTable());
        this.add(EntityType.MULE, EntityType.MULE.getDefaultLootTable(), createDMMeatLootTable());

        //LootZombie (zog/zoh - rotten flesh; zom/zov/hu - rotten flesh, carrot, potato, iron ingot; zop - rotten flesh, golden nugget, golden ingot; dro - rotten flesh, copper ingot;
        this.add(EntityType.ZOMBIE, EntityType.ZOMBIE.getDefaultLootTable(), createLootZombieZomZovHuLootTable());
        this.add(EntityType.ZOGLIN, EntityType.ZOGLIN.getDefaultLootTable(), createLootZombieZogZohLootTable());
        this.add(EntityType.ZOMBIE_HORSE, EntityType.ZOMBIE_HORSE.getDefaultLootTable(), createLootZombieZogZohLootTable());
        this.add(EntityType.DROWNED, EntityType.DROWNED.getDefaultLootTable(), createLootZombieDroLootTable());
        this.add(EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIE_VILLAGER.getDefaultLootTable(), createLootZombieZomZovHuLootTable());
        this.add(EntityType.HUSK, EntityType.HUSK.getDefaultLootTable(), createLootZombieZomZovHuLootTable());
        this.add(EntityType.ZOMBIFIED_PIGLIN, EntityType.ZOMBIFIED_PIGLIN.getDefaultLootTable(), createLootZombieZopLootTable());

        //Rest of Organ Mobs
        this.add(EntityType.COW, EntityType.COW.getDefaultLootTable(), createOrganMobCowLootTable());
                this.add(EntityType.PIG, EntityType.PIG.getDefaultLootTable(), createOrganMobPigLootTable());
                this.add(EntityType.CAMEL, EntityType.CAMEL.getDefaultLootTable(), createOrganMobCamelLootTable());
                this.add(EntityType.CAVE_SPIDER, EntityType.CAVE_SPIDER.getDefaultLootTable(), createOrganMobSpiderLootTable());
                this.add(EntityType.CREEPER, EntityType.CREEPER.getDefaultLootTable(), createOrganMobCreeperLootTable());
                this.add(EntityType.ENDERMAN, EntityType.ENDERMAN.getDefaultLootTable(), createOrganMobEndermanLootTable());
                this.add(EntityType.SHEEP, EntityType.SHEEP.getDefaultLootTable(), createOrganMobSheepLootTable());
                this.add(EntityType.STRIDER, EntityType.STRIDER.getDefaultLootTable(), createOrganMobStriderLootTable());
                this.add(EntityType.SQUID, EntityType.SQUID.getDefaultLootTable(), createOrganMobSquidLootTable());
                this.add(EntityType.HOGLIN, EntityType.HOGLIN.getDefaultLootTable(), createOrganMobHoglinLootTable());
                this.add(EntityType.SPIDER, EntityType.SPIDER.getDefaultLootTable(), createOrganMobSpiderLootTable());
                this.add(EntityType.PIGLIN, EntityType.PIGLIN.getDefaultLootTable(), createOrganMobPiglinLootTable());
                this.add(EntityType.RAVAGER, EntityType.RAVAGER.getDefaultLootTable(), createOrganMobRavagerLootTable());
                this.add(EntityType.LLAMA, EntityType.LLAMA.getDefaultLootTable(), createOrganMobLlamaLootTable());
                this.add(EntityType.TRADER_LLAMA, EntityType.TRADER_LLAMA.getDefaultLootTable(), createOrganMobLlamaLootTable());
                this.add(EntityType.FOX, EntityType.FOX.getDefaultLootTable(), createOrganMobFoxLootTable());
                this.add(EntityType.SNIFFER, EntityType.SNIFFER.getDefaultLootTable(), createOrganMobSnifferLootTable());
                this.add(EntityType.MOOSHROOM, EntityType.MOOSHROOM.getDefaultLootTable(), createOrganMobCowLootTable());
    }

    protected LootTable.Builder createOrganMobCowLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.BEEF))
                        .add(LootItem.lootTableItem(Items.LEATHER)));
    }

    protected LootTable.Builder createOrganMobPigLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.PORKCHOP)));
    }

    protected LootTable.Builder createOrganMobCamelLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())));
    }

    protected LootTable.Builder createOrganMobSpiderLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.SPIDER_EYE))
                        .add(LootItem.lootTableItem(Items.STRING)));
    }

    protected LootTable.Builder createOrganMobCreeperLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.GUNPOWDER)));
    }

    protected LootTable.Builder createOrganMobEndermanLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.ENDER_PEARL)));
    }

    protected LootTable.Builder createOrganMobSheepLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.MUTTON))
                        .add(LootItem.lootTableItem(Items.WHITE_WOOL)));
    }

    protected LootTable.Builder createOrganMobStriderLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.STRING)));
    }

    protected LootTable.Builder createOrganMobSquidLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.INK_SAC)));
    }

    protected LootTable.Builder createOrganMobHoglinLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.PORKCHOP))
                        .add(LootItem.lootTableItem(Items.LEATHER)));
    }

    protected LootTable.Builder createOrganMobPiglinLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())));
    }

    protected LootTable.Builder createOrganMobRavagerLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.SADDLE)));
    }

    protected LootTable.Builder createOrganMobLlamaLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())));
    }

    protected LootTable.Builder createOrganMobFoxLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())));
    }

    protected LootTable.Builder createOrganMobSnifferLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())));
    }

    protected LootTable.Builder createLootZombieZopLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.CRAZY_BLOOD.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.ROTTEN_FLESH))
                        .add(LootItem.lootTableItem(Items.GOLD_INGOT))
                        .add(LootItem.lootTableItem(Items.GOLD_NUGGET)));
    }

    protected LootTable.Builder createLootZombieDroLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.CRAZY_BLOOD.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.ROTTEN_FLESH))
                        .add(LootItem.lootTableItem(Items.COPPER_INGOT)));
    }

    protected LootTable.Builder createLootZombieZogZohLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.CRAZY_BLOOD.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.ROTTEN_FLESH)));
    }

    protected LootTable.Builder createLootZombieZomZovHuLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.CRAZY_BLOOD.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.ROTTEN_FLESH))
                        .add(LootItem.lootTableItem(Items.CARROT))
                        .add(LootItem.lootTableItem(Items.POTATO))
                        .add(LootItem.lootTableItem(Items.IRON_INGOT)));
    }

    protected LootTable.Builder createDMMeatLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.DONKEY_MULE_MEAT.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.LEATHER)));
    }

    protected LootTable.Builder createBearMeatPolarBearLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.BEAR_MEAT.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.COD))
                        .add(LootItem.lootTableItem(Items.SALMON)));
    }

    protected LootTable.Builder createBearMeatPandaLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.BEAR_MEAT.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.BAMBOO)));
    }

    protected LootTable.Builder createFeetLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.CAT_FEET.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())));
    }

    protected LootTable.Builder createGlowSquidLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.GLOW_SQUID_EYE.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.GLOW_INK_SAC)));
    }

    protected LootTable.Builder createRabbitLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.RABBIT_FOOT_FOOD.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.RABBIT))
                        .add(LootItem.lootTableItem(Items.RABBIT_FOOT))
                        .add(LootItem.lootTableItem(Items.RABBIT_HIDE)));
    }

    protected LootTable.Builder createBlazeLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.BLAZE_BLOOD.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.BLAZE_ROD)));
    }

    protected LootTable.Builder createDolphinLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(MKItems.DOLPHIN_FIN.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.COD)));
    }

    protected LootTable.Builder createHorseLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.HORSE_MEAT.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.LEATHER)));
    }

    protected LootTable.Builder createTurtleLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.TURTLE_SCALE.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.SEAGRASS))
                        .add(LootItem.lootTableItem(Items.TURTLE_SCUTE)));
    }

    protected LootTable.Builder createArmadilloLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.ARMADILLO_SCALE.get()))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()))
                        .add(LootItem.lootTableItem(MKItems.HEART.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(Items.ARMADILLO_SCUTE)));
    }


    @Override
    protected java.util.stream.@NotNull Stream<EntityType<?>> getKnownEntityTypes() {
        // Create a Set of the entity types you want to include
        Set<EntityType<?>> allowedEntities = Set.of(EntityType.BLAZE, EntityType.ARMADILLO, EntityType.TURTLE, EntityType.HORSE, EntityType.DOLPHIN, EntityType.RABBIT, EntityType.GLOW_SQUID, EntityType.CAT, EntityType.OCELOT, EntityType.PANDA, EntityType.POLAR_BEAR, EntityType.DONKEY, EntityType.MULE, EntityType.ZOMBIE, EntityType.ZOGLIN, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIE_HORSE, EntityType.ZOMBIFIED_PIGLIN, EntityType.DROWNED, EntityType.HUSK, EntityType.COW, EntityType.PIG, EntityType.CAMEL, EntityType.MOOSHROOM, EntityType.SNIFFER, EntityType.SQUID, EntityType.FOX, EntityType.LLAMA, EntityType.TRADER_LLAMA, EntityType.RAVAGER, EntityType.PIGLIN, EntityType.HOGLIN, EntityType.STRIDER, EntityType.SHEEP, EntityType.ENDERMAN, EntityType.SPIDER, EntityType.CAVE_SPIDER, EntityType.CREEPER);

        // Use Stream to filter entities by checking if they are in the allowed set
        return BuiltInRegistries.ENTITY_TYPE.stream()
                .filter(allowedEntities::contains);
    }
}