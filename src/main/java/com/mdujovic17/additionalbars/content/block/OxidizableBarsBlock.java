

package com.mdujovic17.additionalbars.content.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableBarsBlock extends BarsBlock implements Oxidizable {
    private final OxidationLevel oxidizationLevel;

    public OxidizableBarsBlock(OxidationLevel oxidizationLevel, Settings settings) {
        super(settings);
        this.oxidizationLevel = oxidizationLevel;
    }

    public OxidizableBarsBlock(OxidationLevel oxidizationLevel, Settings settings, BlockTypes... types) {
        super(settings, types);
        this.oxidizationLevel = oxidizationLevel;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }
    @Override
    public OxidationLevel getDegradationLevel() {
        return this.oxidizationLevel;
    }
}
