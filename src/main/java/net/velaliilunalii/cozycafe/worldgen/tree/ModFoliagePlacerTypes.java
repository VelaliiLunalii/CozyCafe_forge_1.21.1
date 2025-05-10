package net.velaliilunalii.cozycafe.worldgen.tree;

import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.velaliilunalii.cozycafe.CozyCafe;

public class ModFoliagePlacerTypes {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(ForgeRegistries.FOLIAGE_PLACER_TYPES, CozyCafe.MOD_ID);

    public static final RegistryObject<FoliagePlacerType<PalmFoliagePlacer>> PALM_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("palm_foliage_placer",
                    () -> new FoliagePlacerType<>(PalmFoliagePlacer.CODEC.fieldOf("palm_foliage_placer").xmap(
                            palmFoliagePlacer -> palmFoliagePlacer,  // Identity function for serialization
                            json -> json                            // Identity function for deserialization
                    )));
}
