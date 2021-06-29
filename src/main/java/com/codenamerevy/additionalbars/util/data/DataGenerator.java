package com.codenamerevy.additionalbars.util.data;

import com.codenamerevy.additionalbars.content.block.BarsBlock;
import com.codenamerevy.additionalbars.events.ModRegistry;
import net.fabricmc.fabric.impl.registry.sync.FabricRegistryInit;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataGenerator {

    public static void init() {
        for (BarsBlock block : ModRegistry.bars) {
            for (String s : bars) {
                switch (block.getType()) {
                    case WOOD -> {
                        generateJSONModel(createBarsModelJSON("classic", block.getTexturePath(), s), block.getPathName(), s);
                        generateJSONItemModel(createBarsItemModelJSON("classic", block.getTexturePath()), block.getPathName());
                    }
                    case METAL -> {
                        generateJSONModel(createBarsModelJSON("special", block.getTexturePath(), s), block.getPathName(), s);
                        generateJSONItemModel(createBarsItemModelJSON("special", block.getTexturePath()), block.getPathName());
                    }
                    case CROSSED_WOOD, CROSSED_METAL -> {
                        generateJSONModel(createBarsModelJSON("crossed", block.getTexturePath(), s), block.getPathName(), s);
                        generateJSONItemModel(createBarsItemModelJSON("special", block.getTexturePath()), block.getPathName());
                    }
                }
                generateJSONBlockState(createBarsBlockStateJSON(block.getPathName()), block.getPathName());
            }
        }
    }

    private static BufferedWriter bw;
    private static final String[] bars = {"cap", "cap_alt", "post", "post_ends", "side", "side_alt"};
    public static String createBarsModelJSON(String type, String texture, String extension) {
        String barsType = "";
        switch (type) {
            case "classic":
                barsType = "";
                break;
            case "crossed":
                barsType = "crossed/";
                break;
            case "special":
                barsType = "special/";
                break;
            default:
                break;
        }
        return String.format("""
                        {
                        \t"parent": "additionalbars:block/parent/td/%s%s",
                        \t"textures": {
                        \t\t"texture": "%s"
                        \t}
                        }""",
        barsType, extension, texture);
    }
    public static String createBarsItemModelJSON(String type, String texture) {
        String barsType = "";
        switch (type) {
            case "classic":
                barsType = "";
                break;
            case "crossed":
                barsType = "crossed";
                break;
            case "special":
                barsType = "special";
                break;
            default:
                break;
        }
        return String.format("""
                        {
                        \t"parent": "additionalbars:item/parent/%s_bars_inventory",
                        \t"textures": {
                        \t\t"texture": "%s"
                        \t}
                        }""",
                barsType, texture);
    }
    public static String createBarsBlockStateJSON(String bars) {
        return String.format("""
                {
                  "multipart": [
                    {   "apply": { "model": "additionalbars:block/%s_post_ends" }},
                    {   "when": { "north": false, "east": false, "south": false, "west": false },
                      "apply": { "model": "additionalbars:block/%s_post" }
                    },
                    {   "when": { "north": true, "east": false, "south": false, "west": false },
                      "apply": { "model": "additionalbars:block/%s_cap" }
                    },
                    {   "when": { "north": false, "east": true, "south": false, "west": false },
                      "apply": { "model": "additionalbars:block/%s_cap", "y": 90 }
                    },
                    {   "when": { "north": false, "east": false, "south": true, "west": false },
                      "apply": { "model": "additionalbars:block/%s_cap_alt" }
                    },
                    {   "when": { "north": false, "east": false, "south": false, "west": true },
                      "apply": { "model": "additionalbars:block/%s_cap_alt", "y": 90 }
                    },
                    {   "when": { "north": true },
                      "apply": { "model": "additionalbars:block/%s_side" }
                    },
                    {   "when": { "east": true },
                      "apply": { "model": "additionalbars:block/%s_side", "y": 90 }
                    },
                    {   "when": { "south": true },
                      "apply": { "model": "additionalbars:block/%s_side_alt" }
                    },
                    {   "when": { "west": true },
                      "apply": { "model": "additionalbars:block/%s_side_alt", "y": 90 }
                    }
                  ]
                }
                """, bars, bars, bars, bars, bars, bars, bars, bars, bars, bars);
    }
    public static void generateJSONModel(String content, String id, String extension) {
        File file = new File("..//data//generated//models//block//");
        if (file.mkdir() || file.exists()) {
            try {
                bw = new BufferedWriter(new FileWriter(file + "//" + id + "_" + extension + ".json"));
                bw.write(content);
                System.out.println("Generated block model" + file.getCanonicalPath() + "//" + id + "_" + extension + ".json");
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void generateJSONItemModel(String content, String id) {
        File file = new File("..//data//generated//models//item//");
        if (file.mkdir() || file.exists()) {
            try {
                bw = new BufferedWriter(new FileWriter(file + "//" + id + ".json"));
                bw.write(content);
                System.out.println("Generated item model" + file.getCanonicalPath() + "//" + id + ".json");
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void generateJSONBlockState(String content, String id) {
        File file = new File("..//data//generated//blockstates//");
        if (file.mkdir() || file.exists()) {
            try {
                bw = new BufferedWriter(new FileWriter(file + "//" + id + ".json"));
                bw.write(content);
                System.out.println("Generated BlockState" + file.getCanonicalPath() + "//" + id + ".json");
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
