package wizewizzard.wizedoors;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wizewizzard.wizedoors.data.EnglishProvider;
import wizewizzard.wizedoors.data.RecipeGenerator;
import wizewizzard.wizedoors.items.WItems;

@Mod("wizedoors")
public class WizeMain {

    public static final String MODID = "wizedoors";
    public static final Logger LOGGER = LogManager.getLogger();

    public WizeMain() {
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
    }

    public void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("[WizeDoors] Setup Method registered");
    }

    @SubscribeEvent
    public void onGatherData(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        generator.addProvider(new EnglishProvider(generator));
        generator.addProvider(new RecipeGenerator(generator));
    }

    @SubscribeEvent
    public void onRegisterNewRegistries(RegistryEvent.NewRegistry e) {
        WItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
