package com.awebsite.idonthave.init.items;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CreeperSammich extends ItemFood {
	
	public static ItemFood CreeperSammich;
	
    public CreeperSammich(int healAmount, float saturationModifier, boolean wolvesFavorite) {
    	//p_i45339_1 is healValue, p_i45339_2 is saturation, p_i45339_3 is if wolves can eat it
		super(healAmount, saturationModifier, wolvesFavorite);
		setUnlocalizedName("creeper_sammich");
		setTextureName(Main.MODID + ":creeper_sammich");
		setCreativeTab(Main.tab);
		setMaxStackSize(64);
	}
    
	public static void init() {
		CreeperSammich = new CreeperSammich(7, 0.6f, false).setAlwaysEdible();
		GameRegistry.registerItem(CreeperSammich, CreeperSammich.getUnlocalizedName());
	}

	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		if (!world.isRemote) {
			Entity entity = new EntityCreeper(world);
			entity.setPosition(player.posX, player.posY, player.posZ);
			world.spawnEntityInWorld(entity);
		}
	}
}
