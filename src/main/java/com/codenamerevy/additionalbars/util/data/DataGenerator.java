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
                    case WOOD -> generateJSONModel(createBarsModelJSON(block.getPathName(), "classic", block.getTexturePath(), s), block.getPathName(), s);
                    case METAL -> generateJSONModel(createBarsModelJSON(block.getPathName(), "special", block.getTexturePath(), s), block.getPathName(), s);
                    case CROSSED_WOOD, CROSSED_METAL -> generateJSONModel(createBarsModelJSON(block.getPathName(), "crossed", block.getTexturePath(), s), block.getPathName(), s);
                }
            }
        }
    }

    private static BufferedWriter bw;
    private static final String[] bars = {"cap", "cap_alt", "post", "post_ends", "side", "side_alt"};
    public static String createBarsModelJSON(String ID, String type, String texture, String extension) {
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
