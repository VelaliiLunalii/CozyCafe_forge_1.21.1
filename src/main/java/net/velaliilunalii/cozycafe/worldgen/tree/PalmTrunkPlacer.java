package net.velaliilunalii.cozycafe.worldgen.tree;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;


public class PalmTrunkPlacer extends TrunkPlacer {

    public static final Codec<PalmTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            trunkPlacerParts(instance).apply(instance, PalmTrunkPlacer::new)
    );

    public PalmTrunkPlacer(int baseHeight, int heightRandA, int heightRandB) {
        super(baseHeight, heightRandA, heightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.PALM_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> setBlock,
            RandomSource random, int height, BlockPos startPos, TreeConfiguration config) {

        BlockPos.MutableBlockPos pos = startPos.mutable();
        Direction bendDirection = Direction.Plane.HORIZONTAL.getRandomDirection(random);
        boolean rotateClockWise = random.nextBoolean();
        int lines = 3 + random.nextInt(2); // 3 or 4
        int bendAt = height / lines;

        for (int i = 0; i < height; i++) {
            if (i != 0 && i % bendAt == 0) {
                if (random.nextBoolean()) {
                    bendDirection = rotateClockWise ? bendDirection.getClockWise() : bendDirection.getCounterClockWise();
                }
                pos.move(bendDirection); // Apply single sideways offset
            }
            BlockState trunkState = config.trunkProvider.getState(random, pos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y);
            setBlock.accept(pos.immutable(), trunkState);
            pos.move(Direction.UP);
        }

        return List.of(new FoliagePlacer.FoliageAttachment(pos, 0, false));
    }
}
