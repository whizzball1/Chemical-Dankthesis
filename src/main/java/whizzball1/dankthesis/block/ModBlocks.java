package whizzball1.dankthesis.block;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;
import whizzball1.dankthesis.tile.ReceptacleTile;

public class ModBlocks {

    @ObjectHolder("dankthesis:receptacle")
    public static ReceptacleBlock receptacleBlock;

    @ObjectHolder("dankthesis:receptacle")
    public static TileEntityType<ReceptacleTile> receptacleTile;
}
