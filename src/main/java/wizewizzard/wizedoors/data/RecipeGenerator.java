package wizewizzard.wizedoors.data;

import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(Items.BOWL, 4).define('#', ItemTags.PLANKS).pattern("# #").pattern(" # ").unlockedBy("has_brown_mushroom", this.has(Blocks.BROWN_MUSHROOM)).unlockedBy("has_red_mushroom", this.has(Blocks.RED_MUSHROOM)).unlockedBy("has_mushroom_stew", this.has(Items.MUSHROOM_STEW)).save(consumer);

    }
}