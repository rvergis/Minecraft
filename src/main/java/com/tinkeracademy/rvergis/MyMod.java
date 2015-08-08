package com.tinkeracademy.rvergis;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MyMod.MODID, version = MyMod.VERSION)
public class MyMod
{
    public static final String MODID = "rvergis_mymod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	GameRegistry.addShapedRecipe(new ItemStack(Items.apple), new Object[] {"XXX", "XXX", "XXX", 'X', Blocks.leaves});
    }
}
