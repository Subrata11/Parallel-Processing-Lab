import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AttractionsImpl extends UnicastRemoteObject implements Attractions {

    private static final long serialVersionUID = 1L;
    private List<String> attractions = new ArrayList<String>();
    private AttractionListener listener;
 
    protected AttractionsImpl() throws RemoteException {
        super();
    }
 
    @Override
    public void addAttraction(String name) throws RemoteException {
        if (name != null) {
            verifyAttraction(name);
        }
    }

    @Override
    public List<String> showAttractions() throws RemoteException {
        List<String> a = new ArrayList<String>();
        a.addAll(attractions);
        return attractions;
    }

    @Override
    public void addAttractionListener(
                    AttractionListener listener) throws RemoteException {
        this.listener = listener;
    }
 
    private void verifyAttraction(String name) {
        Runnable t = new VerifyThread(name);
        new Thread(t).start();
        System.out.println("Verify Thread started");
    }
 
    private class VerifyThread implements Runnable {

        private String name;
     
        VerifyThread(String name) {
            this.name = name;
        }
     
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println("Finished verifying");
                attractions.add(name);
                if (listener!= null)
                    listener.attractionAdded(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (RemoteException ex) {
                Logger.getLogger(AttractionsImpl.class.getName()).log(Level.SEVERE, null, ex);
            } 
         
        }
     
     
    }
 
}
