package net.pikachyuu.mewcraft.item.client;

import net.minecraft.util.Identifier;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.item.custom.MewniteShovelItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MewniteShovelModel extends AnimatedGeoModel<MewniteShovelItem> {
    @Override
    public Identifier getModelResource(MewniteShovelItem object) {
        return new Identifier(Mewcraft.MOD_ID, "geo/mewnite_shovel.geo.json");
    }

    @Override
    public Identifier getTextureResource(MewniteShovelItem object) {
        return new Identifier(Mewcraft.MOD_ID, "textures/item/mewnite_tools_texture.png");
    }

    @Override
    public Identifier getAnimationResource(MewniteShovelItem animatable) {
        return new Identifier(Mewcraft.MOD_ID, "animations/mewnite_tools_animations.json");
    }
}
