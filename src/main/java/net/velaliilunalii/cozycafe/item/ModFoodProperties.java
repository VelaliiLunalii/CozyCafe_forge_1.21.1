package net.velaliilunalii.cozycafe.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties POOR_DRINK = new FoodProperties.Builder().nutrition(3).
            saturationModifier(0.2f).build();
    public static final FoodProperties LOW_DRINK = new FoodProperties.Builder().nutrition(4).
            saturationModifier(0.3f).build();
    public static final FoodProperties NORMAL_DRINK = new FoodProperties.Builder().nutrition(5).
            saturationModifier(0.4f).build();
    public static final FoodProperties NORMAL_COMPLEX_DRINK = new FoodProperties.Builder().nutrition(6).
            saturationModifier(0.5f).build();
    public static final FoodProperties HIGH_COMPLEX_DRINK = new FoodProperties.Builder().nutrition(7).
            saturationModifier(0.6f).build();
    public static final FoodProperties GREAT_COMPLEX_DRINK = new FoodProperties.Builder().nutrition(8).
            saturationModifier(0.7f).build();
}
