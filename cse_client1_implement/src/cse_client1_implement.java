
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
public class cse_client1_implement extends UnicastRemoteObject implements cse_client1_interface {
    
   public cse_client1_implement()throws RemoteException{
        super();
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
    
    
}
