package com.Mackemania.ee2.init;

import java.util.ArrayList;
import java.util.List;

import com.Mackemania.ee2.armour.ArmorBase;
import com.Mackemania.ee2.items.ItemBase;
import com.Mackemania.ee2.tools.ToolPickaxe;
import com.Mackemania.ee2.util.ModMaterials;
import com.Mackemania.ee2.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	
	
	//Tools
	public static final Item PICKAXE_RUBY = new ToolPickaxe("pickaxe_ruby", ModMaterials.TOOL_RUBY);
	
	//Armor, renderIndex should be 1 for head, chest, and boots, and 2 for leggings
	public static final Item HELMET_RUBY = new ArmorBase("helmet_ruby", ModMaterials.ARMOR_RUBY, 1, EntityEquipmentSlot.HEAD);
	
}
