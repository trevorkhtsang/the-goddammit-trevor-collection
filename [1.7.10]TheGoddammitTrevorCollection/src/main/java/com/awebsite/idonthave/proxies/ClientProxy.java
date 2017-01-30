package com.awebsite.idonthave.proxies;

import com.awebsite.idonthave.init.EntityBullet;
import com.awebsite.idonthave.init.EntityGun;
import com.awebsite.idonthave.init.EntityGunGun;
import com.awebsite.idonthave.init.Gun;
import com.awebsite.idonthave.init.GunGun;
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
	//register entity renderers
	RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderSnowball(ModItems.bullet));
	RenderingRegistry.registerEntityRenderingHandler(EntityGun.class, new RenderSnowball(Gun.Gun));
	RenderingRegistry.registerEntityRenderingHandler(EntityGunGun.class, new RenderSnowball(GunGun.GunGun));
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
