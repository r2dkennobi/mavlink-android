/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GPS_RTCM_DATA PACKING
package com.mavlink.MAVLink.common;

/**
* WORK IN PROGRESS! RTCM message for injecting into the onboard GPS (used for DGPS)
*/
public class msg_gps_rtcm_data extends com.mavlink.MAVLink.Messages.MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GPS_RTCM_DATA = 233;
    public static final int MAVLINK_MSG_LENGTH = 182;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GPS_RTCM_DATA;


      
    /**
    * LSB: 1 means message is fragmented
    */
    public short flags;
      
    /**
    * data length
    */
    public short len;
      
    /**
    * RTCM message (may be fragmented)
    */
    public short data[] = new short[180];
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public com.mavlink.MAVLinkPacket pack(){
        com.mavlink.MAVLinkPacket packet = new com.mavlink.MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GPS_RTCM_DATA;
              
        packet.payload.putUnsignedByte(flags);
              
        packet.payload.putUnsignedByte(len);


        for (short aData : data) {
            packet.payload.putUnsignedByte(aData);
        }
                    
        
        return packet;
    }

    /**
    * Decode a gps_rtcm_data message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(com.mavlink.MAVLink.Messages.MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.flags = payload.getUnsignedByte();
              
        this.len = payload.getUnsignedByte();
              
         
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_gps_rtcm_data(){
        msgid = MAVLINK_MSG_ID_GPS_RTCM_DATA;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_gps_rtcm_data(com.mavlink.MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_GPS_RTCM_DATA;
        unpack(mavLinkPacket.payload);        
    }

          
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_GPS_RTCM_DATA -"+" flags:"+flags+" len:"+len+" data:"+data+"";
    }
}
        