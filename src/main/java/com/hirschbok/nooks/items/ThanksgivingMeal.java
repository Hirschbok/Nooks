package com.hirschbok.nooks.items;

import com.hirschbok.nooks.Nooks;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ThanksgivingMeal extends Item {
    public ThanksgivingMeal() {
        super(new Item.Properties()
        .group(Nooks.TAB)
        .food(new Food.Builder()
                .hunger(14)
                .saturation(20.0f)
                .effect(new EffectInstance(Effects.SLOWNESS, 30*20, 0), 1)
                .effect(new EffectInstance(Effects.ABSORPTION, 30*20, 0), 1)
                .effect(new EffectInstance(Effects.NAUSEA, 5*20, 0), 0.1f)
                .build()
        )

        );
    }
}
