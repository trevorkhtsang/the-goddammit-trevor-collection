package com.awebsite.idonthave.init.items;

import com.awebsite.idonthave.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class JellyBeans extends ItemFood {

    public static ItemFood JellyBeans;

    public JellyBeans(int healAmount, float saturationModifier, boolean wolvesFavorite) {
        //p_i45339_1 is healValue, p_i45339_2 is saturation, p_i45339_3 is if wolves can eat it
        super(healAmount, saturationModifier, wolvesFavorite);
        setUnlocalizedName("jelly_beans");
        setTextureName(Main.MODID + ":jelly_beans");
        setCreativeTab(Main.tab);
        setMaxStackSize(64);
    }

    public static void init() {
        JellyBeans = new JellyBeans(1, 0.2f, false).setAlwaysEdible();
        GameRegistry.registerItem(JellyBeans, JellyBeans.getUnlocalizedName());
    }

    @Override
    protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            EntitySlime entity = new EntitySlime(world);
            entity.setPosition(player.posX, player.posY, player.posZ);
            NBTTagCompound tag = new NBTTagCompound();
            entity.writeEntityToNBT(tag);
            tag.setInteger("Size", 0);
            entity.readEntityFromNBT(tag);
            world.spawnEntityInWorld(entity);
        }
    }
}
