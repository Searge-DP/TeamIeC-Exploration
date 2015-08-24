package iec.teamiec.exploration.handler;

import cofh.api.modhelpers.ThermalExpansionHelper;
import cofh.thermalfoundation.block.TFBlocks;
import cofh.thermalfoundation.item.TFItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingHandler {
	
	public static void postInit(){
		crafting();
		smelting();
		pulverizing();
	}
	
	public static void crafting(){
		GameRegistry.addRecipe(new ItemStack(Items.diamond, 1), new Object[]{"XXX", "X X", "XXX", 'X', TFItems.ingotEnderium});
	}
	
	public static void smelting(){
		
	}
	
	public static void pulverizing(){
		
	}

}
