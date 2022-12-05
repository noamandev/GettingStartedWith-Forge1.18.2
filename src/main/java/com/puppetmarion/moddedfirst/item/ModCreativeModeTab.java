package com.puppetmarion.moddedfirst.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MODDED_ITEMS = new CreativeModeTab("moddedtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };
}
