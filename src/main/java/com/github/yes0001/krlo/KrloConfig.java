package com.github.yes0001.krlo;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name="krlo")
public class KrloConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip
    public boolean masterToggle = true;

    @ConfigEntry.Gui.TransitiveObject
    public final CategoryToggles categories = new CategoryToggles();

    public boolean isEnabledFor(GlintCategory category) {
        if (!masterToggle) {
            return false;
        }
        return switch (category) {
            case ITEMS -> categories.items;
            case WEAPONS -> categories.weapons;
            case ARMOR -> categories.armor;
            case OTHER -> categories.other;
        };
    }

    public enum GlintCategory {
        ITEMS,
        WEAPONS,
        ARMOR,
        OTHER
    }

    public static class CategoryToggles {
        @ConfigEntry.Gui.Tooltip
        public boolean items = true;

        @ConfigEntry.Gui.Tooltip
        public boolean weapons = true;

        @ConfigEntry.Gui.Tooltip
        public boolean armor = true;

        @ConfigEntry.Gui.Tooltip
        public boolean other = true;
    }
}
