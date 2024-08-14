package net.JRBolo.tutorialmod.item;

import com.mojang.realmsclient.client.Request;
import net.JRBolo.tutorialmod.TutorialMod;
import net.JRBolo.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> DEBRIS_DETECTOR = ITEMS.register("debris_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(1200)));

    public static final RegistryObject<Item> DIAMOND_DETECTOR = ITEMS.register("diamond_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(350)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> REINFORCEDBREAD = ITEMS.register("reinforcedbread",
            () -> new Item(new Item.Properties()));


    public  static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
