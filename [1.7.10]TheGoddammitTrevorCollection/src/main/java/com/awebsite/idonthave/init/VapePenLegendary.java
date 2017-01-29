package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class VapePenLegendary extends VapePen {
	
	public static VapePen VapePenLegendary;
	
	public VapePenLegendary() {
		setUnlocalizedName("legendary_vape_pen");
		setTextureName(Main.MODID + ":legendary_vape_pen");
	}

	public static void init() {
		VapePenLegendary = new VapePenLegendary();
		GameRegistry.registerItem(VapePenLegendary, VapePenLegendary.getUnlocalizedName());
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		player.swingItem();
		world.spawnParticle("hugeexplosion", player.posX, player.posY, player.posZ, player.motionX, player.motionY, player.motionZ);
		return itemstack;
	}
}
