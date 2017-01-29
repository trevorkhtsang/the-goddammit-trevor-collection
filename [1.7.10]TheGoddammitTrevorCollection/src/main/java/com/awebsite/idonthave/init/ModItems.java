package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item bullet;
	
	public static void init() {
		bullet = new Item()
				.setUnlocalizedName("bullet")
				.setTextureName(Main.MODID + ":bullet")
				.setCreativeTab(CreativeTabs.tabCombat);
		
		GameRegistry.registerItem(bullet, bullet.getUnlocalizedName());
	}

}
