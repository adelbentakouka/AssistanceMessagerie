/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import client.Client;
import java.io.IOException;
import java.util.ArrayList;
import server.Server;

/**
 *
 * @author p1819346
 */
public class user {
    public static ArrayList Listeports = new ArrayList();
    String nom;
    String prenom;
    int noPhone;
    String mail;
    
    public user(String n,String p, int no,String m)
    {
        nom=n;
        prenom=p;
        noPhone=no;
        mail=m;
    }
    public user(String prenom_, String nom_)
    {
        nom = nom_;
        prenom = prenom_;
    }
    public String getNom()
    {
        return nom+" "+prenom;
    }
}
