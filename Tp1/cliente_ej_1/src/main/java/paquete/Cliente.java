package paquete;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class Cliente {
    
    private static String nombre;
    
    private Cliente() {
    }

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        
        
        Scanner scaner = new Scanner(System.in);
        
        while(nombre == null){
            try {
                System.out.println("Ingrese su nombre: ");
                nombre = scaner.nextLine();
            } catch (Exception e) {
                scaner.nextLine();      //es como hace un fflush
                System.out.println("Ingrese nombre valido");
            }
        }
        
        
        HolaMundoRemoto saludador1 = (HolaMundoRemoto)Naming.lookup("rmi://localhost:1099/saludador1");
        
        
        System.out.println(saludador1.saludar(nombre));

    }
}
