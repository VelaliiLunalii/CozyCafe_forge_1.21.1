package net.velaliilunalii.cozycafe.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.velaliilunalii.cozycafe.CozyCafe;
import net.velaliilunalii.cozycafe.worldgen.ModConfiguredFeatures;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower PALM = new TreeGrower(CozyCafe.MOD_ID + ":palm",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PALM_KEY), Optional.empty());
}
