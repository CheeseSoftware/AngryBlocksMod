package com.github.cheesesoftware.AngryBlocksMod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = AngryBlocksMod.MODID, version = AngryBlocksMod.VERSION)
public class AngryBlocksMod
{
    public static final String MODID = "angryblocksmod";
    public static final String VERSION = "1.0";
    
	@SidedProxy(clientSide="com.github.cheesesoftware.AngryBlocksMod.AngryClientProxy", serverSide="com.github.cheesesoftware.AngryBlocksMod.AngryCommonProxy")
	public static AngryCommonProxy proxy;
    
    public static Block angryDirt;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    
        angryDirt = new BlockAngryDirt(538, 0).setUnlocalizedName("Angry Dirt");
        
        proxy.registerRenderThings();

        if(event.getSide() == Side.CLIENT)
        {
        	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        	renderItem.getItemModelMesher().register(Item.getItemFromBlock(angryDirt), 0, new ModelResourceLocation(AngryBlocksMod.MODID + ":" + ((BlockAngryDirt) angryDirt).getName(), "inventory"));
        }
    }
}
