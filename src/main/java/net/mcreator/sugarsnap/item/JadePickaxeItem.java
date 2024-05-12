
package net.mcreator.sugarsnap.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.sugarsnap.SugarsnapModElements;

@SugarsnapModElements.ModElement.Tag
public class JadePickaxeItem extends SugarsnapModElements.ModElement {
	@ObjectHolder("sugarsnap:jade_pickaxe")
	public static final Item block = null;

	public JadePickaxeItem(SugarsnapModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 40;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RawJadeItemItem.block), new ItemStack(JadeitemItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("jade_pickaxe"));
	}
}
