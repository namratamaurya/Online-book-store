/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebookstore;

/**
 *
 * @author Namrata
 */
public class User {
    static String name;
    static boolean isAdmin;
   public void setName(String username){
       name=username;
   }
   public void setIsAdmin(boolean isAdmin){
       this.isAdmin=isAdmin;
   }
    
    public String getName(){
        return name;
    }
    public boolean getIsAdmin(){
        return isAdmin;
    }
    
}
