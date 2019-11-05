package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ExampleMod.MODID)
public class ModItems {

    public static final Item FIRST_ITEM = null;

    @Mod.EventBusSubscriber(modid = ExampleMod.MODID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            final Item[] items = {
                    new Item().setRegistryName(ExampleMod.MODID, "first_item")
                            .setUnlocalizedName(ExampleMod.MODID + "." + "first_item")
                            .setCreativeTab(CreativeTabs.MISC)
            };

            event.getRegistry().registerAll(items);
        }

    }
}
