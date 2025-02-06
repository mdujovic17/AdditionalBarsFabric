package com.mdujovic17.additionalbars_datagen.datagen.loot;

import com.mdujovic17.additionalbars.events.ModRegistry;
import com.mdujovic17.additionalbars.init.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class AdditionalBarsLootTableGenerator extends FabricBlockLootTableProvider {
    public AdditionalBarsLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (Block block : ModRegistry.ADDITIONALBARS_BLOCKS.keySet()) {
            addDrop(block);
        }
    }
}
