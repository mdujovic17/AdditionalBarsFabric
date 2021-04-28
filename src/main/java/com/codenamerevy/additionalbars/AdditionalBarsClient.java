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

package com.codenamerevy.additionalbars;

import com.codenamerevy.additionalbars.events.ModRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.util.Identifier;

public class AdditionalBarsClient implements ClientModInitializer
{
    private static AdditionalBarsClient INSTANCE;
    @Override
    public void onInitializeClient()
    {
        INSTANCE = this;
        ModRegistry.clientSetup();
        FabricLoader.INSTANCE.getModContainer(AdditionalBars.MODID).ifPresent(container -> {
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("additionalbars:classic"), "resourcepacks/classic", container, false);
            //System.out.println("AB CLASSIC RESOURCE PACK LOADED");
        });
    }
}
