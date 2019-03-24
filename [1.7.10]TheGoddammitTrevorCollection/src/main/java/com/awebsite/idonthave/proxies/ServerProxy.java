package com.awebsite.idonthave.proxies;

import com.awebsite.idonthave.Main;
import com.awebsite.idonthave.init.*;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.player.EntityPlayer;

public class ServerProxy extends CommonProxy {

	@Override
	public void registerRenderers() {

	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Server side preinit");
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		System.out.println("Server side init");
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Server side postinit");
		super.postInit(event);
	}

	public EntityPlayer getPlayerEntityFromContext(MessageContext ctx) {
		return ctx.getServerHandler().playerEntity;
	}
}
