/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assistant;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;

/**
 *
 * @author Adim
 */
public class interfaceGraphique extends Application{
    
    @Override
    public void start(Stage stage) throws Exception {
        connexionInterface connexionInterface = new connexionInterface();
        
        Group root = new Group();
        Scene scene = new Scene(root, 300, 400);
        root.getChildren().add(connexionInterface);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
