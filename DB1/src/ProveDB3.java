import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class ProveDB3 {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	    Connection con = null;

	    String url = "jdbc:mysql://localhost:3306/test1?serverTimezone=UTC";
	    String username = "root";
	    String password = "";
	    Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password);
		
		
		
		Scanner sc = new Scanner(System.in);
		String op;
		int id;
		do {
			System.out.println("I per inserimento");
			System.out.println("C per cancellare");
			System.out.println("L per lettura dati");
			System.out.println("E per uscire da programma");
			System.out.print("\n\nCosa vuoi fare:");
			op = sc.next().toUpperCase();
			
			switch(op) {
				case "C":
					System.out.println("****************************");
					System.out.println("****CANCELLAMENTO DATI******");
					System.out.println("****************************");
					System.out.println("Inserisci ID da cancellare");
					id = sc.nextInt();
					PreparedStatement stmt=con.prepareStatement("delete from studenti where id = ?");
					stmt.setInt(1, id);
					int i=stmt.executeUpdate();
					
					break;
				
				case "I":
					System.out.println("****************************");
					System.out.println("*****INSERIMENTO DATI*******");
					System.out.println("****************************");
					System.out.print("Prego inserire ID:");
					id = sc.nextInt();
					System.out.print("Prego inserire Cognome:");
					String cognome = sc.next();
					System.out.print("Prego inserire Nome:");
					String nome = sc.next();
					
					PreparedStatement stmt2=con.prepareStatement("insert into studenti values(?,?,?)");  
					
					stmt2.setInt(1,id);//1 specifies the first parameter in the query  
					stmt2.setString(2,cognome);
					stmt2.setString(3,nome);
					
					int i2=stmt2.executeUpdate();
					
					System.out.println("\n -->" +i2+" Record inseriti");  
					break;
					
				case "L":
					System.out.println("\n****************************");
					System.out.println("***** LETTURA  DATI  *******");
					System.out.println("****************************");
					
					Statement stmt3=con.createStatement(); 
					//stmt.executeUpdate("insert into studenti values(33,'Irfan','Ivan')"); 
					ResultSet rs=stmt3.executeQuery("select * from studenti order by id");  
					while(rs.next())  
					System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
					break;
					
				case "E":
					break;
					
				default :
					System.out.println("ERRORE");
			}
		} while(op != "E");
		
		System.out.println("Programma chiuso");
		con.close();  
	    
	    

	   
	  }
	}