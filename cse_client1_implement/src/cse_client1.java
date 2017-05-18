
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Subrata Paul
 */
public class cse_client1 {
    public static void main(String[] args) {
        
        try {
            cse_client1_implement client1=new cse_client1_implement();
            
             Registry r = LocateRegistry.getRegistry(1099);
      
             System.out.println("Registration for client 2 is complete");
        
            
            
        } catch (Exception e) {
     
            System.out.println("Clint1 face error!!!");
        
        }
    }
    
}
