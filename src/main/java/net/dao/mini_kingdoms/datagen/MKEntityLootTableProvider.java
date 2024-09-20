package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.items.MKItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.animal.Dolphin;
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
    }

    @Override
    protected java.util.stream.@NotNull Stream<EntityType<?>> getKnownEntityTypes() {
        // Create a Set of the entity types you want to include
        Set<EntityType<?>> allowedEntities = Set.of();

        // Use Stream to filter entities by checking if they are in the allowed set
        return BuiltInRegistries.ENTITY_TYPE.stream()
                .filter(allowedEntities::contains);
    }
}