package net.gravyarts.c418records;

import net.fabricmc.api.ModInitializer;
import net.gravyarts.c418records.item.ModItems;
import net.gravyarts.c418records.util.ModLootTableModifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C418Records implements ModInitializer {
	public static final String MOD_ID = "c418records";
	public static final Logger LOGGER = LoggerFactory.getLogger("c418records");
	
	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();
	}
}
