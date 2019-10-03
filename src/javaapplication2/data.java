/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class data {
    public  static ArrayList<user> userList = new ArrayList<user>();
    public static  void load(){
        userList.add(new user(1,"a1","a","a","a","a","a",72,180));
         userList.add(new user(2,"a2","a","a","a","a","a",72,180));
          userList.add(new user(3,"a3","a","a","a","a","a",72,180));
    }
    public static void save() {
         
    }
    
        
    
}
