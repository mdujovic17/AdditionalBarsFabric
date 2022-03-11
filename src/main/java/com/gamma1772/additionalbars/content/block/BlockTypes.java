package com.gamma1772.additionalbars.content.block;

import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

public interface BlockTypes {
    String getType();
    TranslatableText getTranslatableText();
    Formatting getTextColor();
}
