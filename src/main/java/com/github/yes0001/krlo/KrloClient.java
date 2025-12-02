package com.github.yes0001.krlo;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

public class KrloClient implements ClientModInitializer {

    public static final String MOD_ID = "krlo";
    private static ConfigHolder<KrloConfig> CONFIG_HOLDER;

    @Override
    public void onInitializeClient() {
        ensureHolder();
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
