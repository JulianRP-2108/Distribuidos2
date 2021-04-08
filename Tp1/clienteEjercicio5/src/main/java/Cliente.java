
import java.rmi.Naming;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Cliente {
     public static void main (String args[]) throws Exception {
     
         String nombreCliente = null,mensajeCliente = "";
         Pattern patron=Pattern.compile("adios|chau");
         
         MensajeriaRemota mensajeria = (MensajeriaRemota) Naming.lookup ("rmi://localhost:1099/mensajeria");
            
            
         System.out.print("Ingrese su nombre  :\n ");
         Scanner valorEntrada=new Scanner(System.in);
         nombreCliente=valorEntrada.nextLine();
         
         System.out.print("Salude al servidor para empezar :\n");
               Matcher mat = patron.matcher(mensajeCliente.toLowerCase());   
               
         while(!mat.find()){
               
             
               Scanner valorEntrada2=new Scanner(System.in);
               mensajeCliente=valorEntrada2.nextLine();

               System.out.println (mensajeria.responder(nombreCliente,mensajeCliente));
               mat = patron.matcher(mensajeCliente.toLowerCase()); 
         } 
     }
}
