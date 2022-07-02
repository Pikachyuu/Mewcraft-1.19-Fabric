package net.pikachyuu.mewcraft.item.client;

import net.minecraft.util.Identifier;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.item.custom.MewniteBattleAxeItem;
import net.pikachyuu.mewcraft.item.custom.MewniteKatanaItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MewniteBattleAxeModel extends AnimatedGeoModel<MewniteBattleAxeItem> {
    @Override
    public Identifier getModelResource(MewniteBattleAxeItem object) {
        return new Identifier(Mewcraft.MOD_ID, "geo/mewnite_battleaxe.geo.json");
    }

    @Override
    public Identifier getTextureResource(MewniteBattleAxeItem object) {
        return new Identifier(Mewcraft.MOD_ID, "textures/item/mewnite_tools_texture.png");
    }

    @Override
    public Identifier getAnimationResource(MewniteBattleAxeItem animatable) {
        return new Identifier(Mewcraft.MOD_ID, "animations/mewnite_tools_animations.json");
    }
}
