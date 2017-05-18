
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
public interface Server_interface extends Remote{
    
    public String sayHellotoClient()throws RemoteException;
    public void registerMe(Client1_interface obj, String name)throws RemoteException;
    
}
