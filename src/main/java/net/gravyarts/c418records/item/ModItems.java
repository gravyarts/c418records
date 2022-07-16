package net.gravyarts.c418records.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gravyarts.c418records.C418Records;
import net.gravyarts.c418records.item.custom.RecordDiscItem;
import net.gravyarts.c418records.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	
	public static final Item RECORD_DOG = registerItem("record_dog", new RecordDiscItem(7, ModSounds.RECORD_DOG, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(C418Records.MOD_ID, name), item);
	}
	
	public static void registerModItems() {
		C418Records.LOGGER.info("Registering Items for " + C418Records.MOD_ID);
    }
}