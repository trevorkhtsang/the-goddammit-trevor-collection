package com.awebsite.idonthave.init;

import com.awebsite.idonthave.Main;

import net.minecraft.block.Block;

public class SoundType extends Block.SoundType {
	
    public final String soundNameStep;
    public final String soundNameBreak;
    public final String soundNamePlace;
	
    /**
     * Creates a SoundType with automatic names for step and break sounds.
     * Sound names dig.soundName and step.soundName must be specified in the
     * sounds.json
     *
     * @param soundName
     *            block of the sound. Will automatically be expanded to
     *            "mod:dig.soundName" and "mod:step.soundName" respectively)
     * @param volume
     *            default 1.0f
     * @param frequency
     *            default 1.0f
     */
	public SoundType(String name, float volume, float frequency) {
		super(name, volume, frequency);
        this.soundNameStep = null;
        this.soundNameBreak = null;
        this.soundNamePlace = null;
	}

    /**
     * Creates a SoundType with manual names for step and break sounds.
     * Sound names must be specified in the sounds.json
     *
     * @param soundNameBreak
     *            block break sound
     * @param soundNameStep
     *            block step sound
     * @param volume
     *            default 1.0f
     * @param frequency
     *            default 1.0f
     */
    public SoundType(String soundNameBreak, String soundNameStep, float volume, float frequency) {
        super(soundNameStep, volume, frequency);
        this.soundNameStep = soundNameStep;
        this.soundNameBreak = soundNameBreak;
        this.soundNamePlace = null;
    }
    
    /**
     * Creates a SoundType with manual names for step, break and place
     * sounds. Sound names must be specified in the sounds.json
     *
     * @param soundNameBreak
     *            block break sound
     * @param soundNameStep
     *            block step sound
     * @param soundNamePlace
     *            block place sound
     * @param volume
     *            default 1.0f
     * @param frequency
     *            default 1.0f
     */
    public SoundType(String soundNameBreak, String soundNameStep, String soundNamePlace, float volume, float frequency) {
        super(soundNameStep, volume, frequency);
        this.soundNameStep = soundNameStep;
        this.soundNameBreak = soundNameBreak;
        this.soundNamePlace = soundNamePlace;
    }
    
    @Override
    public String getBreakSound() {
        if(soundNameBreak == null)
            return Main.MODID + ":dig." + this.soundName;
        else
            return this.soundNameBreak;
    }

    @Override
    public String getStepResourcePath() {
        if(soundNameStep == null)
            return Main.MODID + ":step." + this.soundName;
        else
            return this.soundNameStep;
    }

    @Override
    public String func_150496_b() {
        if(soundNamePlace == null)
            return getBreakSound();
        else
            return this.soundNamePlace;
    }
}
