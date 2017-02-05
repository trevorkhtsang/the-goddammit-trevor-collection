package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOdorBlocker extends Block {

	protected BlockOdorBlocker(String unlocalizedName, Material material) {
		super(Material.rock);
		setBlockName(unlocalizedName);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		setHardness(0.01F);
		setHarvestLevel(null, 0);
	}
}
