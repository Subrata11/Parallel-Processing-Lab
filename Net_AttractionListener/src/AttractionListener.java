import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AttractionListener extends Remote {
    public void attractionAdded(String attraction) throws RemoteException;
}