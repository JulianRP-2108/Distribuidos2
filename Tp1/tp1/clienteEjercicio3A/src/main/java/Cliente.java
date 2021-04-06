
import java.rmi.Naming;
import java.util.Scanner;


public class Cliente {
     public static void main (String args[]) throws Exception {
         boolean exit=true;
         int opcion;
         long montoIngresado ;
         ConversorMonetarioRemoto cm = (ConversorMonetarioRemoto)
            Naming.lookup ("rmi://localhost:1099/conversorMonetario");
          
            
              
       
          
               System.out.print("ingrese monto : ");
               Scanner valorEntrada=new Scanner(System.in);
               montoIngresado=valorEntrada.nextInt();
            
               System.out.print("Seleccione una opcion : ");
               System.out.print("Peso Argentino a Dolar -> 1: ");
               System.out.print("Dolar a Peso Argentino -> 2 : ");
               
              Scanner valorEntrada2=new Scanner(System.in);
              opcion=valorEntrada2.nextInt();
              if(opcion==1)
              {
                  
                cm.PesoDolar(montoIngresado);
              }
              else
              {
                 cm.DolarPeso(montoIngresado); 
              }
            
               
          
            System.out.println ("Resultado: " + cm.mostrarResultado());
              
          }
     }

         


