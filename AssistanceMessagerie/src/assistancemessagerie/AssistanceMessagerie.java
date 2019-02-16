/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assistancemessagerie;

import common.zdc;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import pkginterface.ListRoom;
import pkginterface.interfaceChat;
import pkginterface.interfaceAdmin;
import pkginterface.interfaceUser;

/**
 *
 * @author p1819346
 */
public class AssistanceMessagerie {
    /**
     * @param args the command line arguments
     */
    
    private static interfaceAdmin interfaceAdmin;
    private static ListRoom interfaceListRoom;
    private static interfaceUser interfaceUser;
    private static interfaceChat chat1;
    private static interfaceChat chat2;

    public static void main(String[] args) throws IOException {
        
        zdc zoneCommune = new zdc();
        interfaceAdmin = new interfaceAdmin();
        interfaceListRoom = new ListRoom();
        interfaceUser = new interfaceUser();
        
        //Création des 5 rooms
        zoneCommune.createRoom("Room 1",3020);
        zoneCommune.createRoom("Room 2",3021);
        zoneCommune.createRoom("Room 3",3022);
        zoneCommune.createRoom("Room 4",3023);
        zoneCommune.createRoom("Room 5",3024);
        zoneCommune.createRoom("Room 6",3025);
        zoneCommune.createRoom("Room 7",3026);
        zoneCommune.createRoom("Room 8",3027);
        zoneCommune.createRoom("Room 9",3028);
        zoneCommune.createRoom("Room 10",3029);
        
        //Affichage de la zone de connexion
        interfaceAdmin.setVisible(true);
        interfaceUser.setVisible(true);
        interfaceListRoom.setVisible(false);
        
        
        

        interfaceUser.syncZDC(zoneCommune);
        /*
        chat1 = new interfaceChat("test","127.0.0.1",3020);
        chat2 = new interfaceChat("test1","127.0.0.1",3020);
        chat1.setVisible(true);
        chat2.setVisible(true);
        
       */
 
    }
}
