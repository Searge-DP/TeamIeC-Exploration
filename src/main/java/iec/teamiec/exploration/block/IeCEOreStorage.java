package iec.teamiec.exploration.block;

import java.util.List;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class IeCEOreStorage extends Block {

	public static IIcon[] texture;
	public static String[] subBlocks = new String[]{"titanium", "netherrite", "tridim"};

	protected IeCEOreStorage(Material mat) {
		super(mat);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		texture = new IIcon[subBlocks.length];
		for(int i = 0; i < subBlocks.length; i++){
			texture[i] = iconRegister.registerIcon("iecexploration:material/" + "block_" + subBlocks[i]);
	    }

    }
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list){
		for (int i = 0; i < subBlocks.length; i++){
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		return texture[meta];
	}
	
	public int damageDropped(int meta){
		return meta;
	}

}
