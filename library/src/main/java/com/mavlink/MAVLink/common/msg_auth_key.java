/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AUTH_KEY PACKING
package com.mavlink.MAVLink.common;

/**
* Emit an encrypted signature / key identifying this system. PLEASE NOTE: This protocol has been kept simple, so transmitting the key requires an encrypted channel for true safety.
*/
public class msg_auth_key extends com.mavlink.MAVLink.Messages.MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_AUTH_KEY = 7;
    public static final int MAVLINK_MSG_LENGTH = 32;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AUTH_KEY;


      
    /**
    * key
    */
    public byte key[] = new byte[32];
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public com.mavlink.MAVLinkPacket pack(){
        com.mavlink.MAVLinkPacket packet = new com.mavlink.MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_AUTH_KEY;


        for (byte aKey : key) {
            packet.payload.putByte(aKey);
        }
                    
        
        return packet;
    }

    /**
    * Decode a auth_key message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(com.mavlink.MAVLink.Messages.MAVLinkPayload payload) {
        payload.resetIndex();
              
         
        for (int i = 0; i < this.key.length; i++) {
            this.key[i] = payload.getByte();
        }
                
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_auth_key(){
        msgid = MAVLINK_MSG_ID_AUTH_KEY;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_auth_key(com.mavlink.MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_AUTH_KEY;
        unpack(mavLinkPacket.payload);        
    }

     
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setKey(String str) {
        int len = Math.min(str.length(), 32);
        for (int i=0; i<len; i++) {
            key[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<32; i++) {            // padding for the rest of the buffer
            key[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getKey() {
        String result = "";
        for (int i = 0; i < 32; i++) {
            if (key[i] != 0)
                result = result + (char) key[i];
            else
                break;
        }
        return result;

    }
                         
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_AUTH_KEY -"+" key:"+key+"";
    }
}
        