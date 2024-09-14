package net.dao.mini_kingdoms.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

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

    public static final FoodProperties STEW_BASE = stew(1).saturationModifier(0.1f).effect(new MobEffectInstance(MobEffects.HUNGER, 500),1.0f).effect(new MobEffectInstance(MobEffects.BAD_OMEN, 500),1.0f).effect(new MobEffectInstance(MobEffects.BLINDNESS, 500),1.0f).effect(new MobEffectInstance(MobEffects.CONFUSION, 500),1.0f).effect(new MobEffectInstance(MobEffects.DARKNESS, 500),1.0f).effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 500),1.0f).effect(new MobEffectInstance(MobEffects.POISON, 500),1.0f).effect(new MobEffectInstance(MobEffects.WEAKNESS, 500),1.0f).effect(new MobEffectInstance(MobEffects.WITHER, 500),1.0f).effect(new MobEffectInstance(MobEffects.RAID_OMEN, 500),1.0f).effect(new MobEffectInstance(MobEffects.TRIAL_OMEN, 500),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500),1.0f).build();

    //Single Ingredient stews
    //Stew Bases
    public static final FoodProperties BEAR_STEW_BASE = stew(12).saturationModifier(3.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000),1.0f).build();
    public static final FoodProperties BLAZE_BLOOD_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 600),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.SATURATION, 600),1.0f).build();
    public static final FoodProperties HORSE_MEAT_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.JUMP, 600),1.0f).build();
    public static final FoodProperties TURTLE_SCALE_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600),1.0f).build();
    public static final FoodProperties CAT_FEET_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600),1.0f).build();
    public static final FoodProperties ARMADILLO_SCALE_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600),1.0f).build();
    public static final FoodProperties STOMACH_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.HUNGER, 600),1.0f).build();
    public static final FoodProperties LIVER_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.SATURATION, 600),1.0f).build();
    public static final FoodProperties LUNGS_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 600),1.0f).build();
    public static final FoodProperties HEART_STEW_BASE = stew(3).saturationModifier(0.2f).effect(new MobEffectInstance(MobEffects.REGENERATION, 600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600),1.0f).effect(new MobEffectInstance(MobEffects.HEAL, 600),1.0f).build();
    //Stews
    public static final FoodProperties BEAR_STEW = stew(24).saturationModifier(6.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2000),1.0f).build();
    public static final FoodProperties BLAZE_BLOOD_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1200),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.SATURATION, 1200),1.0f).build();
    public static final FoodProperties HORSE_MEAT_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.JUMP, 1200),1.0f).build();
    public static final FoodProperties TURTLE_SCALE_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200),1.0f).build();
    public static final FoodProperties CAT_FEET_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200),1.0f).build();
    public static final FoodProperties ARMADILLO_SCALE_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200),1.0f).build();
    public static final FoodProperties STOMACH_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.HUNGER, 1200),1.0f).build();
    public static final FoodProperties LIVER_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.SATURATION, 1200),1.0f).build();
    public static final FoodProperties LUNGS_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1200),1.0f).build();
    public static final FoodProperties HEART_STEW = stew(6).saturationModifier(0.4f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200),1.0f).effect(new MobEffectInstance(MobEffects.HEAL, 1200),1.0f).build();

    //Double Ingredient Stews
    //Stew Bases
    //Bear
    /*public static final FoodProperties BEAR_BLAZE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties BEAR_DOLPHIN_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).build();
    public static final FoodProperties BEAR_SQUID_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).build();
    public static final FoodProperties BEAR_DONKEY_MULE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties BEAR_HORSE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties BEAR_RABBIT_FOOT_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).build();
    public static final FoodProperties BEAR_TURTLE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties BEAR_CAT_FEET_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties BEAR_ARMADILLO_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties BEAR_STOMACH_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).build();
    public static final FoodProperties BEAR_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties BEAR_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties BEAR_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Blaze
    /*public static final FoodProperties BLAZE_DOLPHIN_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).build();
    public static final FoodProperties BLAZE_SQUID_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).build();
    public static final FoodProperties BLAZE_DONKEY_MULE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties BLAZE_HORSE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties BLAZE_RABBIT_FOOT_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).build();
    public static final FoodProperties BLAZE_TURTLE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties BLAZE_CAT_FEET_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties BLAZE_ARMADILLO_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties BLAZE_STOMACH_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).build();
    public static final FoodProperties BLAZE_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties BLAZE_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties BLAZE_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Dolphin
   /* public static final FoodProperties DOLPHIN_FIN_SQUID_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_DONKEY_MULE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_HORSE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_RABBIT_FOOT_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_TURTLE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_CAT_FEET_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_ARMADILLO_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_STOMACH_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Squid
   /* public static final FoodProperties GLOW_SQUID_EYE_DONKEY_MULE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_HORSE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_RABBIT_FOOT_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_TURTLE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_CAT_FEET_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_ARMADILLO_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_STOMACH_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Donkey & Mule
    /*public static final FoodProperties DONKEY_MULE_MEAT_HORSE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_RABBIT_FOOT_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_TURTLE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_CAT_FEET_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_ARMADILLO_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_STOMACH_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Horse
    /*public static final FoodProperties HORSE_RABBIT_FOOT_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).build();
    public static final FoodProperties HORSE_TURTLE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties HORSE_CAT_FEET_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties HORSE_ARMADILLO_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties HORSE_STOMACH_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).build();
    public static final FoodProperties HORSE_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties HORSE_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties HORSE_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Rabbit
    /*public static final FoodProperties RABBIT_FOOT_FOOD_TURTLE_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_CAT_FEET_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_ARMADILLO_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_STOMACH_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.JUMP, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Turtle
    /*public static final FoodProperties TURTLE_CAT_FEET_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).build();
    public static final FoodProperties TURTLE_ARMADILLO_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties TURTLE_STOMACH_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).build();
    public static final FoodProperties TURTLE_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties TURTLE_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties TURTLE_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Cat Feet
    /*public static final FoodProperties CAT_FEET_ARMADILLO_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).build();
    public static final FoodProperties CAT_FEET_STOMACH_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).build();
    public static final FoodProperties CAT_FEET_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties CAT_FEET_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties CAT_FEET_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Armadillo
    /*public static final FoodProperties ARMADILLO_STOMACH_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).build();
    public static final FoodProperties ARMADILLO_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties ARMADILLO_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties ARMADILLO_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Stomach
    /*public static final FoodProperties STOMACH_LIVER_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).build();
    public static final FoodProperties STOMACH_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties STOMACH_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.HUNGER, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Liver
   /* public static final FoodProperties LIVER_LUNGS_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).build();
    public static final FoodProperties LIVER_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.SATURATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Lungs
    /*public static final FoodProperties LUNGS_HEART_STEW_BASE = stew(16).saturationModifier(4.5f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1600),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 1600),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1600),1.0f).build();
    */
    //Stews
    //Bear
    /*public static final FoodProperties BEAR_BLAZE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties BEAR_DOLPHIN_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).build();
    public static final FoodProperties BEAR_SQUID_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).build();
    public static final FoodProperties BEAR_DONKEY_MULE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties BEAR_HORSE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties BEAR_RABBIT_FOOT_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).build();
    public static final FoodProperties BEAR_TURTLE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties BEAR_CAT_FEET_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties BEAR_ARMADILLO_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties BEAR_STOMACH_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).build();
    public static final FoodProperties BEAR_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties BEAR_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties BEAR_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Blaze
    /*public static final FoodProperties BLAZE_DOLPHIN_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).build();
    public static final FoodProperties BLAZE_SQUID_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).build();
    public static final FoodProperties BLAZE_DONKEY_MULE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties BLAZE_HORSE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties BLAZE_RABBIT_FOOT_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).build();
    public static final FoodProperties BLAZE_TURTLE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties BLAZE_CAT_FEET_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties BLAZE_ARMADILLO_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties BLAZE_STOMACH_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).build();
    public static final FoodProperties BLAZE_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties BLAZE_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties BLAZE_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Dolphin
    /*public static final FoodProperties DOLPHIN_FIN_SQUID_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_DONKEY_MULE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_HORSE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_RABBIT_FOOT_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_TURTLE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_CAT_FEET_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_ARMADILLO_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_STOMACH_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties DOLPHIN_FIN_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Squid
    /*public static final FoodProperties GLOW_SQUID_EYE_DONKEY_MULE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_HORSE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_RABBIT_FOOT_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_TURTLE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_CAT_FEET_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_ARMADILLO_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_STOMACH_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties GLOW_SQUID_EYE_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Donkey & Mule
    /*public static final FoodProperties DONKEY_MULE_MEAT_HORSE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_RABBIT_FOOT_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_TURTLE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_CAT_FEET_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_ARMADILLO_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_STOMACH_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties DONKEY_MULE_MEAT_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Horse
    /*public static final FoodProperties HORSE_RABBIT_FOOT_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).build();
    public static final FoodProperties HORSE_TURTLE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties HORSE_CAT_FEET_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties HORSE_ARMADILLO_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties HORSE_STOMACH_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).build();
    public static final FoodProperties HORSE_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties HORSE_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties HORSE_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Rabbit
    /*public static final FoodProperties RABBIT_FOOT_FOOD_TURTLE_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_CAT_FEET_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_ARMADILLO_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_STOMACH_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties RABBIT_FOOT_FOOD_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.JUMP, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Turtle
    /*public static final FoodProperties TURTLE_CAT_FEET_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).build();
    public static final FoodProperties TURTLE_ARMADILLO_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties TURTLE_STOMACH_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).build();
    public static final FoodProperties TURTLE_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties TURTLE_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties TURTLE_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Cat Feet
    /*public static final FoodProperties CAT_FEET_ARMADILLO_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).build();
    public static final FoodProperties CAT_FEET_STOMACH_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).build();
    public static final FoodProperties CAT_FEET_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties CAT_FEET_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties CAT_FEET_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Armadillo
   /* public static final FoodProperties ARMADILLO_STOMACH_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).build();
    public static final FoodProperties ARMADILLO_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties ARMADILLO_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties ARMADILLO_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Stomach
    /*public static final FoodProperties STOMACH_LIVER_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).build();
    public static final FoodProperties STOMACH_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties STOMACH_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.HUNGER, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Liver
   /* public static final FoodProperties LIVER_LUNGS_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).build();
    public static final FoodProperties LIVER_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.SATURATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */
    //Lungs
    /*public static final FoodProperties LUNGS_HEART_STEW = stew(32).saturationModifier(5.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3200),1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION, 3200),1.0f).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3200),1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 3200),1.0f).build();
    */



    protected static FoodProperties.Builder stew(int pNutrition) {
        return new FoodProperties.Builder().nutrition(pNutrition).saturationModifier(0.6F).usingConvertsTo(Items.BOWL);
    }
}
