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
package org.enderstone.server.commands.vanila;

import org.enderstone.server.chat.SimpleMessage;
import org.enderstone.server.commands.Command;
import org.enderstone.server.commands.CommandMap;
import org.enderstone.server.commands.CommandSender;
import org.enderstone.server.commands.SimpleCommand;
import org.enderstone.server.entity.EnderPlayer;

/**
 * Simple /kill command
 * @author ferrybig
 */
public class KillCommand extends SimpleCommand {

	public KillCommand() {
		super("command.enderstone.kill", "kill", CommandMap.DEFAULT_ENDERSTONE_COMMAND_PRIORITY);
	}

	@Override
	public int executeCommand(Command cmd, String alias, CommandSender sender, String[] args) {
		if (sender instanceof EnderPlayer) {
			sender.sendMessage(new SimpleMessage("Killing: "+sender.getName()));
			((EnderPlayer)sender).kill();
		}
		else
		{
			sender.sendMessage(new SimpleMessage("Cannot kill console!"));
		}
		return COMMAND_SUCCES;
	}
}
