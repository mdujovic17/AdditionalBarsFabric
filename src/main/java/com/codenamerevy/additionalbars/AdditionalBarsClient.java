package com.codenamerevy.additionalbars;

import com.codenamerevy.additionalbars.events.ModRegistry;
import net.fabricmc.api.ClientModInitializer;

public class AdditionalBarsClient implements ClientModInitializer
{
    private static AdditionalBarsClient INSTANCE;
    @Override
    public void onInitializeClient()
    {
        INSTANCE = this;
        ModRegistry.clientSetup();
    }
}
