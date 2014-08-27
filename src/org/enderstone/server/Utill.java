package org.enderstone.server;

import org.enderstone.server.entity.EnderPlayer;
import org.enderstone.server.packet.play.PacketOutChatMessage;

public class Utill {

	public static void broadcastMessage(String message) throws Exception {
		PacketOutChatMessage packet = new PacketOutChatMessage(message, false);
		for (EnderPlayer player : Main.getInstance().onlinePlayers) {
			player.getNetworkManager().sendPacket(packet);
		}
	}

	public static byte calcYaw(float f) {
		int i = (int) f;
		return (byte) (f < i ? i - 1 : i);
	}
}
