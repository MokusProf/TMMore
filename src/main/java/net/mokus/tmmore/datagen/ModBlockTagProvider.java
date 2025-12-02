package net.mokus.tmmore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.mokus.tmmore.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_WALL)
                .add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_WALL)
                .add(ModBlocks.BLACK_RIVETED_HULL_SMALL_WALL)
                .add(ModBlocks.MAROON_RIVETED_HULL_SMALL_WALL)
                .add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_WALL)
                .add(ModBlocks.NAVY_RIVETED_HULL_SMALL_WALL)
                .add(ModBlocks.WHITE_RIVETED_HULL_SMALL_WALL);
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_SLAB)
                .add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_SLAB)
                .add(ModBlocks.BLACK_RIVETED_HULL_SMALL_SLAB)
                .add(ModBlocks.MAROON_RIVETED_HULL_SMALL_SLAB)
                .add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_SLAB)
                .add(ModBlocks.NAVY_RIVETED_HULL_SMALL_SLAB)
                .add(ModBlocks.WHITE_RIVETED_HULL_SMALL_SLAB);
        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_STAIRS)
                .add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_STAIRS)
                .add(ModBlocks.BLACK_RIVETED_HULL_SMALL_STAIRS)
                .add(ModBlocks.MAROON_RIVETED_HULL_SMALL_STAIRS)
                .add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_STAIRS)
                .add(ModBlocks.NAVY_RIVETED_HULL_SMALL_STAIRS)
                .add(ModBlocks.WHITE_RIVETED_HULL_SMALL_STAIRS);

    }
}
