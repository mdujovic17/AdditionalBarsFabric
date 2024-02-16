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

package com.mdujovic17.additionalbars.init;

import com.mdujovic17.additionalbars.content.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ABContent
{
    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos)
    {
        return false;
    }

    private static final FabricBlockSettings METALLIC_BARS_SETTINGS = FabricBlockSettings.create().nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL);
    private static final FabricBlockSettings WOODEN_BARS_SETTINGS = FabricBlockSettings.create().nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.WOOD);
    private static final FabricBlockSettings NETHER_BARS_SETTINGS = FabricBlockSettings.create().nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.NETHER_STEM);

    private static final FabricBlockSettings HORIZONTAL_METALLIC_BARS_SETTINGS = FabricBlockSettings.create().nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL);
    private static final FabricBlockSettings HORIZONTAL_WOODEN_BARS_SETTINGS = FabricBlockSettings.create().nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).nonOpaque().hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.WOOD);
    private static final FabricBlockSettings HORIZONTAL_NETHER_BARS_SETTINGS = FabricBlockSettings.create().nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.NETHER_STEM);

    //public static final Block DIAMOND_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.REGULAR);
    //public static final Block NETHERITE_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.REGULAR);

    //public static final Block BRICK_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.REGULAR);
    //public static final Block NETHER_BRICK_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.REGULAR);

    public static final Block GOLD_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.REGULAR, BarsType.METAL);
    public static final Block ACACIA_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.REGULAR);
    public static final Block BIRCH_BARS    = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.REGULAR);
    public static final Block DARK_OAK_BARS = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.REGULAR);
    public static final Block JUNGLE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.REGULAR);
    public static final Block SPRUCE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.REGULAR);
    public static final Block OAK_BARS      = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.REGULAR);
    public static final Block MANGROVE_BARS = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.REGULAR);
    public static final Block CRIMSON_BARS  = new BarsBlock(NETHER_BARS_SETTINGS, BarsType.REGULAR, BarsType.NETHER);
    public static final Block WARPED_BARS   = new BarsBlock(NETHER_BARS_SETTINGS, BarsType.REGULAR, BarsType.NETHER);

    public static final Block CROSSED_IRON_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.CROSSED, BarsType.METAL);
    public static final Block CROSSED_GOLD_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.CROSSED, BarsType.METAL);
    public static final Block CROSSED_ACACIA_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.CROSSED);
    public static final Block CROSSED_BIRCH_BARS    = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.CROSSED);
    public static final Block CROSSED_DARK_OAK_BARS = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.CROSSED);
    public static final Block CROSSED_JUNGLE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.CROSSED);
    public static final Block CROSSED_SPRUCE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.CROSSED);
    public static final Block CROSSED_OAK_BARS      = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.CROSSED);
    public static final Block CROSSED_MANGROVE_BARS = new BarsBlock(WOODEN_BARS_SETTINGS, BarsType.CROSSED);
    public static final Block CROSSED_CRIMSON_BARS  = new BarsBlock(NETHER_BARS_SETTINGS, BarsType.CROSSED, BarsType.NETHER);
    public static final Block CROSSED_WARPED_BARS   = new BarsBlock(NETHER_BARS_SETTINGS, BarsType.CROSSED, BarsType.NETHER);


    public static final Block HORIZONTAL_IRON_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.METAL);
    public static final Block HORIZONTAL_GOLD_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.METAL);
    public static final Block HORIZONTAL_ACACIA_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL);
    public static final Block HORIZONTAL_BIRCH_BARS     = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL);
    public static final Block HORIZONTAL_DARK_OAK_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL);
    public static final Block HORIZONTAL_JUNGLE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL);
    public static final Block HORIZONTAL_OAK_BARS       = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL);
    public static final Block HORIZONTAL_SPRUCE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL);
    public static final Block HORIZONTAL_MANGROVE_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL);
    public static final Block HORIZONTAL_CRIMSON_BARS   = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.NETHER);
    public static final Block HORIZONTAL_WARPED_BARS    = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.NETHER);


    public static final Block HORIZONTAL_CROSSED_IRON_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL);
    public static final Block HORIZONTAL_CROSSED_GOLD_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL);
    public static final Block HORIZONTAL_CROSSED_ACACIA_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final Block HORIZONTAL_CROSSED_BIRCH_BARS     = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final Block HORIZONTAL_CROSSED_DARK_OAK_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final Block HORIZONTAL_CROSSED_JUNGLE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final Block HORIZONTAL_CROSSED_OAK_BARS       = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final Block HORIZONTAL_CROSSED_SPRUCE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final Block HORIZONTAL_CROSSED_MANGROVE_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final Block HORIZONTAL_CROSSED_CRIMSON_BARS   = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.NETHER);
    public static final Block HORIZONTAL_CROSSED_WARPED_BARS    = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.NETHER);

    public static final Block COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block EXPOSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.EXPOSED, METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block WEATHERED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.WEATHERED, METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block OXIDIZED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.OXIDIZED, METALLIC_BARS_SETTINGS, BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING);

    public static final Block CROSSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block CROSSED_EXPOSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.EXPOSED, METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block CROSSED_WEATHERED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.WEATHERED, METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block CROSSED_OXIDIZED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.OXIDIZED, METALLIC_BARS_SETTINGS, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);

    public static final Block HORIZONTAL_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block HORIZONTAL_EXPOSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.EXPOSED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block HORIZONTAL_WEATHERED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.WEATHERED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block HORIZONTAL_OXIDIZED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.OXIDIZED, HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING);

    public static final Block HORIZONTAL_CROSSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.EXPOSED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.WEATHERED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly(), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final Block HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.OXIDIZED, HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);

    public static final Block WAXED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, METALLIC_BARS_SETTINGS, BarsType.REGULAR, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_EXPOSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.EXPOSED, METALLIC_BARS_SETTINGS, BarsType.REGULAR, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_WEATHERED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.WEATHERED, METALLIC_BARS_SETTINGS, BarsType.REGULAR, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_OXIDIZED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.OXIDIZED, METALLIC_BARS_SETTINGS, BarsType.REGULAR, BarsType.METAL, BarsType.WAXED);

    public static final Block WAXED_CROSSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, METALLIC_BARS_SETTINGS, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_CROSSED_EXPOSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.EXPOSED, METALLIC_BARS_SETTINGS, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_CROSSED_WEATHERED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.WEATHERED, METALLIC_BARS_SETTINGS, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_CROSSED_OXIDIZED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.OXIDIZED, METALLIC_BARS_SETTINGS, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);

    public static final Block WAXED_HORIZONTAL_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_HORIZONTAL_EXPOSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.EXPOSED, HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_HORIZONTAL_WEATHERED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.WEATHERED, HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.OXIDIZED, HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED);

    public static final Block WAXED_HORIZONTAL_CROSSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.EXPOSED, HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.WEATHERED, HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final Block WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.OXIDIZED, HORIZONTAL_METALLIC_BARS_SETTINGS, BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
}