
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

 
/**
 *
 * @author Subrata Paul
 */
public class Client2_implementation extends UnicastRemoteObject implements Client1_interface{

    public Client2_implementation() throws RemoteException
    {
     super();
    }
    
    @Override
    public void sayHello(String message) throws RemoteException {
        
        System.out.println(message+" to the client...");
     }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
        
     }

    @Override
    public int mul(int a, int b) throws RemoteException {
    return a+b;
    
    }
    
    
}
