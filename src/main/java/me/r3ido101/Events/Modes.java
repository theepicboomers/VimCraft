package me.r3ido101.Events;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class Modes {

//    @SubscribeEvent
//    public void onChat(RenderGameOverlayEvent.Chat e)
//    {
//        if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE))
//        {
//            if (Minecraft.getMinecraft().currentScreen  instanceof GuiChat)
//            {
//
//            }
//        }
//    }
    @SubscribeEvent
    public void test(GuiScreenEvent.KeyboardInputEvent e)
    {
        //checkkeyhere
        if()
        {
            if (Minecraft.getMinecraft().currentScreen  instanceof GuiChat)
            {
                e.setCanceled(true);
            }
        }
    }

}
