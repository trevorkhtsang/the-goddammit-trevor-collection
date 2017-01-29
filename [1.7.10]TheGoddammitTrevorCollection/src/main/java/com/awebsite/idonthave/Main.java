package com.awebsite.idonthave;

import com.awebsite.idonthave.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION, useMetadata = true)

public class Main {
	
	@SidedProxy(clientSide = "com.awebsite.idonthave.proxies.ClientProxy", serverSide = "com.awebsite.idonthave.proxies.ServerProxy")
	public static CommonProxy proxy;
	
    public static final String NAME = "The Goddammit Trevor Collection";
    public static final String MODID = "goddammittrevorcollection";
    public static final String VERSION = "1.7.10 Alpha 0.002";
 
    @Mod.Instance("goddammittrevorcollection")
    public static Main instance;
    
    int modEntityId = 0;
 
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    	proxy.registerRenderers();
    }
 
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
    	proxy.registerRenderers();
    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    }
}


