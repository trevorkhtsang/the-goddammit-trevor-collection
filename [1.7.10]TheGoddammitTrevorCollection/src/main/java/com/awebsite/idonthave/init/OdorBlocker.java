package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import com.awebsite.idonthave.init.blocks.BlockOdorBlocker;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class OdorBlocker extends Item {

	static Item OdorBlocker;

	private OdorBlocker() {
		setUnlocalizedName("odor_blocker");
		setTextureName(Main.MODID + ":odor_blocker");
		setCreativeTab(Main.tab);
		setMaxStackSize(1);
		setMaxDamage(128);
	}
	
	public static void init() {
		OdorBlocker = new OdorBlocker();
		GameRegistry.registerItem(OdorBlocker, OdorBlocker.getUnlocalizedName());
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		Vec3 facing = player.getLookVec();
		float distance = 1F;
		double X = player.posX + (facing.xCoord * distance);
		double Z = player.posZ + (facing.zCoord * distance);
		int positionX = (int)Math.round(X);
		int positionY = (int)Math.round(player.posY) - 1;
		int positionZ = (int)Math.round(Z);

		if(!world.isRemote) {
			if(world.getBlock(positionX, positionY, positionZ) == Blocks.air || 
			world.getBlock(positionX, positionY, positionZ) instanceof BlockLiquid) {
				world.setBlock(
						(positionX),(positionY), 
						(positionZ), BlockOdorBlocker.BlockOdorBlocker);
				world.playSoundEffect(player.posX, player.posY, player.posZ, Main.MODID + ":obspawned", 1, 1);
				itemstack.damageItem(1, player);
			}
		}
		return itemstack;
	}
}