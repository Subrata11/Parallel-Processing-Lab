/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

 
public class Server {
 
    public static void main(String[] args) {
        try {
             Registry r = LocateRegistry.createRegistry(1099);
             ServerInterfaceImpl impl=new ServerInterfaceImpl();
             
             
             r.rebind("rmi://localhost:1099/callback",impl);
             System.out.println("Server is started...");
        } catch (Exception e) {
             System.out.println("Server is not started...");
        }
    }
    
}
