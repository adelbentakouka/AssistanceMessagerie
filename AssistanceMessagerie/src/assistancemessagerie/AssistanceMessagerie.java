/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assistancemessagerie;

import common.zdc;
import pkginterface.testroom;
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
    public static void main(String[] args) {
        zdc zoneCommune = new zdc();
        zoneCommune.createRoom("test");
        zoneCommune.createRoom("test2");
        zoneCommune.getListeroom();
        
        for(int i = 0; i < zoneCommune.getListeroom().size();i++)
        {
             System.out.println(zoneCommune.getListeroom().get(i).nom + zoneCommune.getListeroom().get(i).adresse + zoneCommune.getListeroom().get(i).port);
        }
    }
}
