package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class VapePenMythical extends VapePen {
	
public static VapePen VapePenMythical;
	
	public VapePenMythical() {
		setUnlocalizedName("mythical_vape_pen");
		setTextureName(Main.MODID + ":mythical_vape_pen");
	}

	public static void init() {
		VapePenMythical = new VapePenMythical();
		GameRegistry.registerItem(VapePenMythical, VapePenMythical.getUnlocalizedName());
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		player.swingItem();
		world.spawnParticle("largeexplode", player.posX, player.posY, player.posZ, player.motionX, player.motionY, player.motionZ);
		return itemstack;
	}
}
