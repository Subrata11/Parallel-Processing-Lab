
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CSL-User
 */
public class CallbackServer {
    public static void main(String[] args) {
        try {
            Registry r=LocateRegistry.createRegistry(2000);
            CallbackServerInterface obj=new CallbackServerImpl();
            
            String registryurl="rmi://localhost:2000/callback";
            r.rebind(registryurl, obj);
            System.out.println("Server is Started.........");
        } catch (Exception e) {
             System.out.println("Server is not Started.........");
            
         //   System.err.println(e);
        }
    }
    
}
