package com.west.rtwomod;


import com.west.rtwomod.fantasy.RTwoFantasy;
import com.west.rtwomod.log.RTwoLog;
import com.west.rtwomod.men.RTwoMen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;


public class RTwoClient  implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(RTwoMen.WHISPERLEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RTwoMen.EMBERLEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RTwoMen.MEN_WIZ_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(RTwoLog.DWARFOAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RTwoLog.MOONWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RTwoLog.SILVER_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RTwoFantasy.BLOODROOTS_LEAVES, RenderLayer.getCutout());

      

    }
}
