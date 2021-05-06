package com.hirschbok.nooks.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Pollen extends Item {
    public Pollen() {
        super(new Item.Properties()
                .group(ItemGroup.MATERIALS)
                .food(new Food.Builder()
                        .hunger(0)
                        .saturation(0)
                        .effect(new EffectInstance(Effects.POISON, 2*20, 1), 1)
                        .effect(new EffectInstance(Effects.NAUSEA, 5*20, 0), .20f)
                        .setAlwaysEdible()
                        .fastToEat()
                        .build()
                )
        );
    }
}