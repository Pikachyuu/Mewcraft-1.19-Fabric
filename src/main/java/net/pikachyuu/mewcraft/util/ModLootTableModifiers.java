package net.pikachyuu.mewcraft.util;

import net.fabricmc.fabric.api.loot.v2.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.pikachyuu.mewcraft.item.ModItems;
import net.pikachyuu.mewcraft.item.custom.CustomMusicDiscs;

public class ModLootTableModifiers {
    private static final Identifier ABANDONED_MINESHAFT_CHEST_ID
            = new Identifier("minecraft", "chests/abandoned_mineshaft");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(ABANDONED_MINESHAFT_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 35% of the time
                        .with(ItemEntry.builder(CustomMusicDiscs.SONG_MUSIC_DISC_1))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
    }
}
