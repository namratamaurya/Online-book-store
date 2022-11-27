/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebookstore;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author Namrata
 */
public class OnlineBookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //database connection
        
        
        MainPage mp = new MainPage();
        mp.show();
        LoginPage login = new LoginPage();
        //login.show();
        RegisterPage register = new RegisterPage();
        //register.show();
    
    }
    
}
