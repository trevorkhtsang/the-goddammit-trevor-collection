package com.awebsite.idonthave.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
	public static void init() {
		GameRegistry.addRecipe(new ItemStack(VapePen.VapePen),
			"X  ", 
			" YZ", 
			"  X", 				
			'X', Items.iron_ingot, 
			'Y', Items.water_bucket, 
			'Z', Blocks.stone_button);
		GameRegistry.addRecipe(new ItemStack(VapePenMythical.VapePenMythical), 
			"X  ", 
			" YZ", 
			"  X", 
			'X', Items.gold_ingot,
			'Y', VapePen.VapePen,
			'Z', Items.diamond);
		GameRegistry.addRecipe(new ItemStack(VapePenLegendary.VapePenLegendary), 
			"X Z", 
			" Y ", 
			"Z X", 
			'X', Blocks.obsidian,
			'Y', VapePenMythical.VapePenMythical,
			'Z', Items.diamond);
		GameRegistry.addRecipe(new ItemStack(ModItems.bullet, 64),
			"X",
			"Y",
			'X', Items.iron_ingot,
			'Y', Items.gunpowder);
		GameRegistry.addRecipe(new ItemStack(Gun.Gun, 16),
			"XXX",
			"  Y",
			'X', Items.iron_ingot,
			'Y', Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(GunGun.GunGun, 1),
			"XY",
			"YX",
			'X', Gun.Gun,
			'Y', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(GunGunGun.GunGunGun, 1),
			"XY",
			"YX",
			'X', GunGun.GunGun,
			'Y', Items.iron_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(CreeperSammich.CreeperSammich, 1),
			new Object[] {Items.bread, Items.gunpowder});
		GameRegistry.addRecipe(new ItemStack(FidgetSpinner.FidgetSpinner, 1),
			" X ",
			" X ",
			"X X",
			'X', Blocks.cobblestone);
		GameRegistry.addRecipe(new ItemStack(OdorBlocker.OdorBlocker, 1),
			"XYX",
			'X', Blocks.red_flower,
			'Y', Blocks.reeds);
	}
}
