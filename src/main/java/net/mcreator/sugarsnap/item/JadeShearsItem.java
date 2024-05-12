
package net.mcreator.sugarsnap.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ShearsItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.sugarsnap.SugarsnapModElements;

import java.util.List;

@SugarsnapModElements.ModElement.Tag
public class JadeShearsItem extends SugarsnapModElements.ModElement {
	@ObjectHolder("sugarsnap:jade_shears")
	public static final Item block = null;

	public JadeShearsItem(SugarsnapModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShearsItem(new Item.Properties().group(ItemGroup.TOOLS).maxDamage(112)) {
			@Override
			public int getItemEnchantability() {
				return 2;
			}

			@Override
			public float getDestroySpeed(ItemStack stack, BlockState block) {
				return 4f;
			}

			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Iron sheers with added jade to increase durability"));
			}
		}.setRegistryName("jade_shears"));
	}
}
