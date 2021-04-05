/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Julian RP
 */
public class Validador extends UnicastRemoteObject implements ValidadorRemoto{

    public Validador() throws RemoteException{}
    
    @Override
    public boolean validar(String user, String password) throws RemoteException {
        //buscar en la base de datos y comparar
        return false;
    }
    
}
