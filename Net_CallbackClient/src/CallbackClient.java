import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;


public class CallbackClient implements AttractionListener {


    public void attractionAdded(String attraction)
                                    throws RemoteException {
        System.out.println("Attraction Added:" + attraction);
    }

    public static void main(String args[])  {
        try  {
            AttractionListener client = new CallbackClient();
            System.out.println("Exporting the client");
            UnicastRemoteObject.exportObject(client);    
            String serverURL = "rmi://127.0.0.1:1099/ServerRMI";
            Attractions server =(Attractions)Naming.lookup(serverURL);
            server.addAttractionListener(client);
            String s;
            while (true) {
                System.out.println("Enter new attraction:");
                Scanner sc = new Scanner(System.in);
                s = sc.next();
                if (s != null) {
                    server.addAttraction(s);
                }
            }
                
        } catch (Exception e) {
            System.out.println("Exception occured " +
                                "while adding attraction: " +
                                "\n" + e.getMessage());
        }
    }
}
