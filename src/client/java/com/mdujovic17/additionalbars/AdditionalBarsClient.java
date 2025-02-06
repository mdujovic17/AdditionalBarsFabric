package com.mdujovic17.additionalbars;

import com.mdujovic17.additionalbars.events.ModRegistry;
import net.fabricmc.api.ClientModInitializer;

public class AdditionalBarsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModRegistry.clientSetup();
    }
}
