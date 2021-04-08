
import java.rmi.Naming;
import java.util.Scanner;


public class Cliente {
    public static void main (String args[]) throws Exception {
     
         String opcion;
         int num1 = 0;
         int num2 = 0;
         
         PotenciadorRemoto potenciador = (PotenciadorRemoto) Naming.lookup ("rmi://localhost:1099/potenciador");
            
             
            
               System.out.print("Seleccione una opcion :\n ");
               System.out.print("Operación de cálculo del cuadrado -> 1:\n");
               System.out.print("Operación de cálculo de potencias -> 2 : \n");
               
               Scanner valorEntrada=new Scanner(System.in);
               opcion=valorEntrada.nextLine();
              if("1".equals(opcion))
              {
               System.out.print("ingrese un numero:\n");
               Scanner valorNum=new Scanner(System.in);
               num1=Integer.parseInt (valorNum.nextLine());
                potenciador.square(num1);
              }
              else
              {
                  System.out.print("ingrese valor de la base : \n");
                  Scanner valorNum1=new Scanner(System.in);
                  num1=Integer.parseInt (valorNum1.nextLine());
                  System.out.print("ingrese valor de la potencia: \n");
                  Scanner valorNum2=new Scanner(System.in);
                  num2=Integer.parseInt (valorNum2.nextLine());
                 potenciador.pow(num1,num2); 
              }
            
     
          
            System.out.println ("Resultado: " + potenciador.mostrarResultado());
              
          }
}
