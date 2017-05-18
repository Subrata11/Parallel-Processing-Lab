
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Subrata Paul
 */
public interface Client1_interface extends Remote{
    
     public void sayHello(String message)throws RemoteException;
     public int add(int a, int b)throws RemoteException;
     public int mul(int a, int b)throws RemoteException;
    
}
