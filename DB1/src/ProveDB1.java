import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class ProveDB1 {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	    Connection con = null;

	    String url = "jdbc:mysql://localhost:3306/test1?serverTimezone=UTC";
	    String username = "root";
	    String password = "";
	    Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password);
		
		Statement stmt=con.createStatement(); 
		//stmt.executeUpdate("insert into studenti2 values('12','Ivan','Neri')");
		stmt.executeUpdate("INSERT INTO studenti (cognome, nome) VALUES('Rossini','Laura')");
		ResultSet rs=stmt.executeQuery("select * from studenti order by id");  
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
	    
	    

	   
	  }
	}