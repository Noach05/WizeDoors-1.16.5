package wizewizzard.wizedoors.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import wizewizzard.wizedoors.WizeMain;

/* Created by Noah on 12/03/2021 */
public class WItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WizeMain.MODID);

    public static ItemGroup MAIN = new ItemGroup("wizedoors") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };
    /* Item registering example:
    public static RegistryObject<Item> ITEM_NAME = ITEMS.register("item_name", () -> new Item(new Item.Properties().group(WItems.MAIN)));
    */

}
