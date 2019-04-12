package com.awebsite.idonthave.proxies;

import com.awebsite.idonthave.Main;
import com.awebsite.idonthave.init.*;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.player.EntityPlayer;

public class CommonProxy implements IProxy {

    private int modEntityId = 0;

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        //init blocks/items with custom behavior
        VapePen.init();
        VapePenMythical.init();
        VapePenLegendary.init();
        Gun.init();
        GunGun.init();
        GunGunGun.init();
        CreeperSammich.init();
        FidgetSpinner.init();
        OdorBlocker.init();
        BlockOdorBlocker.init();
        WoodDiamondPickaxe.init();

        //init items with default behavior, recipes and blocks
        ModItems.init();
        ModRecipes.init();
        ModBlocks.init();
    }

    @Override
    public void registerRenderers() {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", modEntityId++, Main.MODID, 64, 10, true);
        EntityRegistry.registerModEntity(EntityGun.class, "EntityGun", modEntityId++, Main.MODID, 64, 10, true);
        EntityRegistry.registerModEntity(EntityGunGun.class, "EntityGunGun", modEntityId++, Main.MODID, 64, 10, true);
        EntityRegistry.registerModEntity(EntityFidgetSpinner.class, "EntityGunGun", modEntityId++, Main.MODID, 64, 10, true);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

    //TODO: make this not return null
    @Override
    public EntityPlayer getPlayerEntityFromContext(MessageContext parContext) {
        return null;
    }

    public EntityPlayer getPlayerEntity(MessageContext ctx) {
        return ctx.getServerHandler().playerEntity;
    }
}
