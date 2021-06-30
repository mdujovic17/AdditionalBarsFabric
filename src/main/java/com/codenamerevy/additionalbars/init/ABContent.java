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

package com.codenamerevy.additionalbars.init;

import com.codenamerevy.additionalbars.content.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ABContent
{
    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos)
    {
        return false;
    }

    private static final FabricBlockSettings METALLIC_BARS_SETTINGS = FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL);
    private static final FabricBlockSettings WOODEN_BARS_SETTINGS = FabricBlockSettings.of(Material.WOOD).breakByTool(FabricToolTags.AXES, 1).breakByHand(true).hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.WOOD);
    private static final FabricBlockSettings NETHER_BARS_SETTINGS = FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES, 1).breakByHand(true).hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.NETHER_STEM);

    private static final FabricBlockSettings HORIZONTAL_METALLIC_BARS_SETTINGS = FabricBlockSettings.of(Material.METAL).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).breakByTool(FabricToolTags.PICKAXES, 1).breakByHand(false).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL);
    private static final FabricBlockSettings HORIZONTAL_WOODEN_BARS_SETTINGS = FabricBlockSettings.of(Material.WOOD).solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).breakByTool(FabricToolTags.AXES, 1).nonOpaque().breakByHand(true).hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.WOOD);
    private static final FabricBlockSettings HORIZONTAL_NETHER_BARS_SETTINGS = FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).breakByTool(FabricToolTags.AXES, 1).hardness(3.0F).breakByHand(true).resistance(4.0F).sounds(BlockSoundGroup.NETHER_STEM);

    //public static final Block TEST_BLOCK = new BarsBlock(METALLIC_BARS_SETTINGS);

    public static final Block DIAMOND_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, "diamond_bars", EnumType.CRYSTAL, "/diamond_bars");
    public static final Block NETHERITE_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, "netherrite_bars", EnumType.METAL, "/netherrite_bars");

    public static final Block BRICK_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, "brick_bars", EnumType.BRICK, "bricks");
    public static final Block NETHER_BRICK_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, "nether_brick_bars", EnumType.BRICK, "nether_bricks");

    public static final Block GOLD_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, "gold_bars", EnumType.METAL, "/gold_bars");
    public static final Block ACACIA_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS  , "acacia_bars", EnumType.WOOD    , "acacia_planks");
    public static final Block BIRCH_BARS    = new BarsBlock(WOODEN_BARS_SETTINGS  , "birch_bars", EnumType.WOOD     , "birch_planks");
    public static final Block DARK_OAK_BARS = new BarsBlock(WOODEN_BARS_SETTINGS  , "dark_oak_bars", EnumType.WOOD  , "dark_oak_planks");
    public static final Block JUNGLE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS  , "jungle_bars", EnumType.WOOD    , "jungle_planks");
    public static final Block SPRUCE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS  , "spruce_bars", EnumType.WOOD    , "spruce_planks");
    public static final Block OAK_BARS      = new BarsBlock(WOODEN_BARS_SETTINGS  , "oak_bars", EnumType.WOOD       , "oak_planks");
    public static final Block CRIMSON_BARS  = new BarsBlock(NETHER_BARS_SETTINGS  , "crimson_bars", EnumType.WOOD   , "crimson_planks");
    public static final Block WARPED_BARS   = new BarsBlock(NETHER_BARS_SETTINGS  , "warped_bars", EnumType.WOOD    , "warped_planks");

    public static final Block COPPER_BARS = new OxidizableBarsBlock(OxidizableBars.OxidizationLevel.UNAFFECTED, METALLIC_BARS_SETTINGS.ticksRandomly(), "copper_bars", EnumType.METAL, "/copper_bars");
    public static final Block EXPOSED_COPPER_BARS = new OxidizableBarsBlock(OxidizableBars.OxidizationLevel.EXPOSED, METALLIC_BARS_SETTINGS.ticksRandomly(), "exposed_copper_bars", EnumType.METAL, "/exposed_copper_bars");
    public static final Block WEATHERED_COPPER_BARS = new OxidizableBarsBlock(OxidizableBars.OxidizationLevel.WEATHERED, METALLIC_BARS_SETTINGS.ticksRandomly(), "weathered_copper_bars", EnumType.METAL, "/weathered_copper_bars");
    public static final Block OXIDIZED_COPPER_BARS = new OxidizableBarsBlock(OxidizableBars.OxidizationLevel.OXIDIZED, METALLIC_BARS_SETTINGS.ticksRandomly(), "oxidized_copper_bars", EnumType.METAL, "/oxidized_copper_bars");

    public static final Block CROSSED_IRON_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, "crossed_iron_bars", EnumType.CROSSED_METAL , "/crossed_iron_bars");
    public static final Block CROSSED_GOLD_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, "crossed_gold_bars", EnumType.CROSSED_METAL , "/crossed_gold_bars");
    public static final Block CROSSED_ACACIA_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS, "crossed_acacia_bars", EnumType.CROSSED_WOOD  , "acacia_planks");
    public static final Block CROSSED_BIRCH_BARS    = new BarsBlock(WOODEN_BARS_SETTINGS, "crossed_birch_bars", EnumType.CROSSED_WOOD   , "birch_planks");
    public static final Block CROSSED_DARK_OAK_BARS = new BarsBlock(WOODEN_BARS_SETTINGS, "crossed_dark_oak_bars", EnumType.CROSSED_WOOD, "dark_oak_planks");
    public static final Block CROSSED_JUNGLE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS, "crossed_jungle_bars", EnumType.CROSSED_WOOD  , "jungle_planks");
    public static final Block CROSSED_SPRUCE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS, "crossed_spruce_bars", EnumType.CROSSED_WOOD  , "spruce_planks");
    public static final Block CROSSED_OAK_BARS      = new BarsBlock(WOODEN_BARS_SETTINGS, "crossed_oak_bars", EnumType.CROSSED_WOOD     , "oak_planks");
    public static final Block CROSSED_CRIMSON_BARS  = new BarsBlock(NETHER_BARS_SETTINGS, "crossed_crimson_bars", EnumType.CROSSED_WOOD , "crimson_planks");
    public static final Block CROSSED_WARPED_BARS   = new BarsBlock(NETHER_BARS_SETTINGS, "crossed_warped_bars", EnumType.CROSSED_WOOD  , "warped_planks");

    public static final Block CROSSED_COPPER_BARS = new OxidizableBarsBlock(OxidizableBars.OxidizationLevel.UNAFFECTED, METALLIC_BARS_SETTINGS.ticksRandomly(), "crossed_copper_bars", EnumType.CROSSED_METAL, "/crossed_copper_bars");
    public static final Block CROSSED_EXPOSED_COPPER_BARS = new OxidizableBarsBlock(OxidizableBars.OxidizationLevel.EXPOSED, METALLIC_BARS_SETTINGS.ticksRandomly(), "crossed_exposed_copper_bars", EnumType.CROSSED_METAL, "/crossed_exposed_copper_bars");
    public static final Block CROSSED_WEATHERED_COPPER_BARS = new OxidizableBarsBlock(OxidizableBars.OxidizationLevel.WEATHERED, METALLIC_BARS_SETTINGS.ticksRandomly(), "crossed_weathered_copper_bars", EnumType.CROSSED_METAL, "/crossed_weathered_copper_bars");
    public static final Block CROSSED_OXIDIZED_COPPER_BARS = new OxidizableBarsBlock(OxidizableBars.OxidizationLevel.OXIDIZED, METALLIC_BARS_SETTINGS.ticksRandomly(), "crossed_oxidized_copper_bars", EnumType.CROSSED_METAL, "/crossed_oxidized_copper_bars");

    public static final Block HORIZONTAL_IRON_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS, "horizontal_iron_bars", EnumType.H_METAL, "iron_bars");
    public static final Block HORIZONTAL_GOLD_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS, "horizontal_gold_bars", EnumType.H_METAL, "/gold_bars");
    public static final Block HORIZONTAL_ACACIA_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_acacia_bars", EnumType.H_WOOD, "acaica_planks");
    public static final Block HORIZONTAL_BIRCH_BARS     = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_birch_bars", EnumType.H_WOOD, "birch_planks");
    public static final Block HORIZONTAL_DARK_OAK_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_dark_oak_bars", EnumType.H_WOOD, "dark_oak_planks");
    public static final Block HORIZONTAL_JUNGLE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_jungle_bars", EnumType.H_WOOD, "jungle_planks");
    public static final Block HORIZONTAL_OAK_BARS       = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_oak_bars", EnumType.H_WOOD, "oak_planks");
    public static final Block HORIZONTAL_SPRUCE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_spruce_bars", EnumType.H_WOOD, "spruce_planks");
    public static final Block HORIZONTAL_CRIMSON_BARS   = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS, "horizontal_crimson_bars", EnumType.H_WOOD, "crimson_planks");
    public static final Block HORIZONTAL_WARPED_BARS    = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS, "horizontal_warped_bars", EnumType.H_WOOD, "warped_planks");

    public static final Block HORIZONTAL_COPPER_BARS = new OxidizableHorizontalPaneBlock(OxidizableBars.OxidizationLevel.UNAFFECTED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), "horizontal_copper_bars", EnumType.H_METAL, "/copper_bars");
    public static final Block HORIZONTAL_EXPOSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(OxidizableBars.OxidizationLevel.EXPOSED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), "horizontal_exposed_copper_bars", EnumType.H_METAL, "/exposed_copper_bars");
    public static final Block HORIZONTAL_WEATHERED_COPPER_BARS = new OxidizableHorizontalPaneBlock(OxidizableBars.OxidizationLevel.WEATHERED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), "horizontal_weathered_copper_bars", EnumType.H_METAL, "/weathered_copper_bars");
    public static final Block HORIZONTAL_OXIDIZED_COPPER_BARS = new OxidizableHorizontalPaneBlock(OxidizableBars.OxidizationLevel.OXIDIZED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), "horizontal_oxidized_copper_bars", EnumType.H_METAL, "/oxidized_copper_bars");

    public static final Block HORIZONTAL_CROSSED_IRON_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS, "horizontal_crossed_iron_bars", EnumType.H_METAL, "/crossed_iron_bars");
    public static final Block HORIZONTAL_CROSSED_GOLD_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS, "horizontal_crossed_gold_bars", EnumType.H_METAL, "/crossed_gold_bars");
    public static final Block HORIZONTAL_CROSSED_ACACIA_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_crossed_acacia_bars", EnumType.H_WOOD, "acacia_planks");
    public static final Block HORIZONTAL_CROSSED_BIRCH_BARS     = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_crossed_birch_bars", EnumType.H_WOOD, "birch_planks");
    public static final Block HORIZONTAL_CROSSED_DARK_OAK_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_crossed_dark_oak_bars", EnumType.H_WOOD, "dark_oak_planks");
    public static final Block HORIZONTAL_CROSSED_JUNGLE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_crossed_jungle_bars", EnumType.H_WOOD, "jungle_planks");
    public static final Block HORIZONTAL_CROSSED_OAK_BARS       = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_crossed_oak_bars", EnumType.H_WOOD, "oak_planks");
    public static final Block HORIZONTAL_CROSSED_SPRUCE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, "horizontal_crossed_spruce_bars", EnumType.H_WOOD, "spruce_planks");
    public static final Block HORIZONTAL_CROSSED_CRIMSON_BARS   = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS, "horizontal_crossed_crimson_bars", EnumType.H_WOOD, "crimson_planks");
    public static final Block HORIZONTAL_CROSSED_WARPED_BARS    = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS, "horizontal_crossed_warped_bars", EnumType.H_WOOD, "warped_planks");

    public static final Block HORIZONTAL_CROSSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(OxidizableBars.OxidizationLevel.UNAFFECTED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), "horizontal_crossed__copper_bars", EnumType.H_METAL, "/crossed_copper_bars");
    public static final Block HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(OxidizableBars.OxidizationLevel.EXPOSED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), "horizontal_crossed_exposed_copper_bars", EnumType.H_METAL, "/crossed_exposed_copper_bars");
    public static final Block HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = new OxidizableHorizontalPaneBlock(OxidizableBars.OxidizationLevel.WEATHERED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), "horizontal_crossed_weathered_copper_bars", EnumType.H_METAL, "/crossed_weathered_copper_bars");
    public static final Block HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = new OxidizableHorizontalPaneBlock(OxidizableBars.OxidizationLevel.OXIDIZED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), "horizontal_crossed_oxidized_copper_bars", EnumType.H_METAL, "/crossed_oxidized_copper_bars");
}
