
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
public class CallbackClient4Impl extends UnicastRemoteObject implements CallbackClient1Interface{

    public CallbackClient4Impl() throws RemoteException
    {
        super();
    }
    
    @Override
    public void message(String message) throws RemoteException {
     System.out.println(message+" to client1.");
     }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
     }

    @Override
    public int sub(int a, int b) throws RemoteException {
        return a-b;
     }

    @Override
    public int mul(int a, int b) throws RemoteException {
        return a*b;
     }

    @Override
    public int div(int a, int b) throws RemoteException {
        return a/b;
     }
    
}
