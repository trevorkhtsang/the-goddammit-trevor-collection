package com.awebsite.idonthave.init;

import com.awebsite.idonthave.init.items.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

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
		GameRegistry.addShapelessRecipe(new ItemStack(OdorBlocker.OdorBlocker, 1),
				new Object[] {Blocks.red_flower, Items.sugar, Blocks.red_flower});
		GameRegistry.addRecipe(new ItemStack(WoodDiamondPickaxe.WoodDiamondPickaxe, 1),
				"XXX",
				" Y ",
				" Y ",
				'X', Items.stick,
				'Y', Items.diamond
		);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.iront_ingot, 1),
				new Object[] {Items.brick, new ItemStack(Items.dye, 1, 8)});
		GameRegistry.addSmelting(ModItems.iront_ingot, new ItemStack(Items.iron_ingot, 1, 0), 0.7f );
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder, 2),
				new Object[] {Gun.Gun});
		GameRegistry.addSmelting(new ItemStack(Items.gunpowder, 2), new ItemStack(Gun.Gun, 1), 0.1f);
		GameRegistry.addRecipe(new ItemStack(ModItems.quartz_mass, 1),
				"XXX",
				"XXX",
				"XXX",
				'X', Items.quartz);
		GameRegistry.addRecipe(new ItemStack(ModItems.fake_crystal, 1),
				"XXX",
				"XXX",
				"XXX",
				'X', ModItems.quartz_mass);
		GameRegistry.addRecipe(new ItemStack(Items.emerald, 1),
				" X ",
				"XYX",
				" X ",
				'X', new ItemStack(Items.dye, 1, 2),
				'Y', ModItems.fake_crystal);
		GameRegistry.addRecipe(new ItemStack(FakeDiamond.FakeDiamond, 1, 0),
				"XXX",
				"XYX",
				"XXX",
				'X', new ItemStack(Items.dye, 1, 6),
				'Y', ModItems.fake_crystal);
		//diamon't -> diameh
		GameRegistry.addSmelting(new ItemStack(FakeDiamond.FakeDiamond, 1, 0), new ItemStack(FakeDiamond.FakeDiamond, 1, 1), 0.35f);
		//diameh -> diamight
		GameRegistry.addSmelting(new ItemStack(FakeDiamond.FakeDiamond, 1, 1), new ItemStack(FakeDiamond.FakeDiamond, 1, 2), 0.7f);
		//diamight -> diamaybe
		GameRegistry.addSmelting(new ItemStack(FakeDiamond.FakeDiamond, 1, 2), new ItemStack(FakeDiamond.FakeDiamond, 1, 3), 1f);
		//diamaybe -> diamond    That took a while, didn't it?
		GameRegistry.addSmelting(new ItemStack(FakeDiamond.FakeDiamond, 1, 3), new ItemStack(Items.diamond, 1), 1f);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sticky_piston, 1),
				new Object[] {Blocks.piston, Items.stick});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 3),
				new Object[] {Blocks.dirt, new ItemStack(Items.dye, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.soul_sand, 4),
				new Object[] {Blocks.sand, new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.skull_base, 1),
				new Object[] {Items.bucket, Items.flint});
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 0),
				"XXX",
				"XYX",
				"XXX",
				'X', Items.bone,
				'Y', ModItems.skull_base);
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 1),
				"XXX",
				"XYX",
				"XXX",
				'X', Items.coal,
				'Y', ModItems.skull_base);
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 2),
				"XXX",
				"XYX",
				"XXX",
				'X', Items.rotten_flesh,
				'Y', ModItems.skull_base);
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 4),
				"XXX",
				"XYX",
				"XXX",
				'X', Items.gunpowder,
				'Y', ModItems.skull_base);
	}
}
