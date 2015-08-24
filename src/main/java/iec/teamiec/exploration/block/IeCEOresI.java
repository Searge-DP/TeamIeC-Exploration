package iec.teamiec.exploration.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class IeCEOresI extends ItemBlock {
	
	public static String[] subBlocks = new String[]{"titanium", "netherrite"};

	public IeCEOresI(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemStack){
		int i = itemStack.getItemDamage();
		if (i < 0 || i >= subBlocks.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + subBlocks[i];
	}
	
	public int getMetadata(int meta){
		return meta;
	}

}