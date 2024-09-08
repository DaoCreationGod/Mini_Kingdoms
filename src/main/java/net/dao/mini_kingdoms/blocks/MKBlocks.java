package net.dao.mini_kingdoms.blocks;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.dao.mini_kingdoms.blocks.multiblock.*;
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


    //MultiBlockBlocks
    //Mines
    public static final RegistryObject<Block> TINY_ORE_MINE = BLOCKS.register("tiny_ore_mine",
            () -> new BlockMine(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_ORE_MINE = BLOCKS.register("small_ore_mine",
            () -> new BlockMine(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_ORE_MINE = BLOCKS.register("below_average_ore_mine",
            () -> new BlockMine(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_ORE_MINE = BLOCKS.register("average_ore_mine",
            () -> new BlockMine(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_ORE_MINE = BLOCKS.register("above_average_ore_mine",
            () -> new BlockMine(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_ORE_MINE = BLOCKS.register("big_ore_mine",
            () -> new BlockMine(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_ORE_MINE = BLOCKS.register("large_ore_mine",
            () -> new BlockMine(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_ORE_MINE = BLOCKS.register("huge_ore_mine",
            () -> new BlockMine(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_ORE_MINE = BLOCKS.register("giant_ore_mine",
            () -> new BlockMine(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_ORE_MINE = BLOCKS.register("super_ore_mine",
            () -> new BlockMine(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    //Farms
    //VeggieFarms
    public static final RegistryObject<Block> TINY_VEGGIE_FARM = BLOCKS.register("tiny_veggie_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_VEGGIE_FARM = BLOCKS.register("small_veggie_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_VEGGIE_FARM = BLOCKS.register("below_average_veggie_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_VEGGIE_FARM = BLOCKS.register("average_veggie_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_VEGGIE_FARM = BLOCKS.register("above_average_veggie_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_VEGGIE_FARM = BLOCKS.register("big_veggie_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_VEGGIE_FARM = BLOCKS.register("large_veggie_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_VEGGIE_FARM = BLOCKS.register("huge_veggie_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_VEGGIE_FARM = BLOCKS.register("giant_veggie_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_VEGGIE_FARM = BLOCKS.register("super_veggie_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    //MonsterFarms
    public static final RegistryObject<Block> TINY_MONSTER_FARM = BLOCKS.register("tiny_monster_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_MONSTER_FARM = BLOCKS.register("small_monster_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_MONSTER_FARM = BLOCKS.register("below_average_monster_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_MONSTER_FARM = BLOCKS.register("average_monster_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_MONSTER_FARM = BLOCKS.register("above_average_monster_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_MONSTER_FARM = BLOCKS.register("big_monster_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_MONSTER_FARM = BLOCKS.register("large_monster_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_MONSTER_FARM = BLOCKS.register("huge_monster_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_MONSTER_FARM = BLOCKS.register("giant_monster_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_MONSTER_FARM = BLOCKS.register("super_monster_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item

    //AnimalFarms
    public static final RegistryObject<Block> TINY_ANIMAL_FARM = BLOCKS.register("tiny_animal_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_ANIMAL_FARM = BLOCKS.register("small_animal_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_ANIMAL_FARM = BLOCKS.register("below_average_animal_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_ANIMAL_FARM = BLOCKS.register("average_animal_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_ANIMAL_FARM = BLOCKS.register("above_average_animal_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_ANIMAL_FARM = BLOCKS.register("big_animal_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_ANIMAL_FARM = BLOCKS.register("large_animal_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_ANIMAL_FARM = BLOCKS.register("huge_animal_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_ANIMAL_FARM = BLOCKS.register("giant_animal_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_ANIMAL_FARM = BLOCKS.register("super_animal_farm",
            () -> new BlockFarm(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item

    //Buildings
    //Houses
    public static final RegistryObject<Block> TINY_HOUSE = BLOCKS.register("tiny_house",
            () -> new BlockBuilding(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_HOUSE = BLOCKS.register("small_house",
            () -> new BlockBuilding(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_HOUSE = BLOCKS.register("below_average_house",
            () -> new BlockBuilding(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_HOUSE = BLOCKS.register("average_house",
            () -> new BlockBuilding(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_HOUSE = BLOCKS.register("above_average_house",
            () -> new BlockBuilding(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_HOUSE = BLOCKS.register("big_house",
            () -> new BlockBuilding(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_HOUSE = BLOCKS.register("large_house",
            () -> new BlockBuilding(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_HOUSE = BLOCKS.register("huge_house",
            () -> new BlockBuilding(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_HOUSE = BLOCKS.register("giant_house",
            () -> new BlockBuilding(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_HOUSE = BLOCKS.register("super_house",
            () -> new BlockBuilding(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item

    //Stores
    public static final RegistryObject<Block> GROCERY_STORE = BLOCKS.register("standard_grocery_store",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> WEAPONS_SHOP = BLOCKS.register("standard_weapon_shop",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ARMOUR_SHOP = BLOCKS.register("standard_armour_shop",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> TOOL_SHOP = BLOCKS.register("standard_tool_shop",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GENERAL_STORE = BLOCKS.register("standard_general_shop",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> JEWELERY_STORE = BLOCKS.register("standard_jewelery_shop",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BAKERY = BLOCKS.register("standard_bakery",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BUTCHER = BLOCKS.register("standard_butcher",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> FURNITURE_STORE = BLOCKS.register("standard_furniture_store",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item, this block makes nothing, just for internal function
    public static final RegistryObject<Block> FLOWER_SHOP = BLOCKS.register("standard_flower_shop",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    //CraftmenShops
    public static final RegistryObject<Block> TOOLSMITH = BLOCKS.register("standard_toolsmith",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> WEAPONSMITH = BLOCKS.register("standard_weaponsmith",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ARMOURSMITH = BLOCKS.register("standard_armoursmith",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> JEWELER = BLOCKS.register("standard_jeweler",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LOG_YARD = BLOCKS.register("standard_log_yard",
            () -> new BlockShop(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item, this gives logs and sticks

    //Villages
    public static final RegistryObject<Block> TINY_VILLAGE = BLOCKS.register("tiny_village",
            () -> new BlockVillage(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_VILLAGE = BLOCKS.register("small_village",
            () -> new BlockVillage(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_VILLAGE = BLOCKS.register("below_average_village",
            () -> new BlockVillage(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_VILLAGE = BLOCKS.register("average_village",
            () -> new BlockVillage(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_VILLAGE = BLOCKS.register("above_average_village",
            () -> new BlockVillage(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_VILLAGE = BLOCKS.register("big_village",
            () -> new BlockVillage(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_VILLAGE = BLOCKS.register("large_village",
            () -> new BlockVillage(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_VILLAGE = BLOCKS.register("huge_village",
            () -> new BlockVillage(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_VILLAGE = BLOCKS.register("giant_village",
            () -> new BlockVillage(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_VILLAGE = BLOCKS.register("super_village",
            () -> new BlockVillage(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    //Towns
    public static final RegistryObject<Block> TINY_TOWN = BLOCKS.register("tiny_town",
            () -> new BlockTown(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_TOWN = BLOCKS.register("small_town",
            () -> new BlockTown(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_TOWN = BLOCKS.register("below_average_town",
            () -> new BlockTown(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_TOWN = BLOCKS.register("average_town",
            () -> new BlockTown(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_TOWN = BLOCKS.register("above_average_town",
            () -> new BlockTown(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_TOWN = BLOCKS.register("big_town",
            () -> new BlockTown(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_TOWN = BLOCKS.register("large_town",
            () -> new BlockTown(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_TOWN = BLOCKS.register("huge_town",
            () -> new BlockTown(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_TOWN = BLOCKS.register("giant_town",
            () -> new BlockTown(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_TOWN = BLOCKS.register("super_town",
            () -> new BlockTown(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    //Cities
    public static final RegistryObject<Block> TINY_CITY = BLOCKS.register("tiny_city",
            () -> new BlockCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_CITY = BLOCKS.register("small_city",
            () -> new BlockCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_CITY = BLOCKS.register("below_average_city",
            () -> new BlockCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_CITY = BLOCKS.register("average_city",
            () -> new BlockCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_CITY = BLOCKS.register("above_average_city",
            () -> new BlockCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_CITY = BLOCKS.register("big_city",
            () -> new BlockCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_CITY = BLOCKS.register("large_city",
            () -> new BlockCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_CITY = BLOCKS.register("huge_city",
            () -> new BlockCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_CITY = BLOCKS.register("giant_city",
            () -> new BlockCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_CITY = BLOCKS.register("super_city",
            () -> new BlockCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    //LargeCities
    public static final RegistryObject<Block> TINY_LARGE_CITY = BLOCKS.register("tiny_large_city",
            () -> new BlockLargeCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_LARGE_CITY = BLOCKS.register("small_large_city",
            () -> new BlockLargeCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_LARGE_CITY = BLOCKS.register("below_average_large_city",
            () -> new BlockLargeCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_LARGE_CITY = BLOCKS.register("average_large_city",
            () -> new BlockLargeCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_LARGE_CITY = BLOCKS.register("above_average_large_city",
            () -> new BlockLargeCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_LARGE_CITY = BLOCKS.register("big_large_city",
            () -> new BlockLargeCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_LARGE_CITY = BLOCKS.register("large_large_city",
            () -> new BlockLargeCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_LARGE_CITY = BLOCKS.register("huge_large_city",
            () -> new BlockLargeCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_LARGE_CITY = BLOCKS.register("giant_large_city",
            () -> new BlockLargeCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_LARGE_CITY = BLOCKS.register("super_large_city",
            () -> new BlockLargeCity(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    //RegionalCapitals
    public static final RegistryObject<Block> TINY_REGIONAL_CAPITAL = BLOCKS.register("tiny_regional_capital",
            () -> new BlockRegionalCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_REGIONAL_CAPITAL = BLOCKS.register("small_regional_capital",
            () -> new BlockRegionalCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_REGIONAL_CAPITAL = BLOCKS.register("below_average_regional_capital",
            () -> new BlockRegionalCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_REGIONAL_CAPITAL = BLOCKS.register("average_regional_capital",
            () -> new BlockRegionalCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_REGIONAL_CAPITAL = BLOCKS.register("above_average_regional_capital",
            () -> new BlockRegionalCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_REGIONAL_CAPITAL = BLOCKS.register("big_regional_capital",
            () -> new BlockRegionalCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_REGIONAL_CAPITAL = BLOCKS.register("large_regional_capital",
            () -> new BlockRegionalCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_REGIONAL_CAPITAL = BLOCKS.register("huge_regional_capital",
            () -> new BlockRegionalCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_REGIONAL_CAPITAL = BLOCKS.register("giant_regional_capital",
            () -> new BlockRegionalCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_REGIONAL_CAPITAL = BLOCKS.register("super_regional_capital",
            () -> new BlockRegionalCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    //Capitals
    public static final RegistryObject<Block> TINY_CAPITAL = BLOCKS.register("tiny_capital",
            () -> new BlockCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_CAPITAL = BLOCKS.register("small_capital",
            () -> new BlockCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_CAPITAL = BLOCKS.register("below_average_capital",
            () -> new BlockCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_CAPITAL = BLOCKS.register("average_capital",
            () -> new BlockCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_CAPITAL = BLOCKS.register("above_average_capital",
            () -> new BlockCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_CAPITAL = BLOCKS.register("big_capital",
            () -> new BlockCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_CAPITAL = BLOCKS.register("large_capital",
            () -> new BlockCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_CAPITAL = BLOCKS.register("huge_capital",
            () -> new BlockCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_CAPITAL = BLOCKS.register("giant_capital",
            () -> new BlockCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_CAPITAL = BLOCKS.register("super_capital",
            () -> new BlockCapital(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    //Kingdoms
    public static final RegistryObject<Block> TINY_KINGDOM = BLOCKS.register("tiny_kingdom",
            () -> new BlockKingdom(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SMALL_KINGDOM = BLOCKS.register("small_kingdom",
            () -> new BlockKingdom(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BELOW_AVERAGE_KINGDOM = BLOCKS.register("below_average_kingdom",
            () -> new BlockKingdom(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> AVERAGE_KINGDOM = BLOCKS.register("average_kingdom",
            () -> new BlockKingdom(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> ABOVE_AVERAGE_KINGDOM = BLOCKS.register("above_average_kingdom",
            () -> new BlockKingdom(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> BIG_KINGDOM = BLOCKS.register("big_kingdom",
            () -> new BlockKingdom(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> LARGE_KINGDOM = BLOCKS.register("large_kingdom",
            () -> new BlockKingdom(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> HUGE_KINGDOM = BLOCKS.register("huge_kingdom",
            () -> new BlockKingdom(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> GIANT_KINGDOM = BLOCKS.register("giant_kingdom",
            () -> new BlockKingdom(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    public static final RegistryObject<Block> SUPER_KINGDOM = BLOCKS.register("super_kingdom",
            () -> new BlockKingdom(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.METAL))); //This is a block item
    

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
