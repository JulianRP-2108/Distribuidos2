
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Potenciador extends UnicastRemoteObject  implements PotenciadorRemoto {
    
    private  long resultado;
    
    Potenciador() throws RemoteException { 
        this.resultado=0;
     }
    
    
    public long square(int num) throws RemoteException{
        
            this.resultado=num*num;
        
        return resultado;
    };
    
    public long pow(int num1, int num2) throws RemoteException{
        
             this.resultado=(long) Math.pow(num1,num2);
        
        return resultado;
    };

    @Override
    public long mostrarResultado() throws RemoteException {
           
        return  this.resultado;
    }
}
