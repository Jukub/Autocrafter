package net.jsp.autocrafter.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jsp.autocrafter.Autocrafter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item AUTOCRAFTER = registerItem("autocrafter", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Autocrafter.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Autocrafter.LOGGER.info("Registering mod items for " + Autocrafter.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(AUTOCRAFTER);
        });
    }

}
