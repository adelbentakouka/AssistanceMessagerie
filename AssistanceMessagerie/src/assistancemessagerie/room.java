/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assistancemessagerie;

import server.Server;

/**
 *
 * @author p1819346
 */
public class room {
    String nom;
    String adresse;
    int port;
    
    public room(String n,String a,int p)
    {
        adresse = a;
        nom = n;
        port = p;
        createRoom();
    }
    
    public void createRoom()
    {
        
        Server server = new Server(port);
        System.out.println("Room "+nom+" créée.");
        
    }
    
    public int getPort()
    {
        return port;
    }
    
}
