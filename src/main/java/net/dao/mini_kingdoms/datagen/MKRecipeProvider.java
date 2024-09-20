package net.dao.mini_kingdoms.datagen;


import net.dao.mini_kingdoms.blocks.MKBlocks;
import net.dao.mini_kingdoms.items.MKItems;
import net.dao.mini_kingdoms.util.MKTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class MKRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public MKRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MKItems.NET_SOFTENER.get(), 2)
                .pattern("aaa")
                .pattern("aba")
                .pattern("aaa")
                .define('a', MKTags.MKItems.CLOTHS)
                .define('b', Items.SLIME_BALL)
                .unlockedBy(getHasName(Items.SLIME_BALL), has(Items.SLIME_BALL))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MKItems.LEATHER_NET.get(), 1)
                .pattern("aaa")
                .pattern("aba")
                .pattern("aaa")
                .define('a', Items.LEAD)
                .define('b',Items.STICK)
                .unlockedBy(getHasName(Items.LEAD), has(Items.LEAD))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MKItems.STRENGTHENED_LEATHER_NET.get(), 1)
                .pattern("aba")
                .pattern("bcb")
                .pattern("aba")
                .define('a', Items.COPPER_INGOT)
                .define('b',Items.IRON_NUGGET)
                .define('c', MKItems.LEATHER_NET.get())
                .unlockedBy(getHasName(MKItems.LEATHER_NET.get()), has(MKItems.LEATHER_NET.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MKItems.PASSIVE_MOB_CATCHER.get(), 1)
                .pattern(" a ")
                .pattern("aba")
                .pattern(" a ")
                .define('a', Items.COPPER_INGOT)
                .define('b', MKItems.LEATHER_NET.get())
                .unlockedBy(getHasName(MKItems.LEATHER_NET.get()), has(MKItems.LEATHER_NET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MKItems.AGGRESSIVE_MOB_CATCHER.get(), 1)
                .pattern(" a ")
                .pattern("aba")
                .pattern(" a ")
                .define('a', Items.COPPER_INGOT)
                .define('b', MKItems.STRENGTHENED_LEATHER_NET.get())
                .unlockedBy(getHasName(MKItems.STRENGTHENED_LEATHER_NET.get()), has(MKItems.STRENGTHENED_LEATHER_NET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MKItems.VILLAGER_CATCHER.get(), 1)
                .pattern(" a ")
                .pattern("aba")
                .pattern(" a ")
                .define('a', Items.COPPER_INGOT)
                .define('b', MKItems.SOFT_LEATHER_NET.get())
                .unlockedBy(getHasName(MKItems.SOFT_LEATHER_NET.get()), has(MKItems.SOFT_LEATHER_NET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MKBlocks.KINGDOM_CRAFTER.get(), 1)
                .pattern(" a ")
                .pattern("bcb")
                .pattern("b b")
                .define('a', Blocks.CRAFTING_TABLE)
                .define('b', Blocks.ANVIL)
                .define('c', Blocks.COPPER_BLOCK)
                .unlockedBy(getHasName(Blocks.ANVIL), has(Blocks.ANVIL))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MKItems.BIG_EXPERIENCE_ORB.get(),1)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', MKItems.SMALL_EXPERIENCE_ORB.get())
                .unlockedBy(getHasName(MKItems.SMALL_EXPERIENCE_ORB.get()), has(MKItems.SMALL_EXPERIENCE_ORB.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MKItems.COMPACTED_EXPERIENCE_ORB.get(),1)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', MKItems.BIG_EXPERIENCE_ORB.get())
                .unlockedBy(getHasName(MKItems.BIG_EXPERIENCE_ORB.get()), has(MKItems.BIG_EXPERIENCE_ORB.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MKItems.SOFT_LEATHER_NET.get(), 1)
                .requires(MKItems.NET_SOFTENER.get())
                .requires(MKItems.LEATHER_NET.get())
                .unlockedBy(getHasName(MKItems.LEATHER_NET.get()), has(MKItems.LEATHER_NET.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MKItems.GROWTH_BASE.get(), 16)
                .requires(Items.WATER_BUCKET)
                .requires(MKTags.MKItems.SEEDS)
                .requires(ItemTags.STONE_CRAFTING_MATERIALS)
                .unlockedBy(getHasName(Items.WATER_BUCKET), has(Items.WATER_BUCKET))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.STEW_BASE.get(),1)
                .requires(MKItems.BONE_MARROW.get())
                .requires(MKItems.CRAZY_BLOOD.get())
                .requires(MKItems.BIG_EXPERIENCE_ORB.get())
                .requires(Items.BOWL)
                .unlockedBy(getHasName(MKItems.BIG_EXPERIENCE_ORB.get()), has(MKItems.BIG_EXPERIENCE_ORB.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.BLAZE_BLOOD_STEW_BASE.get(),1)
                .requires(MKItems.BLAZE_BLOOD.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.BEAR_STEW_BASE.get(),1)
                .requires(MKItems.BEAR_MEAT.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.DOLPHIN_FIN_STEW_BASE.get(),1)
                .requires(MKItems.DOLPHIN_FIN.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.GLOW_SQUID_EYE_STEW_BASE.get(),1)
                .requires(MKItems.GLOW_SQUID_EYE.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.DONKEY_MULE_MEAT_STEW_BASE.get(),1)
                .requires(MKItems.DONKEY_MULE_MEAT.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.HORSE_MEAT_STEW_BASE.get(),1)
                .requires(MKItems.HORSE_MEAT.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.RABBIT_FOOT_FOOD_STEW_BASE.get(),1)
                .requires(MKItems.RABBIT_FOOT_FOOD.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.TURTLE_SCALE_STEW_BASE.get(),1)
                .requires(MKItems.TURTLE_SCALE.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.CAT_FEET_STEW_BASE.get(),1)
                .requires(MKItems.CAT_FEET.get())
                .requires(MKItems.CAT_FEET.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.ARMADILLO_SCALE_STEW_BASE.get(),1)
                .requires(MKItems.ARMADILLO_SCALE.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.STOMACH_STEW_BASE.get(),1)
                .requires(MKItems.STOMACH.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.LIVER_STEW_BASE.get(),1)
                .requires(MKItems.LIVER.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.LUNGS_STEW_BASE.get(),1)
                .requires(MKItems.LUNGS.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MKItems.HEART_STEW_BASE.get(),1)
                .requires(MKItems.HEART.get())
                .requires(MKItems.STEW_BASE.get())
                .unlockedBy(getHasName(MKItems.STEW_BASE.get()), has(MKItems.STEW_BASE.get())).save(pRecipeOutput);

        addSmokingAndCampfireRecipes(pRecipeOutput);
        addStonecuttingRecipes(pRecipeOutput);
    }

    protected void addStonecuttingRecipes(RecipeOutput pRecipeOutput){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.TINY_CORE_ORE_BIOME.get()), RecipeCategory.MISC, MKItems.BIOME_TINY_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.TINY_CORE_ORE_BUILDING.get()), RecipeCategory.MISC, MKItems.BUILDING_TINY_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.TINY_CORE_ORE_MINE.get()), RecipeCategory.MISC, MKItems.MINE_TINY_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.TINY_CORE_ORE_FARM.get()), RecipeCategory.MISC, MKItems.FARM_TINY_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.SMALL_CORE_ORE_BIOME.get()), RecipeCategory.MISC, MKItems.BIOME_SMALL_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.SMALL_CORE_ORE_BUILDING.get()), RecipeCategory.MISC, MKItems.BUILDING_SMALL_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.SMALL_CORE_ORE_MINE.get()), RecipeCategory.MISC, MKItems.MINE_SMALL_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.SMALL_CORE_ORE_FARM.get()), RecipeCategory.MISC, MKItems.FARM_SMALL_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.BELOW_AVERAGE_CORE_ORE_BIOME.get()), RecipeCategory.MISC, MKItems.BIOME_BELOW_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.BELOW_AVERAGE_CORE_ORE_BUILDING.get()), RecipeCategory.MISC, MKItems.BUILDING_BELOW_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.BELOW_AVERAGE_CORE_ORE_MINE.get()), RecipeCategory.MISC, MKItems.MINE_BELOW_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.BELOW_AVERAGE_CORE_ORE_FARM.get()), RecipeCategory.MISC, MKItems.FARM_BELOW_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.AVERAGE_CORE_ORE_BIOME.get()), RecipeCategory.MISC, MKItems.BIOME_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.AVERAGE_CORE_ORE_BUILDING.get()), RecipeCategory.MISC, MKItems.BUILDING_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.AVERAGE_CORE_ORE_MINE.get()), RecipeCategory.MISC, MKItems.MINE_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.AVERAGE_CORE_ORE_FARM.get()), RecipeCategory.MISC, MKItems.FARM_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.ABOVE_AVERAGE_CORE_ORE_BIOME.get()), RecipeCategory.MISC, MKItems.BIOME_ABOVE_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.ABOVE_AVERAGE_CORE_ORE_BUILDING.get()), RecipeCategory.MISC, MKItems.BUILDING_ABOVE_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.ABOVE_AVERAGE_CORE_ORE_MINE.get()), RecipeCategory.MISC, MKItems.MINE_ABOVE_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.ABOVE_AVERAGE_CORE_ORE_FARM.get()), RecipeCategory.MISC, MKItems.FARM_ABOVE_AVERAGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.BIG_CORE_ORE_BIOME.get()), RecipeCategory.MISC, MKItems.BIOME_BIG_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.BIG_CORE_ORE_BUILDING.get()), RecipeCategory.MISC, MKItems.BUILDING_BIG_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.BIG_CORE_ORE_MINE.get()), RecipeCategory.MISC, MKItems.MINE_BIG_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.BIG_CORE_ORE_FARM.get()), RecipeCategory.MISC, MKItems.FARM_BIG_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.LARGE_CORE_ORE_BIOME.get()), RecipeCategory.MISC, MKItems.BIOME_LARGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.LARGE_CORE_ORE_BUILDING.get()), RecipeCategory.MISC, MKItems.BUILDING_LARGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.LARGE_CORE_ORE_MINE.get()), RecipeCategory.MISC, MKItems.MINE_LARGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.LARGE_CORE_ORE_FARM.get()), RecipeCategory.MISC, MKItems.FARM_LARGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.HUGE_CORE_ORE_BIOME.get()), RecipeCategory.MISC, MKItems.BIOME_HUGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.HUGE_CORE_ORE_BUILDING.get()), RecipeCategory.MISC, MKItems.BUILDING_HUGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.HUGE_CORE_ORE_MINE.get()), RecipeCategory.MISC, MKItems.MINE_HUGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.HUGE_CORE_ORE_FARM.get()), RecipeCategory.MISC, MKItems.FARM_HUGE_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.GIANT_CORE_ORE_BIOME.get()), RecipeCategory.MISC, MKItems.BIOME_GIANT_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.GIANT_CORE_ORE_BUILDING.get()), RecipeCategory.MISC, MKItems.BUILDING_GIANT_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.GIANT_CORE_ORE_MINE.get()), RecipeCategory.MISC, MKItems.MINE_GIANT_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.GIANT_CORE_ORE_FARM.get()), RecipeCategory.MISC, MKItems.FARM_GIANT_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.SUPER_CORE_ORE_BIOME.get()), RecipeCategory.MISC, MKItems.BIOME_SUPER_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.SUPER_CORE_ORE_BUILDING.get()), RecipeCategory.MISC, MKItems.BUILDING_SUPER_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.SUPER_CORE_ORE_MINE.get()), RecipeCategory.MISC, MKItems.MINE_SUPER_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MKBlocks.SUPER_CORE_ORE_FARM.get()), RecipeCategory.MISC, MKItems.FARM_SUPER_CORE.get()).unlockedBy(getHasName(Blocks.STONECUTTER), has(Blocks.STONECUTTER)).save(pRecipeOutput);
    }

    protected void addSmokingAndCampfireRecipes(RecipeOutput pRecipeOutput){
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.BEAR_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.BEAR_STEW.get(),5,50).unlockedBy(getHasName(MKItems.BEAR_STEW_BASE.get()), has(MKItems.BEAR_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.BLAZE_BLOOD_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.BLAZE_BLOOD_STEW.get(),5,50).unlockedBy(getHasName(MKItems.BLAZE_BLOOD_STEW_BASE.get()), has(MKItems.BLAZE_BLOOD_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.GLOW_SQUID_EYE_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.GLOW_SQUID_EYE_STEW.get(),5,50).unlockedBy(getHasName(MKItems.GLOW_SQUID_EYE_STEW_BASE.get()), has(MKItems.GLOW_SQUID_EYE_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.DONKEY_MULE_MEAT_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.DONKEY_MULE_MEAT_STEW.get(),5,50).unlockedBy(getHasName(MKItems.DONKEY_MULE_MEAT_STEW_BASE.get()), has(MKItems.DONKEY_MULE_MEAT_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.HORSE_MEAT_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.HORSE_MEAT_STEW.get(),5,50).unlockedBy(getHasName(MKItems.HORSE_MEAT_STEW_BASE.get()), has(MKItems.HORSE_MEAT_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.RABBIT_FOOT_FOOD_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.RABBIT_FOOT_FOOD_STEW.get(),5,50).unlockedBy(getHasName(MKItems.RABBIT_FOOT_FOOD_STEW_BASE.get()), has(MKItems.RABBIT_FOOT_FOOD_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.TURTLE_SCALE_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.TURTLE_SCALE_STEW.get(),5,50).unlockedBy(getHasName(MKItems.TURTLE_SCALE_STEW_BASE.get()), has(MKItems.TURTLE_SCALE_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.CAT_FEET_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.CAT_FEET_STEW.get(),5,50).unlockedBy(getHasName(MKItems.CAT_FEET_STEW_BASE.get()), has(MKItems.CAT_FEET_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.ARMADILLO_SCALE_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.ARMADILLO_SCALE_STEW.get(),5,50).unlockedBy(getHasName(MKItems.ARMADILLO_SCALE_STEW_BASE.get()), has(MKItems.ARMADILLO_SCALE_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.STOMACH_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.STOMACH_STEW.get(),5,50).unlockedBy(getHasName(MKItems.STOMACH_STEW_BASE.get()), has(MKItems.STOMACH_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.LIVER_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.LIVER_STEW.get(),5,50).unlockedBy(getHasName(MKItems.LIVER_STEW_BASE.get()), has(MKItems.LIVER_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.LUNGS_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.LUNGS_STEW.get(),5,50).unlockedBy(getHasName(MKItems.LUNGS_STEW_BASE.get()), has(MKItems.LUNGS_STEW_BASE.get())).save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(MKItems.HEART_STEW_BASE.get()), RecipeCategory.FOOD, MKItems.HEART_STEW.get(),5,50).unlockedBy(getHasName(MKItems.HEART_STEW_BASE.get()), has(MKItems.HEART_STEW_BASE.get())).save(pRecipeOutput);
    }

}
