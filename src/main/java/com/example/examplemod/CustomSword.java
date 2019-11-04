package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;

public class CustomSword extends net.minecraft.item.ItemSword {
    public CustomSword(ToolMaterial material) {
        super(material);
        this.setRegistryName("mysword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
