package com.awebsite.idonthave.init.items;

import com.awebsite.idonthave.Main;

import com.awebsite.idonthave.init.entities.EntityGunGun;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GunGunGun extends Item {
	
	public static Item GunGunGun;
	
	public GunGunGun() {
		setUnlocalizedName("gun_gun_gun");
		setTextureName(Main.MODID + ":gun_gun_gun");
		setCreativeTab(Main.tab);
		setMaxStackSize(16);
		setMaxDamage(0);
	}

	public static void init() {
		GunGunGun = new GunGunGun();
		GameRegistry.registerItem(GunGunGun, GunGunGun.getUnlocalizedName());
	}
	
	 @Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(GunGun.GunGun))
			{
				world.playSoundAtEntity(player, "random.bow", 0.5F, 1.0F);
					if (!world.isRemote)
						{
							world.spawnEntityInWorld(new EntityGunGun(world, player));
						}
					}
		return itemStack;
	}
}

