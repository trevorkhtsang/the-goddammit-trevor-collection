package com.awebsite.idonthave.proxies;

import com.awebsite.idonthave.Main;
import com.awebsite.idonthave.init.entities.EntityBullet;
import com.awebsite.idonthave.init.entities.EntityFidgetSpinner;
import com.awebsite.idonthave.init.entities.EntityGun;
import com.awebsite.idonthave.init.entities.EntityGunGun;
import com.awebsite.idonthave.init.items.FidgetSpinner;
import com.awebsite.idonthave.init.items.Gun;
import com.awebsite.idonthave.init.items.GunGun;
import com.awebsite.idonthave.init.ModItems;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.player.EntityPlayer;

public class ClientProxy extends CommonProxy {

	@EventHandler @Override
	public void registerRenderers() {	
	//register entity renderers
	RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderSnowball(ModItems.bullet));
	RenderingRegistry.registerEntityRenderingHandler(EntityGun.class, new RenderSnowball(Gun.Gun));
	RenderingRegistry.registerEntityRenderingHandler(EntityGunGun.class, new RenderSnowball(GunGun.GunGun));
	RenderingRegistry.registerEntityRenderingHandler(EntityFidgetSpinner.class, new RenderSnowball(FidgetSpinner.FidgetSpinner));
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Client side preinit");
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		System.out.println("Client side init");
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Client side postinit");
		super.postInit(event);
	}

	@Override
	public EntityPlayer getPlayerEntityFromContext(MessageContext ctx) {
		return (ctx.side.isClient() ? Minecraft.getMinecraft().thePlayer : Main.proxy.getPlayerEntityFromContext(ctx));
	}

}
