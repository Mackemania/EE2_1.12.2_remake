package com.Mackemania.ee2.tools;

import com.Mackemania.ee2.ModInit;
import com.Mackemania.ee2.init.ModItems;
import com.Mackemania.ee2.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	public ToolPickaxe(String name, ToolMaterial material) {
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
