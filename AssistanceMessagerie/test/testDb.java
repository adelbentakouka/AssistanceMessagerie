/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import common.db;
import java.util.ArrayList;
/**
 *
 * @author Adim
 */
public class testDb {
    
    public testDb() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testConnexionBadLogin()
    {
       db database = new db();
        
       ArrayList result = database.connexion("faux", "faux");
       
       assertEquals("false", result.get(0));
    }
    @Test
    public void testConnexion()
    {
       db database = new db();
        
       ArrayList result = database.connexion("Doe", "azerty");
       
       assertEquals("true", result.get(0));
    }
            
}
