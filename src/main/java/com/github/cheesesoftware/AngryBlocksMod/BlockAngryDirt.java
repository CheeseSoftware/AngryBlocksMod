package com.github.cheesesoftware.AngryBlocksMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockAngryDirt extends Block {
	
	private static final String name = "angryDirt";
	
	public BlockAngryDirt(int par1, int par2){
		super(Material.rock);
        GameRegistry.registerBlock(this, name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(89.3F);
		this.setResistance(89.5F);
		this.setStepSound(soundTypeSnow);
        setUnlocalizedName(AngryBlocksMod.MODID + "_" + name);
		
	}

	public String getName()
	{
		return name;
	}
}
