
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ConversorMonetario extends UnicastRemoteObject  implements ConversorMonetarioRemoto {
    private  long resultado;
   /// private  long importe;
    private final  long valorDolar;
    
    ConversorMonetario() throws RemoteException { 
        valorDolar=150;
     }
    
    public long mostrarResultado () throws RemoteException{
            return(resultado);
    };
    
    public long PesoDolar (long importe) throws RemoteException{
               resultado=importe/valorDolar;
        return(resultado);
    };
    
    public long DolarPeso (long importe) throws RemoteException{
               resultado=importe*valorDolar;
              return(resultado);
    
    };
    
}
