/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package necorlibrary;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Daniel Mwaba Mwale
 */
public class NecorLibrary {
    
    // temp stub label to display status of events. 
    JLabel status;
    
    // constructor
    NecorLibrary(){
    // Top-level frame to house main menu components
    JFrame mainMenu = new JFrame("NECOR LibSys");
    
    mainMenu.setLayout(new FlowLayout());
    // inital size, 300 x 300
    mainMenu.setSize(300,300);
    
    // terminate program when user closes the application
    mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Necor main menu label
    JLabel necorLabel = new JLabel("NECOR LibSys Main Menu");
    
    // add Necor label to frame
    mainMenu.add(necorLabel);
    
    /** Buttons
     * Books
     * Users
     * Reports
    */
    JButton btnBooks = new JButton("Books");
    JButton btnLibPats = new JButton("Library Patrons");
    JButton btnReports = new JButton("Reports");
    
    // add ActionListeners to buttons
    // invoke Books frame from here
    btnBooks.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            status.setText("You selected Books."); // replace this with Books logic
        } // end action performed for btnBooks
    });
    
    // invoke Users frame from here
    btnLibPats.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            status.setText("You selected Library Patrons."); // replace this with LibPats logic
        }
    });
    
    // invoke Reports frame from here
    btnReports.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            status.setText("You selected Reports"); // replace this with Reports logic
        }
    });
    
    // add the buttons to the main menu
    mainMenu.add(btnBooks);
    mainMenu.add(btnLibPats);
    mainMenu.add(btnReports);
    
    // prompt user to choose an option
    status = new JLabel("Choose an option");
    
    // add status above to the main menu
    mainMenu.add(status);
    
    // display the main menu
    mainMenu.setVisible(true);
    } // end constructor
    
    
    // Main Menu

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable(){
        
            public void run(){
                new NecorLibrary();
            }
        });
        
        
    } // end main
    
} // end class NecorLibrary
