package com.Mackemania.ee2.util;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {
	//Tool materials
	public static final ToolMaterial TOOL_RUBY = EnumHelper.addToolMaterial("tool_ruby", 2, 1024, 7.0F, 2.5F, 12);
	
	//Armor materials
	public static final ArmorMaterial ARMOR_RUBY = EnumHelper.addArmorMaterial("armor_ruby", Reference.MOD_ID+":ruby", 20, new int[]{3, 6, 7, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
		
}
