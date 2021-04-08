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
 * @author Julian RP
 */
public class Cliente {
    
    private static String user;
    private static String password;
    
    protected Cliente(){}    
    
    public static void main(String[] args) throws Exception {
        
        //String user = null;
        //String password = null;
        
        Scanner scaner = new Scanner(System.in);
        
        while(user == null){
            try {
                System.out.println("Ingrese el usuario");
                user = scaner.nextLine();
            } catch (Exception e) {
                scaner.nextLine();      //es como hace un fflush
                System.out.println("Ingrese un usuario valido");
            }
        }
        
        while(password == null){
            try {
                System.out.println("Ingrese la contraseña");
                password = scaner.nextLine();
            } catch (Exception e) {
                scaner.nextLine();      //es como hace un fflush
                System.out.println("Ingrese una contraseña valida");
            }
        }
        
        ValidadorRemoto val = (ValidadorRemoto)Naming.lookup("rmi://localhost:1099/val");
        
        try {
            if(val.validar(user,password)){
                System.out.println("Iniciaste sesion!");
            }else{
                System.out.println("Datos incorrectos");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: ");
            System.out.println(e);
        }
    }
}
