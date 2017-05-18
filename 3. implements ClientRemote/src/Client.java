
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
public class Client implements ClientRemote{

    
    public Client() throws RemoteException
    {
        super();
    }
    @Override
    public void dosomething() throws RemoteException {
    System.out.println("Server invoked doSomething()");
    
    }
    
    
}
