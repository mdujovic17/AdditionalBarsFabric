package com.mdujovic17.additionalbars.content.block;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public enum BarsType implements BlockTypes {
    REGULAR("regular", Formatting.GRAY), CROSSED("crossed", Formatting.GREEN), HORIZONTAL("horizontal", Formatting.GREEN),
    WOOD("wood", Formatting.GOLD), METAL("metal", Formatting.GOLD), CRYSTAL("crystal", Formatting.GOLD), BRICK("brick", Formatting.GOLD),
    OXIDIZING("oxidizing", Formatting.AQUA),
    WAXED("waxed", Formatting.AQUA),
    NETHER("nether", Formatting.DARK_RED);

    private final String type;
    private final Formatting color;
    private final Text text;
    BarsType(String type, Formatting color) {
        this.type = type;
        this.text = Text.translatable("tooltip.mdujovic17." + type);
        this.color = color;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Text getText() {
        return text;
    }

    @Override
    public Formatting getTextColor() {
        return color;
    }
}
