package com.hirschbok.nooks.items;

import com.hirschbok.nooks.Nooks;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PowderedBeetroot extends Item {
    public PowderedBeetroot() {
        super(new Item.Properties()
            .group(Nooks.TAB)
            .food(new Food.Builder()
                    .hunger(4)
                    .saturation(14.4f)
                    .effect(new EffectInstance(Effects.HASTE, 300, 1), 1)
                    .effect(new EffectInstance(Effects.BLINDNESS, 5*20, 1), .20f)
                    .setAlwaysEdible()
            .build()
            )
        );
    }
}