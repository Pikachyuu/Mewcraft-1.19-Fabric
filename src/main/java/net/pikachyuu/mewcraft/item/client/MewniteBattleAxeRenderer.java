package net.pikachyuu.mewcraft.item.client;

import net.pikachyuu.mewcraft.item.custom.MewniteBattleAxeItem;
import net.pikachyuu.mewcraft.item.custom.MewniteKatanaItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MewniteBattleAxeRenderer extends GeoItemRenderer<MewniteBattleAxeItem>{
    public MewniteBattleAxeRenderer() {
        super(new MewniteBattleAxeModel());
    }
}
