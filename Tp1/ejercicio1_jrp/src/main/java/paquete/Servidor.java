package paquete;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public final class Servidor {
    private Servidor() {
    }

    public static void main(String[] args) throws Exception {
        Registry registro = LocateRegistry.createRegistry(1099);
        //System.setProperty("java.rmi.server.hostname","127.0.0.1");

        HolaMundo saludador1 = new HolaMundo();
        HolaMundo saludador2 = new HolaMundo();

        Naming.rebind("rmi://localhost:1099/saludador1",saludador1);
        Naming.rebind("rmi://localhost:1099/saludador2",saludador2);

    }
}
