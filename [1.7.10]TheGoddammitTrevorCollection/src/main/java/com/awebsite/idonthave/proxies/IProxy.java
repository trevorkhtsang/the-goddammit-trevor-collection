package com.awebsite.idonthave.proxies;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
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
