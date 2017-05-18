
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CSL-User
 */
public interface CallbackServerInterface extends Remote{
    public void RegisterMe(CallbackClient1Interface obj,String name) throws RemoteException;
    public void UnRegisterMe(CallbackClient1Interface obj) throws RemoteException;

    
    
}
