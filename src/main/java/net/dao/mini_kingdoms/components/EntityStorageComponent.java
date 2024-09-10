package net.dao.mini_kingdoms.components;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentContents;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

import java.util.List;

public class EntityStorageComponent implements Component {
    private EntityType<?> storedEntityType;
    private CompoundTag entityData; // Use CompoundTag here to store entity information

    public boolean hasStoredEntity() {
        return storedEntityType != null && entityData != null;
    }

    public void storeEntity(LivingEntity entity) {
        this.storedEntityType = entity.getType();
        this.entityData = new CompoundTag();
        entity.save(entityData); // Save the entity's data into the CompoundTag
    }

    public LivingEntity createEntityFromData(Level level, BlockPos pos) {
        if (storedEntityType != null && entityData != null) {
            LivingEntity newEntity = (LivingEntity) storedEntityType.create(level);
            if (newEntity != null) {
                newEntity.load(entityData); // Load the entity's data from the stored tag
                newEntity.setPos(pos.getX(), pos.getY() + 1, pos.getZ());
                return newEntity;
            }
        }
        return null;
    }

    public void clearStoredEntity() {
        this.storedEntityType = null;
        this.entityData = null;
    }

    @Override
    public Style getStyle() {
        return null;
    }

    @Override
    public ComponentContents getContents() {
        return null;
    }

    @Override
    public List<Component> getSiblings() {
        return null;
    }

    @Override
    public FormattedCharSequence getVisualOrderText() {
        return null;
    }
}
