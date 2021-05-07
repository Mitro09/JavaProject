import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class MySQLConnection2 {
	  public static void main(String[] args) throws ClassNotFoundException {
	    Connection con = null;

	    String url = "jdbc:mysql://localhost:3306/test1?serverTimezone=UTC";
	    String username = "root";
	    String password = "";

	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      con = DriverManager.getConnection(url, username, password);

	      //System.out.println("Connected!");
	      Statement stm = con.createStatement();
	      //stm.executeUpdate("");
	      ResultSet rs = stm.executeQuery("SELECT * FROM studenti ORDER BY cognome");
	      while (rs.next()) {
	    	  System.out.println("ID="+rs.getString(1)+"\t\tCognome="+rs.getString(2)+"\t\tNome="+rs.getString(3));
	      }

	    } catch (SQLException ex) {
	        throw new Error("Error ", ex);
	    } finally {
	      try {
	        if (con != null) {
	            con.close();
	        }
	      } catch (SQLException ex) {
	          System.out.println(ex.getMessage());
	      }
	    }
	  }
	}