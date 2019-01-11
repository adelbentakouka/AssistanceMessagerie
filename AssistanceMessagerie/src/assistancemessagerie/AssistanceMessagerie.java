/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assistancemessagerie;

import assistant.testroom;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author p1819346
 */
public class AssistanceMessagerie {
    /**
     * @param args the command line arguments
     */
    public user monUtilisateur;
    public List<room> listeSalle = new ArrayList<room>();
    public static void main(String[] args) throws IOException {
        testroom.main(args);
    }
}
