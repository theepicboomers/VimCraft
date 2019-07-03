package me.r3ido101;

import me.r3ido101.Core.Utils;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.logging.Logger;

@Mod(
        modid = Utils.MOD_ID,
        name = Utils.MOD_NAME,
        version = Utils.VERSION
)
public class Main {

    @Mod.Instance(Utils.MOD_ID)
    private static Logger logger;
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        logger.info("VimCraft - PreInit");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("VimCraft - Init");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        logger.info("VimCraft - Postinit");
    }

}
