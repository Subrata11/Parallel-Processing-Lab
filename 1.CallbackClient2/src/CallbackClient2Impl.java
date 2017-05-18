
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CSL-User
 */
public class CallbackClient2Impl extends UnicastRemoteObject implements CallbackClient1Interface{
    public CallbackClient2Impl() throws RemoteException{
        
        super();
    }

 
    public void message(String message) throws RemoteException {
        System.out.println(message+" to client1.");
    }

    
    public int add(int a, int b) throws RemoteException {
       return a+b;
    }

  
    public int mul(int a, int b) throws RemoteException {
      return a*b;
    }

 
    public int div(int a, int b) throws RemoteException {
       return a/b;
    }
    
}
