package whizzball1.dankthesis.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import whizzball1.dankthesis.tile.ReceptacleTile;

import javax.annotation.Nullable;

public class ReceptacleBlock extends Block {

    public ReceptacleBlock() {
        super(Block.Properties.create(Material.IRON));
        setRegistryName("receptacle");
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new ReceptacleTile();
    }

}
