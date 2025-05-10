package net.velaliilunalii.cozycafe.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class JuicePressItem extends Item {
    public JuicePressItem(Properties properties) {
        super(properties.stacksTo(1).durability(256));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        ItemStack newStack = stack.copy();
        newStack.setDamageValue(stack.getDamageValue() + 1);

        // Si l'item est cassé, renvoyer ItemStack.EMPTY
        if (newStack.getDamageValue() >= newStack.getMaxDamage()) {
            return ItemStack.EMPTY;
        }

        return newStack;
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        pTooltipComponents.add(Component.translatable("tooltip.cozycafe.juice_press"));
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
