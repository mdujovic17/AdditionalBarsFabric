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

package com.mdujovic17.additionalbars.content.block;

import net.minecraft.block.PaneBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BarsBlock extends PaneBlock {

    protected ArrayList<BlockTypes> barsTypes = new ArrayList<>();

    public BarsBlock(Settings settings) {
        super(settings);
    }

    public BarsBlock(Settings settings, BlockTypes... types) {
        super(settings);
        barsTypes.addAll(Arrays.stream(types).toList());
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext options, List<Text> tooltip, TooltipType type) {
        for ( BlockTypes types : barsTypes) {
            tooltip.add(Text.translatable(types.getText().getString()).formatted(types.getTextColor()));
        }
    }
}
