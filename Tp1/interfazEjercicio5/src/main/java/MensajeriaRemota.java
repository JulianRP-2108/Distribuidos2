
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface MensajeriaRemota extends Remote{
    
      public String responder(String remitente,String mensaje) throws RemoteException;
    
     
}
