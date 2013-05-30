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
                "mediaType="+m_mediaType;

        return RtnStr;
    }

}
