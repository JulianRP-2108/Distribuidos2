package paquete;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface FechaHoraRemota extends Remote{
    public String dateTime() throws RemoteException;
    
}
