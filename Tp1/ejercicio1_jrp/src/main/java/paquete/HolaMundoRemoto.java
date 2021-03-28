package paquete;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface HolaMundoRemoto extends Remote{
    
    public String saludar(String nombre) throws RemoteException;
    
}