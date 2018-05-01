package com.Mackemania.ee2.armour;

import com.Mackemania.ee2.ModInit;
import com.Mackemania.ee2.init.ModItems;
import com.Mackemania.ee2.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel{
	
	public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		super(material, renderIndex, equipmentSlot);
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
