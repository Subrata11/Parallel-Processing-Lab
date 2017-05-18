/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
 
/**
 *
 * @author cse
 */
public class Client2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            Client1Interface exportObj = new Client2InterfaceImpl();
            Registry r = LocateRegistry.getRegistry(1099);
              ServerInterface stub = (ServerInterface) r.lookup("rmi://localhost:1099/callback");
              System.out.println(stub.sayHellotoClient());
              stub.registerMe(exportObj, "client 2");
              System.out.println("Registration for client 2 is complete");
        } catch (Exception e) {
            System.out.println("Error in client 1");
        }
    }
    
}
