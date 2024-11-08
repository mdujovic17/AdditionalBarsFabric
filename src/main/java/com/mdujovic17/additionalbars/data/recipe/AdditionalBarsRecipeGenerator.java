package com.mdujovic17.additionalbars.data.recipe;

import com.mdujovic17.additionalbars.init.ABContent;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class AdditionalBarsRecipeGenerator extends FabricRecipeProvider {

    public AdditionalBarsRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        regularBarsRecipes(exporter);
        crossedBarsRecipes(exporter);
        horizontalBarsRecipes(exporter);
    }

    private void regularBarsRecipes(RecipeExporter exporter) {
        // Gold Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.GOLD_BARS, 16)
                .pattern("GGG")
                .pattern("NNN")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT)
                .input('N', Items.GOLD_NUGGET)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_NUGGET), FabricRecipeProvider.conditionsFromItem(Items.GOLD_NUGGET))
                .group("bars")
                .offerTo(exporter);

        // Copper Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.COPPER_BARS, 64)
                .pattern("CCC")
                .pattern("NNN")
                .pattern("CCC")
                .input('C', Items.COPPER_BLOCK)
                .input('N', Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_BLOCK), FabricRecipeProvider.conditionsFromItem(Items.COPPER_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT), FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .group("bars")
                .offerTo(exporter);

        // Acacia Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.ACACIA_BARS, 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .input('L', Items.ACACIA_LOG)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.ACACIA_LOG), FabricRecipeProvider.conditionsFromItem(Items.ACACIA_LOG))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .group("bars")
                .offerTo(exporter);

        // Birch Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.BIRCH_BARS, 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .input('L', Items.BIRCH_LOG)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.BIRCH_LOG), FabricRecipeProvider.conditionsFromItem(Items.BIRCH_LOG))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .group("bars")
                .offerTo(exporter);

        // Jungle Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.JUNGLE_BARS, 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .input('L', Items.JUNGLE_LOG)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.JUNGLE_LOG), FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_LOG))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .group("bars")
                .offerTo(exporter);

        // Oak Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.OAK_BARS, 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .input('L', Items.OAK_LOG)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.OAK_LOG), FabricRecipeProvider.conditionsFromItem(Items.OAK_LOG))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .group("bars")
                .offerTo(exporter);

        // Dark Oak Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.DARK_OAK_BARS, 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .input('L', Items.DARK_OAK_LOG)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.DARK_OAK_LOG), FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_LOG))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .group("bars")
                .offerTo(exporter);

        // Spruce Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.SPRUCE_BARS, 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .input('L', Items.SPRUCE_LOG)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.SPRUCE_LOG), FabricRecipeProvider.conditionsFromItem(Items.SPRUCE_LOG))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .group("bars")
                .offerTo(exporter);

        // Mangrove Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.MANGROVE_BARS, 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .input('L', Items.MANGROVE_LOG)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.MANGROVE_LOG), FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_LOG))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .group("bars")
                .offerTo(exporter);

        // Crimson Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CRIMSON_BARS, 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .input('L', Items.CRIMSON_HYPHAE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.CRIMSON_HYPHAE), FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_HYPHAE))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .group("bars")
                .offerTo(exporter);

        // Warped Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.WARPED_BARS, 16)
                .pattern("LLL")
                .pattern("SSS")
                .pattern("LLL")
                .input('L', Items.WARPED_HYPHAE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.WARPED_HYPHAE), FabricRecipeProvider.conditionsFromItem(Items.WARPED_HYPHAE))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .group("bars")
                .offerTo(exporter);
    }

    private void crossedBarsRecipes(RecipeExporter exporter) {
        // Iron Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_IRON_BARS, 2)
                .input(Items.IRON_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_IRON_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_IRON_BARS))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_BARS), FabricRecipeProvider.conditionsFromItem(Items.IRON_BARS))
                .group("bars")
                .offerTo(exporter);

        // Gold Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_GOLD_BARS, 2)
                .input(ABContent.GOLD_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_GOLD_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_GOLD_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.GOLD_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.GOLD_BARS))
                .group("bars")
                .offerTo(exporter);

        // Copper Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_COPPER_BARS, 2)
                .input(ABContent.COPPER_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_COPPER_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.COPPER_BARS))
                .group("bars")
                .offerTo(exporter);

        // Exposed Copper Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_EXPOSED_COPPER_BARS, 2)
                .input(ABContent.EXPOSED_COPPER_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_EXPOSED_COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_EXPOSED_COPPER_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.EXPOSED_COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.EXPOSED_COPPER_BARS))
                .group("bars")
                .offerTo(exporter);

        // Weathered Copper Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_WEATHERED_COPPER_BARS, 2)
                .input(ABContent.WEATHERED_COPPER_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_WEATHERED_COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_WEATHERED_COPPER_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.WEATHERED_COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.WEATHERED_COPPER_BARS))
                .group("bars")
                .offerTo(exporter);

        // Oxidized Copper Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_OXIDIZED_COPPER_BARS, 2)
                .input(ABContent.OXIDIZED_COPPER_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_OXIDIZED_COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_OXIDIZED_COPPER_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.OXIDIZED_COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.OXIDIZED_COPPER_BARS))
                .group("bars")
                .offerTo(exporter);

        // Acacia Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_ACACIA_BARS, 2)
                .input(ABContent.ACACIA_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_ACACIA_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_ACACIA_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.ACACIA_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.ACACIA_BARS))
                .group("bars")
                .offerTo(exporter);

        // Birch Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_BIRCH_BARS, 2)
                .input(ABContent.BIRCH_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_BIRCH_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_BIRCH_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.BIRCH_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.BIRCH_BARS))
                .group("bars")
                .offerTo(exporter);

        // Jungle Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_JUNGLE_BARS, 2)
                .input(ABContent.JUNGLE_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_JUNGLE_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_JUNGLE_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.JUNGLE_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.JUNGLE_BARS))
                .group("bars")
                .offerTo(exporter);

        // Oak Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_OAK_BARS, 2)
                .input(ABContent.OAK_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_OAK_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_OAK_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.OAK_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.OAK_BARS))
                .group("bars")
                .offerTo(exporter);

        // Oak Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_DARK_OAK_BARS, 2)
                .input(ABContent.DARK_OAK_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_DARK_OAK_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_DARK_OAK_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.DARK_OAK_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.DARK_OAK_BARS))
                .group("bars")
                .offerTo(exporter);

        // Spruce Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_SPRUCE_BARS, 2)
                .input(ABContent.SPRUCE_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_SPRUCE_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_SPRUCE_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.SPRUCE_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.SPRUCE_BARS))
                .group("bars")
                .offerTo(exporter);

        // Mangrove Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_MANGROVE_BARS, 2)
                .input(ABContent.MANGROVE_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_MANGROVE_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_MANGROVE_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.MANGROVE_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.MANGROVE_BARS))
                .group("bars")
                .offerTo(exporter);

        // Crimson Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_CRIMSON_BARS, 2)
                .input(ABContent.CRIMSON_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_CRIMSON_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_CRIMSON_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.CRIMSON_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CRIMSON_BARS))
                .group("bars")
                .offerTo(exporter);

        // Warped Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.CROSSED_WARPED_BARS, 2)
                .input(ABContent.WARPED_BARS, 2)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_WARPED_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_WARPED_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.WARPED_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.WARPED_BARS))
                .group("bars")
                .offerTo(exporter);
    }

    private void horizontalBarsRecipes(RecipeExporter exporter) {
        // Iron Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_IRON_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', Items.IRON_BARS)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_BARS), FabricRecipeProvider.conditionsFromItem(Items.IRON_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Gold Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_GOLD_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.GOLD_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.GOLD_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.GOLD_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Copper Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_COPPER_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.COPPER_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.COPPER_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Exposed Copper Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_EXPOSED_COPPER_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.EXPOSED_COPPER_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.EXPOSED_COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.EXPOSED_COPPER_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Weathered Copper Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_WEATHERED_COPPER_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.WEATHERED_COPPER_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.WEATHERED_COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.WEATHERED_COPPER_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Oxidized Copper Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_OXIDIZED_COPPER_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.OXIDIZED_COPPER_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.OXIDIZED_COPPER_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.OXIDIZED_COPPER_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Acacia Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_ACACIA_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.ACACIA_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.ACACIA_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.ACACIA_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Birch Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_BIRCH_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.BIRCH_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.BIRCH_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.BIRCH_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Jungle Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_JUNGLE_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.JUNGLE_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.JUNGLE_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.JUNGLE_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Oak Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_OAK_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.OAK_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.OAK_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.OAK_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Dark Oak Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_DARK_OAK_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.DARK_OAK_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.DARK_OAK_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.DARK_OAK_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Spruce Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_SPRUCE_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.SPRUCE_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.SPRUCE_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.SPRUCE_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Mangrove Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_MANGROVE_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.MANGROVE_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.MANGROVE_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.MANGROVE_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Crimson Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_CRIMSON_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.CRIMSON_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.CRIMSON_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CRIMSON_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);

        // Warped Bars
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ABContent.HORIZONTAL_WARPED_BARS, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ABContent.WARPED_BARS)
                .criterion(FabricRecipeProvider.hasItem(ABContent.WARPED_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.WARPED_BARS))
                .group("horizontal_bars")
                .offerTo(exporter);
    }

    private void horizontalCrossedBarsRecipes(RecipeExporter exporter) {}

    private void horizontalToVerticalBarsRecipes(RecipeExporter exporter) {}

    private void crossedToRegularRecipes(RecipeExporter exporter) {
        // Iron Bars
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.IRON_BARS)
                .input(ABContent.CROSSED_IRON_BARS)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_BARS), FabricRecipeProvider.conditionsFromItem(Items.IRON_BARS))
                .criterion(FabricRecipeProvider.hasItem(ABContent.CROSSED_IRON_BARS), FabricRecipeProvider.conditionsFromItem(ABContent.CROSSED_IRON_BARS))
                .group("bars")
                .offerTo(exporter);
    }
}
