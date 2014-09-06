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

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import org.enderstone.server.inventory.ItemStack;
import org.enderstone.server.packet.Packet;

public class PacketOutWindowItems extends Packet{

	private byte windowId;
	private short count;
	private ItemStack[] slotData;
	
	@Override
	public void read(ByteBuf buf) throws IOException {
		throw new RuntimeException("Packet " + this.getClass().getSimpleName() + " with ID 0x" + Integer.toHexString(getId()) + " cannot be read.");
	}
	@Override
	public void write(ByteBuf buf) throws IOException {
		buf.writeByte(windowId);
		buf.writeShort(count);
		
		for(int i = 0; i < count; i++){
			writeItemStack(slotData[i], buf);
		}
	}
	@Override
	public int getSize() throws IOException {
		int stackSize = 0;
		for(int i = 0; i < count; i++){
			stackSize += getItemStackSize(slotData[i]);
		}
		return 1 + getShortSize() + stackSize + getVarIntSize(getId());
	}
	@Override
	public byte getId() {
		return 0x30;
	}
}