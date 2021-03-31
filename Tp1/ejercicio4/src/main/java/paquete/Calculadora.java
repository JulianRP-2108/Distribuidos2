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
 * @author julian
 */
public class Calculadora extends UnicastRemoteObject implements CalculadoraRemota{
    
    public Calculadora() throws RemoteException{}

    @Override
    public long suma(long a, long b) throws RemoteException {
        return a+b;
    }

    @Override
    public long resta(long a, long b) throws RemoteException {
        return a-b;
    }

    @Override
    public long multiplica(long a, long b) throws RemoteException {
        return a*b;
    }

    @Override
    public long divide(long a, long b) throws RemoteException {
        
        return a/b;       
    }
    
}
