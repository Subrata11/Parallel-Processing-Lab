import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface Attractions extends Remote {
    public void addAttraction(String name) throws RemoteException;
    public List<String> showAttractions() throws RemoteException;
    public void addAttractionListener(AttractionListener listener) throws RemoteException;
}