package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.blocks.MKBlocks;
import net.dao.mini_kingdoms.items.MKItems;
import net.dao.mini_kingdoms.util.MKTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.block.Blocks;
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


}
