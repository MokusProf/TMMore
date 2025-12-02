package net.mokus.tmmore;

import net.fabricmc.api.ModInitializer;

import net.mokus.tmmore.block.ModBlocks;
import net.mokus.tmmore.item.ModItemGroup;
import net.mokus.tmmore.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TMMore implements ModInitializer {
	public static final String MOD_ID = "tmmore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.init();
		ModBlocks.init();
		ModItemGroup.init();

	}
}