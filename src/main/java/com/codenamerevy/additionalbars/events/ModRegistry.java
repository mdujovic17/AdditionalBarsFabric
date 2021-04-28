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

package com.codenamerevy.additionalbars.events;

import com.codenamerevy.additionalbars.AdditionalBars;
import com.codenamerevy.additionalbars.init.ABContent;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRegistry
{
    public static void setup()
    {
        registerBlocks();
        registerItems();
    }

    public static void clientSetup()
    {
        registerRenderLayer();
    }

    private static void registerBlocks()
    {
        //Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "test_block"),     ABContent.TEST_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "gold_bars"),     ABContent.GOLD_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "acacia_bars"),   ABContent.ACACIA_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "birch_bars"),    ABContent.BIRCH_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "dark_oak_bars"), ABContent.DARK_OAK_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "jungle_bars"),   ABContent.JUNGLE_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "spruce_bars"),   ABContent.SPRUCE_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "oak_bars"),      ABContent.OAK_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crimson_bars"),  ABContent.CRIMSON_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "warped_bars"),   ABContent.WARPED_BARS);

        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crossed_iron_bars"),     ABContent.CROSSED_IRON_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crossed_gold_bars"),     ABContent.CROSSED_GOLD_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crossed_acacia_bars"),   ABContent.CROSSED_ACACIA_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crossed_birch_bars"),    ABContent.CROSSED_BIRCH_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crossed_dark_oak_bars"), ABContent.CROSSED_DARK_OAK_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crossed_jungle_bars"),   ABContent.CROSSED_JUNGLE_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crossed_spruce_bars"),   ABContent.CROSSED_SPRUCE_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crossed_oak_bars"),      ABContent.CROSSED_OAK_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crossed_crimson_bars"),  ABContent.CROSSED_CRIMSON_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "crossed_warped_bars"),   ABContent.CROSSED_WARPED_BARS);

        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_iron_bars"),     ABContent.HORIZONTAL_IRON_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_gold_bars"),     ABContent.HORIZONTAL_GOLD_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_acacia_bars"),   ABContent.HORIZONTAL_ACACIA_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_birch_bars"),    ABContent.HORIZONTAL_BIRCH_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_dark_oak_bars"), ABContent.HORIZONTAL_DARK_OAK_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_jungle_bars"),   ABContent.HORIZONTAL_JUNGLE_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_spruce_bars"),   ABContent.HORIZONTAL_SPRUCE_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_oak_bars"),      ABContent.HORIZONTAL_OAK_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crimson_bars"),  ABContent.HORIZONTAL_CRIMSON_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_warped_bars"),   ABContent.HORIZONTAL_WARPED_BARS);

        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crossed_iron_bars"),     ABContent.HORIZONTAL_CROSSED_IRON_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crossed_gold_bars"),     ABContent.HORIZONTAL_CROSSED_GOLD_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crossed_acacia_bars"),   ABContent.HORIZONTAL_CROSSED_ACACIA_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crossed_birch_bars"),    ABContent.HORIZONTAL_CROSSED_BIRCH_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crossed_dark_oak_bars"), ABContent.HORIZONTAL_CROSSED_DARK_OAK_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crossed_jungle_bars"),   ABContent.HORIZONTAL_CROSSED_JUNGLE_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crossed_spruce_bars"),   ABContent.HORIZONTAL_CROSSED_SPRUCE_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crossed_oak_bars"),      ABContent.HORIZONTAL_CROSSED_OAK_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crossed_crimson_bars"),  ABContent.HORIZONTAL_CROSSED_CRIMSON_BARS);
        Registry.register(Registry.BLOCK, new Identifier(AdditionalBars.MODID, "horizontal_crossed_warped_bars"),   ABContent.HORIZONTAL_CROSSED_WARPED_BARS);
    }
    private static void registerItems()
    {
        //Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "test_block"), new BlockItem(ABContent.TEST_BLOCK, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "gold_bars"), new BlockItem(ABContent.GOLD_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "acacia_bars"), new BlockItem(ABContent.ACACIA_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "birch_bars"), new BlockItem(ABContent.BIRCH_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "dark_oak_bars"), new BlockItem(ABContent.DARK_OAK_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "jungle_bars"), new BlockItem(ABContent.JUNGLE_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "spruce_bars"), new BlockItem(ABContent.SPRUCE_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "oak_bars"), new BlockItem(ABContent.OAK_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crimson_bars"), new BlockItem(ABContent.CRIMSON_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "warped_bars"), new BlockItem(ABContent.WARPED_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));

        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crossed_iron_bars"), new BlockItem(ABContent.CROSSED_IRON_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crossed_gold_bars"), new BlockItem(ABContent.CROSSED_GOLD_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crossed_acacia_bars"), new BlockItem(ABContent.CROSSED_ACACIA_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crossed_birch_bars"), new BlockItem(ABContent.CROSSED_BIRCH_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crossed_dark_oak_bars"), new BlockItem(ABContent.CROSSED_DARK_OAK_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crossed_jungle_bars"), new BlockItem(ABContent.CROSSED_JUNGLE_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crossed_spruce_bars"), new BlockItem(ABContent.CROSSED_SPRUCE_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crossed_oak_bars"), new BlockItem(ABContent.CROSSED_OAK_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crossed_crimson_bars"), new BlockItem(ABContent.CROSSED_CRIMSON_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "crossed_warped_bars"), new BlockItem(ABContent.CROSSED_WARPED_BARS, new Item.Settings().group(AdditionalBars.ADDITIONAL_BARS)));

        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_iron_bars"), new BlockItem(ABContent.HORIZONTAL_IRON_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_gold_bars"), new BlockItem(ABContent.HORIZONTAL_GOLD_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_acacia_bars"), new BlockItem(ABContent.HORIZONTAL_ACACIA_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_birch_bars"), new BlockItem(ABContent.HORIZONTAL_BIRCH_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_dark_oak_bars"), new BlockItem(ABContent.HORIZONTAL_DARK_OAK_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_jungle_bars"), new BlockItem(ABContent.HORIZONTAL_JUNGLE_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_spruce_bars"), new BlockItem(ABContent.HORIZONTAL_SPRUCE_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_oak_bars"), new BlockItem(ABContent.HORIZONTAL_OAK_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crimson_bars"), new BlockItem(ABContent.HORIZONTAL_CRIMSON_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_warped_bars"), new BlockItem(ABContent.HORIZONTAL_WARPED_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));

        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crossed_iron_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_IRON_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crossed_gold_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_GOLD_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crossed_acacia_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_ACACIA_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crossed_birch_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_BIRCH_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crossed_dark_oak_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_DARK_OAK_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crossed_jungle_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_JUNGLE_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crossed_spruce_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_SPRUCE_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crossed_oak_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_OAK_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crossed_crimson_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_CRIMSON_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
        Registry.register(Registry.ITEM, new Identifier(AdditionalBars.MODID, "horizontal_crossed_warped_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_WARPED_BARS, new Item.Settings().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    }
    public static void registerRenderLayer()
    {
        //BlockRenderLayerMap.INSTANCE.putBlock(ABContent.TEST_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.GOLD_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.ACACIA_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.BIRCH_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.DARK_OAK_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.JUNGLE_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.SPRUCE_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.OAK_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CRIMSON_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.WARPED_BARS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_IRON_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_GOLD_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_ACACIA_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_BIRCH_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_DARK_OAK_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_JUNGLE_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_SPRUCE_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_OAK_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_CRIMSON_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.CROSSED_WARPED_BARS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_IRON_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_GOLD_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_ACACIA_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_BIRCH_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_DARK_OAK_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_JUNGLE_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_SPRUCE_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_OAK_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CRIMSON_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_WARPED_BARS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_IRON_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_GOLD_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_ACACIA_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_BIRCH_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_DARK_OAK_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_JUNGLE_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_SPRUCE_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_OAK_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_CRIMSON_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ABContent.HORIZONTAL_CROSSED_WARPED_BARS, RenderLayer.getCutout());
    }
}
