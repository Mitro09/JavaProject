import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
 
public class OracleConnection2 {
 
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
     String selectSQL =  "SELECT art_descrizione ";
     		selectSQL += "FROM articoli ";
     		selectSQL += "WHERE art_prezzo = (SELECT MAX(art_prezzo) ";
     		selectSQL += "FROM articoli)";
     PreparedStatement preparedStatement = 
           connection.prepareStatement(selectSQL);
     // esecuzione dell'istruzione SELECT
     ResultSet rs = preparedStatement.executeQuery();
      
     while (rs.next()) {
       //String art_cod = rs.getString("art_cod");
       String art_descrizione = rs.getString("art_descrizione");
       //String jobId = rs.getString("job_id");
       System.out.println("Articolo : "+ art_descrizione);
     }
   } 
   catch (SQLSyntaxErrorException e) {
	   System.out.println("Errore nella sintassi SQL");
	   e.printStackTrace();
	   return;
   }
   catch (SQLException e) {
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