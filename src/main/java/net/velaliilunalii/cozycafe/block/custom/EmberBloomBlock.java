package net.velaliilunalii.cozycafe.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class EmberBloomBlock extends FlowerBlock {
    public EmberBloomBlock(Holder<MobEffect> p_334860_, float p_331000_, Properties p_309749_) {
        super(p_334860_, p_331000_, p_309749_);
    }

    @Override
    protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return super.mayPlaceOn(blockState, blockGetter, blockPos) || blockState.is(Blocks.NETHERRACK)
                || blockState.is(Blocks.CRIMSON_NYLIUM) || blockState.is(Blocks.WARPED_NYLIUM);
    }
}
