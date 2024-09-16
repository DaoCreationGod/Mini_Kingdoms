package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.items.MKItems;
import net.dao.mini_kingdoms.util.MKTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MKEntityLootTableProvider extends EntityLootSubProvider {

    protected MKEntityLootTableProvider(HolderLookup.Provider pRegistries) {
        super(FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    public void generate() {
        // Add loot tables for specific entities
        addLootTableForEntity(EntityType.ARMADILLO, createArmadilloLootTable());
        addLootTableForEntity(EntityType.TURTLE, createTurtleLootTable());
        addLootTableForEntity(EntityType.BLAZE, createBlazeLootTable());
        addLootTableForEntity(EntityType.DOLPHIN, createDolphinLootTable());
        addLootTableForEntity(EntityType.RABBIT, createRabbitLootTable());
        addLootTableForEntity(EntityType.HORSE, createHorseLootTable());
        addLootTableForEntity(EntityType.GLOW_SQUID, createGlowSquidLootTable());

        // Apply custom loot tables for entities in your custom tags
        applyLootTableForTag(MKTags.MKEntity.FEET, createFeetLootTable());
        applyLootTableForTag(MKTags.MKEntity.LOOTZOMBIE, createLootZombieLootTable());
        applyLootTableForTag(MKTags.MKEntity.BEARMEAT, createBearLootTable());
        applyLootTableForTag(MKTags.MKEntity.DMMEAT, createDMMeatLootTable());
        applyLootTableForTag(MKTags.MKEntity.ORGANMOBS, createOrganLootTable());
    }

    @Override
    protected java.util.stream.@NotNull Stream<EntityType<?>> getKnownEntityTypes() {
        // Define a set to hold the allowed entities
        Set<EntityType<?>> allowedEntities = new HashSet<>();

        // Add specific entities you want to include (e.g., ARMADILLO, TURTLE, etc.)
        allowedEntities.add(EntityType.ARMADILLO);
        allowedEntities.add(EntityType.TURTLE);
        allowedEntities.add(EntityType.BLAZE);
        allowedEntities.add(EntityType.DOLPHIN);
        allowedEntities.add(EntityType.RABBIT);
        allowedEntities.add(EntityType.HORSE);
        allowedEntities.add(EntityType.GLOW_SQUID);

        // Add entities from custom tags
        allowedEntities.addAll(getEntitiesFromTag(MKTags.MKEntity.FEET));
        allowedEntities.addAll(getEntitiesFromTag(MKTags.MKEntity.LOOTZOMBIE));
        allowedEntities.addAll(getEntitiesFromTag(MKTags.MKEntity.BEARMEAT));
        allowedEntities.addAll(getEntitiesFromTag(MKTags.MKEntity.DMMEAT));
        allowedEntities.addAll(getEntitiesFromTag(MKTags.MKEntity.ORGANMOBS));

        // Return a filtered stream of allowed entities excluding the ones in the exclusion set
        return allowedEntities.stream();
    }

    // Helper function to create a loot table for a specific entity
    protected void addLootTableForEntity(EntityType<?> entityType, LootTable.Builder customLoot) {
        // Create a new LootTable with a new pool and weighted items
        // Register the loot table
        add(entityType, customLoot);
    }

    // Apply loot table for entities in a tag
    protected void applyLootTableForTag(TagKey<EntityType<?>> tag, LootTable.Builder customLoot) {
        // Go through all entities and check if they are in the given tag
        ForgeRegistries.ENTITY_TYPES.getValues().stream()
                .filter(entityType -> entityType.is(tag)) // Check if the entity is part of the tag
                .forEach(entityType -> addLootTableForEntity(entityType, customLoot)); // Apply loot table to each
    }

    // Retrieve all registered entities, including custom tags
    protected Iterable<EntityType<?>> getKnownEntities() {
        Set<EntityType<?>> knownEntities = new HashSet<>();

        // Explicitly known entities
        knownEntities.add(EntityType.ARMADILLO);
        knownEntities.add(EntityType.TURTLE);
        knownEntities.add(EntityType.BLAZE);
        knownEntities.add(EntityType.DOLPHIN);
        knownEntities.add(EntityType.RABBIT);
        knownEntities.add(EntityType.HORSE);
        knownEntities.add(EntityType.GLOW_SQUID);

        // Add entities from tags
        knownEntities.addAll(getEntitiesFromTag(MKTags.MKEntity.FEET));
        knownEntities.addAll(getEntitiesFromTag(MKTags.MKEntity.LOOTZOMBIE));
        knownEntities.addAll(getEntitiesFromTag(MKTags.MKEntity.BEARMEAT));
        knownEntities.addAll(getEntitiesFromTag(MKTags.MKEntity.DMMEAT));
        knownEntities.addAll(getEntitiesFromTag(MKTags.MKEntity.ORGANMOBS));

        return knownEntities;
    }

    // Helper function to retrieve entities from a tag
    protected Set<EntityType<?>> getEntitiesFromTag(TagKey<EntityType<?>> tag) {
        return ForgeRegistries.ENTITY_TYPES.tags()
                .getTag(tag)
                .stream()
                .map(entityType -> entityType)
                .collect(Collectors.toSet());
    }

    // Custom loot tables
    protected LootTable.Builder createOrganLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(4))
                        .add(LootItem.lootTableItem(MKItems.STOMACH.get()).setWeight(25))
                        .add(LootItem.lootTableItem(MKItems.LIVER.get()).setWeight(10))
                        .add(LootItem.lootTableItem(MKItems.LUNGS.get()).setWeight(10))
                        .add(LootItem.lootTableItem(MKItems.HEART.get()).setWeight(5)));
    }

    protected LootTable.Builder createDMMeatLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.DONKEY_MULE_MEAT.get())));
    }

    protected LootTable.Builder createBearLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.BEAR_MEAT.get())));
    }

    protected LootTable.Builder createLootZombieLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(5))
                        .add(LootItem.lootTableItem(MKItems.CRAZY_BLOOD.get())));
    }

    protected LootTable.Builder createFeetLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(6))
                        .add(LootItem.lootTableItem(MKItems.CAT_FEET.get())));
    }

    protected LootTable.Builder createGlowSquidLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.GLOW_SQUID_EYE.get())));
    }

    protected LootTable.Builder createHorseLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.HORSE_MEAT.get())));
    }

    protected LootTable.Builder createRabbitLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.RABBIT_FOOT_FOOD.get())));
    }

    protected LootTable.Builder createDolphinLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.DOLPHIN_FIN.get())));
    }

    protected LootTable.Builder createBlazeLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.BLAZE_BLOOD.get())));
    }

    protected LootTable.Builder createTurtleLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.TURTLE_SCALE.get())));
    }

    protected LootTable.Builder createArmadilloLootTable() {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(2))
                        .add(LootItem.lootTableItem(MKItems.ARMADILLO_SCALE.get())));
    }
}