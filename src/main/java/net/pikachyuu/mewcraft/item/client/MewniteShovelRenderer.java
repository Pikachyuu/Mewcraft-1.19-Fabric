package net.pikachyuu.mewcraft.item.client;

import net.pikachyuu.mewcraft.item.custom.MewniteShovelItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MewniteShovelRenderer extends GeoItemRenderer<MewniteShovelItem> {
    public MewniteShovelRenderer() {
        super(new MewniteShovelModel());
    }
}
