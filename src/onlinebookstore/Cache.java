/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebookstore;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Namrata
 */
public class Cache {
    public static User currentUser;
    
   public Cache(User currentUser){
       this.currentUser=currentUser;
   }
   
}

