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
package org.enderstone.server.packet.login;

import java.io.IOException;
import org.enderstone.server.packet.HandshakeState;
import org.enderstone.server.packet.NetworkManager;
import org.enderstone.server.packet.Packet;
import org.enderstone.server.packet.PacketDataWrapper;

public class PacketOutLoginSucces extends Packet {

	private String UUID;
	private String username;

	public PacketOutLoginSucces() {
	}

	public PacketOutLoginSucces(String UUID, String username) {
		this.UUID = UUID;
		this.username = username;
	}

	@Override
	public void read(PacketDataWrapper wrapper) throws IOException {
		throw new RuntimeException("Packet " + this.getClass().getSimpleName() + " with ID 0x" + Integer.toHexString(getId()) + " cannot be read.");
	}

	@Override
	public void write(PacketDataWrapper wrapper) throws IOException {
		wrapper.writeString(UUID);
		wrapper.writeString(username);
	}

	@Override
	public int getSize() throws IOException {
		return getStringSize(username) + getStringSize(UUID) + getVarIntSize(getId());
	}

	@Override
	public byte getId() {
		return 0x02;
	}

	public String getUUID() {
		return UUID;
	}

	public String getUsername() {
		return username;
	}
	
	@Override
	public void onSend(NetworkManager manager)
	{
		manager.getCodex().setState(HandshakeState.PLAY);
	}
}
