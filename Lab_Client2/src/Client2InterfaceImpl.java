 
 
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Client2InterfaceImpl  extends UnicastRemoteObject implements Client1Interface{
    
    public Client2InterfaceImpl()throws RemoteException{
        super();
    }

    
    @Override
    public void sayHello(String message) throws RemoteException {
         System.out.println(message+" to client2.");
        }

    @Override
    public int add(int a, int b) throws RemoteException {
         
    return a+b;
    }

    @Override
    public int mul(int a, int b) throws RemoteException {
         return a*b;
    }
}
