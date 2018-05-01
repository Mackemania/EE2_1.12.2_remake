package com.Mackemania.ee2.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

	public RubyBlock(String name, Material material) {
		super(name, material);
		
		//All sets are optional
		//Sets the sound when running on it
		setSoundType(SoundType.METAL);
		
		//How long it will take to break, takes a float value
		setHardness(5.0f);
		
		//Sets how resistant blocks are to explosion, float value
		setResistance(15.0f);
		
		//Sets the harvestlevel, and takes a tool (Ex: "pickaxe", "axe", "shovel/spade", "sword" etc)
		setHarvestLevel("pickaxe", 2);
		
		//Sets if the block should emit light, float value
		setLightLevel(0);
		
		//Sets if block should pass through the block, int value (1 is transparent)
		setLightOpacity(0);
		
		//Makes the block indestructable;
		//setBlockUnbreakable();
	}

}
