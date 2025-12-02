package net.mokus.tmmore.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mokus.tmmore.TMMore;

public class ModItems {



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TMMore.MOD_ID,name), item);
    }

    public static void init(){
    }
}
