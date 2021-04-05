/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.rmi.Naming;

/**
 *
 * @author Julian RP
 */
public class Cliente {
    
    protected Cliente(){}    
    
    public static void main(String[] args) throws Exception {
        
        String user = "julian";
        String password = "julian123";
        
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
