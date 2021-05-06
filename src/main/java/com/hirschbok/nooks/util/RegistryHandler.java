package com.hirschbok.nooks.util;

import com.hirschbok.nooks.Nooks;
import com.hirschbok.nooks.blocks.BlockItemBase;
import com.hirschbok.nooks.blocks.NetheritePowderBlock;
import com.hirschbok.nooks.items.*;
import com.hirschbok.nooks.tools.ModItemTier;
import io.netty.resolver.DefaultHostsFileEntriesResolver;
import net.minecraft.block.Block;
import net.minecraft.client.audio.Sound;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Nooks.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Nooks.MOD_ID);
    public static DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Nooks.MOD_ID);

     public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
     }

    // Items
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", ItemBase::new);
    public static final RegistryObject<NetheritePowder> NETHERITE_POWDER = ITEMS.register("netherite_powder", NetheritePowder::new);
    public static final RegistryObject<PowderedBeetroot> POWDERED_BEETROOT = ITEMS.register("powdered_beetroot", PowderedBeetroot::new);
    public static final RegistryObject<ThanksgivingMeal> THANKSGIVING_MEAL = ITEMS.register("thanksgiving_meal", ThanksgivingMeal::new);
    public static final RegistryObject<PoweredKelp> POWERED_KELP = ITEMS.register("powered_kelp", PoweredKelp::new);
    public static final RegistryObject<RichBoneMeal> RICH_BONE_MEAL = ITEMS.register("rich_bone_meal", RichBoneMeal::new);
    public static final RegistryObject<HolidayHam> HOLIDAY_HAM = ITEMS.register("holiday_ham", HolidayHam::new);
    public static final RegistryObject<Pollen> POLLEN = ITEMS.register("pollen", Pollen::new);

    // Tools
    public static final RegistryObject<PickaxeItem> NETHERITE_POWDER_PICKAXE = ITEMS.register("netherite_powder_pickaxe", () ->
            new PickaxeItem(ModItemTier.NETHERITEPOWDER, 1, -2.8F, new Item.Properties().group(Nooks.TAB)));


    //Blocks
    public static final RegistryObject<Block> NETHERITE_POWDER_BLOCK = BLOCKS.register("netherite_powder_block", NetheritePowderBlock::new);

    //Block Items
    public static final RegistryObject<Item> NETHERITE_POWDER_BLOCK_ITEM = ITEMS.register("netherite_powder_block", () -> new BlockItemBase(NETHERITE_POWDER_BLOCK.get()));

    //Sounds
    public static final RegistryObject<SoundEvent> COUGH_SOUND = SOUNDS.register
            ("cough_sound", () -> new SoundEvent(new ResourceLocation(Nooks.MOD_ID, "inject_sound")));
}
