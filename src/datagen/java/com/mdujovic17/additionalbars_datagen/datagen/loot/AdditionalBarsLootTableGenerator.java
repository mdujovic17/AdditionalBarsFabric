package com.mdujovic17.additionalbars_datagen.datagen.loot;

import com.mdujovic17.additionalbars.init.ModBlocks;
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
        addDrop(ModBlocks.GOLD_BARS);
        addDrop(ModBlocks.COPPER_BARS);
        addDrop(ModBlocks.EXPOSED_COPPER_BARS);
        addDrop(ModBlocks.WEATHERED_COPPER_BARS);
        addDrop(ModBlocks.OXIDIZED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_BARS);
        addDrop(ModBlocks.ACACIA_BARS);
        addDrop(ModBlocks.BIRCH_BARS);
        addDrop(ModBlocks.OAK_BARS);
        addDrop(ModBlocks.DARK_OAK_BARS);
        addDrop(ModBlocks.JUNGLE_BARS);
        addDrop(ModBlocks.SPRUCE_BARS);
        addDrop(ModBlocks.MANGROVE_BARS);
        addDrop(ModBlocks.CRIMSON_BARS);
        addDrop(ModBlocks.WARPED_BARS);

        addDrop(ModBlocks.CROSSED_IRON_BARS);
        addDrop(ModBlocks.CROSSED_GOLD_BARS);
        addDrop(ModBlocks.CROSSED_COPPER_BARS);
        addDrop(ModBlocks.CROSSED_EXPOSED_COPPER_BARS);
        addDrop(ModBlocks.CROSSED_WEATHERED_COPPER_BARS);
        addDrop(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_CROSSED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_CROSSED_EXPOSED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_CROSSED_WEATHERED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_CROSSED_OXIDIZED_COPPER_BARS);
        addDrop(ModBlocks.CROSSED_ACACIA_BARS);
        addDrop(ModBlocks.CROSSED_BIRCH_BARS);
        addDrop(ModBlocks.CROSSED_OAK_BARS);
        addDrop(ModBlocks.CROSSED_DARK_OAK_BARS);
        addDrop(ModBlocks.CROSSED_JUNGLE_BARS);
        addDrop(ModBlocks.CROSSED_SPRUCE_BARS);
        addDrop(ModBlocks.CROSSED_MANGROVE_BARS);
        addDrop(ModBlocks.CROSSED_CRIMSON_BARS);
        addDrop(ModBlocks.CROSSED_WARPED_BARS);

        addDrop(ModBlocks.HORIZONTAL_IRON_BARS);
        addDrop(ModBlocks.HORIZONTAL_COPPER_BARS);
        addDrop(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS);
        addDrop(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS);
        addDrop(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_HORIZONTAL_COPPER_BARS);
        addDrop(ModBlocks.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS);
        addDrop(ModBlocks.HORIZONTAL_ACACIA_BARS);
        addDrop(ModBlocks.HORIZONTAL_BIRCH_BARS);
        addDrop(ModBlocks.HORIZONTAL_OAK_BARS);
        addDrop(ModBlocks.HORIZONTAL_DARK_OAK_BARS);
        addDrop(ModBlocks.HORIZONTAL_JUNGLE_BARS);
        addDrop(ModBlocks.HORIZONTAL_SPRUCE_BARS);
        addDrop(ModBlocks.HORIZONTAL_MANGROVE_BARS);
        addDrop(ModBlocks.HORIZONTAL_CRIMSON_BARS);
        addDrop(ModBlocks.HORIZONTAL_WARPED_BARS);

        addDrop(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_HORIZONTAL_CROSSED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
        addDrop(ModBlocks.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS);
        addDrop(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS);
    }
}
