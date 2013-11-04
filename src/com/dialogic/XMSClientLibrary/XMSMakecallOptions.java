/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dialogic.XMSClientLibrary;


/**
 *
 * @author dwolansk
 */
public class XMSMakecallOptions {
    boolean m_cpaEnabled;
    XMSMediaType m_mediaType; 
    boolean m_iceEnabled;
    String m_sdp;
    boolean m_signalingEnabled;
    boolean m_encryptionEnabled;
    /**
     * This will Instantiate and Reset all the values to their defaults
     */
    public XMSMakecallOptions(){
        Reset();
    }
    /**
     * Resets all the contents back to default
     */
    public void Reset(){
        m_cpaEnabled = false;
        m_mediaType = XMSMediaType.AUDIO;
        m_iceEnabled= false;
        m_signalingEnabled = true;
        m_sdp=null;
        m_encryptionEnabled = false;
        
    }
    /**
     * Set if CPA should be enabled on the outbound call
     *  
     * @param a_isEnabled - true or false if it should be enabled
     */
    public void EnableCPA(boolean a_isEnabled){
        m_cpaEnabled=a_isEnabled; 
    }
    
    /**
     * Set if ICE should be enabled on the outbound call
     *  
     * @param a_isEnabled - true or false if it should be enabled
     */
    public void EnableIce(boolean a_isEnabled){
        m_iceEnabled=a_isEnabled; 
    }
    
    /**
     * Set if DTLS should be enabled on the outbound call
     *  
     * @param a_isEnabled - true or false if it should be enabled
     */
    public void EnableEncryption(boolean a_isEnabled){
        m_encryptionEnabled=a_isEnabled; 
    }
    
    /**
     * Set if CPA should be enabled on the outbound call
     *  
     * @param a_isEnabled - true or false if it should be enabled
     */
    public void EnableSignaling(boolean a_isEnabled){
        m_signalingEnabled=a_isEnabled; 
    }
    /**
     * 
     * @param a_sdp  - The SDP to use on the call
     */
    public void setSdp(String a_sdp){
     
        m_sdp = a_sdp;
    }
    
    /**
     * Set Media Type should be enabled on the outbound call
     * @param a_mediaType - AUDIO or VIDEO
     */
    public void SetMediaType(XMSMediaType a_mediaType){
        m_mediaType=a_mediaType;
    }



    
    @Override
    public String toString()
    {
        String RtnStr;

        /**
         * NEED TO DISCUSS THIS SOME MORE
         */
        RtnStr = "MakecallOptions: cpaEnabled="+m_cpaEnabled+
                " mediaType="+m_mediaType+
                " iceEnabled="+m_iceEnabled+
                " encryptionEnabled="+m_encryptionEnabled+
                " signalingEnabled="+m_signalingEnabled;
        
                if(m_sdp != null)
                    RtnStr+=" sdp="+m_sdp;
                

        return RtnStr;
    }

}
