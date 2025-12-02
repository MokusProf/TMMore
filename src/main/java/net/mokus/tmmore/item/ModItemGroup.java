package net.mokus.tmmore.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mokus.tmmore.TMMore;
import net.mokus.tmmore.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup SNOWY_SEASON_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TMMore.MOD_ID,"tmmore_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.KHAKI_RIVETED_HULL_SMALL))
                    .displayName(Text.translatable("itemgroup.tmmore.tmmore"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL);
                        entries.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_PANEL);
                        entries.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_STAIRS);
                        entries.add(ModBlocks.KHAKI_RIVETED_HULL_SMAlL_SLAB);
                        entries.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_WALL);





                    }).build());


    public static void init(){
    }
}
