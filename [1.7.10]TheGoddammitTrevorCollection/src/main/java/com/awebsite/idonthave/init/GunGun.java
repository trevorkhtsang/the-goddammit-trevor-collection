package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GunGun extends Item {
	
	public static Item GunGun;
	
	public GunGun() {
		setUnlocalizedName("gun_gun");
		setTextureName(Main.MODID + ":gun_gun"); //TODO make texture
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(16);
		setMaxDamage(0);
	}
	
	public static void init() {
		GunGun = new GunGun();
		GameRegistry.registerItem(GunGun, GunGun.getUnlocalizedName());
	}
	
	 @Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	    {
	        if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(Gun.Gun))
	        {
	            world.playSoundAtEntity(player, "random.bow", 0.5F, 1.0F);
	            if (!world.isRemote)
	            {
	                world.spawnEntityInWorld(new EntityGun(world, player));
	            }
	        }
	        return itemStack;
	    }
}
