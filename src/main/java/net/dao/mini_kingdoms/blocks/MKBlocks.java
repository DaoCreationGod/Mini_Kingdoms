package net.dao.mini_kingdoms.blocks;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MKBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Mini_kingdoms.MODID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
