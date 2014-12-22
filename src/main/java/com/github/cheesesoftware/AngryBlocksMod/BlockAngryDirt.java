package com.github.cheesesoftware.AngryBlocksMod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockAngryDirt extends Block {
	
	private static final String name = "angryDirt";
	Random r = new Random();
	
	public BlockAngryDirt(int par1, int par2){
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(89.3F);
		this.setResistance(89.5F);
		this.setStepSound(soundTypeSnow);
        setUnlocalizedName(AngryBlocksMod.MODID + "_" + name);
        GameRegistry.registerBlock(this, name);
        this.setTickRandomly(true);
	}

	public String getName()
	{
		return name;
	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
		//world.getBlockState(pos.offset(EnumFacing.DOWN)).getBlock().set;
		//world.setBlockState(pos, new BlockState(1));
		//world.setBlockState(pos, (IBlockState) Blocks.slime_block.getDefaultState());
		EnumFacing face = EnumFacing.getFront(r.nextInt(6));
		world.setBlockState(pos.offset(face), this.getDefaultState());
	}
}
