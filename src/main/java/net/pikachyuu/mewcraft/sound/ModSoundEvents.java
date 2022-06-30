package net.pikachyuu.mewcraft.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pikachyuu.mewcraft.Mewcraft;

public class ModSoundEvents {

    public static SoundEvent ENTITY_MEWLING_AMBIENT = registerSoundEvent("entity_mewling_ambient");
    public static SoundEvent ENTITY_MEWLING_HURT = registerSoundEvent("entity_mewling_hurt");
    public static SoundEvent ENTITY_MEWLING_DEATH = registerSoundEvent("entity_mewling_death");
    public static SoundEvent SONG_MUSIC_DISC_1 = registerSoundEvent("song_music_disc_1");
    public static SoundEvent CLIP_MUSIC_DISC_1 = registerSoundEvent("clip_music_disc_1");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Mewcraft.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
    public static void registerModSoundEvents() {
        Mewcraft.LOGGER.debug("Register Mod Sound Events " + Mewcraft.MOD_ID);
    }
}
