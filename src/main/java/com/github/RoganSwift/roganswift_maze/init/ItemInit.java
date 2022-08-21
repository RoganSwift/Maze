package com.github.RoganSwift.roganswift_maze.init;

import com.github.RoganSwift.roganswift_maze.RoganSwift_Maze;
import com.github.RoganSwift.roganswift_maze.items.Maze_Rod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.CreativeModeTab.TAB_MISC;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RoganSwift_Maze.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Maze_Rod> MAZE_ROD = ITEMS.register("maze_rod", () -> new Maze_Rod(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

}
