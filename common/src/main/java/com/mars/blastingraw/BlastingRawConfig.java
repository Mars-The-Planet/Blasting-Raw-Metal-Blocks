package com.mars.blastingraw;

import com.google.common.collect.Lists;
import com.mars.deimos.config.DeimosConfig;

import java.util.List;

public class BlastingRawConfig extends DeimosConfig {
    @Entry public static boolean show_wishful_recipes_message = true;
    @Entry public static int cooking_time = 100;
    @Entry public static List<String> raw_metal_list = Lists.newArrayList(
            "minecraft:raw_copper_block, minecraft:copper_block, 6.3",
            "minecraft:raw_iron_block, minecraft:iron_block, 6.3",
            "minecraft:raw_gold_block, minecraft:gold_block, 9"
    );
    @Entry public static boolean works_in_furnace = false;
}
