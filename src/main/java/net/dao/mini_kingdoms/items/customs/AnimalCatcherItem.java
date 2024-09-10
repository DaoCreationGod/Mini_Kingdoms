package net.dao.mini_kingdoms.items.customs;

import net.dao.mini_kingdoms.util.MKTags;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

public class AnimalCatcherItem extends Item {

    private static final String NBT_ANIMALS = "AnimalData";

    public AnimalCatcherItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Player player = pContext.getPlayer();
        BlockPos pos = pContext.getClickedPos();
        InteractionHand hand = pContext.getHand();
        ItemStack itemInHand = player.getItemInHand(hand);

        if (!level.isClientSide && player != null) {
            CompoundTag tag = itemInHand.getOrCreateTag();
            if (tag.contains(NBT_ANIMALS)) {
                // Try to pick up an animal
                Entity animal = (Animal) getEntityInRange(level, pos, MKTags.ANIMALS);
                if (animal != null) {
                    CompoundTag animalTag = new CompoundTag();
                    animal.save(animalTag);
                    tag.put(NBT_ANIMALS, animalTag);
                    animal.setInvisible(true);
                    animal.setNoAi(true);
                    player.displayClientMessage(Component.literal("Animal picked up!"), true);
                    return InteractionResult.SUCCESS;
                } else {
                    player.displayClientMessage(Component.literal("No Animal nearby to pick up!"), true);
                    return InteractionResult.FAIL;
                }
            } else {
                // Place the animal back
                if (tag.contains(NBT_ANIMALS)) {
                    CompoundTag animalTag = tag.getCompound(NBT_ANIMALS); // Get the animal data from NBT

                    // Create a new animal at the position
                    EntityType<?> type = EntityType.byId(animalTag.getInt("id")); // Adjust according to your data format
                    Entity newAnimal = type.create(level);
                    if (newAnimal != null) {
                        newAnimal.load(animalTag); // Load the animal data
                        newAnimal.setPos(pos.getX(), pos.getY() + 1, pos.getZ()); // Place the animal

                        level.addFreshEntity(newAnimal); // Add the animal back into the world

                        tag.remove(NBT_ANIMALS); // Clear the NBT data (no longer holding an animal)
                        player.displayClientMessage(Component.literal("Animal placed back!"), true);
                        return InteractionResult.SUCCESS;
                    }
                }
            }
        }
        return InteractionResult.PASS;
    }

    private Entity getEntityInRange(Level level, BlockPos pos, EntityType<?> type) {
        final double range = 3.0;
        return level.getEntities(null, new AABB(
                        pos.getX() - range, pos.getY() - range, pos.getZ() - range,
                        pos.getX() + range, pos.getY() + range, pos.getZ() + range))
                .stream()
                .filter(entity -> entity.getType() == type)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean isStackable(ItemStack stack) {
        // Prevent stacking if the item contains an animal
        CompoundTag tag = stack.getTag();
        return tag == null || !tag.contains(NBT_ANIMALS);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        // Return stack size of 1 if the item contains an animal
        CompoundTag tag = stack.getTag();
        if (tag != null && tag.contains(NBT_ANIMALS)) {
            return 1;
        }
        return super.getMaxStackSize(stack);
    }
}
