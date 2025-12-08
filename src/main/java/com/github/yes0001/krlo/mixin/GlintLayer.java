package com.github.yes0001.krlo.mixin;

import com.github.yes0001.krlo.KrloClient;
import com.github.yes0001.krlo.KrloConfig;
import com.github.yes0001.krlo.KrloConfig.GlintCategory;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.RangedWeaponItem;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TridentItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class GlintLayer {

	@Inject(method="hasGlint", at=@At("HEAD"), cancellable=true)
	private void disableGlint(CallbackInfoReturnable<Boolean> cir) {
		KrloConfig config = KrloClient.getConfig();
		if (!config.masterToggle) {
			return;
		}

		ItemStack stack = (ItemStack) (Object) this;
		if (!stack.hasEnchantments()) {
			return;
		}

		GlintCategory category = resolveCategory(stack);
		if (config.isEnabledFor(category)) {
			cir.setReturnValue(false);
		}
	}

	private GlintCategory resolveCategory(ItemStack stack) {
		Item item = stack.getItem();
		if (isArmor(stack, item)) {
			return GlintCategory.ARMOR;
		}
		if (isWeapon(item)) {
			return GlintCategory.WEAPONS;
		}
		if (stack.isEnchantable()) {
			return GlintCategory.ITEMS;
		}
		return GlintCategory.OTHER;
	}

	private boolean isArmor(ItemStack stack, Item item) {
		return item instanceof ArmorItem
			|| item instanceof HorseArmorItem
			|| stack.isOf(Items.ELYTRA);
	}

	private boolean isWeapon(Item item) {
		return item instanceof SwordItem
			|| item instanceof TridentItem
			|| item instanceof BowItem
			|| item instanceof CrossbowItem
			|| item instanceof RangedWeaponItem
			|| item instanceof AxeItem
			|| item instanceof ShieldItem;
	}

}
