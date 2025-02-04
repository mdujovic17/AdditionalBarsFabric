package com.mdujovic17.additionalbars_datagen.datagen;


import com.mdujovic17.additionalbars_datagen.datagen.loot.AdditionalBarsLootTableGenerator;
import com.mdujovic17.additionalbars_datagen.datagen.model.AdditionalBarsModelGenerator;
import com.mdujovic17.additionalbars_datagen.datagen.recipe.AdditionalBarsRecipeGenerator;
import com.mdujovic17.additionalbars_datagen.datagen.tag.AdditionalBarsTagGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AdditionalBarsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(AdditionalBarsRecipeGenerator::new);
        pack.addProvider(AdditionalBarsLootTableGenerator::new);
        pack.addProvider(AdditionalBarsTagGenerator::new);
        pack.addProvider(AdditionalBarsModelGenerator::new);
    }
}
