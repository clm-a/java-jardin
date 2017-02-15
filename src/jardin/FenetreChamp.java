/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author clement
 */
public class FenetreChamp extends JFrame{
    
    
    public FenetreChamp(){   
        super("Champ");
        setSize(300, 300);
        setAlwaysOnTop(true);
        //setResizable(false);
        
        Frigo frigo = Frigo.getInstance();
        Jardin jardin = Jardin.getInstance();
        JTable table;
       
              
        table = new JTable(jardin);

        add(table, BorderLayout.CENTER);
          
        BoutonEcouteur b = new BoutonEcouteur("Récolter");
        
        jardin.addTableModelListener(b);
        
        
        // ATTENTION ! CLASSE ANONYME
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             
                // item récolté :
                Recoltable r = jardin.harvest(table.getSelectedRow());
                frigo.add(r);

            }  
        });
        
        
        
        add(b, BorderLayout.SOUTH);
        
        
        
        
        
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        

    }

    
}
