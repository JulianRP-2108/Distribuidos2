package paquete;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FechaHora extends UnicastRemoteObject implements FechaHoraRemota{
    
    protected FechaHora() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public String dateTime() throws RemoteException {
        
        LocalDateTime objetoDateTime = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String resultado = objetoDateTime.format(formateador);
        
        System.out.println("El resultado es: "+resultado);
        
        return resultado;
    }
    
}
