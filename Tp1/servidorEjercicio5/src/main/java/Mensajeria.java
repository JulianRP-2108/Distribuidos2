
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Mensajeria  extends UnicastRemoteObject  implements MensajeriaRemota{
    
    private String nombreServidor;
    private String respuestaServidor;
    //son expreciones regulares MUY simples pero andan 
    private Pattern patron=Pattern.compile("hola")
                   ,patron2=Pattern.compile("(?)")
                   ,patron3=Pattern.compile("hola|haces?")
                   ,patron4=Pattern.compile("adios|chau")
                   ;
  
    
    
    Mensajeria ()throws RemoteException
    {
     this.nombreServidor="Servi";
    
    }
    

    
     public String responder(String remitente,String mensaje) throws RemoteException{
         
         int opcion;
         String mensajeRecibido=remitente+": "+mensaje+"\n";
        
         
         ///respuestas para comenzar la conversación     
              Matcher mat = patron.matcher(mensaje.toLowerCase());                                                                           
              if (mat.find()){
                  opcion=(int)(Math.random() * 2) + 1;
                 
                  switch(opcion){
                   case 0:
                         this.respuestaServidor="Hola!! ";
                   break; 
   
                  case 1 :
                         this.respuestaServidor="Hola, como estas?";
                    break; 
   
                  case 2 :
                          this.respuestaServidor="Hola,todo bien?";
                   break; 
  
  
                 default : 
                      this.respuestaServidor="no entiendo  ";
                   } 
              } 
              
         ///respuestas para preguntas   
              Matcher mat2 = patron2.matcher(mensaje.toLowerCase());                                                                           
              if (mat2.find()){
                    opcion=(int)(Math.random() * 2) + 1;
                    
                  switch(opcion){
                   case 0:
                         this.respuestaServidor= "ah mira vos...";
                   break; 
   
                  case 1 :
                         this.respuestaServidor="y es todo un tema";
                    break; 
   
                  case 2 :
                          this.respuestaServidor="no se";
                   break; 
  
  
                 default : 
                      this.respuestaServidor="ah mira que bien..";
                   } 
              } 
              /////////////////saludo con pregunta /////////////////////
              
              Matcher mat3 = patron3.matcher(mensaje.toLowerCase());                                                                           
              if (mat3.find()){
                    opcion=(int)(Math.random() * 2) + 1;
                    
                  switch(opcion){
                   case 0:
                         this.respuestaServidor= "jajaj no";
                   break; 
   
                  case 1 :
                         this.respuestaServidor="Hola, como estas?";
                    break; 
   
                  case 2 :
                          this.respuestaServidor="Hola,todo bien?";
                   break; 
  
  
                 default : 
                      this.respuestaServidor="y es todo un tema..";
                   } 
              } 
              
              
              
          ///respuestas para finalizar conversación     
              Matcher mat4 = patron4.matcher(mensaje.toLowerCase());
              if (mat4.find()){
                  opcion=(int)(Math.random() * 2) + 1;
                  switch(opcion){
                 
                  case 1 :
                        this.respuestaServidor=" adios!! ";
                    break; 
   
                  case 2 :
                         this.respuestaServidor="chau ";
                   break; 
   
                  case 3 :
                         this.respuestaServidor="nos vemos!! ";
                   break; 
                  
   
                 default : 
                      this.respuestaServidor="no entien";
                }
              }
              
              
              
        return mensajeRecibido+nombreServidor+": "+this.respuestaServidor+"\n";
         
     };

 
    
}
