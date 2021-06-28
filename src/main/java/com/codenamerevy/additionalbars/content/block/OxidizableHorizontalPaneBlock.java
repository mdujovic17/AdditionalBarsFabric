package com.codenamerevy.additionalbars.content.block;

public class OxidizableHorizontalPaneBlock extends HorizontalPaneBlock implements OxidizableBars {
    public OxidizableHorizontalPaneBlock(Settings settings) {
        super(settings);
    }

    @Override
    public OxidizationLevel getDegradationLevel() {
        return null;
    }
}
