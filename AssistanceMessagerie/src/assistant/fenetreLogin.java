/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assistant;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javafx.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Adim
 */
public class fenetreLogin extends JFrame implements ActionListener{
      private String name = "";
      private String password = "";
      private JButton connexion = new JButton("Connexion");
      private JPanel conteneur = new JPanel();
      
      private String placeholderNom = "Nom de compte";
      private JTextField inputNom = new JTextField(placeholderNom);
      private String placeholderMdp ="Mot de passe";
      private JTextField inputMdp = new JTextField(placeholderMdp);
      private JLabel labelAssistant = new JLabel("Assistance Messagerie");
      public fenetreLogin()
       {
           setTitle("Assistance Messagerie - Login");
           setSize(400,600);
           setResizable(false);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
           
           //input connexion 
           
           
           inputNom.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (inputNom.getText().equals(placeholderNom)) {
                        inputNom.setText("");
                    }
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if (inputNom.getText().isEmpty()) {
                        inputNom.setText(placeholderNom);
                    }
            }
            });
           
           inputMdp.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    if (inputMdp.getText().equals(placeholderMdp)) {
                        inputMdp.setText("");
                    }
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if (inputMdp.getText().isEmpty()) {
                        inputMdp.setText(placeholderMdp);
                    }
                }
                
            });
           
          connexion.setActionCommand("Login");
          connexion.addActionListener(this);
           //Ajouter les éléments de l'interface
           
           labelAssistant.setHorizontalAlignment(JLabel.CENTER);
           
           conteneur.add(labelAssistant);
           conteneur.add(inputNom);
           conteneur.add(inputMdp);
           conteneur.add(connexion);
           setContentPane(conteneur);
            
           
       }
      public void actionPerformed(ActionEvent evt) {
   

  }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        String cmd = e.getActionCommand();
          if (cmd == "Login") {
  
            System.out.println("clique sur connecter");   
            System.out.println("Nom: "+inputNom.getText()+" mdp: "+inputMdp.getText()); 
      
          
        }
    }


}
