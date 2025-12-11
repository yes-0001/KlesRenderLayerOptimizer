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
        Item item = stack.getItem();
        if (isArmor(stack, item)) return GlintCategory.ARMOR;
        if (isWeapon(stack, item)) return GlintCategory.WEAPONS;
        if (stack.isEnchantable()) return GlintCategory.ITEMS;
		return GlintCategory.OTHER;
	}

	private boolean isArmor(ItemStack stack, Item item) {
        String id = item.toString().toLowerCase();
        boolean check = id.contains("armor")
            || id.contains("elytra")
            || id.contains("helmet")
            || id.contains("chestplate")
            || id.contains("leggings")
            || id.contains("boots")
            || id.contains("cap")
            || id.contains("tunic")
            || id.contains("pants");
        // System.out.println("// isArmor // - " + id + ", " + check);
        return check;
	}

	private boolean isWeapon(ItemStack stack, Item item) {
        String id = item.toString().toLowerCase();
        boolean check = id.contains("sword")
            || id.contains("trident")
            || id.contains("bow") // includes crossbow
            || id.contains("_axe") // axes only, no pickaxes
            || id.contains("shield")
            || id.contains("mace")
            || id.contains("spear");
        // System.out.println("// isWeapon // - " + id + ", " + check);
        return check;
	}
}