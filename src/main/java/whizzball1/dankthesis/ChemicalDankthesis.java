package whizzball1.dankthesis;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import whizzball1.dankthesis.proxy.ClientProxy;
import whizzball1.dankthesis.proxy.CommonProxy;
import whizzball1.dankthesis.proxy.IProxy;

@Mod("ChemicalDankthesis")
public class ChemicalDankthesis{

    public static IProxy PROXY = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new CommonProxy());

    public ChemicalDankthesis() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent e) {

    }

}
