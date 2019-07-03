package me.r3ido101;

import me.r3ido101.Core.Utils;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = Utils.MOD_ID,
        name = Utils.MOD_NAME,
        version = Utils.VERSION
)
public class Main {

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        System.out.println("VimCraft - PreInit");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("VimCraft - Init");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        System.out.println("Your message here");
    }

}
