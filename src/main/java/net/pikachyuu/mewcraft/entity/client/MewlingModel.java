package net.pikachyuu.mewcraft.entity.client;

import net.minecraft.util.Identifier;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.entity.custom.MewlingEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MewlingModel extends AnimatedGeoModel<MewlingEntity> {
    @Override
    public Identifier getModelResource(MewlingEntity object) {
         return new Identifier(Mewcraft.MOD_ID, "geo/mewling.geo.json");
    }

    @Override
    public Identifier getTextureResource(MewlingEntity object) {
        return new Identifier(Mewcraft.MOD_ID, "textures/entity/mewling/mewling.png");
    }

    @Override
    public Identifier getAnimationResource(MewlingEntity animatable) {
        return new Identifier(Mewcraft.MOD_ID, "animations/mewling.animations.json");
    }
}
