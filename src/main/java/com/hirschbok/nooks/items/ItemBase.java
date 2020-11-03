package com.hirschbok.nooks.items;

import com.hirschbok.nooks.Nooks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(Nooks.TAB));
    }
}
