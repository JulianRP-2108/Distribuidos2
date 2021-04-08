
import java.rmi.Naming;
import java.util.Scanner;


public class Cliente {
     public static void main (String args[]) throws Exception {
     
         int opcion;
         long montoIngresado ;
         ConversorMonetarioRemoto cm = (ConversorMonetarioRemoto)
            Naming.lookup ("rmi://localhost:1099/conversorMonetario");
          
               System.out.print("Seleccione una opcion :  \n");
               System.out.print("Peso Argentino a Dolar -> 1\n ");
               System.out.print("Dolar a Peso Argentino -> 2 \n ");
               
                Scanner valorEntrada2=new Scanner(System.in);
                opcion=valorEntrada2.nextInt();
              
              
               System.out.print("ingrese monto : \n");
                Scanner valorEntrada=new Scanner(System.in);
                montoIngresado=valorEntrada.nextInt();
              
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

         


