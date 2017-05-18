import java.rmi.Naming;


public class ServerRMI {

    public static void main (String args[] )  {
        try  {
            Attractions attractions = new AttractionsImpl();
            Naming.rebind("ServerRMI", attractions);
            System.out.println("Server started!");
        }
        catch (Exception e)  {
                System.out.println("Exception: " + e);
        }
    }

}