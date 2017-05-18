 
 
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;
import java.util.Vector;
 
 
public class ServerInterfaceImpl extends UnicastRemoteObject implements ServerInterface{
    
    Vector<Client1Interface> clientList;
    Vector<String> clientName;
    
    public ServerInterfaceImpl()throws RemoteException{
        super();
        clientList = new Vector();
        clientName = new Vector();
    }

    @Override
    public String sayHellotoClient() throws RemoteException {
           
    return "Hello from server";
    }

    @Override
    public void registerMe(Client1Interface obj, String name) throws RemoteException {
        
    if(!clientList.contains(obj)){
        clientList.addElement(obj);
        clientName.addElement(name);
        doCallback(name);
    }
    
    }

    private void doCallback(String name) {
     
        for(int i=0; i<clientName.size(); i++){
            if(clientName.elementAt(i).equalsIgnoreCase(name)){
            
            Client1Interface obj = (Client1Interface) clientList.elementAt(i);
            
            try {
               if(name.equalsIgnoreCase("client 1"))
                 
                   obj.sayHello("This is message from server (for Client1)");
               
               else if(name.equalsIgnoreCase("client 2"))
               {
                   System.out.println("Add by client 2 : "+obj.add(10, 20));
                   
               }
               else if(name.equalsIgnoreCase("client 3"))
               {
                    System.out.println("Multiplied by client 3 : "+obj.mul(10, 20));
               }
               
            }
            
            catch (Exception e) 
            
            {
                System.out.println("Message not sending");
            }
           }
 
        }
    
    
    }
    
    
}
