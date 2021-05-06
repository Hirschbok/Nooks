package com.hirschbok.nooks.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PowderedBeetroot extends Item {
    public PowderedBeetroot() {
        super(new Item.Properties()
            .group(ItemGroup.FOOD)
            .food(new Food.Builder()
                    .hunger(4)
                    .saturation(3)
                    .effect(new EffectInstance(Effects.HASTE, 300, 1), 1)
                    .effect(new EffectInstance(Effects.BLINDNESS, 5*20, 1), .20f)
                    .setAlwaysEdible()
            .build()
            )
        );
    }
}
