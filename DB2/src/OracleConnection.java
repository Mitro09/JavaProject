import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class OracleConnection {
 
 public static void main(String[] args) {
   System.out.println("-------- Test della connessione a Oracle con JDBC ------");
 
   try {
     Class.forName("oracle.jdbc.driver.OracleDriver");
   } catch (ClassNotFoundException e) {
     System.out.println("Driver Oracle JDBC non trovato");
     e.printStackTrace();
     return;
   }
 
   System.out.println("Driver Oracle JDBC trovato!");
   Connection connection = null;
 
   try {
     connection = DriverManager.getConnection(
         "jdbc:oracle:thin:@localhost:1521:XE", "system","tss");
   } catch (SQLException e) {
     System.out.println("Connessione fallita! Guarda lo stacktrace sulla console");
     e.printStackTrace();
     return;
   }
 
   if (connection != null) {
     System.out.println("Conessione stabilita con successo!");
   } else {
     System.out.println("Impossibile stabilire la connessione!");
   }
 }
}