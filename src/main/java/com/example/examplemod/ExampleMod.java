package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "sword";
    public static final String NAME = "Mod de prueba";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static Item.ToolMaterial myToolMaterial;
    public static Item mySword;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        myToolMaterial = EnumHelper.addToolMaterial(
                "Material name",
                4,
                10000,
                20.0F,
                100.0F,
                30
        );
        mySword = new CustomSword(myToolMaterial);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    public static Item getMySword() {
        if (mySword == null) {
            throw new RuntimeException("ExampleMod: sword not initialized.");
        }

        return mySword;
    }
}
