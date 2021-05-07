import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.RowSetEvent;  
import javax.sql.RowSetListener;  
import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider;  

class ProveDB2 {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	    
		Class.forName("com.mysql.cj.jdbc.Driver");
		  
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        
		 //String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
		rowSet.setUrl("jdbc:mysql://localhost:3306/test1?serverTimezone=UTC");  
        rowSet.setUsername("root");  
        rowSet.setPassword("");  
                   
        rowSet.setCommand("select * from studenti order by id");  
        rowSet.execute();  
                   
    while (rowSet.next()) {  
                        // Generating cursor Moved event  
                        System.out.print("Id:" + rowSet.getString(1)+"; ");  
                        System.out.print("Cognome:" + rowSet.getString(2)+"; ");  
                        System.out.print("Nome:" + rowSet.getString(3)+"; ");
                        System.out.println();
                        
                }  
                 
        }  

	   
	}