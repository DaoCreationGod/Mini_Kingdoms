package net.dao.mini_kingdoms.items.customs;

import net.dao.mini_kingdoms.util.MKTags;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

public class MonsterCatcherItem extends Item {

    private static final String NBT_MONSTERS = "MonsterData";

    public MonsterCatcherItem(Properties pProperties) {
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
            if (tag.contains(NBT_MONSTERS)) {
                // Try to pick up a monster
                Entity monster = (Monster) getEntityInRange(level, pos, MKTags.MONSTERS);
                if (monster != null) {
                    CompoundTag monsterTag = new CompoundTag();
                    monster.save(monsterTag);
                    tag.put(NBT_MONSTERS, monsterTag);
                    monster.setInvisible(true);
                    monster.setNoAi(true);
                    player.displayClientMessage(Component.literal("Monster picked up!"), true);
                    return InteractionResult.SUCCESS;
                } else {
                    player.displayClientMessage(Component.literal("No Monster nearby to pick up!"), true);
                    return InteractionResult.FAIL;
                }
            } else {
                // Place the monster back
                if (tag.contains(NBT_MONSTERS)) {
                    CompoundTag monsterTag = tag.getCompound(NBT_MONSTERS); // Get the monster data from NBT

                    // Create a new monster at the position
                    EntityType<?> type = EntityType.byId(monsterTag.getInt("id"));
                    Entity newMonster = type.create(level);
                    if (newMonster != null) {
                        newMonster.load(monsterTag); // Load the monster data
                        newMonster.setPos(pos.getX(), pos.getY() + 1, pos.getZ()); // Place the monster

                        level.addFreshEntity(newMonster); // Add the monster back into the world

                        tag.remove(NBT_MONSTERS); // Clear the NBT data (no longer holding a monster)
                        player.displayClientMessage(Component.literal("Monster placed back!"), true);
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
        // Prevent stacking if the item contains a monster
        CompoundTag tag = stack.getTag();
        return tag == null || !tag.contains(NBT_MONSTERS);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        // Return stack size of 1 if the item contains a monster
        CompoundTag tag = stack.getTag();
        if (tag != null && tag.contains(NBT_MONSTERS)) {
            return 1;
        }
        return super.getMaxStackSize(stack);
    }
}
