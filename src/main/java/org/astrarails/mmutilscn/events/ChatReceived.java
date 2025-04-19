package org.astrarails.mmutilscn.events;

import org.astrarails.mmutilscn.MMUtilsCN;
import net.weavemc.loader.api.event.ChatReceivedEvent;
import net.weavemc.loader.api.event.SubscribeEvent;

public class ChatReceived {

    @SubscribeEvent
    public void onChatMessage(ChatReceivedEvent event) {
        if (event.getMessage().getUnformattedText().equals("严禁与杀手联手！") || event.getMessage().getUnformattedText().equals("Teaming with the Murderers is not allowed!")) {
            MMUtilsCN.isInMMClassic = true;
        } if (event.getMessage().getUnformattedText().equals("严禁与侦探/平民联手！") || event.getMessage().getUnformattedText().equals("Teaming with the Detectives/Innocents is not allowed!")) {
            MMUtilsCN.isInMMClassic = true;
        }
    }
}
