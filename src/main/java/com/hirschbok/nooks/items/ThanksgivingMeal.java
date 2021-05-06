package com.hirschbok.nooks.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ThanksgivingMeal extends Item {
    public ThanksgivingMeal() {
        super(new Item.Properties()
        .group(ItemGroup.FOOD)
        .food(new Food.Builder()
                .hunger(14)
                .saturation(20.0f)
                .effect(new EffectInstance(Effects.SLOWNESS, 30*20, 0), 1)
                .effect(new EffectInstance(Effects.ABSORPTION, 30*20, 0), 1)
                .effect(new EffectInstance(Effects.NAUSEA, 8*20, 0), 0.1f)
                .build()
        )

        );
    }
}
