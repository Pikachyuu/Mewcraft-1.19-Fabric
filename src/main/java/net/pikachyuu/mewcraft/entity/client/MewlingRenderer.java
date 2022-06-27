package net.pikachyuu.mewcraft.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.pikachyuu.mewcraft.entity.custom.MewlingEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MewlingRenderer extends GeoEntityRenderer<MewlingEntity> {

    public MewlingRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MewlingModel());
    }

    @Override
    public Identifier getTextureResource(MewlingEntity instance) {
        return super.getTextureResource(instance);
    }
}
