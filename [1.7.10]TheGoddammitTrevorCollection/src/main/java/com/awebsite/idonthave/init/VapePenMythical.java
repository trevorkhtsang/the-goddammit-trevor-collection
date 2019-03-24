package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class VapePenMythical extends VapePen {
	
static VapePen VapePenMythical;
	
	private VapePenMythical() {
		setUnlocalizedName("vape_pen_mythical");
		setTextureName(Main.MODID + ":vape_pen_mythical");
	}

	public static void init() {
		VapePenMythical = new VapePenMythical();
		GameRegistry.registerItem(VapePenMythical, VapePenMythical.getUnlocalizedName());
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		player.swingItem();
			if(!world.isRemote) {
				for(int i = 0; i < 20; ++i)
				world.spawnParticle(
						"explode", 
						player.posX,
						player.posY, 
						player.posZ, 
						player.motionX, 
						player.motionY, 
						player.motionZ
						);
			}
		return itemstack;
	}
}
