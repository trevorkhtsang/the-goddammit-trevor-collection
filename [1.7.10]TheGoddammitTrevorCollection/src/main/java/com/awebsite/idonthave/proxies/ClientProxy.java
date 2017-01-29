package com.awebsite.idonthave.proxies;

import com.awebsite.idonthave.init.EntityBullet;
import com.awebsite.idonthave.init.ModItems;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.renderer.entity.RenderSnowball;

public class ClientProxy extends CommonProxy {
	

	@EventHandler @Override
	public void registerRenderers() {	
	//init entities
	RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderSnowball(ModItems.bullet));
	}

	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
