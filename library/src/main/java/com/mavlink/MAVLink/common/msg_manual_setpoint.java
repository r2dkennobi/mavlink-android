/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MANUAL_SETPOINT PACKING
package com.mavlink.MAVLink.common;

/**
* Setpoint in roll, pitch, yaw and thrust from the operator
*/
public class msg_manual_setpoint extends com.mavlink.MAVLink.Messages.MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MANUAL_SETPOINT = 81;
    public static final int MAVLINK_MSG_LENGTH = 22;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MANUAL_SETPOINT;


      
    /**
    * Timestamp in milliseconds since system boot
    */
    public long time_boot_ms;
      
    /**
    * Desired roll rate in radians per second
    */
    public float roll;
      
    /**
    * Desired pitch rate in radians per second
    */
    public float pitch;
      
    /**
    * Desired yaw rate in radians per second
    */
    public float yaw;
      
    /**
    * Collective thrust, normalized to 0 .. 1
    */
    public float thrust;
      
    /**
    * Flight mode switch position, 0.. 255
    */
    public short mode_switch;
      
    /**
    * Override mode switch position, 0.. 255
    */
    public short manual_override_switch;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public com.mavlink.MAVLinkPacket pack(){
        com.mavlink.MAVLinkPacket packet = new com.mavlink.MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MANUAL_SETPOINT;
              
        packet.payload.putUnsignedInt(time_boot_ms);
              
        packet.payload.putFloat(roll);
              
        packet.payload.putFloat(pitch);
              
        packet.payload.putFloat(yaw);
              
        packet.payload.putFloat(thrust);
              
        packet.payload.putUnsignedByte(mode_switch);
              
        packet.payload.putUnsignedByte(manual_override_switch);
        
        return packet;
    }

    /**
    * Decode a manual_setpoint message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(com.mavlink.MAVLink.Messages.MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time_boot_ms = payload.getUnsignedInt();
              
        this.roll = payload.getFloat();
              
        this.pitch = payload.getFloat();
              
        this.yaw = payload.getFloat();
              
        this.thrust = payload.getFloat();
              
        this.mode_switch = payload.getUnsignedByte();
              
        this.manual_override_switch = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_manual_setpoint(){
        msgid = MAVLINK_MSG_ID_MANUAL_SETPOINT;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_manual_setpoint(com.mavlink.MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_MANUAL_SETPOINT;
        unpack(mavLinkPacket.payload);        
    }

                  
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_MANUAL_SETPOINT -"+" time_boot_ms:"+time_boot_ms+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" thrust:"+thrust+" mode_switch:"+mode_switch+" manual_override_switch:"+manual_override_switch+"";
    }
}
        