/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author julian
 */
public class Servidor {
    
    public static void main(String[] args) throws Exception{
        Registry registro = LocateRegistry.createRegistry(1099);
         
         Calculadora cal = new Calculadora();
         
         Naming.rebind("rmi://localhost:1099/calc",cal);
    }
    
}
