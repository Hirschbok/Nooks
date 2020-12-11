package com.hirschbok.nooks.items;

import com.hirschbok.nooks.Nooks;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class HolidayHam extends Item {
    public HolidayHam() {
        super(new Properties()
        .group(Nooks.TAB)
        .food(new Food.Builder()
        .meat()
        .hunger(10)
        .saturation(10.0f)
        .effect(new EffectInstance(Effects.STRENGTH, 30*20, 0), 1)
        .build()
        )
        );
    }
}
