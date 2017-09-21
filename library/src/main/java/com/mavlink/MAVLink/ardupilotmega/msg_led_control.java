/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LED_CONTROL PACKING
package com.mavlink.MAVLink.ardupilotmega;

/**
* Control vehicle LEDs
*/
public class msg_led_control extends com.mavlink.MAVLink.Messages.MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_LED_CONTROL = 186;
    public static final int MAVLINK_MSG_LENGTH = 29;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LED_CONTROL;


      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Component ID
    */
    public short target_component;
      
    /**
    * Instance (LED instance to control or 255 for all LEDs)
    */
    public short instance;
      
    /**
    * Pattern (see LED_PATTERN_ENUM)
    */
    public short pattern;
      
    /**
    * Custom Byte Length
    */
    public short custom_len;
      
    /**
    * Custom Bytes
    */
    public short custom_bytes[] = new short[24];
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public com.mavlink.MAVLinkPacket pack(){
        com.mavlink.MAVLinkPacket packet = new com.mavlink.MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LED_CONTROL;
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(target_component);
              
        packet.payload.putUnsignedByte(instance);
              
        packet.payload.putUnsignedByte(pattern);
              
        packet.payload.putUnsignedByte(custom_len);


        for (short custom_byte : custom_bytes) {
            packet.payload.putUnsignedByte(custom_byte);
        }
                    
        
        return packet;
    }

    /**
    * Decode a led_control message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(com.mavlink.MAVLink.Messages.MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.target_system = payload.getUnsignedByte();
              
        this.target_component = payload.getUnsignedByte();
              
        this.instance = payload.getUnsignedByte();
              
        this.pattern = payload.getUnsignedByte();
              
        this.custom_len = payload.getUnsignedByte();
              
         
        for (int i = 0; i < this.custom_bytes.length; i++) {
            this.custom_bytes[i] = payload.getUnsignedByte();
        }
                
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_led_control(){
        msgid = MAVLINK_MSG_ID_LED_CONTROL;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_led_control(com.mavlink.MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_LED_CONTROL;
        unpack(mavLinkPacket.payload);        
    }

                
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_LED_CONTROL -"+" target_system:"+target_system+" target_component:"+target_component+" instance:"+instance+" pattern:"+pattern+" custom_len:"+custom_len+" custom_bytes:"+custom_bytes+"";
    }
}
        