package com.Mackemania.ee2.tools;

import com.Mackemania.ee2.ModInit;
import com.Mackemania.ee2.init.ModItems;
import com.Mackemania.ee2.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel{

	public ToolSpade(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		
		ModInit.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
