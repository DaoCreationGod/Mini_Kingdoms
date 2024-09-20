package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.util.MKTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.entity.EntityType;

import java.util.concurrent.CompletableFuture;

public class MKEntityTagProvider extends EntityTypeTagsProvider {
    public MKEntityTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider) {
        super(pOutput, pProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider){
        tag(MKTags.MKEntity.BEARMEAT)
                .add(EntityType.PANDA)
                .add(EntityType.POLAR_BEAR);

        tag(MKTags.MKEntity.DMMEAT)
                .add(EntityType.DONKEY)
                .add(EntityType.MULE);

        tag(MKTags.MKEntity.FEET)
                .add(EntityType.CAT)
                .add(EntityType.OCELOT);

        tag(MKTags.MKEntity.LOOTZOMBIE)
                .add(EntityType.ZOMBIFIED_PIGLIN)
                .add(EntityType.ZOMBIE_VILLAGER)
                .add(EntityType.ZOMBIE_HORSE)
                .add(EntityType.ZOMBIE)
                .add(EntityType.ZOGLIN)
                .add(EntityType.HUSK)
                .add(EntityType.DROWNED);

        tag(MKTags.MKEntity.ORGANMOBS)
                .add(EntityType.COW)
                .add(EntityType.PIG)
                .add(EntityType.ARMADILLO)
                .add(EntityType.CAMEL)
                .add(EntityType.CAVE_SPIDER)
                .add(EntityType.CREEPER)
                .add(EntityType.DOLPHIN)
                .add(EntityType.ENDERMAN)
                .add(EntityType.SHEEP)
                .add(EntityType.STRIDER)
                .add(EntityType.SQUID)
                .add(EntityType.GLOW_SQUID)
                .add(EntityType.HOGLIN)
                .add(EntityType.SPIDER)
                .add(EntityType.PIGLIN)
                .add(EntityType.RAVAGER)
                .add(EntityType.LLAMA)
                .add(EntityType.TRADER_LLAMA)
                .add(EntityType.FOX)
                .add(EntityType.SNIFFER)
                .add(EntityType.MOOSHROOM)
                .add(EntityType.ZOMBIFIED_PIGLIN)
                .add(EntityType.ZOMBIE_VILLAGER)
                .add(EntityType.ZOMBIE_HORSE)
                .add(EntityType.ZOMBIE)
                .add(EntityType.ZOGLIN)
                .add(EntityType.HUSK)
                .add(EntityType.CAT)
                .add(EntityType.OCELOT)
                .add(EntityType.DONKEY)
                .add(EntityType.MULE)
                .add(EntityType.PANDA)
                .add(EntityType.POLAR_BEAR)
                .add(EntityType.HORSE);
    }
}
