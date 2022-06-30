package net.pikachyuu.mewcraft.item.custom;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.item.ModItemGroup;
import net.pikachyuu.mewcraft.sound.ModSoundEvents;

//The purpose of this class existing is due to the sheer volume of music discs I plan on implementing. Otherwise it would have been normally
public class CustomMusicDiscs {

    public static final Item SONG_MUSIC_DISC_1 = registerItem("song_music_disc_1",
            new ModMusicDiscItem(1, ModSoundEvents.SONG_MUSIC_DISC_1,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.MEWCRAFT)));

    public static final Item CLIP_MUSIC_DISC_1 = registerItem("clip_music_disc_1",
            new ModMusicDiscItem(1, ModSoundEvents.CLIP_MUSIC_DISC_1,
                    new FabricItemSettings().maxCount(1).group(ModItemGroup.MEWCRAFT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Mewcraft.MOD_ID, name), item);
    }

    public static void registerCustomMusicDiscs(){
        Mewcraft.LOGGER.debug("Register Mod Music Discs for " + Mewcraft.MOD_ID);
    }
}
