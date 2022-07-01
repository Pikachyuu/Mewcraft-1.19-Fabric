package net.pikachyuu.mewcraft.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.pikachyuu.mewcraft.item.ModMusicDiscs;

import java.util.ArrayList;

public class ModLootTableModifiers {
    private static final Identifier ABANDONED_MINESHAFT_CHEST_ID
            = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier DESERT_PYRAMID_CHEST_ID
            = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier BURIED_TREASURE_CHEST_ID
            = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier END_CITY_TREASURE_CHEST_ID
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier JUNGLE_TEMPLE_CHEST_ID
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier RUINED_PORTAL_CHEST_ID
            = new Identifier("minecraft", "chests/ruined_portal");
    private static final Identifier SIMPLE_DUNGEON_CHEST_ID
            = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier STRONGHOLD_CORRIDOR_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_crossing");
    private static final Identifier STRONGHOLD_LIBRARY_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_library");



    public static void modifyLootTables() {
        ArrayList<Identifier> chest_id_list= new ArrayList<Identifier>();
        chest_id_list.add(ABANDONED_MINESHAFT_CHEST_ID);
        chest_id_list.add(DESERT_PYRAMID_CHEST_ID);
        chest_id_list.add(BURIED_TREASURE_CHEST_ID);
        chest_id_list.add(END_CITY_TREASURE_CHEST_ID);
        chest_id_list.add(JUNGLE_TEMPLE_CHEST_ID);
        chest_id_list.add(RUINED_PORTAL_CHEST_ID);
        chest_id_list.add(SIMPLE_DUNGEON_CHEST_ID);
        chest_id_list.add(STRONGHOLD_CORRIDOR_CHEST_ID);
        chest_id_list.add(STRONGHOLD_CROSSING_CHEST_ID);
        chest_id_list.add(STRONGHOLD_LIBRARY_CHEST_ID);


        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            for(int i = 0; i < chest_id_list.size(); i++) {
                if(chest_id_list.get(i).equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                            .with(ItemEntry.builder(ModMusicDiscs.SONG_MUSIC_DISC_1))
                            .with(ItemEntry.builder(ModMusicDiscs.CLIP_MUSIC_DISC_1))
                            .with(ItemEntry.builder(ModMusicDiscs.CLIP_MUSIC_DISC_2))
                            .with(ItemEntry.builder(ModMusicDiscs.CLIP_MUSIC_DISC_3))
                            .with(ItemEntry.builder(ModMusicDiscs.CLIP_MUSIC_DISC_4))
                            .with(ItemEntry.builder(ModMusicDiscs.CLIP_MUSIC_DISC_5))
                            .with(ItemEntry.builder(ModMusicDiscs.CLIP_MUSIC_DISC_6))


                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    supplier.pool(poolBuilder.build());
                }
            }
        }));
    }
}
