package whizzball1.dankthesis.core;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import whizzball1.dankthesis.block.ModBlocks;
import whizzball1.dankthesis.block.ReceptacleBlock;
import whizzball1.dankthesis.tile.ReceptacleTile;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> e) {
        e.getRegistry().register(new ReceptacleBlock());
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> e) {
        Item.Properties properties = new Item.Properties()
                .group(ItemGroup.BUILDING_BLOCKS);
        e.getRegistry().register(new BlockItem(ModBlocks.receptacleBlock, properties).setRegistryName("firstblock"));
    }

    @SubscribeEvent
    public static void onTileRegistry(final RegistryEvent.Register<TileEntityType<?>> e) {
        e.getRegistry().register(TileEntityType.Builder.create(ReceptacleTile::new, ModBlocks.receptacleBlock).build(null).setRegistryName("receptacle"));
    }
}
