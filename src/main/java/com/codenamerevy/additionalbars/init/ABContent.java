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

import com.codenamerevy.additionalbars.content.block.BarsBlock;
import com.codenamerevy.additionalbars.content.block.HorizontalPaneBlock;
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
    public static final Block GOLD_BARS     = new BarsBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block ACACIA_BARS   = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_BARS    = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARK_OAK_BARS = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BARS   = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BARS   = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BARS      = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_BARS  = new BarsBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block WARPED_BARS   = new BarsBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block CROSSED_IRON_BARS     = new BarsBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block CROSSED_GOLD_BARS     = new BarsBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block CROSSED_ACACIA_BARS   = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CROSSED_BIRCH_BARS    = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CROSSED_DARK_OAK_BARS = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CROSSED_JUNGLE_BARS   = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CROSSED_SPRUCE_BARS   = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CROSSED_OAK_BARS      = new BarsBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CROSSED_CRIMSON_BARS  = new BarsBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block CROSSED_WARPED_BARS   = new BarsBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block HORIZONTAL_IRON_BARS      = new HorizontalPaneBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block HORIZONTAL_GOLD_BARS      = new HorizontalPaneBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block HORIZONTAL_ACACIA_BARS    = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_BIRCH_BARS     = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_DARK_OAK_BARS  = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_JUNGLE_BARS    = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_OAK_BARS       = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_SPRUCE_BARS    = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_CRIMSON_BARS   = new HorizontalPaneBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block HORIZONTAL_WARPED_BARS    = new HorizontalPaneBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block HORIZONTAL_CROSSED_IRON_BARS      = new HorizontalPaneBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block HORIZONTAL_CROSSED_GOLD_BARS      = new HorizontalPaneBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block HORIZONTAL_CROSSED_ACACIA_BARS    = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_CROSSED_BIRCH_BARS     = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_CROSSED_DARK_OAK_BARS  = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_CROSSED_JUNGLE_BARS    = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_CROSSED_OAK_BARS       = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_CROSSED_SPRUCE_BARS    = new HorizontalPaneBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HORIZONTAL_CROSSED_CRIMSON_BARS   = new HorizontalPaneBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block HORIZONTAL_CROSSED_WARPED_BARS    = new HorizontalPaneBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque().solidBlock(ABContent::never).blockVision(ABContent::never).suffocates(ABContent::never).requiresTool().breakByTool(FabricToolTags.AXES, 1).hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.NETHER_STEM));

    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos)
    {
        return false;
    }
}
