/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Cliente {
    protected Cliente(){
        
    }
    
    public static void main(String[] args) throws Exception{
        Long op1 = null;
        Long op2 = null;
        Integer oper = null;
        
       Scanner scaner = new Scanner(System.in);
        while(op1 == null){
            try {
                System.out.println("Ingrese el Op1");
                op1 = scaner.nextLong();
            } catch (Exception e) {
                scaner.nextLine();      //es como hace un fflush
                System.out.println("Ingrese un numero valido para op1");
            }
        }
        
        while(op2 == null){
            System.out.println("Ingrese el Op2");
            try {
                op2 = scaner.nextLong();
            } catch (Exception e) {
                scaner.nextLine();      //es como hace un fflush
                System.out.println("Ingrese un numero valido para op2");
            }
        }
        
        System.out.println("Ingrese el nro de la operacion deseada");
        while(oper == null){
            System.out.println("1 - Suma, 2 - Resta, 3 - Multiplica, 4 - Divide");
            try {
                oper = scaner.nextInt();
            } catch (Exception e) {
                scaner.nextLine();      //es como hace un fflush
                System.out.println("Ingrese una operacion valida");
            }
        }
    
        CalculadoraRemota calc = (CalculadoraRemota)Naming.lookup("rmi://localhost:1099/calc");
        
        switch(oper){
            case 1: System.out.println(calc.suma(op1,op2));break;
            case 2: System.out.println(calc.resta(op1,op2));break;
            case 3: System.out.println(calc.multiplica(op1,op2));break;
            case 4: try {
                System.out.println(calc.divide(op1,op2));
            } catch (Exception e) {
                System.out.println("Error: Revise los valores ingresados");
            }
            break;
        }
    }
    
    
    
}
