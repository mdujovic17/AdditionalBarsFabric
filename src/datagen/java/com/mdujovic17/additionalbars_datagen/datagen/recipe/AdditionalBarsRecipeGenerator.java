package com.mdujovic17.additionalbars_datagen.datagen.recipe;

import com.mdujovic17.additionalbars.init.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class AdditionalBarsRecipeGenerator extends FabricRecipeProvider {

    public AdditionalBarsRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {

        return new RecipeGenerator(wrapperLookup, recipeExporter) {

            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
                regularBarsRecipes(exporter);
                crossedBarsRecipes(exporter);
                horizontalBarsRecipes(exporter);
                horizontalCrossedBarsRecipes(exporter);
                horizontalToVerticalBarsRecipes(exporter);
                crossedToRegularRecipes(exporter);
            }

            private void regularBarsRecipes(RecipeExporter exporter) {
                // Gold Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.GOLD_BARS, 16)
                        .pattern("GGG")
                        .pattern("NNN")
                        .pattern("GGG")
                        .input('G', Items.GOLD_INGOT)
                        .input('N', Items.GOLD_NUGGET)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                        .group("bars")
                        .offerTo(exporter);

                // Copper Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.COPPER_BARS, 64)
                        .pattern("CCC")
                        .pattern("NNN")
                        .pattern("CCC")
                        .input('C', Items.COPPER_BLOCK)
                        .input('N', Items.COPPER_INGOT)
                        .criterion(hasItem(Items.COPPER_BLOCK), conditionsFromItem(Items.COPPER_BLOCK))
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .group("bars")
                        .offerTo(exporter);

                // Acacia Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_BARS, 16)
                        .pattern("LLL")
                        .pattern("SSS")
                        .pattern("LLL")
                        .input('L', Items.ACACIA_LOG)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.ACACIA_LOG), conditionsFromItem(Items.ACACIA_LOG))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group("bars")
                        .offerTo(exporter);

                // Birch Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_BARS, 16)
                        .pattern("LLL")
                        .pattern("SSS")
                        .pattern("LLL")
                        .input('L', Items.BIRCH_LOG)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.BIRCH_LOG), conditionsFromItem(Items.BIRCH_LOG))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group("bars")
                        .offerTo(exporter);

                // Jungle Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_BARS, 16)
                        .pattern("LLL")
                        .pattern("SSS")
                        .pattern("LLL")
                        .input('L', Items.JUNGLE_LOG)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.JUNGLE_LOG), conditionsFromItem(Items.JUNGLE_LOG))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group("bars")
                        .offerTo(exporter);

                // Oak Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_BARS, 16)
                        .pattern("LLL")
                        .pattern("SSS")
                        .pattern("LLL")
                        .input('L', Items.OAK_LOG)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.OAK_LOG), conditionsFromItem(Items.OAK_LOG))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group("bars")
                        .offerTo(exporter);

                // Dark Oak Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_BARS, 16)
                        .pattern("LLL")
                        .pattern("SSS")
                        .pattern("LLL")
                        .input('L', Items.DARK_OAK_LOG)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.DARK_OAK_LOG), conditionsFromItem(Items.DARK_OAK_LOG))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group("bars")
                        .offerTo(exporter);

                // Spruce Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_BARS, 16)
                        .pattern("LLL")
                        .pattern("SSS")
                        .pattern("LLL")
                        .input('L', Items.SPRUCE_LOG)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.SPRUCE_LOG), conditionsFromItem(Items.SPRUCE_LOG))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group("bars")
                        .offerTo(exporter);

                // Cherry Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_BARS, 16)
                        .pattern("LLL")
                        .pattern("SSS")
                        .pattern("LLL")
                        .input('L', Items.CHERRY_LOG)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.CHERRY_LOG), conditionsFromItem(Items.CHERRY_LOG))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group("bars")
                        .offerTo(exporter);

                // Mangrove Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_BARS, 16)
                        .pattern("LLL")
                        .pattern("SSS")
                        .pattern("LLL")
                        .input('L', Items.MANGROVE_LOG)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.MANGROVE_LOG), conditionsFromItem(Items.MANGROVE_LOG))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group("bars")
                        .offerTo(exporter);

                // Crimson Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_BARS, 16)
                        .pattern("LLL")
                        .pattern("SSS")
                        .pattern("LLL")
                        .input('L', Items.CRIMSON_HYPHAE)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.CRIMSON_HYPHAE), conditionsFromItem(Items.CRIMSON_HYPHAE))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group("bars")
                        .offerTo(exporter);

                // Warped Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_BARS, 16)
                        .pattern("LLL")
                        .pattern("SSS")
                        .pattern("LLL")
                        .input('L', Items.WARPED_HYPHAE)
                        .input('S', Items.STICK)
                        .criterion(hasItem(Items.WARPED_HYPHAE), conditionsFromItem(Items.WARPED_HYPHAE))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group("bars")
                        .offerTo(exporter);
            }

            private void crossedBarsRecipes(RecipeExporter exporter) {
                // Iron Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_IRON_BARS, 2)
                        .input(Items.IRON_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_IRON_BARS), conditionsFromItem(ModBlocks.CROSSED_IRON_BARS))
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Gold Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_GOLD_BARS, 2)
                        .input(ModBlocks.GOLD_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_GOLD_BARS), conditionsFromItem(ModBlocks.CROSSED_GOLD_BARS))
                        .criterion(hasItem(ModBlocks.GOLD_BARS), conditionsFromItem(ModBlocks.GOLD_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_COPPER_BARS, 2)
                        .input(ModBlocks.COPPER_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.COPPER_BARS), conditionsFromItem(ModBlocks.COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Exposed Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_EXPOSED_COPPER_BARS, 2)
                        .input(ModBlocks.EXPOSED_COPPER_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_EXPOSED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.EXPOSED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Weathered Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_WEATHERED_COPPER_BARS, 2)
                        .input(ModBlocks.WEATHERED_COPPER_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_WEATHERED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.WEATHERED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Oxidized Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_OXIDIZED_COPPER_BARS, 2)
                        .input(ModBlocks.OXIDIZED_COPPER_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.OXIDIZED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Acacia Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_ACACIA_BARS, 2)
                        .input(ModBlocks.ACACIA_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_ACACIA_BARS), conditionsFromItem(ModBlocks.CROSSED_ACACIA_BARS))
                        .criterion(hasItem(ModBlocks.ACACIA_BARS), conditionsFromItem(ModBlocks.ACACIA_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Birch Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_BIRCH_BARS, 2)
                        .input(ModBlocks.BIRCH_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_BIRCH_BARS), conditionsFromItem(ModBlocks.CROSSED_BIRCH_BARS))
                        .criterion(hasItem(ModBlocks.BIRCH_BARS), conditionsFromItem(ModBlocks.BIRCH_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Jungle Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_JUNGLE_BARS, 2)
                        .input(ModBlocks.JUNGLE_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_JUNGLE_BARS), conditionsFromItem(ModBlocks.CROSSED_JUNGLE_BARS))
                        .criterion(hasItem(ModBlocks.JUNGLE_BARS), conditionsFromItem(ModBlocks.JUNGLE_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Oak Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_OAK_BARS, 2)
                        .input(ModBlocks.OAK_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_OAK_BARS), conditionsFromItem(ModBlocks.CROSSED_OAK_BARS))
                        .criterion(hasItem(ModBlocks.OAK_BARS), conditionsFromItem(ModBlocks.OAK_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Oak Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_DARK_OAK_BARS, 2)
                        .input(ModBlocks.DARK_OAK_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_DARK_OAK_BARS), conditionsFromItem(ModBlocks.CROSSED_DARK_OAK_BARS))
                        .criterion(hasItem(ModBlocks.DARK_OAK_BARS), conditionsFromItem(ModBlocks.DARK_OAK_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Spruce Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_SPRUCE_BARS, 2)
                        .input(ModBlocks.SPRUCE_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_SPRUCE_BARS), conditionsFromItem(ModBlocks.CROSSED_SPRUCE_BARS))
                        .criterion(hasItem(ModBlocks.SPRUCE_BARS), conditionsFromItem(ModBlocks.SPRUCE_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Cherry Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_CHERRY_BARS, 2)
                        .input(ModBlocks.CHERRY_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_CHERRY_BARS), conditionsFromItem(ModBlocks.CROSSED_CHERRY_BARS))
                        .criterion(hasItem(ModBlocks.CHERRY_BARS), conditionsFromItem(ModBlocks.CHERRY_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Mangrove Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_MANGROVE_BARS, 2)
                        .input(ModBlocks.MANGROVE_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_MANGROVE_BARS), conditionsFromItem(ModBlocks.CROSSED_MANGROVE_BARS))
                        .criterion(hasItem(ModBlocks.MANGROVE_BARS), conditionsFromItem(ModBlocks.MANGROVE_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Crimson Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_CRIMSON_BARS, 2)
                        .input(ModBlocks.CRIMSON_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_CRIMSON_BARS), conditionsFromItem(ModBlocks.CROSSED_CRIMSON_BARS))
                        .criterion(hasItem(ModBlocks.CRIMSON_BARS), conditionsFromItem(ModBlocks.CRIMSON_BARS))
                        .group("bars")
                        .offerTo(exporter);

                // Warped Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_WARPED_BARS, 2)
                        .input(ModBlocks.WARPED_BARS, 2)
                        .criterion(hasItem(ModBlocks.CROSSED_WARPED_BARS), conditionsFromItem(ModBlocks.CROSSED_WARPED_BARS))
                        .criterion(hasItem(ModBlocks.WARPED_BARS), conditionsFromItem(ModBlocks.WARPED_BARS))
                        .group("bars")
                        .offerTo(exporter);
            }

            private void horizontalBarsRecipes(RecipeExporter exporter) {
                // Iron Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_IRON_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', Items.IRON_BARS)
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Gold Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_GOLD_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.GOLD_BARS)
                        .criterion(hasItem(ModBlocks.GOLD_BARS), conditionsFromItem(ModBlocks.GOLD_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Copper Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_COPPER_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.COPPER_BARS)
                        .criterion(hasItem(ModBlocks.COPPER_BARS), conditionsFromItem(ModBlocks.COPPER_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Exposed Copper Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.EXPOSED_COPPER_BARS)
                        .criterion(hasItem(ModBlocks.EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.EXPOSED_COPPER_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Weathered Copper Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.WEATHERED_COPPER_BARS)
                        .criterion(hasItem(ModBlocks.WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.WEATHERED_COPPER_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Oxidized Copper Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.OXIDIZED_COPPER_BARS)
                        .criterion(hasItem(ModBlocks.OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.OXIDIZED_COPPER_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Acacia Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_ACACIA_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.ACACIA_BARS)
                        .criterion(hasItem(ModBlocks.ACACIA_BARS), conditionsFromItem(ModBlocks.ACACIA_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Birch Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_BIRCH_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.BIRCH_BARS)
                        .criterion(hasItem(ModBlocks.BIRCH_BARS), conditionsFromItem(ModBlocks.BIRCH_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Jungle Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_JUNGLE_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.JUNGLE_BARS)
                        .criterion(hasItem(ModBlocks.JUNGLE_BARS), conditionsFromItem(ModBlocks.JUNGLE_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Oak Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_OAK_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.OAK_BARS)
                        .criterion(hasItem(ModBlocks.OAK_BARS), conditionsFromItem(ModBlocks.OAK_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Dark Oak Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_DARK_OAK_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.DARK_OAK_BARS)
                        .criterion(hasItem(ModBlocks.DARK_OAK_BARS), conditionsFromItem(ModBlocks.DARK_OAK_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Spruce Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_SPRUCE_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.SPRUCE_BARS)
                        .criterion(hasItem(ModBlocks.SPRUCE_BARS), conditionsFromItem(ModBlocks.SPRUCE_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Cherry Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CHERRY_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.CHERRY_BARS)
                        .criterion(hasItem(ModBlocks.CHERRY_BARS), conditionsFromItem(ModBlocks.CHERRY_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Mangrove Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_MANGROVE_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.MANGROVE_BARS)
                        .criterion(hasItem(ModBlocks.MANGROVE_BARS), conditionsFromItem(ModBlocks.MANGROVE_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Crimson Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CRIMSON_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.CRIMSON_BARS)
                        .criterion(hasItem(ModBlocks.CRIMSON_BARS), conditionsFromItem(ModBlocks.CRIMSON_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Warped Bars
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_WARPED_BARS, 6)
                        .pattern("BBB")
                        .pattern("BBB")
                        .input('B', ModBlocks.WARPED_BARS)
                        .criterion(hasItem(ModBlocks.WARPED_BARS), conditionsFromItem(ModBlocks.WARPED_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);
            }

            private void horizontalCrossedBarsRecipes(RecipeExporter exporter) {
                // Iron Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_IRON_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_IRON_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_IRON_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_IRON_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Gold Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_GOLD_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_GOLD_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_GOLD_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_COPPER_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_COPPER_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Exposed Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Weathered Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Oxidized Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Acacia Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_ACACIA_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_ACACIA_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_ACACIA_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Birch Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_BIRCH_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_BIRCH_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_BIRCH_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Jungle Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_JUNGLE_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_JUNGLE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_JUNGLE_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Oak Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_OAK_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_OAK_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_OAK_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_OAK_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Oak Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_DARK_OAK_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_DARK_OAK_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_DARK_OAK_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Spruce Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_SPRUCE_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_SPRUCE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_SPRUCE_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Cherry Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_CHERRY_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_CHERRY_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_CHERRY_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_CHERRY_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CHERRY_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CHERRY_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Mangrove Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_MANGROVE_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_MANGROVE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_MANGROVE_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Crimson Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_CRIMSON_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CRIMSON_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CRIMSON_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);

                // Warped Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS, 2)
                        .input(ModBlocks.HORIZONTAL_WARPED_BARS, 2)
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_WARPED_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_WARPED_BARS))
                        .group("horizontal_bars")
                        .offerTo(exporter);
            }

            private void horizontalToVerticalBarsRecipes(RecipeExporter exporter) {
                // Iron Bars
                createShapeless(RecipeCategory.DECORATIONS, Items.IRON_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_IRON_BARS, 1)
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_IRON_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_IRON_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_iron_bars");

                // Gold Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.GOLD_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_GOLD_BARS, 1)
                        .criterion(hasItem(ModBlocks.GOLD_BARS), conditionsFromItem(ModBlocks.GOLD_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_GOLD_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_GOLD_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_gold_bars");

                // Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.COPPER_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.COPPER_BARS), conditionsFromItem(ModBlocks.COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_copper_bars");

                // Exposed Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.EXPOSED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_exposed_copper_bars");

                // Weathered Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.WEATHERED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_weather_copper_bars");

                // Oxidized Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.OXIDIZED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_oxidized_copper_bars");

                // Acacia Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_ACACIA_BARS, 1)
                        .criterion(hasItem(ModBlocks.ACACIA_BARS), conditionsFromItem(ModBlocks.ACACIA_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_ACACIA_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_ACACIA_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_acacia_bars");

                // Birch Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_BIRCH_BARS, 1)
                        .criterion(hasItem(ModBlocks.BIRCH_BARS), conditionsFromItem(ModBlocks.BIRCH_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_BIRCH_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_BIRCH_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_birch_bars");

                // Oak Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.OAK_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_OAK_BARS, 1)
                        .criterion(hasItem(ModBlocks.OAK_BARS), conditionsFromItem(ModBlocks.OAK_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_OAK_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_OAK_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_oak_bars");

                // Dark Oak Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_DARK_OAK_BARS, 1)
                        .criterion(hasItem(ModBlocks.DARK_OAK_BARS), conditionsFromItem(ModBlocks.DARK_OAK_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_DARK_OAK_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_DARK_OAK_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_dark_oak_bars");

                // Jungle Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_JUNGLE_BARS, 1)
                        .criterion(hasItem(ModBlocks.JUNGLE_BARS), conditionsFromItem(ModBlocks.JUNGLE_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_JUNGLE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_JUNGLE_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_jungle_bars");

                // Spruce Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_SPRUCE_BARS, 1)
                        .criterion(hasItem(ModBlocks.SPRUCE_BARS), conditionsFromItem(ModBlocks.SPRUCE_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_SPRUCE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_SPRUCE_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_spruce_bars");

                // Mangrove Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_MANGROVE_BARS, 1)
                        .criterion(hasItem(ModBlocks.MANGROVE_BARS), conditionsFromItem(ModBlocks.MANGROVE_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_MANGROVE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_MANGROVE_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_mangrove_bars");

                // Crimson Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CRIMSON_BARS, 1)
                        .criterion(hasItem(ModBlocks.CRIMSON_BARS), conditionsFromItem(ModBlocks.CRIMSON_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CRIMSON_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CRIMSON_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crimson_bars");

                // Crimson Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.WARPED_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_WARPED_BARS, 1)
                        .criterion(hasItem(ModBlocks.WARPED_BARS), conditionsFromItem(ModBlocks.WARPED_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_WARPED_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_WARPED_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_warped_bars");

                // CROSSED //

                // Iron Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_IRON_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_IRON_BARS), conditionsFromItem(ModBlocks.CROSSED_IRON_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_iron_bars");

                // Gold Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_GOLD_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_GOLD_BARS), conditionsFromItem(ModBlocks.CROSSED_GOLD_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_gold_bars");

                // Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_COPPER_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_copper_bars");

                // Exposed Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_EXPOSED_COPPER_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_EXPOSED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_exposed_copper_bars");

                // Weathered Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_WEATHERED_COPPER_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_WEATHERED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_weather_copper_bars");

                // Oxidized Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_OXIDIZED_COPPER_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_oxidized_copper_bars");

                // Acacia Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_ACACIA_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_ACACIA_BARS), conditionsFromItem(ModBlocks.CROSSED_ACACIA_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_acacia_bars");

                // Birch Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_BIRCH_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_BIRCH_BARS), conditionsFromItem(ModBlocks.CROSSED_BIRCH_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_birch_bars");

                // Oak Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_OAK_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_OAK_BARS), conditionsFromItem(ModBlocks.CROSSED_OAK_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_oak_bars");

                // Dark Oak Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_DARK_OAK_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_DARK_OAK_BARS), conditionsFromItem(ModBlocks.CROSSED_DARK_OAK_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_dark_oak_bars");

                // Jungle Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_JUNGLE_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_JUNGLE_BARS), conditionsFromItem(ModBlocks.CROSSED_JUNGLE_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_jungle_bars");

                // Spruce Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_SPRUCE_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_SPRUCE_BARS), conditionsFromItem(ModBlocks.CROSSED_SPRUCE_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_spruce_bars");

                // Mangrove Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_MANGROVE_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_MANGROVE_BARS), conditionsFromItem(ModBlocks.CROSSED_MANGROVE_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_mangrove_bars");

                // Crimson Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_CRIMSON_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_CRIMSON_BARS), conditionsFromItem(ModBlocks.CROSSED_CRIMSON_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_crimson_bars");

                // Crimson Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CROSSED_WARPED_BARS, 1)
                        .input(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS, 1)
                        .criterion(hasItem(ModBlocks.CROSSED_WARPED_BARS), conditionsFromItem(ModBlocks.CROSSED_WARPED_BARS))
                        .criterion(hasItem(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS), conditionsFromItem(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS))
                        .group("bars")
                        .offerTo(exporter, "horizontal_to_crossed_warped_bars");
            }

            private void crossedToRegularRecipes(RecipeExporter exporter) {
                // Iron Bars
                createShapeless(RecipeCategory.DECORATIONS, Items.IRON_BARS, 1)
                        .input(ModBlocks.CROSSED_IRON_BARS, 1)
                        .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_IRON_BARS), conditionsFromItem(ModBlocks.CROSSED_IRON_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_iron_bars");

                // Gold Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.GOLD_BARS, 1)
                        .input(ModBlocks.CROSSED_GOLD_BARS, 1)
                        .criterion(hasItem(ModBlocks.GOLD_BARS), conditionsFromItem(ModBlocks.GOLD_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_GOLD_BARS), conditionsFromItem(ModBlocks.CROSSED_GOLD_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_gold_bars");

                // Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.COPPER_BARS, 1)
                        .input(ModBlocks.CROSSED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.COPPER_BARS), conditionsFromItem(ModBlocks.COPPER_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_copper_bars");

                // Exposed Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.EXPOSED_COPPER_BARS, 1)
                        .input(ModBlocks.CROSSED_EXPOSED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.EXPOSED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_EXPOSED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_EXPOSED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_exposed_copper_bars");

                // Weathered Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.WEATHERED_COPPER_BARS, 1)
                        .input(ModBlocks.CROSSED_WEATHERED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.WEATHERED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_WEATHERED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_WEATHERED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_weather_copper_bars");

                // Oxidized Copper Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.OXIDIZED_COPPER_BARS, 1)
                        .input(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS, 1)
                        .criterion(hasItem(ModBlocks.OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.OXIDIZED_COPPER_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS), conditionsFromItem(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_oxidized_copper_bars");

                // Acacia Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_BARS, 1)
                        .input(ModBlocks.CROSSED_ACACIA_BARS, 1)
                        .criterion(hasItem(ModBlocks.ACACIA_BARS), conditionsFromItem(ModBlocks.ACACIA_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_ACACIA_BARS), conditionsFromItem(ModBlocks.CROSSED_ACACIA_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_acacia_bars");

                // Birch Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_BARS, 1)
                        .input(ModBlocks.CROSSED_BIRCH_BARS, 1)
                        .criterion(hasItem(ModBlocks.BIRCH_BARS), conditionsFromItem(ModBlocks.BIRCH_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_BIRCH_BARS), conditionsFromItem(ModBlocks.CROSSED_BIRCH_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_birch_bars");

                // Oak Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.OAK_BARS, 1)
                        .input(ModBlocks.CROSSED_OAK_BARS, 1)
                        .criterion(hasItem(ModBlocks.OAK_BARS), conditionsFromItem(ModBlocks.OAK_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_OAK_BARS), conditionsFromItem(ModBlocks.CROSSED_OAK_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_oak_bars");

                // Dark Oak Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_BARS, 1)
                        .input(ModBlocks.CROSSED_DARK_OAK_BARS, 1)
                        .criterion(hasItem(ModBlocks.DARK_OAK_BARS), conditionsFromItem(ModBlocks.DARK_OAK_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_DARK_OAK_BARS), conditionsFromItem(ModBlocks.CROSSED_DARK_OAK_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_dark_oak_bars");

                // Jungle Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_BARS, 1)
                        .input(ModBlocks.CROSSED_JUNGLE_BARS, 1)
                        .criterion(hasItem(ModBlocks.JUNGLE_BARS), conditionsFromItem(ModBlocks.JUNGLE_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_JUNGLE_BARS), conditionsFromItem(ModBlocks.CROSSED_JUNGLE_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_jungle_bars");

                // Spruce Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_BARS, 1)
                        .input(ModBlocks.CROSSED_SPRUCE_BARS, 1)
                        .criterion(hasItem(ModBlocks.SPRUCE_BARS), conditionsFromItem(ModBlocks.SPRUCE_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_SPRUCE_BARS), conditionsFromItem(ModBlocks.CROSSED_SPRUCE_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_spruce_bars");

                // Mangrove Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_BARS, 1)
                        .input(ModBlocks.CROSSED_MANGROVE_BARS, 1)
                        .criterion(hasItem(ModBlocks.MANGROVE_BARS), conditionsFromItem(ModBlocks.MANGROVE_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_MANGROVE_BARS), conditionsFromItem(ModBlocks.CROSSED_MANGROVE_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_mangrove_bars");

                // Crimson Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_BARS, 1)
                        .input(ModBlocks.CROSSED_CRIMSON_BARS, 1)
                        .criterion(hasItem(ModBlocks.CRIMSON_BARS), conditionsFromItem(ModBlocks.CRIMSON_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_CRIMSON_BARS), conditionsFromItem(ModBlocks.CROSSED_CRIMSON_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_crimson_bars");

                // Crimson Bars
                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.WARPED_BARS, 1)
                        .input(ModBlocks.CROSSED_WARPED_BARS, 1)
                        .criterion(hasItem(ModBlocks.WARPED_BARS), conditionsFromItem(ModBlocks.WARPED_BARS))
                        .criterion(hasItem(ModBlocks.CROSSED_WARPED_BARS), conditionsFromItem(ModBlocks.CROSSED_WARPED_BARS))
                        .group("bars")
                        .offerTo(exporter, "crossed_to_warped_bars");
            }
        };
    }

    @Override
    public String getName() {
        return "Additional Bars Recipe Provider";
    }
}
