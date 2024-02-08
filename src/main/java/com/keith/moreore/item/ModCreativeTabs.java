package com.keith.moreore.item;


import com.keith.moreore.MoreOre;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreOre.MOD_ID);
    public static final RegistryObject<CreativeModeTab> SAPPHIRE_TAB =
            CREATIVE_MODE_TABS.register("sapphires",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get())).
                            title(Component.translatable("creativeab.sapphires")).
                            displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.SAPPHIRE.get());
                                output.accept(ModItems.RAW_SAPPHIRE .get());
                            }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
