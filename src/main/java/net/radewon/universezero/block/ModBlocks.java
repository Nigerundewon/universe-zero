package net.radewon.universezero.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.radewon.universezero.UniverseZero;

public class ModBlocks {


    public static final Block CYANITE_CRYSTAL = registerBlock("cyanite_crystal",
            //new GlassBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER).strength(10.0f).nonOpaque()), ItemGroups.BUILDING_BLOCKS);
            new AmethystClusterBlock(10,4,FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER).strength(10.0f).nonOpaque().requiresTool().resistance(69420.0f)), ItemGroups.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(UniverseZero.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(UniverseZero.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks() {
        UniverseZero.LOGGER.info("Registering ModBlocks for " + UniverseZero.MOD_ID);
    }
}
