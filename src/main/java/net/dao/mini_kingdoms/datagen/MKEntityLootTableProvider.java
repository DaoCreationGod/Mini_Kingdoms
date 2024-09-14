package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.items.MKItems;
import net.dao.mini_kingdoms.util.MKTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;

public class MKEntityLootTableProvider extends EntityLootSubProvider {

    public MKEntityLootTableProvider(PackOutput output){
        super(output, Set.of(), LootContextParamSets.ENTITY);
    }
    @Override
    public void generate() {

        add(EntityType.ARMADILLO, createArmadilloLootTable());
        add(EntityType.TURTLE, createTurtleLootTable());
        add(EntityType.BLAZE, createBlazeLootTable());
        add(EntityType.DOLPHIN, createDolphinLootTable());
        add(EntityType.RABBIT, createRabbitLootTable());
        add(EntityType.HORSE, createHorseLootTable());
        add(EntityType.GLOW_SQUID, createGlowSquidLootTable());

        // Add loot tables for entities in custom tags
        applyLootTableForTag(MKTags.MKEntity.FEET, createFeetLootTable());
        applyLootTableForTag(MKTags.MKEntity.LOOTZOMBIE, createLootZombieLootTable());
        applyLootTableForTag(MKTags.MKEntity.BEARMEAT, createBearLootTable());
        applyLootTableForTag(MKTags.MKEntity.DMMEAT, createDMMeatLootTable());
        applyLootTableForTag(MKTags.MKEntity.ORGANMOBS, createOrganLootTable());
    }

    private LootTable.Builder createOrganLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(4))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()).setWeight(25))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()).setWeight(10))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()).setWeight(10))
                        .add(LootItem.lootTableItem(MKItems.HEART.get()).setWeight(5)));
    }

    private LootTable.Builder createDMMeatLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.DONKEY_MULE_MEAT.get())));
    }

    private LootTable.Builder createBearLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.BEAR_MEAT.get())));
    }

    private LootTable.Builder createLootZombieLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(5))
                        .add(LootItem.lootTableItem(MKItems.CRAZY_BLOOD.get())));
    }

    private LootTable.Builder createFeetLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(6))
                        .add(LootItem.lootTableItem(MKItems.CAT_FEET.get())));
    }




    private LootTable.Builder createGlowSquidLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.GLOW_SQUID_EYE.get())));
    }

    private LootTable.Builder createHorseLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.HORSE_MEAT.get())));
    }

    private LootTable.Builder createRabbitLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.RABBIT_FOOT_FOOD.get())));
    }

    private LootTable.Builder createDolphinLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.DOLPHIN_FIN.get())));
    }

    private LootTable.Builder createBlazeLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.BLAZE_BLOOD.get())));
    }

    private LootTable.Builder createTurtleLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.TURTLE_SCALE.get())));
    }

    private LootTable.Builder createArmadilloLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.ARMADILLO_SCALE.get())));
    }

    // Custom helper function to apply loot tables to all entities in a tag
    private void applyLootTableForTag(TagKey<EntityType<?>> tag, LootTable.Builder lootTable) {
        ForgeRegistries.ENTITY_TYPES.tags()
                .getTag(tag)  // Get all entities in the tag
                .stream()
                .forEach(entityType -> add(entityType, lootTable));  // Apply loot table to each entity in the tag
    }

    @Override
    protected Iterable<EntityType<?>> getKnownEntities() {
        // List all entities you're modifying here
        return Set.of(EntityType.ZOMBIE, EntityType.CREEPER);
    }

}
