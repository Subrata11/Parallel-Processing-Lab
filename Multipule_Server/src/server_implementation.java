
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Stack;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Subrata Paul
 */
public class server_implementation extends UnicastRemoteObject implements Server_interface {

    Vector<Client1_interface> clientList;
    Vector<String> clientName;
    
    
    public server_implementation() throws RemoteException{
    super();
    
    
        clientList = new Vector();
        clientName = new Vector();
     
    }
    
    @Override
    public String sayHellotoClient() throws RemoteException {
        return "Hello from server side and Thanks....";
     }

    @Override
    public void registerMe(Client1_interface obj, String name) throws RemoteException {
        
         if(!clientList.contains(obj)){
        clientList.addElement(obj);
        clientName.addElement(name);
        doCallback(name);
    }
        
          private void doCallback(String name) {
     
        for(int i=0; i<clientName.size(); i++){
            if(clientName.elementAt(i).equalsIgnoreCase(name)){
            
            Client1_interface obj = (Client1_interface) clientList.elementAt(i);
            try {
               if(name.equalsIgnoreCase("client 1")) obj.sayHello("This is message from server ");
               else if(name.equalsIgnoreCase("client 2")){
                   System.out.println("Add by client 2 : "+obj.add(10, 20));
                   
               }
               else if(name.equalsIgnoreCase("client 3")){
                    System.out.println("Multiplied by client 3 : "+obj.mul(10, 20));
               }
               
            } catch (Exception e) {
                System.out.println("Message not sending");
            }
           }
 
        }
    
    
    }
        
     }
    
}
