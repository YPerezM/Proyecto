
package Clases;

import java.io.FileNotFoundException;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, SQLException {
        Menu a = new Menu();
     
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        a.insertarInicio();
       
      
    }
}
/*=============================================================================*/