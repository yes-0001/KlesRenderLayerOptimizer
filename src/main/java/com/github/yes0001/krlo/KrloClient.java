package com.github.yes0001.krlo;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class KrloClient implements ClientModInitializer {

    FabricLoader loader = FabricLoader.getInstance();

    Boolean hasLegacyFabric = loader.isModLoaded("fabric");
    Boolean hasModernFabricAPI = loader.isModLoaded("fabric-api");
    Boolean hasLegacyClothConfig = loader.isModLoaded("cloth-config2");
    Boolean hasModernClothConfig = loader.isModLoaded("cloth-config");

    public static final String MOD_ID = "krlo";
    private static ConfigHolder<KrloConfig> CONFIG_HOLDER;

    @Override
    public void onInitializeClient() {
        ensureHolder();
        if (!hasLegacyFabric && !hasModernFabricAPI) {
            throw new IllegalStateException("no version of fabric-api found.");
        }
        if (!hasLegacyClothConfig && !hasModernClothConfig) {
            throw new IllegalStateException("no version of cloth-config found.");
        }
    }

    public static KrloConfig getConfig() {
        ensureHolder();
        return CONFIG_HOLDER.getConfig();
    }

    private static void ensureHolder() {
        if (CONFIG_HOLDER == null) {
            CONFIG_HOLDER = AutoConfig.register(KrloConfig.class, JanksonConfigSerializer::new);
        }
    }
}
