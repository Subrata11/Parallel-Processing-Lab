
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CSL-User
 */
public class CallbackServerImpl extends UnicastRemoteObject implements CallbackServerInterface{
    
    Vector<CallbackClient1Interface> clientlist;
    Vector<String> clientname;
public CallbackServerImpl() throws RemoteException{
     super();
    clientlist=new Vector();
    clientname=new Vector();
    
}
    
    public void RegisterMe(CallbackClient1Interface obj, String name) throws RemoteException {
        if (!clientlist.contains(obj)) {
            clientlist.addElement(obj);
            clientname.addElement(name);
            docallbacks(name);
        }
    }

    private void docallbacks(String name) {
         System.out.println("Number of registered client:"+clientlist.size());
        for(int i=0; i<clientname.size(); i++){
            if(clientname.elementAt(i).equalsIgnoreCase(name)){
            
            CallbackClient1Interface obj = (CallbackClient1Interface) clientlist.elementAt(i);
            try {
               if(name.equalsIgnoreCase("client1")) {
                   
                   System.out.println("Add by client 1 : "+obj.add(10, 20));
               }
               else if(name.equalsIgnoreCase("client2")){
                   System.out.println("Multiply by client 2 : "+obj.mul(10, 20));
                   
               }
               else if(name.equalsIgnoreCase("client3")){
                    System.out.println("Division by client 3 : "+obj.div(20, 2));
               }
               
            } catch (Exception e) {
                System.out.println("Message not sending");
            }
           }
 
        }
        
    }
    
}
