package net.gravyarts.c418records.sound;

import net.gravyarts.c418records.C418Records;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
	public static SoundEvent RECORD_DOG = registerSoundEvent("record_dog");
	
		private static SoundEvent registerSoundEvent(String name) {
			Identifier id = new Identifier(C418Records.MOD_ID, name);
			return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
		}
}
