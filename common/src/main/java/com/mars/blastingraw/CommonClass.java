package com.mars.blastingraw;

import com.mars.deimos.config.DeimosConfig;
import com.mars.deimos.datagen.DeimosRecipeGenerator;
import net.minecraft.resources.Identifier;

import static com.mars.blastingraw.Constants.MOD_ID;

public class CommonClass {
    public static void init() {
        DeimosConfig.init(MOD_ID, BlastingRawConfig.class);

        for(String rawMetal : BlastingRawConfig.raw_metal_list){
            String[] rawMetalSet =  ((rawMetal).replaceAll("\\s","")).split(",");
            DeimosRecipeGenerator.createBlastingJson(Identifier.parse(rawMetalSet[0]), Identifier.parse(rawMetalSet[1]), BlastingRawConfig.cooking_time, Float.parseFloat(rawMetalSet[2]));
            if(BlastingRawConfig.works_in_furnace)
                DeimosRecipeGenerator.createSmeltingJson(Identifier.parse(rawMetalSet[0]), Identifier.parse(rawMetalSet[1]), BlastingRawConfig.cooking_time * 2, Float.parseFloat(rawMetalSet[2]));
        }
    }
}
