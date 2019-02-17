/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import common.Message;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkginterface.interfaceChat;


public class ClientReceive implements Runnable {

    private interfaceChat interfaceChat;

    private Socket socket;
    private ObjectInputStream in;

    public ClientReceive(interfaceChat ic, Socket soc) {
        interfaceChat = ic;
        socket = soc;
    }

    public void run() {
        try {
            
            in = new ObjectInputStream(socket.getInputStream());

            boolean isActive = true;
            while (isActive) {
                Message mess = (Message) in.readObject();
                
                if (mess != null) {
                    interfaceChat.afficherMessage(mess.toString() + "\r\n");  
                } else {
                    isActive = false;
                }
            }
            interfaceChat.disconnect();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
