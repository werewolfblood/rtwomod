package com.west.rtwomod;

import com.west.rtwomod.log.dwarf_log.RTwoDwarf_log;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;


public class RTwoClient  implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(RTwoDwarf_log.BEAM, RenderLayer.getCutout());




    }
}
