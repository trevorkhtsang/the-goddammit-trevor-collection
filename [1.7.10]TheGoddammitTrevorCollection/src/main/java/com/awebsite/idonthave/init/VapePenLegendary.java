package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IWorldAccess;
import net.minecraft.world.World;

public class VapePenLegendary extends VapePen {

    static VapePen VapePenLegendary;

    private VapePenLegendary() {
        setUnlocalizedName("vape_pen_legendary");
        setTextureName(Main.MODID + ":vape_pen_legendary");
    }

    public static void init() {
        VapePenLegendary = new VapePenLegendary();
        GameRegistry.registerItem(VapePenLegendary, VapePenLegendary.getUnlocalizedName());
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
        player.swingItem();
        if (!world.isRemote) {
            for (int i = 0; i < 4; ++i)
                world.spawnParticle(
                        "hugeexplosion",
                        player.posX,
                        player.posY,
                        player.posZ,
                        player.motionX,
                        player.motionY,
                        player.motionZ
                );
        }
        return itemstack;
    }
}
