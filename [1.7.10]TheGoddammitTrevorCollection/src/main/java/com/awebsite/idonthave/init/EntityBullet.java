package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBullet extends EntitySnowball {

    public EntityBullet(World world)
    {
        super(world);
    }

    public EntityBullet(World world, EntityLivingBase entity)
    {
        super(world, entity);
    }

    public EntityBullet(World world, double x, double y, double z)
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
            float bulletDamage = 4;
            
            movingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)bulletDamage);
        }

        for (int i = 0; i < 4; ++i)
        {
            this.worldObj.spawnParticle(
            		"itemcrack_" + Main.MODID + ":" + ModItems.bullet.getUnlocalizedName(), 
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
            this.setDead();
        }
    }
    
    @Override
    protected float getGravityVelocity() {
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