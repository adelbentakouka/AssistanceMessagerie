/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assistant;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;


/**
 *
 * @author p1812244
 */
public class connexionInterface extends Parent {
   
 
    Text assistantMessagerie;
    TextArea nomdecompte;
    
    public connexionInterface()
    {
        assistantMessagerie = new Text();
        assistantMessagerie.setLayoutX(75);
        assistantMessagerie.setLayoutY(25);
        assistantMessagerie.setText("Assistant Messagerie");
        this.getChildren().add(assistantMessagerie); 
        
        nomdecompte = new TextArea();
        nomdecompte.setLayoutX(75);
        nomdecompte.setLayoutY(75);
        nomdecompte.setText("Nom de compte");
        this.getChildren().add(nomdecompte); 
        
        
        
      /*   textToSend= new TextArea();
        textToSend.setLayoutX(50);
        textToSend.setLayoutY(350);
        textToSend.setPrefHeight(100);
        textToSend.setPrefWidth(400);*/
        
      /*
     
        clearBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                //action à effectuer 
                receivedText.getChildren().clear();
            } 

        });
        sendBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent event) {
                //action à effectuer 
                Text temp = new Text();
                temp.setText(textToSend.getText()+"\r\n");
                receivedText.getChildren().add(temp);
                textToSend.clear();
            } 

        });

        
        this.getChildren().add(connected); 
        
        */
      
   

    }
    
}
