package net.gravyarts.c418records.mixin;

import net.gravyarts.c418records.C418Records;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class C418RecordsMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		C418Records.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
