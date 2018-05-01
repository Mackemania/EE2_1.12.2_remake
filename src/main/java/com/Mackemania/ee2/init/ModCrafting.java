package com.Mackemania.ee2.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void registerCrafting() {
		GameRegistry.addShapedRecipe(new ResourceLocation("em:ruby_block"), new ResourceLocation("em:em_blocks"), new ItemStack(ModBlocks.RUBY_BLOCK), new Object[] {"###", "###", "###", '#', ModItems.RUBY});
		GameRegistry.addShapelessRecipe(new ResourceLocation("em:ruby"), new ResourceLocation("em:em_items"), new ItemStack(ModItems.RUBY, 9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(ModBlocks.RUBY_BLOCK)), Ingredient.fromItem(ModItems.RUBY)});
	}
	
	public static void registerSmelting() {
		GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK, new ItemStack(ModItems.RUBY, 10), 10);
	}
	
}
