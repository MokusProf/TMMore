package net.mokus.tmmore.block;

import net.minecraft.data.family.BlockFamily;

public interface Family {
        BlockFamily KHAKI_RIVETED = new BlockFamily.Builder(ModBlocks.KHAKI_RIVETED_HULL_SMALL)
                .slab(ModBlocks.KHAKI_RIVETED_HULL_SMAlL_SLAB)
                .stairs(ModBlocks.KHAKI_RIVETED_HULL_SMALL_STAIRS)
                .wall(ModBlocks.KHAKI_RIVETED_HULL_SMALL_WALL)
                .build();
}
