/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author clement
 */
public class Fenetre extends JFrame{
    
    private  JLabel  label ;
    
    public Fenetre(){    
        setSize(300, 300);
        setAlwaysOnTop(true);
        //setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label = new JLabel("COUCOU");
        label.setHorizontalAlignment(JLabel.CENTER);
        JButton b = new JButton("+");

        add(label, BorderLayout.CENTER);  
        add(b, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    public void afficher(String str){
        label.setText(str);
    }
    
    
}