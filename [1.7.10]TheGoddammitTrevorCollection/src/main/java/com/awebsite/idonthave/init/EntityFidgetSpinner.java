package com.awebsite.idonthave.init;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityFidgetSpinner extends EntityThrowable {

	public EntityFidgetSpinner(World world) {
		super(world);
	}
	
    public EntityFidgetSpinner(World world, EntityLivingBase entity) {
        super(world, entity);
    }

    public EntityFidgetSpinner(World world, double x, double y, double z) {
        super(world, x, y, z);
    }

	@Override
	protected void onImpact(MovingObjectPosition movingObjectPosition) {
        if (movingObjectPosition.entityHit != null) {
            float bulletDamage = 4;
            movingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)bulletDamage);
        }
        if (!this.worldObj.isRemote) {
        	ItemStack itemstack = new ItemStack(FidgetSpinner.FidgetSpinner);
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

    /**
     * Sets velocity.
     */
    @Override
    protected float func_70182_d() {
    	 return 2F;
    }
}
