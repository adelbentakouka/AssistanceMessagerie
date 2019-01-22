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
    
   /*  static MySQL sqlObj = new MySQL();
     
    public static void main(String[] args)
     {
        ResultSet rs = sqlObj.open("SELECT * FROM user");
        try{
            System.out.println(rs.getFetchSize());

            while(rs.next()){
                System.out.println(rs.getString("username")+" "+
                        rs.getString("password"));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
     }/*
    public ArrayList connexion(String _name, String _password)
    {
        ResultSet rs = sqlObj.open("SELECT password FROM user where username="+_name);
        try{
            while(rs.next()){
               
                System.out.println(rs.getString("username")+" "+
                        rs.getString("password"));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }*/
            
    
}
