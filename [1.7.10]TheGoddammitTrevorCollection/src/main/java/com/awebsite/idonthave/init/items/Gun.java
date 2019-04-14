package com.awebsite.idonthave.init.items;

import com.awebsite.idonthave.Main;

import com.awebsite.idonthave.init.entities.EntityBullet;
import com.awebsite.idonthave.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Gun extends Item {
	
	public static Item Gun;
	
	public Gun() {
		setUnlocalizedName("gun");
		setTextureName(Main.MODID + ":gun");
		setCreativeTab(Main.tab);
		setMaxStackSize(64);
		setMaxDamage(0);
	}
	
	public static void init() {
		Gun = new Gun();
		GameRegistry.registerItem(Gun, Gun.getUnlocalizedName());
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
	        if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(ModItems.bullet)) {
	            world.playSoundAtEntity(player, "random.bow", 0.5F, 1.0F);
	            if (!world.isRemote) {
	                world.spawnEntityInWorld(new EntityBullet(world, player));
	            }
	        }
	        return itemStack;
	    }
}
