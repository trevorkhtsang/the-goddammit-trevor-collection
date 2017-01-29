package com.awebsite.idonthave.proxies;

import com.awebsite.idonthave.init.ModItems;
import com.awebsite.idonthave.init.ModRecipes;
import com.awebsite.idonthave.init.VapePen;
import com.awebsite.idonthave.init.VapePenLegendary;
import com.awebsite.idonthave.init.VapePenMythical;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
    	
		VapePen.init();
    	VapePenMythical.init();
    	VapePenLegendary.init();
    	ModItems.init();
    	ModRecipes.init();
		
	}

	public void init(FMLInitializationEvent event) {
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
