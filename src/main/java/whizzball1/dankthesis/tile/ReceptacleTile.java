package whizzball1.dankthesis.tile;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import whizzball1.dankthesis.block.ModBlocks;

public class ReceptacleTile extends TileEntity implements ITickableTileEntity {

    public ReceptacleTile() {

        super(ModBlocks.receptacleTile);
    }

    @Override
    public void tick() {

    }
}
