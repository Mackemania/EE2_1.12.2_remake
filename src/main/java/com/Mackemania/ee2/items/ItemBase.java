package com.Mackemania.ee2.items;

import com.Mackemania.ee2.ModInit;
import com.Mackemania.ee2.init.ModItems;
import com.Mackemania.ee2.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
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
