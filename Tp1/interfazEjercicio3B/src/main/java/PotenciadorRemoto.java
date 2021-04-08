
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PotenciadorRemoto extends Remote {
     public long mostrarResultado() throws RemoteException;
     
    public long square(int nu) throws RemoteException;
    
    public long pow(int num1, int num2) throws RemoteException;
    
   
}