package wizewizzard.wizedoors.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import wizewizzard.wizedoors.WizeMain;

public class EnglishProvider extends LanguageProvider {

    public EnglishProvider(DataGenerator gen) {
        super(gen, WizeMain.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Blocks


        //Items


        //Tabs
        add("itemGroup.wizedoors.wize", "Wize Doors");
    }
}
