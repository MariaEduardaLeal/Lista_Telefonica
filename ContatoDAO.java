import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ContatoDAO {
	public Connection conectaDB() {
		Connection conexao = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/agendatele","root","Xx19%32,");
			
		}catch(ClassNotFoundException e) {
			System.out.println("Problema JDBC Driver " + e);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexao;
		
	}
}
