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
package com.theisleoffavalon.chatterbox;

/**
 * Interface that people extend if they want to get chat messages
 * from the server.
 * @author SgtHotshot09
 *
 */
public interface ChatRelay {

    /**
     * This method is called when a message has arrived from Forge/Minecraft
     * @param message A String that holds the message.
     */
    public void chatHasArrived(String message);
    
}