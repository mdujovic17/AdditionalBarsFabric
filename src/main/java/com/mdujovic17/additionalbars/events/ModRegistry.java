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

import com.mdujovic17.additionalbars.AdditionalBars;
import com.mdujovic17.additionalbars.init.ABContent;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

import java.util.*;

import static com.mdujovic17.additionalbars.AdditionalBars.MODID;

public class ModRegistry
{
//    public static final ItemGroup ADDITIONAL_BARS = FabricItemGroup.builder()
//            .icon(() -> new ItemStack(ABContent.GOLD_BARS))
//            .displayName(Text.translatable("itemGroup.additionalbars.additionalbars"))
//            .build();
//    public static final ItemGroup HORIZONTAL_ADDITIONAL_BARS = FabricItemGroup.builder()
//            .icon(() -> new ItemStack(ABContent.HORIZONTAL_GOLD_BARS))
//            .displayName(Text.translatable("itemGroup.additionalbars.horizontaladditionalbars"))
//            .build();

    public static final RegistryKey<ItemGroup> ADDITIONAL_BARS = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MODID, "additionalbars"));
    //public static final RegistryKey<ItemGroup> HORIZONTAL_ADDITIONAL_BARS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID, "horizontaladditionalbars"));

    public static void setup()
    {
        registerBlocks();
        //registerItems();
        registerItemGroups();
        registerOxidationStates();
        registerWaxableStates();
        addItemsToItemGroups();
    }

    public static void clientSetup()
    {
        //registerResourcePacks();
        registerRenderLayer();
    }

    private static void registerBlocks()
    {
        register(ABContent.GOLD_BARS,                "gold_bars",                true);
        register(ABContent.ACACIA_BARS,              "acacia_bars",              true);
        register(ABContent.BIRCH_BARS,               "birch_bars",               true);
        register(ABContent.DARK_OAK_BARS,            "dark_oak_bars",            true);
        register(ABContent.JUNGLE_BARS,              "jungle_bars",              true);
        register(ABContent.SPRUCE_BARS,              "spruce_bars",              true);
        register(ABContent.OAK_BARS,                 "oak_bars",                 true);
        register(ABContent.MANGROVE_BARS,            "mangrove_bars",            true);
        register(ABContent.CRIMSON_BARS,             "crimson_bars",             true);
        register(ABContent.WARPED_BARS,              "warped_bars",              true);

        register(ABContent.CROSSED_IRON_BARS,        "crossed_iron_bars",        true);
        register(ABContent.CROSSED_GOLD_BARS,        "crossed_gold_bars",        true);
        register(ABContent.CROSSED_ACACIA_BARS,      "crossed_acacia_bars",      true);
        register(ABContent.CROSSED_BIRCH_BARS,       "crossed_birch_bars",       true);
        register(ABContent.CROSSED_DARK_OAK_BARS,    "crossed_dark_oak_bars",    true);
        register(ABContent.CROSSED_JUNGLE_BARS,      "crossed_jungle_bars",      true);
        register(ABContent.CROSSED_SPRUCE_BARS,      "crossed_spruce_bars",      true);
        register(ABContent.CROSSED_OAK_BARS,         "crossed_oak_bars",         true);
        register(ABContent.CROSSED_MANGROVE_BARS,    "crossed_mangrove_bars",    true);
        register(ABContent.CROSSED_CRIMSON_BARS,     "crossed_crimson_bars",     true);
        register(ABContent.CROSSED_WARPED_BARS,      "crossed_warped_bars",      true);

        register(ABContent.HORIZONTAL_IRON_BARS,     "horizontal_iron_bars",     true);
        register(ABContent.HORIZONTAL_GOLD_BARS,     "horizontal_gold_bars",     true);
        register(ABContent.HORIZONTAL_ACACIA_BARS,   "horizontal_acacia_bars",   true);
        register(ABContent.HORIZONTAL_BIRCH_BARS,    "horizontal_birch_bars",    true);
        register(ABContent.HORIZONTAL_DARK_OAK_BARS, "horizontal_dark_oak_bars", true);
        register(ABContent.HORIZONTAL_JUNGLE_BARS,   "horizontal_jungle_bars",   true);
        register(ABContent.HORIZONTAL_SPRUCE_BARS,   "horizontal_spruce_bars",   true);
        register(ABContent.HORIZONTAL_OAK_BARS,      "horizontal_oak_bars",      true);
        register(ABContent.HORIZONTAL_MANGROVE_BARS, "horizontal_mangrove_bars", true);
        register(ABContent.HORIZONTAL_CRIMSON_BARS,  "horizontal_crimson_bars",  true);
        register(ABContent.HORIZONTAL_WARPED_BARS,   "horizontal_warped_bars",   true);

        register(ABContent.HORIZONTAL_CROSSED_IRON_BARS,         "horizontal_crossed_iron_bars",     true);
        register(ABContent.HORIZONTAL_CROSSED_GOLD_BARS,         "horizontal_crossed_gold_bars",     true);
        register(ABContent.HORIZONTAL_CROSSED_ACACIA_BARS,       "horizontal_crossed_acacia_bars",   true);
        register(ABContent.HORIZONTAL_CROSSED_BIRCH_BARS,        "horizontal_crossed_birch_bars",    true);
        register(ABContent.HORIZONTAL_CROSSED_DARK_OAK_BARS,     "horizontal_crossed_dark_oak_bars", true);
        register(ABContent.HORIZONTAL_CROSSED_JUNGLE_BARS,       "horizontal_crossed_jungle_bars",   true);
        register(ABContent.HORIZONTAL_CROSSED_SPRUCE_BARS,       "horizontal_crossed_spruce_bars",   true);
        register(ABContent.HORIZONTAL_CROSSED_OAK_BARS,          "horizontal_crossed_oak_bars",      true);
        register(ABContent.HORIZONTAL_CROSSED_MANGROVE_BARS,     "horizontal_crossed_mangrove_bars", true);
        register(ABContent.HORIZONTAL_CROSSED_CRIMSON_BARS,      "horizontal_crossed_crimson_bars",  true);
        register(ABContent.HORIZONTAL_CROSSED_WARPED_BARS,       "horizontal_crossed_warped_bars",   true);

        register(ABContent.COPPER_BARS,             "copper_bars",           true);
        register(ABContent.EXPOSED_COPPER_BARS,     "exposed_copper_bars",   true);
        register(ABContent.WEATHERED_COPPER_BARS,   "weathered_copper_bars", true);
        register(ABContent.OXIDIZED_COPPER_BARS,    "oxidized_copper_bars",  true);

        register(   ABContent.CROSSED_COPPER_BARS, "crossed_copper_bars",          true                                                               );
        register(   ABContent.CROSSED_EXPOSED_COPPER_BARS, "crossed_exposed_copper_bars",  true                                               );
        register(     ABContent.CROSSED_WEATHERED_COPPER_BARS, "crossed_weathered_copper_bars",true                                           );
        register(    ABContent.CROSSED_OXIDIZED_COPPER_BARS, "crossed_oxidized_copper_bars", true                                             );

        register(    ABContent.HORIZONTAL_COPPER_BARS, "horizontal_copper_bars",          true                                                         );
        register(   ABContent.HORIZONTAL_EXPOSED_COPPER_BARS, "horizontal_exposed_copper_bars",  true                                         );
        register(     ABContent.HORIZONTAL_WEATHERED_COPPER_BARS, "horizontal_weathered_copper_bars",true                                     );
        register(    ABContent.HORIZONTAL_OXIDIZED_COPPER_BARS, "horizontal_oxidized_copper_bars", true                                       );

        register(ABContent.HORIZONTAL_CROSSED_COPPER_BARS, "horizontal_crossed_copper_bars",          true                                         );
        register(   ABContent.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, "horizontal_crossed_exposed_copper_bars",  true                         );
        register(     ABContent.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, "horizontal_crossed_weathered_copper_bars",true                     );
        register(    ABContent.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, "horizontal_crossed_oxidized_copper_bars", true                       );

        register( ABContent.WAXED_COPPER_BARS, "waxed_copper_bars",           true                                                                   );
        register(   ABContent.WAXED_EXPOSED_COPPER_BARS, "waxed_exposed_copper_bars",   true                                                   );
        register(     ABContent.WAXED_WEATHERED_COPPER_BARS, "waxed_weathered_copper_bars", true                                               );
        register(    ABContent.WAXED_OXIDIZED_COPPER_BARS, "waxed_oxidized_copper_bars",  true                                                 );

        register(ABContent.WAXED_CROSSED_COPPER_BARS, "waxed_crossed_copper_bars",           true                                                   );
        register(  ABContent.WAXED_CROSSED_EXPOSED_COPPER_BARS, "waxed_crossed_exposed_copper_bars",   true                                   );
        register(    ABContent.WAXED_CROSSED_WEATHERED_COPPER_BARS, "waxed_crossed_weathered_copper_bars", true                               );
        register(   ABContent.WAXED_CROSSED_OXIDIZED_COPPER_BARS, "waxed_crossed_oxidized_copper_bars",  true                                 );

        register(  ABContent.WAXED_HORIZONTAL_COPPER_BARS, "waxed_horizontal_copper_bars",          true                                             );
        register(   ABContent.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS, "waxed_horizontal_exposed_copper_bars",  true                             );
        register(     ABContent.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS, "waxed_horizontal_weathered_copper_bars",true                         );
        register(    ABContent.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS, "waxed_horizontal_oxidized_copper_bars", true                           );

        register(  ABContent.WAXED_HORIZONTAL_CROSSED_COPPER_BARS, "waxed_horizontal_crossed_copper_bars",          true                             );
        register(   ABContent.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, "waxed_horizontal_crossed_exposed_copper_bars",  true             );
        register(     ABContent.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, "waxed_horizontal_crossed_weathered_copper_bars",true         );
        register(    ABContent.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, "waxed_horizontal_crossed_oxidized_copper_bars", true           );
    }
//    private static void registerItems()
//    {
//        //Registry.register(Registries.ITEM, new Identifier(AdditionalBars.MODID, "test_block"), new BlockItem(ABContent.TEST_BLOCK, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "gold_bars"), new BlockItem(ABContent.GOLD_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "acacia_bars"), new BlockItem(ABContent.ACACIA_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "birch_bars"), new BlockItem(ABContent.BIRCH_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "dark_oak_bars"), new BlockItem(ABContent.DARK_OAK_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "jungle_bars"), new BlockItem(ABContent.JUNGLE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "spruce_bars"), new BlockItem(ABContent.SPRUCE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "oak_bars"), new BlockItem(ABContent.OAK_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "mangrove_bars"), new BlockItem(ABContent.MANGROVE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crimson_bars"), new BlockItem(ABContent.CRIMSON_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "warped_bars"), new BlockItem(ABContent.WARPED_BARS, new Item.Settings()));
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_iron_bars"), new BlockItem(ABContent.CROSSED_IRON_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_gold_bars"), new BlockItem(ABContent.CROSSED_GOLD_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_acacia_bars"), new BlockItem(ABContent.CROSSED_ACACIA_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_birch_bars"), new BlockItem(ABContent.CROSSED_BIRCH_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_dark_oak_bars"), new BlockItem(ABContent.CROSSED_DARK_OAK_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_jungle_bars"), new BlockItem(ABContent.CROSSED_JUNGLE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_spruce_bars"), new BlockItem(ABContent.CROSSED_SPRUCE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_oak_bars"), new BlockItem(ABContent.CROSSED_OAK_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_mangrove_bars"), new BlockItem(ABContent.CROSSED_MANGROVE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_crimson_bars"), new BlockItem(ABContent.CROSSED_CRIMSON_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_warped_bars"), new BlockItem(ABContent.CROSSED_WARPED_BARS, new Item.Settings()));
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_iron_bars"), new BlockItem(ABContent.HORIZONTAL_IRON_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_gold_bars"), new BlockItem(ABContent.HORIZONTAL_GOLD_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_acacia_bars"), new BlockItem(ABContent.HORIZONTAL_ACACIA_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_birch_bars"), new BlockItem(ABContent.HORIZONTAL_BIRCH_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_dark_oak_bars"), new BlockItem(ABContent.HORIZONTAL_DARK_OAK_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_jungle_bars"), new BlockItem(ABContent.HORIZONTAL_JUNGLE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_spruce_bars"), new BlockItem(ABContent.HORIZONTAL_SPRUCE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_oak_bars"), new BlockItem(ABContent.HORIZONTAL_OAK_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_mangrove_bars"), new BlockItem(ABContent.HORIZONTAL_MANGROVE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crimson_bars"), new BlockItem(ABContent.HORIZONTAL_CRIMSON_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_warped_bars"), new BlockItem(ABContent.HORIZONTAL_WARPED_BARS, new Item.Settings()));
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_iron_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_IRON_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_gold_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_GOLD_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_acacia_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_ACACIA_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_birch_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_BIRCH_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_dark_oak_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_DARK_OAK_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_jungle_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_JUNGLE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_spruce_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_SPRUCE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_oak_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_OAK_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_mangrove_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_MANGROVE_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_crimson_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_CRIMSON_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_warped_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_WARPED_BARS, new Item.Settings()));
//
//        /*COPPER*/
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "copper_bars"), new BlockItem(ABContent.COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "exposed_copper_bars"), new BlockItem(ABContent.EXPOSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "weathered_copper_bars"), new BlockItem(ABContent.WEATHERED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "oxidized_copper_bars"), new BlockItem(ABContent.OXIDIZED_COPPER_BARS, new Item.Settings()));
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_copper_bars"), new BlockItem(ABContent.CROSSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_exposed_copper_bars"), new BlockItem(ABContent.CROSSED_EXPOSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_weathered_copper_bars"), new BlockItem(ABContent.CROSSED_WEATHERED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "crossed_oxidized_copper_bars"), new BlockItem(ABContent.CROSSED_OXIDIZED_COPPER_BARS, new Item.Settings()));
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_copper_bars"), new BlockItem(ABContent.HORIZONTAL_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_exposed_copper_bars"), new BlockItem(ABContent.HORIZONTAL_EXPOSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_weathered_copper_bars"), new BlockItem(ABContent.HORIZONTAL_WEATHERED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_oxidized_copper_bars"), new BlockItem(ABContent.HORIZONTAL_OXIDIZED_COPPER_BARS, new Item.Settings()));
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_copper_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_exposed_copper_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_weathered_copper_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "horizontal_crossed_oxidized_copper_bars"), new BlockItem(ABContent.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, new Item.Settings()));
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_copper_bars"), new BlockItem(ABContent.WAXED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_exposed_copper_bars"), new BlockItem(ABContent.WAXED_EXPOSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_weathered_copper_bars"), new BlockItem(ABContent.WAXED_WEATHERED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_oxidized_copper_bars"), new BlockItem(ABContent.WAXED_OXIDIZED_COPPER_BARS, new Item.Settings()));
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_crossed_copper_bars"), new BlockItem(ABContent.WAXED_CROSSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_crossed_exposed_copper_bars"), new BlockItem(ABContent.WAXED_CROSSED_EXPOSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_crossed_weathered_copper_bars"), new BlockItem(ABContent.WAXED_CROSSED_WEATHERED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_crossed_oxidized_copper_bars"), new BlockItem(ABContent.WAXED_CROSSED_OXIDIZED_COPPER_BARS, new Item.Settings()));
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_horizontal_copper_bars"), new BlockItem(ABContent.WAXED_HORIZONTAL_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_horizontal_exposed_copper_bars"), new BlockItem(ABContent.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_horizontal_weathered_copper_bars"), new BlockItem(ABContent.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_horizontal_oxidized_copper_bars"), new BlockItem(ABContent.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS, new Item.Settings()));
//
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_horizontal_crossed_copper_bars"), new BlockItem(ABContent.WAXED_HORIZONTAL_CROSSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_horizontal_crossed_exposed_copper_bars"), new BlockItem(ABContent.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_horizontal_crossed_weathered_copper_bars"), new BlockItem(ABContent.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, new Item.Settings()));
//        Registry.register(Registries.ITEM, new Identifier(MODID, "waxed_horizontal_crossed_oxidized_copper_bars"), new BlockItem(ABContent.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, new Item.Settings()));
//
//    }

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, ADDITIONAL_BARS, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ABContent.GOLD_BARS))
                .displayName(Text.translatable("itemGroup.additionalbars.additionalbars"))
                .build());
//        Registry.register(Registries.ITEM_GROUP, HORIZONTAL_ADDITIONAL_BARS, FabricItemGroup.builder()
//                .icon(() -> new ItemStack(ABContent.HORIZONTAL_GOLD_BARS))
//                .displayName(Text.translatable("itemGroup.additionalbars.horizontaladditionalbars"))
//                .build());
    }

    public static void registerOxidationStates() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.COPPER_BARS, ABContent.EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.EXPOSED_COPPER_BARS, ABContent.WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.WEATHERED_COPPER_BARS, ABContent.OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.CROSSED_COPPER_BARS, ABContent.CROSSED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.CROSSED_EXPOSED_COPPER_BARS, ABContent.CROSSED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.CROSSED_WEATHERED_COPPER_BARS, ABContent.CROSSED_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.HORIZONTAL_COPPER_BARS, ABContent.HORIZONTAL_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.HORIZONTAL_EXPOSED_COPPER_BARS, ABContent.HORIZONTAL_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.HORIZONTAL_WEATHERED_COPPER_BARS, ABContent.HORIZONTAL_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.HORIZONTAL_CROSSED_COPPER_BARS, ABContent.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, ABContent.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ABContent.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, ABContent.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);
    }

    public static void registerWaxableStates() {
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.COPPER_BARS, ABContent.WAXED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.EXPOSED_COPPER_BARS, ABContent.WAXED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.WEATHERED_COPPER_BARS, ABContent.WAXED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.OXIDIZED_COPPER_BARS, ABContent.WAXED_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.CROSSED_COPPER_BARS, ABContent.WAXED_CROSSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.CROSSED_EXPOSED_COPPER_BARS, ABContent.WAXED_CROSSED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.CROSSED_WEATHERED_COPPER_BARS, ABContent.WAXED_CROSSED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.CROSSED_OXIDIZED_COPPER_BARS, ABContent.WAXED_CROSSED_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.HORIZONTAL_COPPER_BARS, ABContent.WAXED_HORIZONTAL_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.HORIZONTAL_EXPOSED_COPPER_BARS, ABContent.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.HORIZONTAL_WEATHERED_COPPER_BARS, ABContent.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.HORIZONTAL_OXIDIZED_COPPER_BARS, ABContent.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.HORIZONTAL_CROSSED_COPPER_BARS, ABContent.WAXED_HORIZONTAL_CROSSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS, ABContent.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS, ABContent.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ABContent.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS, ABContent.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);
    }

    public static void addItemsToItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ADDITIONAL_BARS).register(content -> {
            content.add(ABContent.GOLD_BARS.asItem());
            content.add(ABContent.ACACIA_BARS.asItem());
            content.add(ABContent.BIRCH_BARS.asItem());
            content.add(ABContent.DARK_OAK_BARS.asItem());
            content.add(ABContent.JUNGLE_BARS.asItem());
            content.add(ABContent.SPRUCE_BARS.asItem());
            content.add(ABContent.OAK_BARS.asItem());
            content.add(ABContent.MANGROVE_BARS.asItem());
            content.add(ABContent.CRIMSON_BARS.asItem());
            content.add(ABContent.WARPED_BARS.asItem());

            content.add(ABContent.CROSSED_GOLD_BARS.asItem());
            content.add(ABContent.CROSSED_IRON_BARS.asItem());
            content.add(ABContent.CROSSED_ACACIA_BARS.asItem());
            content.add(ABContent.CROSSED_BIRCH_BARS.asItem());
            content.add(ABContent.CROSSED_DARK_OAK_BARS.asItem());
            content.add(ABContent.CROSSED_JUNGLE_BARS.asItem());
            content.add(ABContent.CROSSED_SPRUCE_BARS.asItem());
            content.add(ABContent.CROSSED_OAK_BARS.asItem());
            content.add(ABContent.CROSSED_MANGROVE_BARS.asItem());
            content.add(ABContent.CROSSED_CRIMSON_BARS.asItem());
            content.add(ABContent.CROSSED_WARPED_BARS.asItem());

            content.add(ABContent.COPPER_BARS.asItem());
            content.add(ABContent.EXPOSED_COPPER_BARS.asItem());
            content.add(ABContent.WEATHERED_COPPER_BARS.asItem());
            content.add(ABContent.OXIDIZED_COPPER_BARS.asItem());

            content.add(ABContent.CROSSED_COPPER_BARS.asItem());
            content.add(ABContent.CROSSED_EXPOSED_COPPER_BARS.asItem());
            content.add(ABContent.CROSSED_WEATHERED_COPPER_BARS.asItem());
            content.add(ABContent.CROSSED_OXIDIZED_COPPER_BARS.asItem());

            content.add(ABContent.WAXED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_EXPOSED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_WEATHERED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_OXIDIZED_COPPER_BARS.asItem());

            content.add(ABContent.WAXED_CROSSED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_CROSSED_EXPOSED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_CROSSED_WEATHERED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_CROSSED_OXIDIZED_COPPER_BARS.asItem());
        });

        ItemGroupEvents.modifyEntriesEvent(ADDITIONAL_BARS).register(content -> {
            content.add(ABContent.HORIZONTAL_GOLD_BARS.asItem());
            content.add(ABContent.HORIZONTAL_IRON_BARS.asItem());
            content.add(ABContent.HORIZONTAL_ACACIA_BARS.asItem());
            content.add(ABContent.HORIZONTAL_BIRCH_BARS.asItem());
            content.add(ABContent.HORIZONTAL_DARK_OAK_BARS.asItem());
            content.add(ABContent.HORIZONTAL_JUNGLE_BARS.asItem());
            content.add(ABContent.HORIZONTAL_SPRUCE_BARS.asItem());
            content.add(ABContent.HORIZONTAL_OAK_BARS.asItem());
            content.add(ABContent.HORIZONTAL_MANGROVE_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CRIMSON_BARS.asItem());
            content.add(ABContent.HORIZONTAL_WARPED_BARS.asItem());

            content.add(ABContent.HORIZONTAL_CROSSED_GOLD_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_IRON_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_ACACIA_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_BIRCH_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_DARK_OAK_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_JUNGLE_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_SPRUCE_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_OAK_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_MANGROVE_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_CRIMSON_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_WARPED_BARS.asItem());

            content.add(ABContent.HORIZONTAL_COPPER_BARS.asItem());
            content.add(ABContent.HORIZONTAL_EXPOSED_COPPER_BARS.asItem());
            content.add(ABContent.HORIZONTAL_WEATHERED_COPPER_BARS.asItem());
            content.add(ABContent.HORIZONTAL_OXIDIZED_COPPER_BARS.asItem());

            content.add(ABContent.HORIZONTAL_CROSSED_COPPER_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.asItem());
            content.add(ABContent.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.asItem());

            content.add(ABContent.WAXED_HORIZONTAL_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS.asItem());

            content.add(ABContent.WAXED_HORIZONTAL_CROSSED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.asItem());
            content.add(ABContent.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.asItem());
        });
    }

    public static void registerRenderLayer()
    {
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

//    private static void registerResourcePacks() {
//        Optional<ModContainer> CONTAINER = FabricLoader.getInstance().getModContainer(MODID);
//        assert CONTAINER.isPresent();
//        ResourceManagerHelper.registerBuiltinResourcePack(Identifier.of(MODID, "classic"), CONTAINER.get(), ResourcePackActivationType.NORMAL);
//    }

    private static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(MODID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
}
