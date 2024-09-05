package net.dao.mini_kingdoms.blocks;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.dao.mini_kingdoms.items.MKItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MKBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Mini_kingdoms.MODID);

    public static final RegistryObject<Block> KINGDOM_CRAFTER = registerBlock("kingdom_crafter", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL)));
    //Core Ores
    //Tiny
    public static final RegistryObject<Block> TINY_CORE_ORE_MINE = registerBlock("tiny_core_ore_mine", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> TINY_CORE_ORE_FARM = registerBlock("tiny_core_ore_farm", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> TINY_CORE_ORE_BIOME = registerBlock("tiny_core_ore_biome", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> TINY_CORE_ORE_BUILDING = registerBlock("tiny_core_ore_building", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    //Small
    public static final RegistryObject<Block> SMALL_CORE_ORE_MINE = registerBlock("small_core_ore_mine", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> SMALL_CORE_ORE_FARM = registerBlock("small_core_ore_farm", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> SMALL_CORE_ORE_BIOME = registerBlock("small_core_ore_biome", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> SMALL_CORE_ORE_BUILDING = registerBlock("small_core_ore_building", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    //Below Average
    public static final RegistryObject<Block> BELOW_AVERAGE_CORE_ORE_MINE = registerBlock("below_average_core_ore_mine", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> BELOW_AVERAGE_CORE_ORE_FARM = registerBlock("below_average_core_ore_farm", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> BELOW_AVERAGE_CORE_ORE_BIOME = registerBlock("below_average_core_ore_biome", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> BELOW_AVERAGE_CORE_ORE_BUILDING = registerBlock("below_average_core_ore_building", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    //Average
    public static final RegistryObject<Block> AVERAGE_CORE_ORE_MINE = registerBlock("average_core_ore_mine", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> AVERAGE_CORE_ORE_FARM = registerBlock("average_core_ore_farm", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> AVERAGE_CORE_ORE_BIOME = registerBlock("average_core_ore_biome", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> AVERAGE_CORE_ORE_BUILDING = registerBlock("average_core_ore_building", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    //Above Average
    public static final RegistryObject<Block> ABOVE_AVERAGE_CORE_ORE_MINE = registerBlock("above_average_core_ore_mine", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> ABOVE_AVERAGE_CORE_ORE_FARM = registerBlock("above_average_core_ore_farm", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> ABOVE_AVERAGE_CORE_ORE_BIOME = registerBlock("above_average_core_ore_biome", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> ABOVE_AVERAGE_CORE_ORE_BUILDING = registerBlock("above_average_core_ore_building", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    //Big
    public static final RegistryObject<Block> BIG_CORE_ORE_MINE = registerBlock("big_core_ore_mine", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> BIG_CORE_ORE_FARM = registerBlock("big_core_ore_farm", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> BIG_CORE_ORE_BIOME = registerBlock("big_core_ore_biome", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> BIG_CORE_ORE_BUILDING = registerBlock("big_core_ore_building", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    //Large
    public static final RegistryObject<Block> LARGE_CORE_ORE_MINE = registerBlock("large_core_ore_mine", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> LARGE_CORE_ORE_FARM = registerBlock("large_core_ore_farm", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> LARGE_CORE_ORE_BIOME = registerBlock("large_core_ore_biome", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> LARGE_CORE_ORE_BUILDING = registerBlock("large_core_ore_building", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    //Huge
    public static final RegistryObject<Block> HUGE_CORE_ORE_MINE = registerBlock("huge_core_ore_mine", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> HUGE_CORE_ORE_FARM = registerBlock("huge_core_ore_farm", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> HUGE_CORE_ORE_BIOME = registerBlock("huge_core_ore_biome", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> HUGE_CORE_ORE_BUILDING = registerBlock("huge_core_ore_building", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    //Giant
    public static final RegistryObject<Block> GIANT_CORE_ORE_MINE = registerBlock("giant_core_ore_mine", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> GIANT_CORE_ORE_FARM = registerBlock("giant_core_ore_farm", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> GIANT_CORE_ORE_BIOME = registerBlock("giant_core_ore_biome", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> GIANT_CORE_ORE_BUILDING = registerBlock("giant_core_ore_building", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    //Super
    public static final RegistryObject<Block> SUPER_CORE_ORE_MINE = registerBlock("super_core_ore_mine", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> SUPER_CORE_ORE_FARM = registerBlock("super_core_ore_farm", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> SUPER_CORE_ORE_BIOME = registerBlock("super_core_ore_biome", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final RegistryObject<Block> SUPER_CORE_ORE_BUILDING = registerBlock("super_core_ore_building", ()-> new Block(BlockBehaviour.Properties.of()
            .strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        MKItems.ITEMS.register(name, ()->  new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
