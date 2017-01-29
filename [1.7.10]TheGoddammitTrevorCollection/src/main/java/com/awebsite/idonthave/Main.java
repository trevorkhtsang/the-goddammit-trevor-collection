package com.awebsite.idonthave;

import com.awebsite.idonthave.init.ModItems;
import com.awebsite.idonthave.init.ModRecipes;
import com.awebsite.idonthave.init.VapePen;
import com.awebsite.idonthave.init.VapePenLegendary;
import com.awebsite.idonthave.init.VapePenMythical;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION, useMetadata = true)

public class Main {
	
    public static final String NAME = "Test Mod Please Ignore";
    public static final String MODID = "testmodpleaseignore";
    public static final String VERSION = "1.7.10 Alpha 0.001";
 
    @Mod.Instance("testmodpleaseignore")
    public static Main instance;
 
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	VapePen.init();
    	VapePenMythical.init();
    	VapePenLegendary.init();
    	ModItems.init();
    	ModRecipes.init();
    }
 
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}


