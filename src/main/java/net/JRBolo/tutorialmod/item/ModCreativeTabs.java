package net.JRBolo.tutorialmod.item;

import net.JRBolo.tutorialmod.TutorialMod;
import net.JRBolo.tutorialmod.block.ModBlocks;
import net.JRBolo.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.REINFORCEDBREAD.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.REINFORCEDBREAD.get());
                        output.accept(ModBlocks.REINFORCEDBREAD_BLOCK.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModItems.DIAMOND_DETECTOR.get());
                        output.accept(ModItems.DEBRIS_DETECTOR.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
