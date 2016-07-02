package websitebuilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kris.kelley
 */
public class Main extends WebsiteBuilder  {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        
       
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
}
