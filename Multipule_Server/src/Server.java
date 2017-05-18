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
             r.rebind("rmi://localhost:1099/callback", new ServerInterfaceImpl());
             System.out.println("Server Ok");
        } catch (Exception e) {
             System.out.println("Server Not Ok");
        }
    }
    
}
