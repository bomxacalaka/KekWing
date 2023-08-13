package net.keker.kekwing.item;

import net.keker.kekwing.KekWing;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KekWing.MOD_ID);


    public static final RegistryObject<Item> KEK_WING = ITEMS.register("kek_wing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KEK_TAB)));
    public static final RegistryObject<Item> KEK_WING2 = ITEMS.register("kek_wing2",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KEK_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
