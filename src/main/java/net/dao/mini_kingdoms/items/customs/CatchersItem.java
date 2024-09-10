package net.dao.mini_kingdoms.items.customs;

import net.dao.mini_kingdoms.components.EntityStorageComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

public class CatchersItem extends Item {

    private final TagKey<EntityType<?>> entityTag;
    public CatchersItem(Properties pProperties, TagKey<EntityType<?>> entityTag){
        super(pProperties);
        this.entityTag = entityTag;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Player player = pContext.getPlayer();
        BlockPos pos = pContext.getClickedPos();
        InteractionHand hand = pContext.getHand();
        ItemStack itemInHand = player.getItemInHand(hand);

        // Attach or retrieve the data component from the item
        EntityStorageComponent storageComponent = (EntityStorageComponent) itemInHand.getComponents();

        if (!level.isClientSide && player != null) {
            if (storageComponent.hasStoredEntity()) {
                // Place the stored entity back into the world
                LivingEntity newEntity = storageComponent.createEntityFromData(level, pos);
                if (newEntity != null) {
                    level.addFreshEntity(newEntity); // Add the entity back into the world
                    storageComponent.clearStoredEntity(); // Clear the stored data
                    player.displayClientMessage(Component.literal("Entity placed back!"), true);
                    return InteractionResult.SUCCESS;
                }
            } else {
                // Try to pick up an entity based on the tag
                LivingEntity entity = getEntityInRange(level, pos);
                if (entity != null && entity.getType().is(entityTag)) {  // Check if the entity matches the tag
                    storageComponent.storeEntity(entity);  // Store the entity in the component
                    entity.setInvisible(true);  // Temporarily hide the entity
                    player.displayClientMessage(Component.literal("Entity picked up!"), true);
                    return InteractionResult.SUCCESS;
                } else {
                    player.displayClientMessage(Component.literal("No valid entity nearby to pick up!"), true);
                    return InteractionResult.FAIL;
                }
            }
        }
        return InteractionResult.PASS;
    }

    private LivingEntity getEntityInRange(Level level, BlockPos pos) {
        // Find the nearest LivingEntity within a small radius, and filter by the tag
        return level.getEntitiesOfClass(LivingEntity.class, new AABB(pos).inflate(5))
                .stream()
                .filter(entity -> entity.getType().is(entityTag))  // Filter entities by the tag
                .findFirst()
                .orElse(null);
    }
}
