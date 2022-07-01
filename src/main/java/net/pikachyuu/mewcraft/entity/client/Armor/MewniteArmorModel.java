package net.pikachyuu.mewcraft.entity.client.Armor;

import net.minecraft.util.Identifier;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.entity.custom.MewlingEntity;
import net.pikachyuu.mewcraft.item.custom.MewniteArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MewniteArmorModel extends AnimatedGeoModel<MewniteArmorItem> {
    @Override
    public Identifier getModelResource(MewniteArmorItem object) {
        return new Identifier(Mewcraft.MOD_ID, "geo/mewnite_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(MewniteArmorItem object) {
        return new Identifier(Mewcraft.MOD_ID, "textures/models/armor/mewnite_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(MewniteArmorItem animatable) {
        return new Identifier(Mewcraft.MOD_ID, "animations/armor_animations.json");
    }
}
