package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Gun extends Item {
	
	public static Item Gun;
	
	public Gun() {
		setUnlocalizedName("gun");
		setTextureName(Main.MODID + ":gun");
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(64);
		setMaxDamage(0);
	}
	
	public static void init() {
		Gun = new Gun();
		GameRegistry.registerItem(Gun, Gun.getUnlocalizedName());
	}
	
	 @Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	    {
	        if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(ModItems.bullet))
	        {
	            world.playSoundAtEntity(player, "random.bow", 0.5F, 1.0F);
	            if (!world.isRemote)
	            {
	                world.spawnEntityInWorld(new EntityBullet(world, player));
	            }
	        }
	        return itemStack;
	    }
}
