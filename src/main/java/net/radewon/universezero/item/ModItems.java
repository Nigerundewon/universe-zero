package net.radewon.universezero.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.radewon.universezero.UniverseZero;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

	public static Item CYANITE_SHARD = registerItem("cyanite_shard",
			new Item(new FabricItemSettings()));


	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(UniverseZero.MOD_ID, name), item);
	}

	public static void addItemsToItemGroup() {
		addToItemGroup(ItemGroups.INGREDIENTS, CYANITE_SHARD);
	}

	private static void addToItemGroup(ItemGroup group, Item item) {
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
	}

	public static void registerModItems() {
		UniverseZero.LOGGER.debug("Registering Mod Items for " + UniverseZero.MOD_ID);

		addItemsToItemGroup();
	}
}
