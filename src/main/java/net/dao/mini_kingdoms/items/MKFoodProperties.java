package net.dao.mini_kingdoms.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class MKFoodProperties {
    public static final FoodProperties BONE_MARROW = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 500),1.0f).build();
    public static final FoodProperties BEAR_MEAT = new FoodProperties.Builder().nutrition(6).saturationModifier(1.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 500),1.0f).build();
    public static final FoodProperties BLAZE_BLOOD = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 500),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 500),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 500),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.SATURATION, 500),1.0f).build();
    public static final FoodProperties HORSE_MEAT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.JUMP, 500),1.0f).build();
    public static final FoodProperties TURTLE_SCALE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500),1.0f).build();
    public static final FoodProperties CAT_FEET = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 500),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,500),1.0f).build();
    public static final FoodProperties ARMADILLO_SCALE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500),1.0f).build();
    public static final FoodProperties STOMACH = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.HUNGER, 500),1.0f).build();
    public static final FoodProperties LIVER = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.SATURATION, 500),1.0f).build();
    public static final FoodProperties LUNGS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 500),1.0f).build();
    public static final FoodProperties HEART = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.REGENERATION, 500),1.0f).effect(new MobEffectInstance(MobEffects.HEAL, 500), 1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 500), 1.0f).build();
    public static final FoodProperties CRAZY_BLOOD = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.HUNGER, 500),1.0f).effect(new MobEffectInstance(MobEffects.BAD_OMEN, 500),1.0f).effect(new MobEffectInstance(MobEffects.BLINDNESS, 500),1.0f).effect(new MobEffectInstance(MobEffects.CONFUSION, 500),1.0f).effect(new MobEffectInstance(MobEffects.DARKNESS, 500),1.0f).effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 500),1.0f).effect(new MobEffectInstance(MobEffects.POISON, 500),1.0f).effect(new MobEffectInstance(MobEffects.WEAKNESS, 500),1.0f).effect(new MobEffectInstance(MobEffects.WITHER, 500),1.0f).effect(new MobEffectInstance(MobEffects.RAID_OMEN, 500),1.0f).effect(new MobEffectInstance(MobEffects.TRIAL_OMEN, 500),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500),1.0f).build();
}
