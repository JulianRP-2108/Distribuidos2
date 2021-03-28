package paquete;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * HolaMundo
 */
public class HolaMundo extends UnicastRemoteObject implements HolaMundoRemoto{

    protected HolaMundo() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    public String nombre;

    public String saludar(String nombre) throws RemoteException {
        return "Hola "+nombre+"!!";
    }
    
}