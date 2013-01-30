/*
 * DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *                    Version 2, December 2004
 * 
 * Copyright (C) 2004 Sam Hocevar <sam@hocevar.net>
 * 
 * Everyone is permitted to copy and distribute verbatim or modified
 * copies of this license document, and changing it is allowed as long
 * as the name is changed.
 * 
 *            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 * 
 * 0. You just DO WHAT THE FUCK YOU WANT TO.
 */

package com.theisleoffavalon.mcmanager.permission;

/**
 * An implementation of the {@link IPermission} interface specific for
 * commands.
 * 
 * @author Cadyyan
 *
 */
public class CommandPermission extends BasePermission
{
	/**
	 * The block subtype permission node.
	 */
	public static final String BLOCK_PERMISSION_NODE = "block";
	
	/**
	 * Creates a permission node for a command.
	 * 
	 * @param command - the command
	 * @param isAllowed - whether or not the command is allowed
	 */
	public CommandPermission(String command, boolean isAllowed)
	{
		super(BLOCK_PERMISSION_NODE + IPermission.PERMISSION_NODE_DELIMITER + command, isAllowed);
	}
}
