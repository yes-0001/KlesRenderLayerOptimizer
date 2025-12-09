package com.github.yes0001.krlo.mixin;

import com.github.yes0001.krlo.KrloClient;
import com.github.yes0001.krlo.KrloConfig;
import com.github.yes0001.krlo.KrloConfig.GlintCategory;

import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class GlintLayer {

	@Inject(method="hasGlint", at=@At("HEAD"), cancellable=true)
	private void disableGlint(CallbackInfoReturnable<Boolean> cir) {
        KrloConfig config = KrloClient.getConfig();
        if (config == null || !config.masterToggle) return;

        ItemStack stack = (ItemStack) (Object) this;
        GlintCategory category = resolveCategory(stack);

        if (!stack.hasEnchantments()) return;

        if (config.isEnabledFor(category)) {
            cir.setReturnValue(false);
        }
	}

	private GlintCategory resolveCategory(ItemStack stack) {
        try {
		    Item item = stack.getItem();
            if (isArmor(stack, item)) return GlintCategory.ARMOR;
            if (isWeapon(item)) return GlintCategory.WEAPONS;
            if (stack.isEnchantable()) return GlintCategory.ITEMS;
        } catch (Throwable ignored) {}

		return GlintCategory.OTHER;
	}

	private boolean isArmor(ItemStack stack, Item item) {

		if (item instanceof ArmorItem || stack.isOf(Items.ELYTRA)) return true;
        try {
            if (item == Items.WOLF_ARMOR) return true;
        } catch (Throwable ignored) {}
        
        
        String id = item.toString().toLowerCase();
        return id.contains("horse") && id.contains("armor");
	}

	private boolean isWeapon(Item item) {
        return item instanceof SwordItem
            || item instanceof TridentItem
            || item instanceof BowItem
            || item instanceof CrossbowItem
            || item instanceof RangedWeaponItem
            || item instanceof AxeItem
            || item instanceof ShieldItem
            || item.toString().toLowerCase().contains("mace");
	}
}