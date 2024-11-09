import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.AbstractBlock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "cidademod");

    public static final RegistryObject<Block> WORKSHOP_BLOCK = BLOCKS.register("workshop_block", () ->
        new Block(AbstractBlock.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> METAL_BLOCK = BLOCKS.register("metal_block", () ->
        new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
} 