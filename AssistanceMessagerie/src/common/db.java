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
    public boolean connexion(String _name, String _password)
    {

        boolean valid = false;

        ResultSet rs = sqlObj.open("SELECT password FROM user where username='"+_name+"'");
        try{
            while(rs.next())
            {
                if(rs.getRow() != 0)
                {
                    if(rs.getString("password").equals(_password))
                    {
                        valid = true;
                     }       
                }
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return valid;
    }
    

            
    
}
