package org.astrarails.mmutilscn;

import org.astrarails.mmutilscn.command.Info;
import org.astrarails.mmutilscn.command.MMToggle;
import org.astrarails.mmutilscn.events.ChatReceived;
import org.astrarails.mmutilscn.events.MurdererFinder;
import org.astrarails.mmutilscn.utils.config.Config;
import net.weavemc.loader.api.ModInitializer;
import net.weavemc.loader.api.command.CommandBus;
import net.weavemc.loader.api.event.EventBus;

import java.io.IOException;

public class MMUtilsCN implements ModInitializer {
    public static boolean isInMMClassic;
    private static Config config;
    @Override
    public void preInit() {
        System.out.println("成功加载MMUtilsCN！");
        EventBus.subscribe(new MurdererFinder());
        EventBus.subscribe(new ChatReceived());
        CommandBus.register(new MMToggle());
        CommandBus.register(new Info());
        try {
            config = new Config();
            config.createConfigFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Config getConfig() {
        return config;
    }
    static {
        isInMMClassic = false;
    }
}