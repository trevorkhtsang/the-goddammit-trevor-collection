package com.awebsite.idonthave.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block block_odor_blocker;
	
	public static void init() {
		
		block_odor_blocker = new BlockOdorBlocker("block_odor_blocker", Material.iron);
		
		GameRegistry.registerBlock(block_odor_blocker, "block_odor_blocker");
	}
	
}
