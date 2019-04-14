package com.awebsite.idonthave.init.blocks;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOdorBlocker extends Block {

	public static Block BlockOdorBlocker;
	
	protected BlockOdorBlocker() {
		super(Material.rock);
		setBlockName("block_odor_blocker");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(Main.MODID + ":" + "block_odor_blocker");
		setHardness(0.01F);
		setHarvestLevel(null, 0);
		SoundType sound = new SoundType(Main.MODID + ":obdestroyed", 1, 1) {

			@Override
			public String getBreakSound() {
				return Main.MODID + ":obdestroyed";
			}

			/**
			 * place sound, maybe
			 */
			@Override
			public String func_150496_b() {
				return Main.MODID + ":obspawned";
			}
			
		};
		setStepSound(sound);
	}
	
	public static void init() {
		BlockOdorBlocker = new BlockOdorBlocker();
		GameRegistry.registerBlock(BlockOdorBlocker, "block_odor_blocker");
	}
}