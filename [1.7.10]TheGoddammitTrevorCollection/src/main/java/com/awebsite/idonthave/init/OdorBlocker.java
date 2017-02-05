package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class OdorBlocker extends Item {
	
	public static Item OdorBlocker;
	
	public OdorBlocker()
	{
		setUnlocalizedName("odor_blocker");
		setTextureName(Main.MODID + ":odor_blocker");
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);
		setMaxDamage(128);
	}
	
	public static void init()
	{
		OdorBlocker = new OdorBlocker();
		GameRegistry.registerItem(OdorBlocker, OdorBlocker.getUnlocalizedName());
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		int playerDirection = (int) player.rotationYaw;
		if(world.isRemote)
			{
				switch(playerDirection)
				{
				case 0:
					{
						world.setBlock((int) player.posX, (int) player.posY - 1, (int) player.posZ+1, ModBlocks.block_odor_blocker);
					}
			
				case 1:
					{
						world.setBlock((int) player.posX-1, (int) player.posY - 1, (int) player.posZ+1, ModBlocks.block_odor_blocker);
					}
				
				case 2:
					{
						world.setBlock((int) player.posX, (int) player.posY - 1, (int) player.posZ-1, ModBlocks.block_odor_blocker);
					}
				
				case 3:
					{
						world.setBlock((int) player.posX+1, (int) player.posY - 1, (int) player.posZ, ModBlocks.block_odor_blocker);
					}
				}
				return itemstack;
			}
		return itemstack;

	}
}
