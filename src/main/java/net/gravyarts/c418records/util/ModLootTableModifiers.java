package net.gravyarts.c418records.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.gravyarts.c418records.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
	private static final Identifier END_CITY_CHEST_ID
		= new Identifier("minecraft", "chests/end_city_treasure");
	private static final Identifier STRONGHOLD_LIBRARY_CHEST_ID
		= new Identifier("minecraft", "chests/stronghold_library");
	private static final Identifier BURIED_CHEST_ID
	= new Identifier("minecraft", "chests/buried_treasure");
	private static final Identifier JUNGLE_TEMPLE_CHEST_ID
	= new Identifier("minecraft", "chests/jungle_temple");
	private static final Identifier DESERT_PYRAMID_CHEST_ID
	= new Identifier("minecraft", "chests/desert_pyramid");
	private static final Identifier ABANDONED_MINESHAFT_CHEST_ID
	= new Identifier("minecraft", "chests/abandoned_mineshaft");
	private static final Identifier SPAWNER_CHEST_ID
		= new Identifier("minecraft", "chests/simple_dungeon");
	
	public static void modifyLootTables() {
		LootTableEvents.MODIFY.register((resourceManager, lootmanager, id, tableBuilder, source) -> {
			
			if(END_CITY_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.bonusRolls(ConstantLootNumberProvider.create(1))
						.conditionally(RandomChanceLootCondition.builder(0.75f))
						//Chance in % of spawning
						.with(ItemEntry.builder(ModItems.DISC_ONE_FRAGMENT))
						//Loot Drop
						.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());
						//1-5 Possible Item Drop Chance
				tableBuilder.pool(poolBuilder.build());
				
				//Hey Ukaye, is there any better way to do this?
				
			}
			if(STRONGHOLD_LIBRARY_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.bonusRolls(ConstantLootNumberProvider.create(1))
						.conditionally(RandomChanceLootCondition.builder(0.5f))
						.with(ItemEntry.builder(ModItems.DISC_ONE_FRAGMENT))
						.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 7.0f)).build());
				tableBuilder.pool(poolBuilder.build());
			}
			if(BURIED_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.bonusRolls(ConstantLootNumberProvider.create(1))
						.conditionally(RandomChanceLootCondition.builder(1.0f))
						.with(ItemEntry.builder(ModItems.DISC_ONE_FRAGMENT))
						.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());
				tableBuilder.pool(poolBuilder.build());
			}
			if(JUNGLE_TEMPLE_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.bonusRolls(ConstantLootNumberProvider.create(1))
						.conditionally(RandomChanceLootCondition.builder(1.0f))
						.with(ItemEntry.builder(ModItems.DISC_FRAGMENT))
						.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());
				tableBuilder.pool(poolBuilder.build());
			}
			if(DESERT_PYRAMID_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.bonusRolls(ConstantLootNumberProvider.create(1))
						.conditionally(RandomChanceLootCondition.builder(0.65f))
						.with(ItemEntry.builder(ModItems.DISC_FRAGMENT))
						.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 5.0f)).build());
				tableBuilder.pool(poolBuilder.build());
			}
			if(ABANDONED_MINESHAFT_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.bonusRolls(ConstantLootNumberProvider.create(1))
						.conditionally(RandomChanceLootCondition.builder(0.5f))
						.with(ItemEntry.builder(ModItems.DISC_FRAGMENT))
						.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 7.0f)).build());
				tableBuilder.pool(poolBuilder.build());
			}
			if(SPAWNER_CHEST_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.bonusRolls(ConstantLootNumberProvider.create(1))
						.conditionally(RandomChanceLootCondition.builder(0.25f))
						.with(ItemEntry.builder(ModItems.DISC_FRAGMENT))
						.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 10.0f)).build());
				tableBuilder.pool(poolBuilder.build());
			}
		});
	}
}

