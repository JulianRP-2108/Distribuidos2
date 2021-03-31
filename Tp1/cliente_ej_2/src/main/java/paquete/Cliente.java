package paquete;

import java.rmi.Naming;



public class Cliente {
    private Cliente() {
    }

    public static void main(String[] args) throws Exception{
        
        FechaHoraRemota fechaRemota = (FechaHoraRemota)Naming.lookup("rmi://localhost:1099/fecha1");
        System.out.println("La fecha del servidor es: "+fechaRemota.dateTime());

    }
}
