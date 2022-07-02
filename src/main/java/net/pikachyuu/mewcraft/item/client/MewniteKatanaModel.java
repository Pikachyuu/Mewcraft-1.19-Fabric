package net.pikachyuu.mewcraft.item.client;

import net.minecraft.util.Identifier;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.item.custom.MewniteArmorItem;
import net.pikachyuu.mewcraft.item.custom.MewniteKatanaItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MewniteKatanaModel extends AnimatedGeoModel<MewniteKatanaItem> {
    @Override
    public Identifier getModelResource(MewniteKatanaItem object) {
        return new Identifier(Mewcraft.MOD_ID, "geo/mewnite_katana.geo.json");
    }

    @Override
    public Identifier getTextureResource(MewniteKatanaItem object) {
        return new Identifier(Mewcraft.MOD_ID, "textures/item/mewnite_tools_texture.png");
    }

    @Override
    public Identifier getAnimationResource(MewniteKatanaItem animatable) {
        return new Identifier(Mewcraft.MOD_ID, "animations/mewnite_tools_animations.json");
    }
}
