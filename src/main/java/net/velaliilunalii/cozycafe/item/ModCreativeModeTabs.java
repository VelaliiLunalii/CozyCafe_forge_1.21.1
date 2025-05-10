package net.velaliilunalii.cozycafe.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.velaliilunalii.cozycafe.CozyCafe;
import net.velaliilunalii.cozycafe.block.ModBlocks;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CozyCafe.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COZY_CAFE_TAB = CREATIVE_MODE_TABS.register("cozy_cafe_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PURPLE_UMBRELLA_COCONUT_COCKTAIL.get()))
                    .title(Component.translatable("creativetab.cozycafe.cozy_cafe_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COCKTAIL_GLASS.get());
                        output.accept(ModItems.GLASS_CUP.get());
                        output.accept(ModItems.EMPTY_GLASS.get());
                        output.accept(ModItems.TEA_LEAVES.get());
                        output.accept(ModItems.MATCHA_POWDER.get());
                        output.accept(ModItems.GUAVA_FRUIT.get());
                        output.accept(ModItems.COCONUT.get());
                        output.accept(ModItems.OPEN_COCONUT.get());
                        output.accept(ModItems.PALM_FIBER.get());
                        output.accept(ModItems.CRUSHED_EMBER_BLOOM.get());
                        output.accept(ModItems.JUICE_PRESS.get());
                        output.accept(ModItems.WOODEN_SHAKER.get());
                        output.accept(ModItems.IRON_SHAKER.get());
                        output.accept(ModItems.GOLDEN_SHAKER.get());
                        output.accept(ModItems.DIAMOND_SHAKER.get());
                        output.accept(ModItems.NETHERITE_SHAKER.get());
                        output.accept(ModItems.BROWN_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.BLACK_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.GRAY_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.LIGHT_GRAY_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.WHITE_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.LIME_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.GREEN_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.CYAN_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.LIGHT_BLUE_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.BLUE_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.PURPLE_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.MAGENTA_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.PINK_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.RED_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.ORANGE_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.YELLOW_COCKTAIL_UMBRELLA.get());
                        output.accept(ModItems.BROWN_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.BLACK_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.GRAY_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.LIGHT_GRAY_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.WHITE_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.LIME_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.GREEN_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.CYAN_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.LIGHT_BLUE_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.BLUE_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.PURPLE_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.MAGENTA_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.PINK_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.RED_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.ORANGE_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.YELLOW_UMBRELLA_COCKTAIL_GLASS.get());
                        output.accept(ModItems.GUAVA_JUICE.get());
                        output.accept(ModItems.APPLE_JUICE.get());
                        output.accept(ModItems.GLOW_BERRY_JUICE.get());
                        output.accept(ModItems.SWEET_BERRY_JUICE.get());
                        output.accept(ModItems.CARROT_JUICE.get());
                        output.accept(ModItems.CHORUS_JUICE.get());
                        output.accept(ModItems.MELON_JUICE.get());
                        output.accept(ModItems.COCONUT_MILK.get());
                        output.accept(ModItems.CARBONATED_WATER.get());
                        output.accept(ModItems.PUMPKIN_JUICE.get());

                        output.accept(ModItems.PURPLE_UMBRELLA_COCONUT_COCKTAIL.get());

                        output.accept(ModItems.TEA_SHAKERS.get(0).get());
                        output.accept(ModItems.TEA_SHAKERS.get(1).get());
                        output.accept(ModItems.TEA_SHAKERS.get(2).get());
                        output.accept(ModItems.TEA_SHAKERS.get(3).get());
                        output.accept(ModItems.TEA_SHAKERS.get(4).get());
                        output.accept(ModItems.TEA_GLASSES.getFirst().get());
                        output.accept(ModItems.TEA_GLASSES.getLast().get());

                        output.accept(ModItems.PUMPKIN_SPICE_LATTE_SHAKERS.get(0).get());
                        output.accept(ModItems.PUMPKIN_SPICE_LATTE_SHAKERS.get(1).get());
                        output.accept(ModItems.PUMPKIN_SPICE_LATTE_SHAKERS.get(2).get());
                        output.accept(ModItems.PUMPKIN_SPICE_LATTE_SHAKERS.get(3).get());
                        output.accept(ModItems.PUMPKIN_SPICE_LATTE_SHAKERS.get(4).get());
                        output.accept(ModItems.PUMPKIN_SPICE_LATTE_GLASSES.getFirst().get());
                        output.accept(ModItems.PUMPKIN_SPICE_LATTE_GLASSES.getLast().get());

                        output.accept(ModItems.CHOCOLATE_SHAKERS.get(0).get());
                        output.accept(ModItems.CHOCOLATE_SHAKERS.get(1).get());
                        output.accept(ModItems.CHOCOLATE_SHAKERS.get(2).get());
                        output.accept(ModItems.CHOCOLATE_SHAKERS.get(3).get());
                        output.accept(ModItems.CHOCOLATE_SHAKERS.get(4).get());
                        output.accept(ModItems.CHOCOLATE_GLASSES.getFirst().get());
                        output.accept(ModItems.CHOCOLATE_GLASSES.getLast().get());

                        output.accept(ModItems.MATCHA_TEA_LATTE_SHAKERS.get(0).get());
                        output.accept(ModItems.MATCHA_TEA_LATTE_SHAKERS.get(1).get());
                        output.accept(ModItems.MATCHA_TEA_LATTE_SHAKERS.get(2).get());
                        output.accept(ModItems.MATCHA_TEA_LATTE_SHAKERS.get(3).get());
                        output.accept(ModItems.MATCHA_TEA_LATTE_SHAKERS.get(4).get());
                        output.accept(ModItems.MATCHA_TEA_LATTE_GLASSES.getFirst().get());
                        output.accept(ModItems.MATCHA_TEA_LATTE_GLASSES.getLast().get());

                        output.accept(ModItems.WATERMELON_ROSE_SHAKERS.get(0).get());
                        output.accept(ModItems.WATERMELON_ROSE_SHAKERS.get(1).get());
                        output.accept(ModItems.WATERMELON_ROSE_SHAKERS.get(2).get());
                        output.accept(ModItems.WATERMELON_ROSE_SHAKERS.get(3).get());
                        output.accept(ModItems.WATERMELON_ROSE_SHAKERS.get(4).get());
                        output.accept(ModItems.WATERMELON_ROSE_GLASSES.getFirst().get());

                        output.accept(ModItems.IL_SIRACUSANO_SHAKERS.get(0).get());
                        output.accept(ModItems.IL_SIRACUSANO_SHAKERS.get(1).get());
                        output.accept(ModItems.IL_SIRACUSANO_SHAKERS.get(2).get());
                        output.accept(ModItems.IL_SIRACUSANO_SHAKERS.get(3).get());
                        output.accept(ModItems.IL_SIRACUSANO_SHAKERS.get(4).get());
                        output.accept(ModItems.IL_SIRACUSANO_GLASSES.getFirst().get());

                        output.accept(ModItems.GUAYABA_COLADA_SHAKERS.get(0).get());
                        output.accept(ModItems.GUAYABA_COLADA_SHAKERS.get(1).get());
                        output.accept(ModItems.GUAYABA_COLADA_SHAKERS.get(2).get());
                        output.accept(ModItems.GUAYABA_COLADA_SHAKERS.get(3).get());
                        output.accept(ModItems.GUAYABA_COLADA_SHAKERS.get(4).get());
                        output.accept(ModItems.GUAYABA_COLADA_GLASSES.getFirst().get());

                        output.accept(ModItems.GENDER_FLUID_SHAKERS.get(0).get());
                        output.accept(ModItems.GENDER_FLUID_SHAKERS.get(1).get());
                        output.accept(ModItems.GENDER_FLUID_SHAKERS.get(2).get());
                        output.accept(ModItems.GENDER_FLUID_SHAKERS.get(3).get());
                        output.accept(ModItems.GENDER_FLUID_SHAKERS.get(4).get());
                        output.accept(ModItems.GENDER_FLUID_GLASSES.getFirst().get());

                        output.accept(ModItems.BERRYLICIOUS_SHAKERS.get(0).get());
                        output.accept(ModItems.BERRYLICIOUS_SHAKERS.get(1).get());
                        output.accept(ModItems.BERRYLICIOUS_SHAKERS.get(2).get());
                        output.accept(ModItems.BERRYLICIOUS_SHAKERS.get(3).get());
                        output.accept(ModItems.BERRYLICIOUS_SHAKERS.get(4).get());
                        output.accept(ModItems.BERRYLICIOUS_GLASSES.getFirst().get());

                        output.accept(ModItems.AUREATE_SPRING_SHAKERS.get(0).get());
                        output.accept(ModItems.AUREATE_SPRING_SHAKERS.get(1).get());
                        output.accept(ModItems.AUREATE_SPRING_SHAKERS.get(2).get());
                        output.accept(ModItems.AUREATE_SPRING_SHAKERS.get(3).get());
                        output.accept(ModItems.AUREATE_SPRING_SHAKERS.get(4).get());
                        output.accept(ModItems.AUREATE_SPRING_GLASSES.getFirst().get());

                        output.accept(ModBlocks.EMBER_BLOOM.get());
                        output.accept(ModBlocks.PALM_PLANKS.get());
                        output.accept(ModBlocks.PALM_LOG.get());
                        output.accept(ModBlocks.STRIPPED_PALM_LOG.get());
                        output.accept(ModBlocks.PALM_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_PALM_WOOD.get());
                        output.accept(ModBlocks.PALM_STAIRS.get());
                        output.accept(ModBlocks.PALM_SLAB.get());
                        output.accept(ModBlocks.PALM_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.PALM_BUTTON.get());
                        output.accept(ModBlocks.PALM_FENCE.get());
                        output.accept(ModBlocks.PALM_FENCE_GATE.get());
                        output.accept(ModBlocks.PALM_LEAVES.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
