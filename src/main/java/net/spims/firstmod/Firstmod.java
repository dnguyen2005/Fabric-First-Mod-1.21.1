package net.spims.firstmod;

import net.fabricmc.api.ModInitializer;

import net.spims.firstmod.block.ModBlocks;
import net.spims.firstmod.item.ModItemGroups;
import net.spims.firstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Firstmod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}