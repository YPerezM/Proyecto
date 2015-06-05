
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Borja
 */
public class Conectar {
 public Conectar() {
    }
    
    
    Connection conectar=null;
    public Connection conexion(){
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conectar=DriverManager.getConnection("jdbc:derby://localhost:1527/Canciones","root","root");
            System.out.println("conectado");
           

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
        
    }
    
}
