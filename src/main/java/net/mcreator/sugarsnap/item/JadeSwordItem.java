
package net.mcreator.sugarsnap.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.sugarsnap.SugarsnapModElements;

@SugarsnapModElements.ModElement.Tag
public class JadeSwordItem extends SugarsnapModElements.ModElement {
	@ObjectHolder("sugarsnap:jade_sword")
	public static final Item block = null;

	public JadeSwordItem(SugarsnapModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RawJadeItemItem.block));
			}
		}, 3, -2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("jade_sword"));
	}
}
