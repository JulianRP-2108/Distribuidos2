/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author julian
 */
public interface CalculadoraRemota extends Remote{
    
    public long suma(long a,long b) throws RemoteException;
    public long resta(long a,long b) throws RemoteException;
    public long multiplica(long a,long b) throws RemoteException;
    public long divide(long a,long b) throws RemoteException;
    
}
