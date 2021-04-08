
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Servidor {
      public static void main (String args[]) throws Exception {
        
            Registry registro=LocateRegistry.createRegistry(1099);
                 
           Mensajeria mensajeria = new Mensajeria();
            
           Naming.rebind ("rmi://localhost:1099/mensajeria",mensajeria);
}
}
