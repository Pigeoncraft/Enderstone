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
import org.enderstone.server.packet.Packet;
import org.enderstone.server.packet.PacketDataWrapper;

public class PacketOutEntityTeleport extends Packet {

	private int entityId;
	private int x;
	private int y;
	private int z;
	private byte yaw;
	private byte pitch;
	private boolean onGround;

	public PacketOutEntityTeleport(int entityId, int x, int y, int z, byte yaw, byte pitch, boolean onGround) {
		this.entityId = entityId;
		this.x = x;
		this.y = y;
		this.z = z;
		this.yaw = yaw;
		this.pitch = pitch;
		this.onGround = onGround;
	}

	@Override
	public void read(PacketDataWrapper wrapper) throws IOException {
		throw new RuntimeException("Packet " + this.getClass().getSimpleName() + " with ID 0x" + Integer.toHexString(getId()) + " cannot be read.");
	}

	@Override
	public void write(PacketDataWrapper wrapper) throws IOException {
		wrapper.writeVarInt(entityId);
		wrapper.writeInt(x);
		wrapper.writeInt(y);
		wrapper.writeInt(z);
		wrapper.writeByte(yaw);
		wrapper.writeByte(pitch);
		wrapper.writeBoolean(onGround);
	}

	@Override
	public int getSize() throws IOException {
		return getVarIntSize(entityId) + (getIntSize() * 3) + 3 + getVarIntSize(getId());
	}

	@Override
	public byte getId() {
		return 0x18;
	}
}
