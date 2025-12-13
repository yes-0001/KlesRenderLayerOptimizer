package com.github.yes0001.krlo;


import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name="krlo")
public class KrloConfig implements ConfigData {


    @ConfigEntry.Gui.Tooltip
    public boolean glintToggle = true;

    // @ConfigEntry.Gui.Tooltip
    // public boolean patternToggle = true;


    @ConfigEntry.Gui.CollapsibleObject(startExpanded = false)
    public final GlintCategoryToggles glint = new GlintCategoryToggles();


    // @ConfigEntry.Gui.CollapsibleObject(startExpanded = false)
    // public PatternCategoryToggles pattern = new PatternCategoryToggles();



    public boolean isGlintEnabledFor(GlintCategory category) {
        if (!glintToggle) return false;

        switch (category) {
            case ITEMS:   return glint.items;
            case WEAPONS: return glint.weapons;
            case ARMOR:   return glint.armor;
            case OTHER:   return glint.other;
            default:      return false;
        }
    }


    // public boolean isPatternEnabledFor(PatternCategory category) {
    //     if (!patternToggle) return false;

    //     switch (category) {
    //         case BANNERS: return pattern.banners;
    //         case SHIELDS: return pattern.shields;
    //         default:      return false;
    //     }
    // }



    public enum GlintCategory {
        ITEMS,
        WEAPONS,
        ARMOR,
        OTHER
    }

    public static class GlintCategoryToggles {
        @ConfigEntry.Gui.Tooltip
        public boolean items = true;

        @ConfigEntry.Gui.Tooltip
        public boolean weapons = true;

        @ConfigEntry.Gui.Tooltip
        public boolean armor = true;

        @ConfigEntry.Gui.Tooltip
        public boolean other = true;
    }



    // public enum PatternCategory {
    //     BANNERS,
    //     SHIELDS
    // }

    // public static class PatternCategoryToggles {
    //     @ConfigEntry.Gui.Tooltip
    //     public boolean banners = true;

    //     @ConfigEntry.Gui.Tooltip
    //     public boolean shields = true;
    // }
}