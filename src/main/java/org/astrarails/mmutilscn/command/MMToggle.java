package org.astrarails.mmutilscn.command;

import org.astrarails.mmutilscn.MMUtilsCN;
import org.astrarails.mmutilscn.utils.chat.Message;
import net.weavemc.loader.api.command.Command;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class MMToggle extends Command {
    public MMToggle() {
        super("mmtoggle");
    }

    @Override
    public void handle(@NotNull String[] args) {
        try {
            boolean isEnabled = Boolean.parseBoolean(MMUtilsCN.getConfig().getProperty("enabled"));
            MMUtilsCN.getConfig().setProperty("enabled", String.valueOf(!isEnabled));
            Message.sendMessage("成功 " + (isEnabled ? "关闭" : "开启") + " MMUtilsCN!", Message.LEVEL.Log);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
