package com.awebsite.idonthave.proxies;

import com.awebsite.idonthave.Main;
import com.awebsite.idonthave.init.BlockOdorBlocker;
import com.awebsite.idonthave.init.CreeperSammich;
import com.awebsite.idonthave.init.EntityBullet;
import com.awebsite.idonthave.init.EntityFidgetSpinner;
import com.awebsite.idonthave.init.EntityGun;
import com.awebsite.idonthave.init.EntityGunGun;
import com.awebsite.idonthave.init.FidgetSpinner;
import com.awebsite.idonthave.init.Gun;
import com.awebsite.idonthave.init.GunGun;
import com.awebsite.idonthave.init.GunGunGun;
import com.awebsite.idonthave.init.ModBlocks;
import com.awebsite.idonthave.init.ModItems;
import com.awebsite.idonthave.init.ModRecipes;
import com.awebsite.idonthave.init.OdorBlocker;
import com.awebsite.idonthave.init.VapePen;
import com.awebsite.idonthave.init.VapePenLegendary;
import com.awebsite.idonthave.init.VapePenMythical;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;

public interface IProxy {

	@EventHandler
	void preInit(FMLPreInitializationEvent event);
	
	void registerRenderers();

	@EventHandler
	void init(FMLInitializationEvent event);
	
	@EventHandler
	void postInit(FMLPostInitializationEvent event);

	EntityPlayer getPlayerEntityFromContext(MessageContext parContext);

}
