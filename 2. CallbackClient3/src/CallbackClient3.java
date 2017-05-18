
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
public class CallbackClient3 {
      public static void main(String[] args) {
        try {
            Registry r=LocateRegistry.getRegistry(2000);
            CallbackClient1Interface obj=new  CallbackClient3Impl();
            String registryurl="rmi://localhost:2000/callback";
            
            CallbackServerInterface server=(CallbackServerInterface) r.lookup(registryurl);
            server.RegisterMe(obj, "client3");
            System.out.println("Register for client 3 is complete");
        } catch (Exception e) {
        }
    }
}
