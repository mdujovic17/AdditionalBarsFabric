

package com.codenamerevy.additionalbars.content.block;

import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class OxidizableBarsBlock extends BarsBlock implements OxidizableBars {
    private final OxidizationLevel oxidizationLevel;

    public OxidizableBarsBlock(OxidizationLevel oxidizationLevel, Settings settings, String pathName, EnumType type, String texturePath) {
        super(settings, pathName, type, texturePath);
        this.oxidizationLevel = oxidizationLevel;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return OxidizableBars.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }
    @Override
    public OxidizationLevel getDegradationLevel() {
        return this.oxidizationLevel;
    }
}
