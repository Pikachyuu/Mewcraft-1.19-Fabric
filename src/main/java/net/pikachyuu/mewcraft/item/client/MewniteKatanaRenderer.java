package net.pikachyuu.mewcraft.item.client;

import net.pikachyuu.mewcraft.item.custom.MewniteKatanaItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MewniteKatanaRenderer extends GeoItemRenderer<MewniteKatanaItem> {

    public MewniteKatanaRenderer() {
        super(new MewniteKatanaModel());
    }
}
