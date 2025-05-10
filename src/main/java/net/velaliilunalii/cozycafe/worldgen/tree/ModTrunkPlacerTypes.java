package net.velaliilunalii.cozycafe.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.velaliilunalii.cozycafe.CozyCafe;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, CozyCafe.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<PalmTrunkPlacer>> PALM_TRUNK_PLACER =
            TRUNK_PLACERS.register("palm_trunk_placer",
                    () -> new TrunkPlacerType<>(PalmTrunkPlacer.CODEC.fieldOf("palm_foliage_placer").xmap(
                            palmFoliagePlacer -> palmFoliagePlacer,  // Identity function for serialization
                            json -> json                            // Identity function for deserialization
                    )));
}