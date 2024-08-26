package net.jsp.autocrafter.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jsp.autocrafter.Autocrafter;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block AUTOCRAFTER = registerBlock("autocrafter_block", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.OAK_TAN)
            .instrument(NoteBlockInstrument.BASS)
            .strength(3.5F)
            .requiresTool()
            .sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(Autocrafter.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Autocrafter.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Autocrafter.LOGGER.info("Registering blocks for " + Autocrafter.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL). register(entries -> {
            entries.add(ModBlocks.AUTOCRAFTER);
        });
    }
}
