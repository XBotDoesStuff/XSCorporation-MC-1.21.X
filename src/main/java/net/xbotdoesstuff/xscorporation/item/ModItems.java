package net.xbotdoesstuff.xscorporation.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xbotdoesstuff.xscorporation.XSCorporation;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(XSCorporation.MODID);


    public static final DeferredItem<Item> ENTROPY = ITEMS.register("entropy", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_ENTROPY = ITEMS.register("raw_entropy", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
