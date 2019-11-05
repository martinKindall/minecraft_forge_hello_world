package com.example.examplemod;

/*
One might think, why is this logic duplicating registers for
Blocks and ItemBlocks? Well, in Minecraft a Block exists in both
places: the real world and the inventory. Inside the inventory they
are called ItemBlocks and in the real worls just Blocks.

The registry name of both are not colliding because Item and Block names
do not collide.
* */

import block.FirstBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        final Block[] blocks = {
                new FirstBlock().setRegistryName("first_block")
                        .setUnlocalizedName(ExampleMod.MODID + "." + "first_block"),
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName(ModBlocks.FIRST_BLOCK.getRegistryName()),
        };

        event.getRegistry().registerAll(ExampleMod.getMySword());
        event.getRegistry().registerAll(itemBlocks);
    }

}
