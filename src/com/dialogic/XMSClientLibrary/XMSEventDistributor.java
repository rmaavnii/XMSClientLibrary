/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dialogic.XMSClientLibrary;
/**
 * Logging utility.
 */
import java.util.Stack;
import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author dwolansk
 */
public class XMSEventDistributor implements Runnable{
     
     static Logger m_logger = Logger.getLogger(xmsEventHandler.class.getName());
     protected Stack m_eventlist= new Stack();
     boolean m_keeplooping;
    public XMSEventDistributor() {
        m_logger.info("xmsEventHandler thread created");
     
        m_keeplooping=true;
    }//constructor
    
    public void stopWaitingForEvents(){
        m_keeplooping=false;
    }
    /**
     * This method is called when the thread runs
     */
    public void run() {
        FunctionLogger logger=new FunctionLogger("run",this,m_logger);
        logger.info("xmsEventHandler Thread started.");
        monitorEvents();
    }
    public void monitorEvents(){
        FunctionLogger logger=new FunctionLogger("monitorEvents",this,m_logger);
        while(m_keeplooping){
            if(!m_eventlist.empty()){
                XMSEvent evt = (XMSEvent)m_eventlist.pop();
                evt.getCall().DispatchXMSEvent(evt);
            }
        }
        
    }
    public void AddEventToQueue(XMSEvent a_evt){
        m_eventlist.push(a_evt);
    }
    
}
