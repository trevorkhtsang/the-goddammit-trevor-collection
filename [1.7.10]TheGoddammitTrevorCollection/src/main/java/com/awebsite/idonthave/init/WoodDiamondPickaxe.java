package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class WoodDiamondPickaxe extends ItemPickaxe {

    public static WoodDiamondPickaxe WoodDiamondPickaxe;

    private static final ToolMaterial woodDiamond = EnumHelper.addToolMaterial(
            "wood_diamond",
            0,
            1561,
            2.0f,
            0.0f,
            15);

    private WoodDiamondPickaxe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("wood_diamond_pickaxe");
        this.setTextureName(Main.MODID + ":wood_diamond_pickaxe");
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setMaxStackSize(1);
        this.setMaxDamage(1561);
    }

    public static void init() {
        WoodDiamondPickaxe = new WoodDiamondPickaxe(woodDiamond);
        GameRegistry.registerItem(WoodDiamondPickaxe, WoodDiamondPickaxe.getUnlocalizedName());
    }
}
