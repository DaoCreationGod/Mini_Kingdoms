package net.dao.mini_kingdoms.components;

import net.dao.mini_kingdoms.Mini_kingdoms;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.UnaryOperator;

public class MKDataComponentTypes {
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES =
            DeferredRegister.create(Registries.DATA_COMPONENT_TYPE, Mini_kingdoms.MODID);

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHCOREBUILDINGVILLAGE = register("touch_core_building_village",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHCOREBUILDINGTOWN = register("touch_core_building_town",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHCOREBUILDINGCITY = register("touch_core_building_city",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHCOREBUILDINGLARGECITY = register("touch_core_building_large_city",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHCOREBUILDINGREGIONALCAPITAL = register("touch_core_building_regional_capital",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHCOREBUILDINGCAPITAL = register("touch_core_building_capital",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHCOREBUILDINGKINGDOM = register("touch_core_building_kingdom",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHMINE = register("touch_mine",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHFARM = register("touch_farm",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHSHOP = register("touch_shop",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHBIOME = register("touch_biome",
            builder -> builder.persistent(BlockPos.CODEC));

    public static final RegistryObject<DataComponentType<BlockPos>> TOUCHCRAFTMENSHOP = register("touch_craftmen_shop",
            builder -> builder.persistent(BlockPos.CODEC));

    private static <T>RegistryObject<DataComponentType<T>> register(String name, UnaryOperator<DataComponentType.Builder<T>> builderOperator) {
        return DATA_COMPONENT_TYPES.register(name, () -> builderOperator.apply(DataComponentType.builder()).build());
    }

    public static void register(IEventBus eventBus) {
        DATA_COMPONENT_TYPES.register(eventBus);
    }
}
