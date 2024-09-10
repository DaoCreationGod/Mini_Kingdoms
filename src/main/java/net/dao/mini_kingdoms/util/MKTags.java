package net.dao.mini_kingdoms.util;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.dao.mini_kingdoms.items.customs.AnimalCatcherItem;
import net.dao.mini_kingdoms.items.customs.MonsterCatcherItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MKTags {
    public static class MKBlocks{
        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Mini_kingdoms.MODID,name));
        }
    }
    public static class MKItems{
        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Mini_kingdoms.MODID,name));
        }

    }
    public static final TagKey<EntityType<?>> MONSTERS = TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("mini_kingdoms:monsters"));
    public static final TagKey<EntityType<?>> ANIMALS = TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("mini_kingdoms:animals"));

    public static TagKey<EntityType<?>> getTagForItem(Item item) {
        if (item instanceof MonsterCatcherItem) {
            return MONSTERS;
        }
        if (item instanceof AnimalCatcherItem) {
            return ANIMALS;
        }
        return null;
    }
}
