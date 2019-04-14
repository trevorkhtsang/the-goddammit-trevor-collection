package com.awebsite.idonthave.init.entities;

import com.awebsite.idonthave.Main;

import com.awebsite.idonthave.init.items.GunGun;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGunGun extends EntityThrowable {

    public EntityGunGun(World world)
    {
        super(world);
    }

    public EntityGunGun(World world, EntityLivingBase entity)
    {
        super(world, entity);
    }

    public EntityGunGun(World world, double x, double y, double z)
    {
        super(world, x, y, z);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    @Override
    protected void onImpact(MovingObjectPosition movingObjectPosition)
    {

        if (movingObjectPosition.entityHit != null)
        {
            float bulletDamage = 30;
            
            movingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)bulletDamage);
        }

        for (int i = 0; i < 4; ++i)
        {
            this.worldObj.spawnParticle(
            		"itemcrack_" + Main.MODID + ":" + GunGun.GunGun.getUnlocalizedName(), 
            		this.posX, 
            		this.posY, 
            		this.posZ, 
            		0.0D, 
            		0.0D, 
            		0.0D
            		);
        }

        if (!this.worldObj.isRemote)
        {
        	ItemStack itemstack = new ItemStack(GunGun.GunGun);
        	if(this.worldObj.getGameRules().getGameRuleBooleanValue("doTileDrops")) {
        		this.worldObj.spawnEntityInWorld(new EntityItem(
        				worldObj, 
        				this.posX, 
        				this.posY, 
        				this.posZ, 
        				itemstack));
        	}
            this.setDead();
        }
    }
    
    @Override
    protected float getGravityVelocity()
    {
    	return 0.0001F;
    }

    /**
     * Sets velocity.
     */
    @Override
    protected float func_70182_d()
    {
    	 return 5F;
    }
}