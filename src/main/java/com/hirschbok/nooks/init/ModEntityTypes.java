package com.hirschbok.nooks.init;

import com.hirschbok.nooks.Nooks;
import com.hirschbok.nooks.entities.QuartzmiteEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Nooks.MOD_ID);
    public static final RegistryObject<EntityType<QuartzmiteEntity>> QUARTZMITE = ENTITY_TYPES.register("quartzmite",
    () -> EntityType.Builder.create(QuartzmiteEntity::new, EntityClassification.MONSTER)
        .size(.4f, .3f)
        .build(new ResourceLocation(Nooks.MOD_ID, "quartzmite").toString())
    );
}
