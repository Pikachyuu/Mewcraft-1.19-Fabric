package net.pikachyuu.mewcraft.block.entity;

import net.minecraft.util.SignType;
import net.pikachyuu.mewcraft.mixin.SignTypeAccessor;

public class ModSignTypes {
    public static final SignType SAKURA =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("sakura"));
}
