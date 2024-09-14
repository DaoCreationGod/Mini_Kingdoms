package net.dao.mini_kingdoms.util;

import net.dao.mini_kingdoms.Mini_kingdoms;
//import net.dao.mini_kingdoms.items.customs.AnimalCatcherItem;
//import net.dao.mini_kingdoms.items.customs.MonsterCatcherItem;
import net.minecraft.core.Registry;
//import net.dao.mini_kingdoms.items.customs.CatchersItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static net.dao.mini_kingdoms.Mini_kingdoms.MODID;

public class MKTags {
    public static class MKBlocks{
        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MODID,name));
        }
    }
    public static class MKItems{

        public static final TagKey<Item> CLOTHS = createTag("cloths");
        public static final TagKey<Item> ORES = createTag("ores");
        public static final TagKey<Item> FOODS = createTag("foods");
        public static final TagKey<Item> SEEDS = createTag("seeds");
        public static final TagKey<Item> STEWS = createTag("stews");
        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID,name));
        }


    }

    public static class MKEntity {
        public static final TagKey<EntityType<?>> VILLAGERS = createTag("villagers");
        public static final TagKey<EntityType<?>> ANIMALS = createTag("animals");
        public static final TagKey<EntityType<?>> MONSTERS = createTag("monsters");
        public static final TagKey<EntityType<?>> LOOTZOMBIE = createTag("lootzombie");
        public static final TagKey<EntityType<?>> ORGANMOBS = createTag("organmobs");
        public static final TagKey<EntityType<?>> BEARMEAT = createTag("bearmeat");
        public static final TagKey<EntityType<?>> DMMEAT = createTag("dmmeat");
        public static final TagKey<EntityType<?>> FEET = createTag("feet");

        private static TagKey<EntityType<?>> createTag(String name){
            return EntityTypeTags.create(ResourceLocation.fromNamespaceAndPath(MODID, name));
        }
    }


}
