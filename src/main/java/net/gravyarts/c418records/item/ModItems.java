package net.gravyarts.c418records.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gravyarts.c418records.C418Records;
import net.gravyarts.c418records.item.custom.RecordDiscItem;
import net.gravyarts.c418records.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
	

//Crafting
	
	public static final Item DISC_FRAGMENT = registerItem("disc_fragment", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	public static final Item DISC_ONE_FRAGMENT = registerItem("disc_one_fragment", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

//C418 - Volume Alpha
	public static final Item RECORD_DOG = registerItem("record_dog", new RecordDiscItem(7, ModSounds.MUSIC_DOG, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_BEGINNING = registerItem("record_beginning", new RecordDiscItem(7, ModSounds.MUSIC_BEGINNING, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_DOOR = registerItem("record_door", new RecordDiscItem(7, ModSounds.MUSIC_DOOR, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_CHRIS = registerItem("record_chris", new RecordDiscItem(7, ModSounds.MUSIC_CHRIS, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_EQUINOXE = registerItem("record_equinoxe", new RecordDiscItem(7, ModSounds.MUSIC_EQUINOXE, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_DROOPY_RICOCHET = registerItem("record_droopy_ricochet", new RecordDiscItem(7, ModSounds.MUSIC_DROOPY_RICOCHET, new FabricItemSettings().rarity(Rarity.EPIC).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_DROOPY_FACE = registerItem("record_droopy_face", new RecordDiscItem(7, ModSounds.MUSIC_DROOPY_FACE, new FabricItemSettings().rarity(Rarity.EPIC).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_EXCUSE = registerItem("record_excuse", new RecordDiscItem(7, ModSounds.MUSIC_EXCUSE, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_MOOG_CITY = registerItem("record_moog_city", new RecordDiscItem(7, ModSounds.MUSIC_MOOG_CITY, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_DEATH = registerItem("record_death", new RecordDiscItem(7, ModSounds.MUSIC_DEATH, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	
//C418 - Volume Beta
	public static final Item RECORD_INTRO = registerItem("record_intro", new RecordDiscItem(7, ModSounds.MUSIC_INTRO, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_KYOTO = registerItem("record_kyoto", new RecordDiscItem(7, ModSounds.MUSIC_KYOTO, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_FLAKE = registerItem("record_flake", new RecordDiscItem(7, ModSounds.MUSIC_FLAKE, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_KI = registerItem("record_ki", new RecordDiscItem(7, ModSounds.MUSIC_KI, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_ELEVEN = registerItem("record_eleven", new RecordDiscItem(7, ModSounds.MUSIC_ELEVEN, new FabricItemSettings().rarity(Rarity.EPIC).group(ItemGroup.MISC).maxCount(1)));

//C418 - One
	public static final Item RECORD_FIFFLAS = registerItem("record_fifflas", new RecordDiscItem(7, ModSounds.MUSIC_FIFFLAS, new FabricItemSettings().rarity(Rarity.EPIC).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_FLOB = registerItem("record_flob", new RecordDiscItem(7, ModSounds.MUSIC_FLOB, new FabricItemSettings().rarity(Rarity.EPIC).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_TSUKI = registerItem("record_tsuki", new RecordDiscItem(7, ModSounds.MUSIC_TSUKI, new FabricItemSettings().rarity(Rarity.EPIC).group(ItemGroup.MISC).maxCount(1)));
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(C418Records.MOD_ID, name), item);
	}
	
	public static void registerModItems() {
		C418Records.LOGGER.info("Registering Items for " + C418Records.MOD_ID);
    }
}