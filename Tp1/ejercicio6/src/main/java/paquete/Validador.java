/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.DatabaseMetaData;
import org.bson.Document;
import org.bson.types.ObjectId;


/**
 *
 * @author Julian RP
 */
public class Validador extends UnicastRemoteObject implements ValidadorRemoto{
    
    MongoClientURI uri = new MongoClientURI("mongodb+srv://tp1Distribuidos:julian123@cluster0.rj764.mongodb.net/Ej6?retryWrites=true&w=majority");
    

    public Validador() throws RemoteException{}
    
    @Override
    public boolean validar(String user, String password) throws RemoteException {
        
        try {
            MongoClient mongoClient = MongoClients.create("mongodb+srv://tp1Distribuidos:julian123@cluster0.rj764.mongodb.net/Ej6?retryWrites=true&w=majority");
            MongoDatabase database = mongoClient.getDatabase("Ej6");
            MongoCollection<Document> collection = database.getCollection("Usuarios");
            
            Document query = new Document("user", user).append("password", password);
            Document usuario = collection.find(query).first();
            
            if(usuario == null){
                return false;
            }
            
            System.out.println(usuario.toJson());
        } catch (Exception e) {
            
            System.out.println("Ocurrio un error en la bd");
            System.out.println(e);
            return false;
        }
        return true;
    }
    
}
