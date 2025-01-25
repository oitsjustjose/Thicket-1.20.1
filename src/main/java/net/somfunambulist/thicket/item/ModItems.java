package net.somfunambulist.thicket.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.somfunambulist.thicket.Thicket;
import net.somfunambulist.thicket.item.custom.DowsingRodItem;
import net.somfunambulist.thicket.item.custom.PocketKnifeItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Thicket.MOD_ID);

    public static final RegistryObject<Item> POCKET_KNIFE = ITEMS.register("pocket_knife",
            () -> new PocketKnifeItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HAZELNUT = ITEMS.register("hazelnut",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HAZELNUT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
