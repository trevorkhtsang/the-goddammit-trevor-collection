package com.awebsite.idonthave.init.items;

import com.awebsite.idonthave.Main;

import com.awebsite.idonthave.init.entities.EntityFidgetSpinner;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FidgetSpinner extends Item {

	public static Item FidgetSpinner;
	
	public FidgetSpinner() {
		setUnlocalizedName("fidget_spinner");
		setTextureName(Main.MODID + ":fidget_spinner");
		setCreativeTab(Main.tab);
		setMaxStackSize(16);
		setMaxDamage(0);
	}
	
	public static void init() {
		FidgetSpinner = new FidgetSpinner();
		GameRegistry.registerItem(FidgetSpinner, FidgetSpinner.getUnlocalizedName());
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
	        if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(FidgetSpinner)) {
	            world.playSoundAtEntity(player, "random.bow", 0.5F, 1.0F);
	            if (!world.isRemote) {
	                world.spawnEntityInWorld(new EntityFidgetSpinner(world, player));
	            }
	        }
	        return itemStack;
	    }
}
