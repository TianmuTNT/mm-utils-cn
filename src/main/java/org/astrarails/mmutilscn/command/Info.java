package org.astrarails.mmutilscn.command;

import org.astrarails.mmutilscn.utils.chat.Message;
import net.weavemc.loader.api.command.Command;
import org.jetbrains.annotations.NotNull;

public class Info extends Command {
    public Info() {
        super("mmhelp");
    }

    @Override
    public void handle(@NotNull String[] args) {
        Message.sendMessage("切换: /mmtoggle", Message.LEVEL.Log);
        Message.sendMessage("原作者: imyanice, GitHub: Yan-Jobs; 汉化作者: 天沐TNT, GitHub: TianmuTNT", Message.LEVEL.Log);
    }
}
