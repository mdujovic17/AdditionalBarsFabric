package com.codenamerevy.additionalbars.content.block;

import com.codenamerevy.additionalbars.init.ABContent;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Degradable;

import java.util.Optional;
import java.util.function.Supplier;

public interface OxidizableBars extends Degradable<OxidizableBars.OxidizationLevel> {
    Supplier<BiMap<Block, Block>> OXIDATION_LEVEL_INCREASES = Suppliers.memoize(() -> new ImmutableBiMap.Builder<Block, Block>()
            .put(ABContent.COPPER_BARS, ABContent.EXPOSED_COPPER_BARS)
            .put(ABContent.EXPOSED_COPPER_BARS, ABContent.WEATHERED_COPPER_BARS)
            .put(ABContent.WEATHERED_COPPER_BARS, ABContent.OXIDIZED_COPPER_BARS).build());

    Supplier<BiMap<Block, Block>> OXIDATION_LEVEL_DECREASES = Suppliers.memoize(() -> (OXIDATION_LEVEL_INCREASES.get()).inverse());

    static Optional<Block> getDecreasedOxidationBlock(Block block) {
        return Optional.ofNullable((OXIDATION_LEVEL_DECREASES.get()).get(block));
    }

    static Block getUnaffectedOxidationBlock(Block block) {
        Block block2 = block;

        for(Block block3 = (OXIDATION_LEVEL_DECREASES.get()).get(block); block3 != null; block3 = (OXIDATION_LEVEL_DECREASES.get()).get(block3)) {
            block2 = block3;
        }

        return block2;
    }

    static Optional<BlockState> getDecreasedOxidationState(BlockState state) {
        return getDecreasedOxidationBlock(state.getBlock()).map((block) -> block.getStateWithProperties(state));
    }

    static Optional<Block> getIncreasedOxidationBlock(Block block) {
        return Optional.ofNullable((OXIDATION_LEVEL_INCREASES.get()).get(block));
    }

    static BlockState getUnaffectedOxidationState(BlockState state) {
        return getUnaffectedOxidationBlock(state.getBlock()).getStateWithProperties(state);
    }

    default Optional<BlockState> getDegradationResult(BlockState state) {
        return getIncreasedOxidationBlock(state.getBlock()).map((block) -> block.getStateWithProperties(state));
    }

    default float getDegradationChanceMultiplier() {
        return this.getDegradationLevel() == OxidizableBars.OxidizationLevel.UNAFFECTED ? 0.75F : 1.0F;
    }

    public static enum OxidizationLevel {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;

        private OxidizationLevel() {
        }
    }
}
