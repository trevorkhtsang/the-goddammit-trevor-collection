package com.awebsite.idonthave.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GDITCreativeTab extends CreativeTabs {

    public GDITCreativeTab(String lable) {
        super(lable);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.skull_base;
    }
}
