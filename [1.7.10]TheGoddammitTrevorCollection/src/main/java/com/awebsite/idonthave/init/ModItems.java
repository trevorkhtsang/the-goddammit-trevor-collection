package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item bullet;
	public static Item iront_ingot;
	public static Item quartz_mass;
	public static Item fake_crystal;
	public static Item skull_base;
	
	public static void init() {
		bullet = new Item()
				.setUnlocalizedName("bullet")
				.setTextureName(Main.MODID + ":bullet")
				.setCreativeTab(Main.tab);
		iront_ingot = new Item()
				.setUnlocalizedName("iront_ingot")
				.setTextureName(Main.MODID + ":iront_ingot")
				.setCreativeTab(Main.tab);
		quartz_mass = new Item()
				.setUnlocalizedName("quartz_mass")
				.setTextureName(Main.MODID + ":quartz_mass")
				.setCreativeTab(Main.tab);
		fake_crystal = new Item()
				.setUnlocalizedName("fake_crystal")
				.setTextureName(Main.MODID + ":fake_crystal")
				.setCreativeTab(Main.tab);
		skull_base = new Item()
				.setUnlocalizedName("skull_base")
				.setTextureName(Main.MODID + ":skull_base")
				.setCreativeTab(Main.tab);

		GameRegistry.registerItem(bullet, bullet.getUnlocalizedName());
		GameRegistry.registerItem(iront_ingot, iront_ingot.getUnlocalizedName());
		GameRegistry.registerItem(quartz_mass, quartz_mass.getUnlocalizedName());
		GameRegistry.registerItem(fake_crystal, fake_crystal.getUnlocalizedName());
		GameRegistry.registerItem(skull_base, skull_base.getUnlocalizedName());
	}
}
