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
import pkginterface.login;
import pkginterface.testroom;

/**
 *
 * @author p1819346
 */
public class AssistanceMessagerie {
    /**
     * @param args the command line arguments
     */
    private static login interfaceLogin;
    private static ListRoom interfaceListRoom;
    private static testroom interfaceClient;
    public static void main(String[] args) {
        zdc zoneCommune = new zdc();
        interfaceLogin = new login();
      //  interfaceListRoom = new ListRoom();
        interfaceClient = new testroom();
        
        //Création des 5 rooms
        zoneCommune.createRoom("Room 1");
        zoneCommune.createRoom("Room 2");
        zoneCommune.createRoom("Room 3");
        zoneCommune.createRoom("Room 4");
        zoneCommune.createRoom("Room 5");
        zoneCommune.createRoom("Room 6");
        zoneCommune.createRoom("Room 7");
        zoneCommune.createRoom("Room 8");
        zoneCommune.createRoom("Room 9");
        zoneCommune.createRoom("Room 10");
        
        //Affichage de la zone de connexion
        interfaceLogin.setVisible(true);
        interfaceClient.setVisible(true);
  //      interfaceListRoom.setVisible(false);

        
        
       
 
    }
}
