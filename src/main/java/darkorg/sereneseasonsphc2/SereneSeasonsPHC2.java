package darkorg.sereneseasonsphc2;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("unused")
@Mod("sereneseasonsphc2")

public class SereneSeasonsPHC2 {
    public SereneSeasonsPHC2() {
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    //private void setup(final FMLCommonSetupEvent event) {}
}
