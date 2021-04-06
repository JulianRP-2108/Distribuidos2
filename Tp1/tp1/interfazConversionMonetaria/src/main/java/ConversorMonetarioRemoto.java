
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ConversorMonetarioRemoto extends Remote {
    public long mostrarResultado () throws RemoteException;
    
    public long PesoDolar (long importe) throws RemoteException;
    
    public long DolarPeso (long importe) throws RemoteException;
    
}
