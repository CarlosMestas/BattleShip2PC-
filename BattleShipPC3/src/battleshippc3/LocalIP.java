/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshippc3;

import java.net.InetAddress;

/**
 * @author Carlos Mestas
 */
public class LocalIP {
    
    public static String getLocalIPv4() throws Exception{
        InetAddress address = InetAddress.getLocalHost();
        return address.getHostAddress();    
    }
    
}
