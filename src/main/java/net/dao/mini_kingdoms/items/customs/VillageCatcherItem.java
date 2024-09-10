/*package net.dao.mini_kingdoms.items.customs;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class VillageCatcherItem extends Item {

    private static final String NBT_VILLAGERS = "VillagerData";
    public VillageCatcherItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext){
        Level level = pContext.getLevel();
        Player player = pContext.getPlayer();
        BlockPos pos = pContext.getClickedPos();
        InteractionHand hand = pContext.getHand();
        ItemStack itemInHand = player.getItemInHand(hand);

        if (!level.isClientSide && player != null){
            CompoundTag tag = itemInHand.getOrCreateTagCompound();
            if (tag.contains(NBT_VILLAGERS)) {
                // Try to pick up a villager
                Villager villager = (Villager) getVillagerInRange(level,pos);
                if (villager != null) {
                    CompoundTag villagerTag = new CompoundTag();
                    villager.save(villagerTag);
                    tag.put(NBT_VILLAGERS, villagerTag);
                    villager.setInvisible(true);
                    villager.setNoAi(true);
                    player.displayClientMessage(Component.literal("Villager picked up!"), true);
                    return InteractionResult.SUCCESS;
                } else {
                    player.displayClientMessage(Component.literal("No villager nearby to pick up!"), true);
                    return InteractionResult.FAIL;
                }
            } else {
                // Place the villager back
                if (tag.contains(NBT_VILLAGERS)) {
                    CompoundTag villagerTag = tag.getCompound(NBT_VILLAGERS); // Get the villager data from NBT

                    // Create a new villager at the position
                    Villager newVillager = EntityType.VILLAGER.create(level);
                    if (newVillager != null) {
                        newVillager.load(villagerTag); // Load the villager data
                        newVillager.setPos(pos.getX(), pos.getY() + 1, pos.getZ()); // Place the villager

                        level.addFreshEntity(newVillager); // Add the villager back into the world

                        tag.remove(NBT_VILLAGERS); // Clear the NBT data (no longer holding a villager)
                        player.displayClientMessage(Component.literal("Villager placed back!"), true);
                        return InteractionResult.SUCCESS;
                    }
                }
            }
        }
        return InteractionResult.PASS;
    }

    private Entity getVillagerInRange(Level level, BlockPos pos){
        final double range = 3.0;
        return level.getEntities(null, new net.minecraft.world.phys.AABB(
                pos.getX() - range, pos.getY() - range, pos.getZ() - range,
                pos.getX() + range, pos.getY() + range, pos.getZ() + range))
                .stream().filter(entity -> entity instanceof Villager).findFirst().orElse(null);
    }

    @Override
    public boolean isStackable(ItemStack stack) {
        // Prevent stacking if the item contains a villager
        CompoundTag tag = stack.getTagCompound();
        return tag == null || !tag.contains(NBT_VILLAGERS);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        // Return stack size of 1 if the item contains a villager
        CompoundTag tag = stack.getTag();
        if (tag != null && tag.contains(NBT_VILLAGERS)) {
            return 1;
        }
        return super.getMaxStackSize(ItemStack stack);
    }
}
*/