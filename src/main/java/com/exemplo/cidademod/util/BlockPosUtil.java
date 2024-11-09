import net.minecraft.core.BlockPos;

public class BlockPosUtil {
    public static BlockPos create(int x, int y, int z) {
        return new BlockPos(x, y, z);
    }
} 