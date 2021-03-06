/* 
 * Enderstone
 * Copyright (C) 2014 Sander Gielisse and Fernando van Loenhout
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.enderstone.server.packet.play;

import java.io.IOException;
import org.enderstone.server.Main;
import org.enderstone.server.entity.EnderPlayer;
import org.enderstone.server.packet.NetworkManager;
import org.enderstone.server.packet.Packet;
import org.enderstone.server.packet.PacketDataWrapper;

public class PacketInClientSettings extends Packet {

	private String locale;
	private byte renderDistance;
	private byte chatFlags;
	private boolean chatColors;
	private int displayedSkinParts;

	@Override
	public void read(PacketDataWrapper wrapper) throws IOException {
		this.locale = wrapper.readString();
		this.renderDistance = wrapper.readByte();
		this.chatFlags = wrapper.readByte();
		this.chatColors = wrapper.readBoolean();
		this.displayedSkinParts = wrapper.readUnsignedByte();
	}

	@Override
	public void write(PacketDataWrapper wrapper) throws IOException {
		throw new RuntimeException("Packet " + this.getClass().getSimpleName() + " with ID 0x" + Integer.toHexString(getId()) + " cannot be written.");
	}

	@Override
	public int getSize() throws IOException {
		return getStringSize(locale) + 4 + getVarIntSize(getId());
	}

	@Override
	public byte getId() {
		return 0x15;
	}

	@Override
	public void onRecieve(final NetworkManager networkManager) {
		Main.getInstance().sendToMainThread(new Runnable(){

			@Override
			public void run() {
				EnderPlayer player;
				if((player=networkManager.player) == null) return;
				player.clientSettings.chatColors = chatColors;
				player.clientSettings.chatFlags = chatFlags;
				player.clientSettings.locale = locale;
				player.clientSettings.renderDistance = renderDistance;
				player.clientSettings.displayedSkinParts = displayedSkinParts;
			}
		});
	}

	public String getLocale() {
		return locale;
	}

	public byte getRenderDistance() {
		return renderDistance;
	}

	public byte getChatFlags() {
		return chatFlags;
	}

	public boolean getChatColors() {
		return chatColors;
	}
}
