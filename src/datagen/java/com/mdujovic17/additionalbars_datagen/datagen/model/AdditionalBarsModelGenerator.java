package com.mdujovic17.additionalbars_datagen.datagen.model;

import com.mdujovic17.additionalbars.AdditionalBars;
import com.mdujovic17.additionalbars.content.block.HorizontalPaneBlock;
import com.mdujovic17.additionalbars.events.ModRegistry;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.enums.SlabType;
import net.minecraft.client.data.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AdditionalBarsModelGenerator extends FabricModelProvider {

    private final Map<String, Identifier> textureMap = new HashMap<>();

    private static final Model BARS_INVENTORY = item("bars_inventory", TextureKey.TEXTURE);
    private static final Model CROSSED_BARS_INVENTORY = item("crossed_bars_inventory", TextureKey.TEXTURE);
    private static final Model SPECIAL_BARS_INVENTORY = item("special_bars_inventory", TextureKey.TEXTURE);

    private static final Model PANE_MODEL_CAP = block("cap", "_cap", TextureKey.TEXTURE);
    private static final Model PANE_MODEL_CAP_ALT = block("cap_alt", "_cap_alt", TextureKey.TEXTURE);
    private static final Model PANE_MODEL_POST = block("post", "_post", TextureKey.TEXTURE);
    private static final Model PANE_MODEL_POST_ENDS = block("post_ends", "_post_ends", TextureKey.TEXTURE);
    private static final Model PANE_MODEL_SIDE = block("side", "_side", TextureKey.TEXTURE);
    private static final Model PANE_MODEL_SIDE_ALT = block("side_alt", "_side_alt", TextureKey.TEXTURE);

    private static final Model PANE_CROSSED_MODEL_CAP = block("crossed/cap", "_cap", TextureKey.TEXTURE);
    private static final Model PANE_CROSSED_MODEL_CAP_ALT = block("crossed/cap_alt", "_cap_alt", TextureKey.TEXTURE);
    private static final Model PANE_CROSSED_MODEL_POST = block("crossed/post", "_post", TextureKey.TEXTURE);
    private static final Model PANE_CROSSED_MODEL_POST_ENDS = block("crossed/post_ends", "_post_ends", TextureKey.TEXTURE);
    private static final Model PANE_CROSSED_MODEL_SIDE = block("crossed/side", "_side", TextureKey.TEXTURE);
    private static final Model PANE_CROSSED_MODEL_SIDE_ALT = block("crossed/side_alt", "_side_alt", TextureKey.TEXTURE);

    private static final Model PANE_SPECIAL_MODEL_CAP = block("special/cap", "_cap", TextureKey.TEXTURE);
    private static final Model PANE_SPECIAL_MODEL_CAP_ALT = block("special/cap_alt", "_cap_alt", TextureKey.TEXTURE);
    private static final Model PANE_SPECIAL_MODEL_POST = block("special/post", "_post", TextureKey.TEXTURE);
    private static final Model PANE_SPECIAL_MODEL_POST_ENDS = block("special/post_ends", "_post_ends", TextureKey.TEXTURE);
    private static final Model PANE_SPECIAL_MODEL_SIDE = block("special/side", "_side", TextureKey.TEXTURE);
    private static final Model PANE_SPECIAL_MODEL_SIDE_ALT = block("special/side_alt", "_side_alt", TextureKey.TEXTURE);

    private static final Model HORIZONTAL_MODEL_BOTTOM = block("horizontal/bot", "", TextureKey.TEXTURE);
    private static final Model HORIZONTAL_MODEL_TOP = block("horizontal/top", "_top", TextureKey.TEXTURE);
    private static final Model HORIZONTAL_MODEL_COMBINED = block("horizontal/com", "_combined", TextureKey.TEXTURE);

    private static final Model HORIZONTAL_CROSSED_MODEL_BOTTOM = block("horizontal/crossed/bot", "", TextureKey.TEXTURE);
    private static final Model HORIZONTAL_CROSSED_MODEL_TOP = block("horizontal/crossed/top", "_top", TextureKey.TEXTURE);
    private static final Model HORIZONTAL_CROSSED_MODEL_COMBINED = block("horizontal/crossed/com", "_combined", TextureKey.TEXTURE);

    private static final Model HORIZONTAL_SPECIAL_MODEL_BOTTOM = block("horizontal/special/bot", "", TextureKey.TEXTURE);
    private static final Model HORIZONTAL_SPECIAL_MODEL_TOP = block("horizontal/special/top", "_top", TextureKey.TEXTURE);
    private static final Model HORIZONTAL_SPECIAL_MODEL_COMBINED = block("horizontal/special/com", "_combined", TextureKey.TEXTURE);

    public AdditionalBarsModelGenerator(FabricDataOutput output) {
        super(output);
        createTextureMap();
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (Map.Entry<Block, RegistryKey<Block>> blockEntry : ModRegistry.ADDITIONALBARS_BLOCKS.entrySet()) {
            String id = Registries.BLOCK.getEntry(blockEntry.getKey()).getIdAsString().replace("additionalbars:", "");

            TextureMap textures = new TextureMap();
            textures.put(TextureKey.TEXTURE, getTexture(id));

            if (id.contains("horizontal")) {
                VariantsBlockStateSupplier supplier = createHorizontalBlockStateSupplier(blockEntry.getKey(), id);

                if (id.contains("crossed")) {
                    HORIZONTAL_CROSSED_MODEL_BOTTOM.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    HORIZONTAL_CROSSED_MODEL_COMBINED.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    HORIZONTAL_CROSSED_MODEL_TOP.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                }
                else if (id.contains("copper") || id.contains("iron") || id.contains("gold")) {
                    HORIZONTAL_SPECIAL_MODEL_BOTTOM.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    HORIZONTAL_SPECIAL_MODEL_COMBINED.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    HORIZONTAL_SPECIAL_MODEL_TOP.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                }
                else {
                    HORIZONTAL_MODEL_BOTTOM.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    HORIZONTAL_MODEL_COMBINED.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    HORIZONTAL_MODEL_TOP.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                }

                blockStateModelGenerator.blockStateCollector.accept(supplier);
            }
            else {
                //LOGGER.info(id);

                MultipartBlockStateSupplier supplier = createPaneBlockStateSupplier(blockEntry.getKey(), id);

                if (id.contains("crossed")) {
                    PANE_CROSSED_MODEL_POST.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_CROSSED_MODEL_POST_ENDS.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_CROSSED_MODEL_CAP.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_CROSSED_MODEL_CAP_ALT.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_CROSSED_MODEL_SIDE.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_CROSSED_MODEL_SIDE_ALT.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                }
                else if (id.contains("copper") || id.contains("iron") || id.contains("gold")) {
                    PANE_SPECIAL_MODEL_POST.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_SPECIAL_MODEL_POST_ENDS.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_SPECIAL_MODEL_CAP.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_SPECIAL_MODEL_CAP_ALT.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_SPECIAL_MODEL_SIDE.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_SPECIAL_MODEL_SIDE_ALT.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                }
                else {
                    PANE_MODEL_POST.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_MODEL_POST_ENDS.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_MODEL_CAP.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_MODEL_CAP_ALT.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_MODEL_SIDE.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                    PANE_MODEL_SIDE_ALT.upload(blockEntry.getKey(), textures, blockStateModelGenerator.modelCollector);
                }

                blockStateModelGenerator.blockStateCollector.accept(supplier);
            }
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Map.Entry<Block, RegistryKey<Block>> blockEntry : ModRegistry.ADDITIONALBARS_BLOCKS.entrySet()) {
            String id = Registries.ITEM.getEntry(blockEntry.getKey().asItem()).getIdAsString().replace("additionalbars:", "");

            TextureMap textures = new TextureMap();
            textures.put(TextureKey.TEXTURE, getTexture(id));

            if (id.contains("horizontal")) {
                itemModelGenerator.register(blockEntry.getKey().asItem(), new Model(Optional.of(Identifier.of(AdditionalBars.MODID, "block/" + id)), Optional.empty()));
            }
            else {
                itemModelGenerator.register(blockEntry.getKey().asItem());
                if (id.contains("crossed")) {
                    CROSSED_BARS_INVENTORY.upload(blockEntry.getKey().asItem(), textures, itemModelGenerator.modelCollector);
                }
                else if (id.contains("copper") || id.contains("iron") || id.contains("gold")) {
                    SPECIAL_BARS_INVENTORY.upload(blockEntry.getKey().asItem(), textures, itemModelGenerator.modelCollector);
                }
                else {
                    BARS_INVENTORY.upload(blockEntry.getKey().asItem(), textures, itemModelGenerator.modelCollector);
                }
            }
        }
    }

    @Override
    public String getName() {
        return "Additional Bars Model Provider";
    }


    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(AdditionalBars.MODID, "block/parent/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(AdditionalBars.MODID, "block/parent/" + parent)), Optional.of(variant), requiredTextureKeys);
    }

    private static Model item(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(AdditionalBars.MODID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private MultipartBlockStateSupplier createPaneBlockStateSupplier(Block block, String blockId) {
        MultipartBlockStateSupplier supplier = MultipartBlockStateSupplier.create(block);
        supplier.with(BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_post_ends")));

        supplier.with(
                When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_post")));

        supplier.with(
                When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_cap")));

        supplier.with(
                When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, false),
                BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_cap")).put(VariantSettings.Y, VariantSettings.Rotation.R90));

        supplier.with(
                When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, false),
                BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_cap_alt")));

        supplier.with(
                When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, true),
                BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_cap_alt")).put(VariantSettings.Y, VariantSettings.Rotation.R90));

        supplier.with(When.create().set(Properties.NORTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_side")));
        supplier.with(When.create().set(Properties.EAST, true), BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_side")).put(VariantSettings.Y, VariantSettings.Rotation.R90));
        supplier.with(When.create().set(Properties.SOUTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_side_alt")));
        supplier.with(When.create().set(Properties.WEST, true), BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_side_alt")).put(VariantSettings.Y, VariantSettings.Rotation.R90));

        return supplier;
    }

    private VariantsBlockStateSupplier createHorizontalBlockStateSupplier(Block block, String blockId) {

        return VariantsBlockStateSupplier.create(block, BlockStateVariant.create()
                .put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, blockId)))
                .coordinate(BlockStateVariantMap.create(HorizontalPaneBlock.TYPE)
                        .register(SlabType.DOUBLE, BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_combined")))
                        .register(SlabType.TOP, BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId + "_top")))
                        .register(SlabType.BOTTOM, BlockStateVariant.create().put(VariantSettings.MODEL, Identifier.of(AdditionalBars.MODID, "block/" + blockId))));
    }

    private Identifier getTexture(String blockId) {
        return textureMap.get(blockId);
    }

    private void createTextureMap() {
        textureMap.put("crossed_iron_bars", Identifier.of("additionalbars", "block/crossed_iron_bars"));
        textureMap.put("horizontal_iron_bars", Identifier.of("minecraft", "block/iron_bars"));
        textureMap.put("horizontal_crossed_iron_bars", Identifier.of("additionalbars", "block/crossed_iron_bars"));
        textureMap.put("gold_bars", Identifier.of("additionalbars", "block/gold_bars"));
        textureMap.put("crossed_gold_bars", Identifier.of("additionalbars", "block/crossed_gold_bars"));
        textureMap.put("horizontal_gold_bars", Identifier.of("additionalbars", "block/gold_bars"));
        textureMap.put("horizontal_crossed_gold_bars", Identifier.of("additionalbars", "block/crossed_gold_bars"));

        textureMap.put("acacia_bars", Identifier.of("minecraft", "block/acacia_planks"));
        textureMap.put("crossed_acacia_bars", Identifier.of("minecraft", "block/acacia_planks"));
        textureMap.put("horizontal_acacia_bars", Identifier.of("minecraft", "block/acacia_planks"));
        textureMap.put("horizontal_crossed_acacia_bars", Identifier.of("minecraft", "block/acacia_planks"));
        textureMap.put("birch_bars", Identifier.of("minecraft", "block/birch_planks"));
        textureMap.put("crossed_birch_bars", Identifier.of("minecraft", "block/birch_planks"));
        textureMap.put("horizontal_birch_bars", Identifier.of("minecraft", "block/birch_planks"));
        textureMap.put("horizontal_crossed_birch_bars", Identifier.of("minecraft", "block/birch_planks"));
        textureMap.put("dark_oak_bars", Identifier.of("minecraft", "block/dark_oak_planks"));
        textureMap.put("crossed_dark_oak_bars", Identifier.of("minecraft", "block/dark_oak_planks"));
        textureMap.put("horizontal_dark_oak_bars", Identifier.of("minecraft", "block/dark_oak_planks"));
        textureMap.put("horizontal_crossed_dark_oak_bars", Identifier.of("minecraft", "block/dark_oak_planks"));
        textureMap.put("jungle_bars", Identifier.of("minecraft", "block/jungle_planks"));
        textureMap.put("crossed_jungle_bars", Identifier.of("minecraft", "block/jungle_planks"));
        textureMap.put("horizontal_jungle_bars", Identifier.of("minecraft", "block/jungle_planks"));
        textureMap.put("horizontal_crossed_jungle_bars", Identifier.of("minecraft", "block/jungle_planks"));
        textureMap.put("spruce_bars", Identifier.of("minecraft", "block/spruce_planks"));
        textureMap.put("crossed_spruce_bars", Identifier.of("minecraft", "block/spruce_planks"));
        textureMap.put("horizontal_spruce_bars", Identifier.of("minecraft", "block/spruce_planks"));
        textureMap.put("horizontal_crossed_spruce_bars", Identifier.of("minecraft", "block/spruce_planks"));
        textureMap.put("oak_bars", Identifier.of("minecraft", "block/oak_planks"));
        textureMap.put("crossed_oak_bars", Identifier.of("minecraft", "block/oak_planks"));
        textureMap.put("horizontal_oak_bars", Identifier.of("minecraft", "block/oak_planks"));
        textureMap.put("horizontal_crossed_oak_bars", Identifier.of("minecraft", "block/oak_planks"));
        textureMap.put("cherry_bars", Identifier.of("minecraft", "block/cherry_planks"));
        textureMap.put("crossed_cherry_bars", Identifier.of("minecraft", "block/cherry_planks"));
        textureMap.put("horizontal_cherry_bars", Identifier.of("minecraft", "block/cherry_planks"));
        textureMap.put("horizontal_crossed_cherry_bars", Identifier.of("minecraft", "block/cherry_planks"));
        textureMap.put("pale_oak_bars", Identifier.of("minecraft", "block/pale_oak_planks"));
        textureMap.put("crossed_pale_oak_bars", Identifier.of("minecraft", "block/pale_oak_planks"));
        textureMap.put("horizontal_pale_oak_bars", Identifier.of("minecraft", "block/pale_oak_planks"));
        textureMap.put("horizontal_crossed_pale_oak_bars", Identifier.of("minecraft", "block/pale_oak_planks"));
        textureMap.put("mangrove_bars", Identifier.of("minecraft", "block/mangrove_planks"));
        textureMap.put("crossed_mangrove_bars", Identifier.of("minecraft", "block/mangrove_planks"));
        textureMap.put("horizontal_mangrove_bars", Identifier.of("minecraft", "block/mangrove_planks"));
        textureMap.put("horizontal_crossed_mangrove_bars", Identifier.of("minecraft", "block/mangrove_planks"));
        textureMap.put("crimson_bars", Identifier.of("minecraft", "block/crimson_planks"));
        textureMap.put("crossed_crimson_bars", Identifier.of("minecraft", "block/crimson_planks"));
        textureMap.put("horizontal_crimson_bars", Identifier.of("minecraft", "block/crimson_planks"));
        textureMap.put("horizontal_crossed_crimson_bars", Identifier.of("minecraft", "block/crimson_planks"));
        textureMap.put("warped_bars", Identifier.of("minecraft", "block/warped_planks"));
        textureMap.put("crossed_warped_bars", Identifier.of("minecraft", "block/warped_planks"));
        textureMap.put("horizontal_warped_bars", Identifier.of("minecraft", "block/warped_planks"));
        textureMap.put("horizontal_crossed_warped_bars", Identifier.of("minecraft", "block/warped_planks"));

        textureMap.put("copper_bars", Identifier.of("additionalbars", "block/copper_bars"));
        textureMap.put("crossed_copper_bars", Identifier.of("additionalbars", "block/crossed_copper_bars"));
        textureMap.put("horizontal_copper_bars", Identifier.of("additionalbars", "block/copper_bars"));
        textureMap.put("horizontal_crossed_copper_bars", Identifier.of("additionalbars", "block/crossed_copper_bars"));
        textureMap.put("exposed_copper_bars", Identifier.of("additionalbars", "block/exposed_copper_bars"));
        textureMap.put("crossed_exposed_copper_bars", Identifier.of("additionalbars", "block/crossed_exposed_copper_bars"));
        textureMap.put("horizontal_exposed_copper_bars", Identifier.of("additionalbars", "block/exposed_copper_bars"));
        textureMap.put("horizontal_crossed_exposed_copper_bars", Identifier.of("additionalbars", "block/crossed_exposed_copper_bars"));
        textureMap.put("weathered_copper_bars", Identifier.of("additionalbars", "block/weathered_copper_bars"));
        textureMap.put("crossed_weathered_copper_bars", Identifier.of("additionalbars", "block/crossed_weathered_copper_bars"));
        textureMap.put("horizontal_weathered_copper_bars", Identifier.of("additionalbars", "block/weathered_copper_bars"));
        textureMap.put("horizontal_crossed_weathered_copper_bars", Identifier.of("additionalbars", "block/crossed_weathered_copper_bars"));
        textureMap.put("oxidized_copper_bars", Identifier.of("additionalbars", "block/oxidized_copper_bars"));
        textureMap.put("crossed_oxidized_copper_bars", Identifier.of("additionalbars", "block/crossed_oxidized_copper_bars"));
        textureMap.put("horizontal_oxidized_copper_bars", Identifier.of("additionalbars", "block/oxidized_copper_bars"));
        textureMap.put("horizontal_crossed_oxidized_copper_bars", Identifier.of("additionalbars", "block/crossed_oxidized_copper_bars"));

        textureMap.put("waxed_copper_bars", Identifier.of("additionalbars", "block/copper_bars"));
        textureMap.put("waxed_crossed_copper_bars", Identifier.of("additionalbars", "block/crossed_copper_bars"));
        textureMap.put("waxed_horizontal_copper_bars", Identifier.of("additionalbars", "block/copper_bars"));
        textureMap.put("waxed_horizontal_crossed_copper_bars", Identifier.of("additionalbars", "block/crossed_copper_bars"));
        textureMap.put("waxed_exposed_copper_bars", Identifier.of("additionalbars", "block/exposed_copper_bars"));
        textureMap.put("waxed_crossed_exposed_copper_bars", Identifier.of("additionalbars", "block/crossed_exposed_copper_bars"));
        textureMap.put("waxed_horizontal_exposed_copper_bars", Identifier.of("additionalbars", "block/exposed_copper_bars"));
        textureMap.put("waxed_horizontal_crossed_exposed_copper_bars", Identifier.of("additionalbars", "block/crossed_exposed_copper_bars"));
        textureMap.put("waxed_weathered_copper_bars", Identifier.of("additionalbars", "block/weathered_copper_bars"));
        textureMap.put("waxed_crossed_weathered_copper_bars", Identifier.of("additionalbars", "block/crossed_weathered_copper_bars"));
        textureMap.put("waxed_horizontal_weathered_copper_bars", Identifier.of("additionalbars", "block/weathered_copper_bars"));
        textureMap.put("waxed_horizontal_crossed_weathered_copper_bars", Identifier.of("additionalbars", "block/crossed_weathered_copper_bars"));
        textureMap.put("waxed_oxidized_copper_bars", Identifier.of("additionalbars", "block/oxidized_copper_bars"));
        textureMap.put("waxed_crossed_oxidized_copper_bars", Identifier.of("additionalbars", "block/crossed_oxidized_copper_bars"));
        textureMap.put("waxed_horizontal_oxidized_copper_bars", Identifier.of("additionalbars", "block/oxidized_copper_bars"));
        textureMap.put("waxed_horizontal_crossed_oxidized_copper_bars", Identifier.of("additionalbars", "block/crossed_oxidized_copper_bars"));
    }
}
