/*
MIT License

Copyright (c) 2020 Marko Dujović

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package com.mdujovic17.additionalbars.events;

import com.google.common.collect.Maps;
import com.mdujovic17.additionalbars.init.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

import java.util.Map;

import static com.mdujovic17.additionalbars.AdditionalBars.MODID;

public class ModRegistry {
//    public static final ItemGroup ADDITIONAL_BARS = FabricItemGroup.builder()
//            .icon(() -> new ItemStack(ABContent.GOLD_BARS))
//            .displayName(Text.translatable("itemGroup.additionalbars.additionalbars"))
//            .build();
//    public static final ItemGroup HORIZONTAL_ADDITIONAL_BARS = FabricItemGroup.builder()
//            .icon(() -> new ItemStack(ABContent.HORIZONTAL_GOLD_BARS))
//            .displayName(Text.translatable("itemGroup.additionalbars.horizontaladditionalbars"))
//            .build();

    public static final Map<Block, RegistryKey<Block>> ADDITIONALBARS_BLOCKS = Maps.newHashMap();

    public static final RegistryKey<ItemGroup> ADDITIONAL_BARS = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MODID, "additionalbars"));
    //public static final RegistryKey<ItemGroup> HORIZONTAL_ADDITIONAL_BARS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID, "horizontaladditionalbars"));

    public static void setup() {
        registerBlocks();
        registerItemGroups();
        registerOxidationStates();
        registerWaxableStates();
        addItemsToItemGroups();
    }

    public static void clientSetup() {
        registerRenderLayer();
    }

    private static void registerBlocks() {
        register(ModBlocks.GOLD_BARS, ModRegistryKeys.GOLD_BARS_KEY, true);
        register(ModBlocks.ACACIA_BARS, ModRegistryKeys.ACACIA_BARS_KEY, true);
        register(ModBlocks.BIRCH_BARS, ModRegistryKeys.BIRCH_BARS_KEY, true);
        register(ModBlocks.DARK_OAK_BARS, ModRegistryKeys.DARK_OAK_BARS_KEY, true);
        register(ModBlocks.JUNGLE_BARS, ModRegistryKeys.JUNGLE_BARS_KEY, true);
        register(ModBlocks.SPRUCE_BARS, ModRegistryKeys.SPRUCE_BARS_KEY, true);
        register(ModBlocks.OAK_BARS, ModRegistryKeys.OAK_BARS_KEY, true);
        register(ModBlocks.CHERRY_BARS, ModRegistryKeys.CHERRY_BARS_KEY, true);
        register(ModBlocks.PALE_OAK_BARS, ModRegistryKeys.PALE_OAK_BARS_KEY, true);
        register(ModBlocks.MANGROVE_BARS, ModRegistryKeys.MANGROVE_BARS_KEY, true);
        register(ModBlocks.CRIMSON_BARS, ModRegistryKeys.CRIMSON_BARS_KEY, true);
        register(ModBlocks.WARPED_BARS, ModRegistryKeys.WARPED_BARS_KEY, true);

        register(ModBlocks.CROSSED_IRON_BARS, ModRegistryKeys.CROSSED_IRON_BARS_KEY, true);
        register(ModBlocks.CROSSED_GOLD_BARS, ModRegistryKeys.CROSSED_GOLD_BARS_KEY, true);
        register(ModBlocks.CROSSED_ACACIA_BARS, ModRegistryKeys.CROSSED_ACACIA_BARS_KEY, true);
        register(ModBlocks.CROSSED_BIRCH_BARS, ModRegistryKeys.CROSSED_BIRCH_BARS_KEY, true);
        register(ModBlocks.CROSSED_DARK_OAK_BARS, ModRegistryKeys.CROSSED_DARK_OAK_BARS_KEY, true);
        register(ModBlocks.CROSSED_JUNGLE_BARS, ModRegistryKeys.CROSSED_JUNGLE_BARS_KEY, true);
        register(ModBlocks.CROSSED_SPRUCE_BARS, ModRegistryKeys.CROSSED_SPRUCE_BARS_KEY, true);
        register(ModBlocks.CROSSED_OAK_BARS, ModRegistryKeys.CROSSED_OAK_BARS_KEY, true);
        register(ModBlocks.CROSSED_CHERRY_BARS, ModRegistryKeys.CROSSED_CHERRY_BARS_KEY, true);
        register(ModBlocks.CROSSED_PALE_OAK_BARS, ModRegistryKeys.CROSSED_PALE_OAK_BARS_KEY, true);
        register(ModBlocks.CROSSED_MANGROVE_BARS, ModRegistryKeys.CROSSED_MANGROVE_BARS_KEY, true);
        register(ModBlocks.CROSSED_CRIMSON_BARS, ModRegistryKeys.CROSSED_CRIMSON_BARS_KEY, true);
        register(ModBlocks.CROSSED_WARPED_BARS, ModRegistryKeys.CROSSED_WARPED_BARS_KEY, true);

        register(ModBlocks.HORIZONTAL_IRON_BARS, ModRegistryKeys.HORIZONTAL_IRON_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_GOLD_BARS, ModRegistryKeys.HORIZONTAL_GOLD_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_ACACIA_BARS, ModRegistryKeys.HORIZONTAL_ACACIA_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_BIRCH_BARS, ModRegistryKeys.HORIZONTAL_BIRCH_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_DARK_OAK_BARS, ModRegistryKeys.HORIZONTAL_DARK_OAK_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_JUNGLE_BARS, ModRegistryKeys.HORIZONTAL_JUNGLE_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_SPRUCE_BARS, ModRegistryKeys.HORIZONTAL_SPRUCE_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_OAK_BARS, ModRegistryKeys.HORIZONTAL_OAK_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CHERRY_BARS, ModRegistryKeys.HORIZONTAL_CHERRY_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_PALE_OAK_BARS, ModRegistryKeys.HORIZONTAL_PALE_OAK_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_MANGROVE_BARS, ModRegistryKeys.HORIZONTAL_MANGROVE_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CRIMSON_BARS, ModRegistryKeys.HORIZONTAL_CRIMSON_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_WARPED_BARS, ModRegistryKeys.HORIZONTAL_WARPED_BARS_KEY, true);

        register(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_IRON_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_GOLD_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_ACACIA_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_BIRCH_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_DARK_OAK_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_JUNGLE_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_SPRUCE_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_OAK_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_CHERRY_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_CHERRY_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_PALE_OAK_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_PALE_OAK_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_MANGROVE_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_CRIMSON_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_WARPED_BARS_KEY, true);

        register(ModBlocks.COPPER_BARS, ModRegistryKeys.COPPER_BARS_KEY, true);
        register(ModBlocks.EXPOSED_COPPER_BARS, ModRegistryKeys.EXPOSED_COPPER_BARS_KEY, true);
        register(ModBlocks.WEATHERED_COPPER_BARS, ModRegistryKeys.WEATHERED_COPPER_BARS_KEY, true);
        register(ModBlocks.OXIDIZED_COPPER_BARS, ModRegistryKeys.OXIDIZED_COPPER_BARS_KEY, true);

        register(ModBlocks.CROSSED_COPPER_BARS, ModRegistryKeys.CROSSED_COPPER_BARS_KEY, true);
        register(ModBlocks.CROSSED_EXPOSED_COPPER_BARS, ModRegistryKeys.CROSSED_EXPOSED_COPPER_BARS_KEY, true);
        register(ModBlocks.CROSSED_WEATHERED_COPPER_BARS, ModRegistryKeys.CROSSED_WEATHERED_COPPER_BARS_KEY, true);
        register(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS, ModRegistryKeys.CROSSED_OXIDIZED_COPPER_BARS_KEY, true);

        register(ModBlocks.HORIZONTAL_COPPER_BARS, ModRegistryKeys.HORIZONTAL_COPPER_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS, ModRegistryKeys.HORIZONTAL_EXPOSED_COPPER_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS, ModRegistryKeys.HORIZONTAL_WEATHERED_COPPER_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS, ModRegistryKeys.HORIZONTAL_OXIDIZED_COPPER_BARS_KEY, true);

        register(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_COPPER_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS_KEY, true);
        register(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, ModRegistryKeys.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS_KEY, true);

        register(ModBlocks.WAXED_COPPER_BARS, ModRegistryKeys.WAXED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_EXPOSED_COPPER_BARS, ModRegistryKeys.WAXED_EXPOSED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_WEATHERED_COPPER_BARS, ModRegistryKeys.WAXED_WEATHERED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_OXIDIZED_COPPER_BARS, ModRegistryKeys.WAXED_OXIDIZED_COPPER_BARS_KEY, true);

        register(ModBlocks.WAXED_CROSSED_COPPER_BARS, ModRegistryKeys.WAXED_CROSSED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_CROSSED_EXPOSED_COPPER_BARS, ModRegistryKeys.WAXED_CROSSED_EXPOSED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_CROSSED_WEATHERED_COPPER_BARS, ModRegistryKeys.WAXED_CROSSED_WEATHERED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_CROSSED_OXIDIZED_COPPER_BARS, ModRegistryKeys.WAXED_CROSSED_OXIDIZED_COPPER_BARS_KEY, true);

        register(ModBlocks.WAXED_HORIZONTAL_COPPER_BARS, ModRegistryKeys.WAXED_HORIZONTAL_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS, ModRegistryKeys.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS, ModRegistryKeys.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS, ModRegistryKeys.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS_KEY, true);

        register(ModBlocks.WAXED_HORIZONTAL_CROSSED_COPPER_BARS, ModRegistryKeys.WAXED_HORIZONTAL_CROSSED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, ModRegistryKeys.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, ModRegistryKeys.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS_KEY, true);
        register(ModBlocks.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, ModRegistryKeys.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS_KEY, true);
    }

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, ADDITIONAL_BARS, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModBlocks.GOLD_BARS))
                .displayName(Text.translatable("itemGroup.additionalbars.additionalbars"))
                .build());
    }

    public static void registerOxidationStates() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_BARS, ModBlocks.EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_BARS, ModBlocks.WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_BARS, ModBlocks.OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CROSSED_COPPER_BARS, ModBlocks.CROSSED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CROSSED_EXPOSED_COPPER_BARS, ModBlocks.CROSSED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CROSSED_WEATHERED_COPPER_BARS, ModBlocks.CROSSED_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.HORIZONTAL_COPPER_BARS, ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS, ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS, ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS, ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);
    }

    public static void registerWaxableStates() {
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_BARS, ModBlocks.WAXED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_BARS, ModBlocks.WAXED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_BARS, ModBlocks.WAXED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_BARS, ModBlocks.WAXED_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CROSSED_COPPER_BARS, ModBlocks.WAXED_CROSSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CROSSED_EXPOSED_COPPER_BARS, ModBlocks.WAXED_CROSSED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CROSSED_WEATHERED_COPPER_BARS, ModBlocks.WAXED_CROSSED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS, ModBlocks.WAXED_CROSSED_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.HORIZONTAL_COPPER_BARS, ModBlocks.WAXED_HORIZONTAL_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS, ModBlocks.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS, ModBlocks.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS, ModBlocks.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS, ModBlocks.WAXED_HORIZONTAL_CROSSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, ModBlocks.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, ModBlocks.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, ModBlocks.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);
    }

    public static void addItemsToItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ADDITIONAL_BARS).register(content -> {
            content.add(ModBlocks.GOLD_BARS.asItem());
            content.add(ModBlocks.ACACIA_BARS.asItem());
            content.add(ModBlocks.BIRCH_BARS.asItem());
            content.add(ModBlocks.DARK_OAK_BARS.asItem());
            content.add(ModBlocks.JUNGLE_BARS.asItem());
            content.add(ModBlocks.SPRUCE_BARS.asItem());
            content.add(ModBlocks.OAK_BARS.asItem());
            content.add(ModBlocks.CHERRY_BARS.asItem());
            content.add(ModBlocks.PALE_OAK_BARS.asItem());
            content.add(ModBlocks.MANGROVE_BARS.asItem());
            content.add(ModBlocks.CRIMSON_BARS.asItem());
            content.add(ModBlocks.WARPED_BARS.asItem());

            content.add(ModBlocks.CROSSED_GOLD_BARS.asItem());
            content.add(ModBlocks.CROSSED_IRON_BARS.asItem());
            content.add(ModBlocks.CROSSED_ACACIA_BARS.asItem());
            content.add(ModBlocks.CROSSED_BIRCH_BARS.asItem());
            content.add(ModBlocks.CROSSED_DARK_OAK_BARS.asItem());
            content.add(ModBlocks.CROSSED_JUNGLE_BARS.asItem());
            content.add(ModBlocks.CROSSED_SPRUCE_BARS.asItem());
            content.add(ModBlocks.CROSSED_OAK_BARS.asItem());
            content.add(ModBlocks.CROSSED_CHERRY_BARS.asItem());
            content.add(ModBlocks.CROSSED_PALE_OAK_BARS.asItem());
            content.add(ModBlocks.CROSSED_MANGROVE_BARS.asItem());
            content.add(ModBlocks.CROSSED_CRIMSON_BARS.asItem());
            content.add(ModBlocks.CROSSED_WARPED_BARS.asItem());

            content.add(ModBlocks.COPPER_BARS.asItem());
            content.add(ModBlocks.EXPOSED_COPPER_BARS.asItem());
            content.add(ModBlocks.WEATHERED_COPPER_BARS.asItem());
            content.add(ModBlocks.OXIDIZED_COPPER_BARS.asItem());

            content.add(ModBlocks.CROSSED_COPPER_BARS.asItem());
            content.add(ModBlocks.CROSSED_EXPOSED_COPPER_BARS.asItem());
            content.add(ModBlocks.CROSSED_WEATHERED_COPPER_BARS.asItem());
            content.add(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS.asItem());

            content.add(ModBlocks.WAXED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_EXPOSED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_WEATHERED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_OXIDIZED_COPPER_BARS.asItem());

            content.add(ModBlocks.WAXED_CROSSED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_CROSSED_EXPOSED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_CROSSED_WEATHERED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_CROSSED_OXIDIZED_COPPER_BARS.asItem());
        });

        ItemGroupEvents.modifyEntriesEvent(ADDITIONAL_BARS).register(content -> {
            content.add(ModBlocks.HORIZONTAL_GOLD_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_IRON_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_ACACIA_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_BIRCH_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_DARK_OAK_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_JUNGLE_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_SPRUCE_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_OAK_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CHERRY_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_PALE_OAK_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_MANGROVE_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CRIMSON_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_WARPED_BARS.asItem());

            content.add(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_CHERRY_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_PALE_OAK_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS.asItem());

            content.add(ModBlocks.HORIZONTAL_COPPER_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS.asItem());

            content.add(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.asItem());
            content.add(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.asItem());

            content.add(ModBlocks.WAXED_HORIZONTAL_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS.asItem());

            content.add(ModBlocks.WAXED_HORIZONTAL_CROSSED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.asItem());
            content.add(ModBlocks.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.asItem());
        });
    }

    public static void registerRenderLayer() {
//        //BlockRenderLayerMap.INSTANCE.putBlock(ABContent.TEST_BLOCK, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.GOLD_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.ACACIA_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.BIRCH_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.DARK_OAK_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.JUNGLE_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.SPRUCE_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.OAK_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CRIMSON_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.WARPED_BARS, RenderLayer.getCutout());
//
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_IRON_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_GOLD_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_ACACIA_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_BIRCH_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_DARK_OAK_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_JUNGLE_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_SPRUCE_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_OAK_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_CRIMSON_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_WARPED_BARS, RenderLayer.getCutout());
//
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_IRON_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_GOLD_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_ACACIA_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_BIRCH_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_DARK_OAK_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_JUNGLE_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_SPRUCE_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_OAK_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CRIMSON_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_WARPED_BARS, RenderLayer.getCutout());
//
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_IRON_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_GOLD_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_ACACIA_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_BIRCH_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_DARK_OAK_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_JUNGLE_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_SPRUCE_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_OAK_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_CRIMSON_BARS, RenderLayer.getCutout());
//        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_WARPED_BARS, RenderLayer.getCutout());
    }

    private static void register(Block block, RegistryKey<Block> blockRegistryKey, boolean shouldRegisterItem) {

        if (shouldRegisterItem) {
            RegistryKey<Item> itemRegistryKey = RegistryKey.of(RegistryKeys.ITEM, blockRegistryKey.getValue());
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemRegistryKey));
            Registry.register(Registries.ITEM, itemRegistryKey, blockItem);
        }

        Registry.register(Registries.BLOCK, blockRegistryKey, block);
        ADDITIONALBARS_BLOCKS.put(block, blockRegistryKey);
    }
}
