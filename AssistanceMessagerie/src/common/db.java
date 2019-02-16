/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import static java.lang.System.console;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;

import mySql.MySQL;

/**
 *
 * @author Adim
 */
public class db {
    
    static MySQL sqlObj;
    public db()
    {
        sqlObj = new MySQL();
    }
    public ArrayList connexion(String _name, String _password)
    {

        boolean valid = false; // Code de retour du resultat
  
        //Selectionne tout de l'utilisateur
        ResultSet rs = sqlObj.open("SELECT * FROM user2 where nom='"+_name+"'");
        ArrayList<String> result = new ArrayList();
        try{
            //On regarde le resultat
            while(rs.next())
            {   
                //SI on trouve le nom
                if(rs.getRow() != 0)
                {
                    // Si le mdp entrer = au mdp entrer en bdd
                    if(rs.getString("motdepasse").equals(_password))
                    {
                        // stocker les valeurs 
                        valid = true;
                       // System.out.print(rs.getString("secteur")+" "+rs.getString("prenom"));
                        result.add(0, "code");
                        result.add(1, rs.getString("prenom"));
                        result.add(2, rs.getString("secteur"));
                        
                     }       
                }

            }
            
        }catch(SQLException ex){
            System.out.println(ex);

        }
        //Si on une info dans result on stock la variable de retour
        if(!result.isEmpty())
        {
            result.set(0, Boolean.toString(valid));
        }
        // sinon on ajoute le code de retour
        else 
            result.add(0, Boolean.toString(valid));
        return result;
    }
    

            
    
}
