/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import server.Server;
import assistancemessagerie.room;

/**
 *
 * @author p1819346
 */
public class zdc {
    private ArrayList<room> Listeroom = new ArrayList<room>();
    private ArrayList<Integer> ports = new ArrayList<Integer>();
    private int listePorts = 3001;
    private String adresseServeur = "127.0.0.1";
    
    
    public void createRoom(String nom)
        {
            room nouvelleRoom = new room(nom,adresseServeur,listePorts);
            Listeroom.add(nouvelleRoom);
            listePorts++;
        }

    public ArrayList<room> getListeroom()
        {
            return Listeroom;
        }

}
