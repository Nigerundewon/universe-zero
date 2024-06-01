package net.radewon.universezero;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.radewon.universezero.block.ModBlocks;
import net.radewon.universezero.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UniverseZero implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Universe Zero");
	public static final String MOD_ID = "universezero";

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
