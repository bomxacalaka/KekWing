package net.keker.kekwing.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab KEK_TAB = new CreativeModeTab("kek_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.KEK_WING.get());
        }
    };
}
