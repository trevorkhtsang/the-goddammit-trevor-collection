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
	}

}
