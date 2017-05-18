
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Subrata Paul
 */
public class Client1_implementation extends UnicastRemoteObject implements Client1_interface{

    public Client1_implementation() throws RemoteException
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
