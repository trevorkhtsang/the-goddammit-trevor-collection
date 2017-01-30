package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGun extends EntitySnowball {

    public EntityGun(World world)
    {
        super(world);
    }

    public EntityGun(World world, EntityLivingBase entity)
    {
        super(world, entity);
    }

    public EntityGun(World world, double x, double y, double z)
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
            float bulletDamage = 8;
            
            movingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)bulletDamage);
        }

        for (int i = 0; i < 4; ++i)
        {
            this.worldObj.spawnParticle(
            		"itemcrack_" + Main.MODID + ":" + Gun.Gun.getUnlocalizedName(), 
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
        	ItemStack itemstack = new ItemStack(Gun.Gun);
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
    protected float getGravityVelocity() {
    	return 0.0001F;
    }
}