package net.velaliilunalii.cozycafe.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.velaliilunalii.cozycafe.CozyCafe;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_BEACH_PALM_TREE = registerKey("add_beach_tree_palm");
    public static final ResourceKey<BiomeModifier> ADD_DESERT_PALM_TREE = registerKey("add_desert_tree_palm");
    public static final ResourceKey<BiomeModifier> ADD_JUNGLE_PALM_TREE = registerKey("add_jungle_tree_palm");

    public static final ResourceKey<BiomeModifier> ADD_EMBER_BLOOM = registerKey("add_ember_bloom");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeature = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_BEACH_PALM_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.BEACH)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.PALM_PLACED_BEACH_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_DESERT_PALM_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.DESERT)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.PALM_PLACED_DESERT_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_JUNGLE_PALM_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.JUNGLE), biomes.getOrThrow(Biomes.SPARSE_JUNGLE)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.PALM_PLACED_JUNGLE_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_EMBER_BLOOM, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.NETHER_WASTES)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.EMBER_BLOOM_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CozyCafe.MOD_ID, name));
    }
}
