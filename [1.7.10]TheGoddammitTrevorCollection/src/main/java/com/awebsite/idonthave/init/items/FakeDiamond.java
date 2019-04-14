package com.awebsite.idonthave.init.items;

import com.awebsite.idonthave.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class FakeDiamond extends Item {

    public static Item FakeDiamond;
    IIcon[] Textures = new IIcon[4];

    public FakeDiamond() {
        this.setUnlocalizedName("fake_diamond");
        this.setTextureName(Main.MODID + ":fake_diamond");
        this.setCreativeTab(Main.tab);
    }

    @Override
    public void registerIcons(IIconRegister par1IconRegister) {
        this.Textures[0] = par1IconRegister.registerIcon(Main.MODID + ":fake_diamond_1");
        this.Textures[1] = par1IconRegister.registerIcon(Main.MODID + ":fake_diamond_2");
        this.Textures[2] = par1IconRegister.registerIcon(Main.MODID + ":fake_diamond_3");
        this.Textures[3] = par1IconRegister.registerIcon(Main.MODID + ":fake_diamond_4");
    }

    @Override
    public IIcon getIconFromDamage(int i) {
        return Textures[i];
    }

    @Override
    public String getUnlocalizedName(ItemStack i) {
        switch(i.getItemDamage()) {
            case 0:
                return "item.fake_diamond_1";
            case 1:
                return "item.fake_diamond_2";
            case 2:
                return "item.fake_diamond_3";
            case 3:
                return "item.fake_diamond_4";
        }
        return "item.fake_diamond_null.name";
    }

    public static void init() {
        FakeDiamond = new FakeDiamond();
        GameRegistry.registerItem(FakeDiamond, FakeDiamond.getUnlocalizedName());
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
        list.add(new ItemStack(item, 1, 2));
        list.add(new ItemStack(item, 1, 3));
    }
}
