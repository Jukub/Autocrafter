package net.jsp.autocrafter;

import net.fabricmc.api.ModInitializer;
import net.jsp.autocrafter.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Autocrafter implements ModInitializer {
	public static final String MOD_ID = "autocrafter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
//		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}