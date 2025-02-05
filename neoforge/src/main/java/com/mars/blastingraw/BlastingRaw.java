package com.mars.blastingraw;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class BlastingRaw {
    public BlastingRaw(IEventBus eventBus) {
        CommonClass.init();
    }
}
