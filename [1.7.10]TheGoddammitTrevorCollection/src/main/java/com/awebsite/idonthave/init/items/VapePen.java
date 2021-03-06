package com.awebsite.idonthave.init.items;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class VapePen extends Item {

    public static Item VapePen;

    public VapePen() {
        setUnlocalizedName("vape_pen");
        setTextureName(Main.MODID + ":vape_pen");
        setCreativeTab(Main.tab);
        setMaxStackSize(1);
        setMaxDamage(0);
    }

    public static void init() {
        VapePen = new VapePen();
        GameRegistry.registerItem(VapePen, VapePen.getUnlocalizedName());
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
        player.swingItem();
        if (world.isRemote) {
            world.spawnParticle(
                    "explode",
                    player.posX,
                    player.posY,
                    player.posZ,
                    player.motionX,
                    player.motionY,
                    player.motionZ
            );
            return itemstack;
        }
        return itemstack;
    }
}
