/*package net.dao.mini_kingdoms.items.customs;

import net.dao.mini_kingdoms.components.EntityStorageComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

import java.util.Optional;
import java.util.function.Consumer;

import static net.dao.mini_kingdoms.util.MKTags.*;

public class CatchersItem extends Item {

    private final TagKey<EntityType<?>> captureTag;

    public CatchersItem(Properties properties, TagKey<EntityType<?>> captureTag) {
        super(properties);
        this.captureTag = captureTag;
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
        if (player.level().isClientSide) {
            return InteractionResult.FAIL;
        }

        Optional<ItemStack> captured = captureEntity(stack, target, message -> player.displayClientMessage(message, true));
        if (captured.isPresent()) {
            player.setItemInHand(hand, stack); // No need to replace the stack
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.FAIL;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (context.getLevel().isClientSide) {
            return InteractionResult.FAIL;
        }

        Player player = context.getPlayer();
        if (player == null) {
            return InteractionResult.FAIL;
        }

        return releaseEntity(context.getLevel(), context.getItemInHand(), context.getClickedFace(), context.getClickedPos(),
                emptyItem -> player.setItemInHand(context.getHand(), emptyItem));
    }

    /**
     * Capture the entity into the item's NBT data.
     */
    /*private Optional<ItemStack> captureEntity(ItemStack catcherItem, LivingEntity entity, Consumer<Component> displayCallback) {
        if (entity.getType().is(captureTag)) { // Check if the entity matches the capture tag
            if (!hasCapturedEntity(catcherItem)) {
                setCapturedEntity(catcherItem, entity); // Store entity data in the item's NBT
                return Optional.of(catcherItem); // Return the original stack with updated NBT
            } else {
                displayCallback.accept(Component.literal("This item is already holding an entity!"));
                return Optional.empty();
            }
        } else {
            displayCallback.accept(Component.literal("This entity cannot be captured by this item!"));
            return Optional.empty();
        }
    }

    /**
     * Release the captured entity from the item's NBT data.
     */
    /*private InteractionResult releaseEntity(Level level, ItemStack catcherItem, Direction face, BlockPos pos, Consumer<ItemStack> emptyItemSetter) {
        if (hasCapturedEntity(catcherItem)) {
            // Get spawn location
            double spawnX = pos.getX() + face.getStepX() + 0.5;
            double spawnY = pos.getY() + face.getStepY();
            double spawnZ = pos.getZ() + face.getStepZ() + 0.5;
            float rotation = Mth.wrapDegrees(level.getRandom().nextFloat() * 360.0f);

            // Spawn the stored entity
            Optional<Entity> entity = getCapturedEntity(catcherItem, level);
            entity.ifPresent(ent -> {
                ent.setPos(spawnX, spawnY, spawnZ);
                ent.setYRot(rotation);
                level.addFreshEntity(ent);
            });

            // Clear the captured entity from NBT
            clearCapturedEntity(catcherItem);

            return InteractionResult.SUCCESS;
        }

        return InteractionResult.FAIL;
    }

    /**
     * Check if the item has an entity captured.
     */
   /* private boolean hasCapturedEntity(ItemStack stack) {
        return stack.getTagElement("CapturedEntity") != null;
    }

    /**
     * Store the captured entity's data in the item's NBT.
     */
    /*private void setCapturedEntity(ItemStack stack, LivingEntity entity) {
        CompoundTag tag = stack.getOrCreateTag();
        CompoundTag entityTag = new CompoundTag();
        entity.saveWithoutId(entityTag); // Save the entity's data into a tag
        tag.put("CapturedEntity", entityTag); // Store the entity data under "CapturedEntity"
    }

    /**
     * Get the captured entity from the item's NBT.
     */
    /*private Optional<Entity> getCapturedEntity(ItemStack stack, Level level) {
        CompoundTag tag = stack.getTagElement("CapturedEntity");
        if (tag != null) {
            return EntityType.create(tag, level); // Recreate the entity from its saved data
        }
        return Optional.empty();
    }

    /**
     * Clear the captured entity's data from the item's NBT.
     */
    /*private void clearCapturedEntity(ItemStack stack) {
        CompoundTag tag = stack.getOrCreateTag();
        tag.remove("CapturedEntity"); // Remove the entity data
    }
}
*/