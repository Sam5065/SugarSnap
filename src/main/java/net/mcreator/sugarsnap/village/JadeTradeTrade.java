
package net.mcreator.sugarsnap.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import net.mcreator.sugarsnap.item.JadeitemItem;
import net.mcreator.sugarsnap.item.JadeArmorItem;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class JadeTradeTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(5)
					.add(new BasicTrade(new ItemStack(Items.GOLD_INGOT, (int) (10)), new ItemStack(JadeitemItem.block, (int) (2)), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			trades.get(5).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (10)), new ItemStack(JadeitemItem.block, (int) (8)),
					new ItemStack(JadeArmorItem.body), 4, 5, 0.05f));
			trades.get(3).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (8)), new ItemStack(JadeitemItem.block, (int) (7)),
					new ItemStack(JadeArmorItem.legs), 4, 5, 0.05f));
			trades.get(2).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (6)), new ItemStack(JadeitemItem.block, (int) (4)),
					new ItemStack(JadeArmorItem.boots), 4, 5, 0.05f));
			trades.get(4).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (7)), new ItemStack(JadeitemItem.block, (int) (5)),
					new ItemStack(JadeArmorItem.helmet), 3, 5, 0.05f));
		}
	}
}
