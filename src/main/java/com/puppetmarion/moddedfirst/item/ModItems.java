package com.puppetmarion.moddedfirst.item;

import com.puppetmarion.moddedfirst.ModdedFirst;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModdedFirst.MOD_ID);

    // Ruby items
    public static final RegistryObject<Item> RUBY =
            ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));

    public static final RegistryObject<Item> CITRINE =
            ITEMS.register("citrine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));

    public static final RegistryObject<Item> RAW_CITRINE =
            ITEMS.register("raw_citrine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODDED_ITEMS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
