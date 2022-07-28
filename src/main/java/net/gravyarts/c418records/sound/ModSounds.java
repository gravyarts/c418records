package net.gravyarts.c418records.sound;

import net.gravyarts.c418records.C418Records;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

//C418 - Volume Alpha
	public static SoundEvent MUSIC_DOG = registerSoundEvent("music_dog");
	public static SoundEvent MUSIC_BEGINNING = registerSoundEvent("music_beginning");
	public static SoundEvent MUSIC_DOOR = registerSoundEvent("music_door");
	public static SoundEvent MUSIC_CHRIS = registerSoundEvent("music_chris");
	public static SoundEvent MUSIC_EQUINOXE = registerSoundEvent("music_equinoxe");
	public static SoundEvent MUSIC_DROOPY_RICOCHET = registerSoundEvent("music_droopy_ricochet");
	public static SoundEvent MUSIC_DROOPY_FACE = registerSoundEvent("music_droopy_face");
	public static SoundEvent MUSIC_EXCUSE = registerSoundEvent("music_excuse");
	public static SoundEvent MUSIC_MOOG_CITY = registerSoundEvent("music_moog_city");
	public static SoundEvent MUSIC_DEATH = registerSoundEvent("music_death");
	
//C418 - Volume Beta
	public static SoundEvent MUSIC_INTRO = registerSoundEvent("music_intro");
	public static SoundEvent MUSIC_KYOTO = registerSoundEvent("music_kyoto");
	public static SoundEvent MUSIC_FLAKE = registerSoundEvent("music_flake");
	public static SoundEvent MUSIC_KI = registerSoundEvent("music_ki");
	public static SoundEvent MUSIC_ELEVEN = registerSoundEvent("music_eleven");

	
//C418 - One
	public static SoundEvent MUSIC_FIFFLAS = registerSoundEvent("music_fifflas");
	public static SoundEvent MUSIC_FLOB = registerSoundEvent("music_flob");
	public static SoundEvent MUSIC_TSUKI = registerSoundEvent("music_tsuki");
	
		private static SoundEvent registerSoundEvent(String name) {
			Identifier id = new Identifier(C418Records.MOD_ID, name);
			return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
		}
}