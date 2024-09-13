package net.dao.mini_kingdoms.datagen;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.dao.mini_kingdoms.items.MKItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.event.brewing.BrewingRecipeRegisterEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mini_kingdoms.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MKBrewingRecipeProvider {

    @SubscribeEvent
    public static void onRegisterBrewingRecipes(BrewingRecipeRegisterEvent event) {
        // Example recipe: Brew Water Bottle with Bone to get Bone Marrow
        Ingredient input = Ingredient.of(Items.POTION); // Input item (e.g., Water Bottle)
        Ingredient ingredient = Ingredient.of(Items.BONE); // Ingredient (e.g., Bone)
        ItemStack output = new ItemStack(MKItems.BONE_MARROW.get()); // Result (e.g., Bone Marrow)

        // Add the brewing recipe
        event.addRecipe(input, ingredient, output);
    }
}
