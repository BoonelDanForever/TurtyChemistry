package io.github.darealturtywurty.turtychemistry.core.init;

import io.github.darealturtywurty.turtychemistry.TurtyChemistry;
import io.github.darealturtywurty.turtychemistry.common.container.ShaleFracturerContainer;
import io.github.darealturtywurty.turtylib.core.init.AbstractInit;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ContainerInit extends AbstractInit {

    public static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister
            .create(ForgeRegistries.CONTAINERS, TurtyChemistry.MODID);

    public static final RegistryObject<MenuType<ShaleFracturerContainer>> SHALE_FRACTURER = CONTAINERS
            .register("shale_fracturer", () -> new MenuType<>(ShaleFracturerContainer::new));
}
