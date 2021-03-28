package paquete;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Hello world!
 */
public final class Cliente {
    private Cliente() {
    }

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        
        
        HolaMundoRemoto saludador1 = (HolaMundoRemoto)Naming.lookup("rmi://localhost:1099/saludador1");
        System.out.println(saludador1.saludar("Julian"));

    }
}
