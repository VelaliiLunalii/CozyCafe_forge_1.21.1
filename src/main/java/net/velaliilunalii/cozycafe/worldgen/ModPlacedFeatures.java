package net.velaliilunalii.cozycafe.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.velaliilunalii.cozycafe.CozyCafe;
import net.velaliilunalii.cozycafe.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> PALM_PLACED_BEACH_KEY = registerKey("palm_beach_placed");
    public static final ResourceKey<PlacedFeature> PALM_PLACED_DESERT_KEY = registerKey("palm_desert_placed");
    public static final ResourceKey<PlacedFeature> PALM_PLACED_JUNGLE_KEY = registerKey("palm_jungle_placed");

    public static final ResourceKey<PlacedFeature> EMBER_BLOOM_PLACED_KEY = registerKey("ember_bloom_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, PALM_PLACED_BEACH_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PALM_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 2),
                        ModBlocks.PALM_SAPLING.get()));

        register(context, PALM_PLACED_DESERT_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PALM_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.005f, 3),
                        ModBlocks.PALM_SAPLING.get()));

        register(context, PALM_PLACED_JUNGLE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PALM_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 3),
                        ModBlocks.PALM_SAPLING.get()));

        register(context, EMBER_BLOOM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.EMBER_BLOOM_KEY),
                List.of(RarityFilter.onAverageOnceEvery(6), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(CozyCafe.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
