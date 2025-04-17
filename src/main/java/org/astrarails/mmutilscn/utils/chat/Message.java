package org.astrarails.mmutilscn.utils.chat;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import org.jetbrains.annotations.NotNull;

public class Message {
    public enum LEVEL {
        Murderer,
        Detective,
        Log,
    }
    public static void sendMessage(@NotNull String message, LEVEL level) {
        switch (level) {
            case Log -> {
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_AQUA + "MM> " + EnumChatFormatting.DARK_GRAY + message));
            }
            case Murderer -> {
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_AQUA + "MM> " + EnumChatFormatting.DARK_RED + message + EnumChatFormatting.DARK_GRAY + " 是一个杀手！"));
            }
            case Detective -> {
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_AQUA + "MM> " + EnumChatFormatting.DARK_AQUA + message + EnumChatFormatting.DARK_GRAY + " 是一个侦探！"));
            }
        }
    }
}
