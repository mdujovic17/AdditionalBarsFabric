package com.mdujovic17.additionalbars.data.loot;

import com.mdujovic17.additionalbars.init.ABContent;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class AdditionalBarsLootTableGenerator extends FabricBlockLootTableProvider {
    public AdditionalBarsLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ABContent.GOLD_BARS);
        addDrop(ABContent.COPPER_BARS);
        addDrop(ABContent.EXPOSED_COPPER_BARS);
        addDrop(ABContent.WEATHERED_COPPER_BARS);
        addDrop(ABContent.OXIDIZED_COPPER_BARS);
        addDrop(ABContent.WAXED_COPPER_BARS);
        addDrop(ABContent.WAXED_EXPOSED_COPPER_BARS);
        addDrop(ABContent.WAXED_WEATHERED_COPPER_BARS);
        addDrop(ABContent.WAXED_OXIDIZED_COPPER_BARS);
        addDrop(ABContent.ACACIA_BARS);
        addDrop(ABContent.BIRCH_BARS);
        addDrop(ABContent.OAK_BARS);
        addDrop(ABContent.DARK_OAK_BARS);
        addDrop(ABContent.JUNGLE_BARS);
        addDrop(ABContent.SPRUCE_BARS);
        addDrop(ABContent.MANGROVE_BARS);
        addDrop(ABContent.CRIMSON_BARS);
        addDrop(ABContent.WARPED_BARS);

        addDrop(ABContent.CROSSED_IRON_BARS);
        addDrop(ABContent.CROSSED_GOLD_BARS);
        addDrop(ABContent.CROSSED_COPPER_BARS);
        addDrop(ABContent.CROSSED_EXPOSED_COPPER_BARS);
        addDrop(ABContent.CROSSED_WEATHERED_COPPER_BARS);
        addDrop(ABContent.CROSSED_OXIDIZED_COPPER_BARS);
        addDrop(ABContent.WAXED_CROSSED_COPPER_BARS);
        addDrop(ABContent.WAXED_CROSSED_EXPOSED_COPPER_BARS);
        addDrop(ABContent.WAXED_CROSSED_WEATHERED_COPPER_BARS);
        addDrop(ABContent.WAXED_CROSSED_OXIDIZED_COPPER_BARS);
        addDrop(ABContent.CROSSED_ACACIA_BARS);
        addDrop(ABContent.CROSSED_BIRCH_BARS);
        addDrop(ABContent.CROSSED_OAK_BARS);
        addDrop(ABContent.CROSSED_DARK_OAK_BARS);
        addDrop(ABContent.CROSSED_JUNGLE_BARS);
        addDrop(ABContent.CROSSED_SPRUCE_BARS);
        addDrop(ABContent.CROSSED_MANGROVE_BARS);
        addDrop(ABContent.CROSSED_CRIMSON_BARS);
        addDrop(ABContent.CROSSED_WARPED_BARS);

        addDrop(ABContent.HORIZONTAL_IRON_BARS);
        addDrop(ABContent.HORIZONTAL_COPPER_BARS);
        addDrop(ABContent.HORIZONTAL_EXPOSED_COPPER_BARS);
        addDrop(ABContent.HORIZONTAL_WEATHERED_COPPER_BARS);
        addDrop(ABContent.HORIZONTAL_OXIDIZED_COPPER_BARS);
        addDrop(ABContent.WAXED_HORIZONTAL_COPPER_BARS);
        addDrop(ABContent.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS);
        addDrop(ABContent.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS);
        addDrop(ABContent.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS);
        addDrop(ABContent.HORIZONTAL_ACACIA_BARS);
        addDrop(ABContent.HORIZONTAL_BIRCH_BARS);
        addDrop(ABContent.HORIZONTAL_OAK_BARS);
        addDrop(ABContent.HORIZONTAL_DARK_OAK_BARS);
        addDrop(ABContent.HORIZONTAL_JUNGLE_BARS);
        addDrop(ABContent.HORIZONTAL_SPRUCE_BARS);
        addDrop(ABContent.HORIZONTAL_MANGROVE_BARS);
        addDrop(ABContent.HORIZONTAL_CRIMSON_BARS);
        addDrop(ABContent.HORIZONTAL_WARPED_BARS);

        addDrop(ABContent.HORIZONTAL_CROSSED_IRON_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_GOLD_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_COPPER_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);
        addDrop(ABContent.WAXED_HORIZONTAL_CROSSED_COPPER_BARS);
        addDrop(ABContent.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
        addDrop(ABContent.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
        addDrop(ABContent.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_ACACIA_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_BIRCH_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_OAK_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_DARK_OAK_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_JUNGLE_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_SPRUCE_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_MANGROVE_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_CRIMSON_BARS);
        addDrop(ABContent.HORIZONTAL_CROSSED_WARPED_BARS);
    }
}
