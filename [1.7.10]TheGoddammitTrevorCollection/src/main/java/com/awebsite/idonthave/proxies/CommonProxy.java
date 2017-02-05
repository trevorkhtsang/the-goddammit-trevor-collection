package com.awebsite.idonthave.proxies;

import com.awebsite.idonthave.Main;
import com.awebsite.idonthave.init.EntityBullet;
import com.awebsite.idonthave.init.EntityGun;
import com.awebsite.idonthave.init.EntityGunGun;
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
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxy {	
	
	int modEntityId = 0;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		//init items with custom behavior
		VapePen.init();
    	VapePenMythical.init();
    	VapePenLegendary.init();
    	Gun.init();
    	GunGun.init();
    	GunGunGun.init();
    	OdorBlocker.init();

    	//init items with default behavior, recipes and blocks
    	ModItems.init();
    	ModRecipes.init();
    	ModBlocks.init();

	}
	
	public void registerRenderers() {
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", modEntityId++, Main.MODID, 64, 10, true);
		EntityRegistry.registerModEntity(EntityGun.class, "EntityGun", modEntityId++, Main.MODID, 64, 10, true);
		EntityRegistry.registerModEntity(EntityGunGun.class, "EntityGunGun", modEntityId++, Main.MODID, 64, 10, true);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
