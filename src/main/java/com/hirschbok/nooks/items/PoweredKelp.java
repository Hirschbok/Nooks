package com.hirschbok.nooks.items;

import com.hirschbok.nooks.Nooks;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PoweredKelp extends Item {
    public PoweredKelp() {
        super(new Properties()
        .group(Nooks.TAB)
        .food(new Food.Builder()
                .hunger(2)
                .saturation(0)
                .effect(new EffectInstance(Effects.DOLPHINS_GRACE, 30*20, 0), 1)
                .effect(new EffectInstance(Effects.WATER_BREATHING, 2*20, 0), 1)
                .setAlwaysEdible()
                .build()
        )

        );
    }
}
