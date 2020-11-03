package com.hirschbok.nooks.util;

import com.hirschbok.nooks.Nooks;
import com.hirschbok.nooks.blocks.BlockItemBase;
import com.hirschbok.nooks.blocks.NetheritePowderBlock;
import com.hirschbok.nooks.items.ItemBase;
import com.hirschbok.nooks.items.PowderedBeetroot;
import com.hirschbok.nooks.items.ThanksgivingMeal;
import com.hirschbok.nooks.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Nooks.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Nooks.MOD_ID);

     public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
     }

    // Items
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", ItemBase::new);
    public static final RegistryObject<Item> NETHERITE_POWDER = ITEMS.register("netherite_powder", ItemBase::new);
    public static final RegistryObject<PowderedBeetroot> POWDERED_BEETROOT = ITEMS.register("powdered_beetroot", PowderedBeetroot::new);
    public static final RegistryObject<ThanksgivingMeal> THANKSGIVING_MEAL = ITEMS.register("thanksgiving_meal", ThanksgivingMeal::new);

    // Tools
    public static final RegistryObject<PickaxeItem> NETHERITE_POWDER_PICKAXE = ITEMS.register("netherite_powder_pickaxe", () ->
            new PickaxeItem(ModItemTier.NETHERITEPOWDER, 1, -2.8F, new Item.Properties().group(Nooks.TAB)));


    //Blocks
    public static final RegistryObject<Block> NETHERITE_POWDER_BLOCK = BLOCKS.register("netherite_powder_block", NetheritePowderBlock::new);

    //Block Items
    public static final RegistryObject<Item> NETHERITE_POWDER_BLOCK_ITEM = ITEMS.register("netherite_powder_block", () -> new BlockItemBase(NETHERITE_POWDER_BLOCK.get()));
}
