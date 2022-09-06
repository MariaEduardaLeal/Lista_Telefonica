import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ContatoCRUD {
	static ContatoDAO dao = new ContatoDAO();
	static Connection conexao = dao.conectaDB();
	
	//CRUD = Create Read(lista) Update(atualizar) Delet(delete)
	

	

	
	public static void main(String[] args) {
		//criarContato("Beltrano", "1551025815", null);
		//atualizarContato(10, "Aresbaldo", "783298923", "Aresbaldo@gmail.com");
		//atualizarEmailContato(10, "aresbaldo@gmail.com");
		//atualizarNomeContato(10, "Aresbaldo");
		atualizarTelefoneContato(10, "3719283l");
		listarContato();
	}
	
	public static void criarContato(String nome, String telefone, String email) {
		try {
			PreparedStatement prep = conexao.
					prepareStatement("INSERT INTO contato(idcontato , nome, telefone, email ) VALUES (null , ?, ?, ?) ");
			prep.setString(1, nome);
			prep.setString(2, telefone);
			prep.setString(3, email);
			prep.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void listarContato() {
		ResultSet contato;
		
		try {
			contato = conexao.createStatement().
					executeQuery("SELECT * FROM contato");
			while(contato.next()) {
				System.out.println(contato.getInt("idcontato") +" - " +
			                       contato.getString("nome") + "\nNúmero para contato :  "
			                       +contato.getString("telefone")  + "\nEmail para contato : "
			                       +contato.getString("email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void atualizarNomeContato(int idcontato, String nome) {
		//SET telefone = ?, SET email =?
		try {
			PreparedStatement prep = conexao.
					prepareStatement("UPDATE contato SET nome = ?   WHERE idcontato = ?");
			prep.setString(1, nome);
			prep.setInt(2, idcontato);
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void atualizarTelefoneContato(int idcontato, String telefone) {
		try {
			PreparedStatement prep = conexao.
					prepareStatement("UPDATE contato SET telefone = ?  WHERE idcontato = ?");
			prep.setString(1, telefone);
			prep.setInt(2, idcontato);
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void atualizarEmailContato(int idcontato, String email) {
		try {
			PreparedStatement prep = conexao.
					prepareStatement("UPDATE contato SET email = ?   WHERE idcontato = ?");
			prep.setString(1, email);
			prep.setInt(2, idcontato);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void excluirContato(int idcontato) {
		try {
			PreparedStatement prep = conexao.prepareStatement("DELETE from contato WHERE idcontato = ?");
			prep.setInt(1, idcontato);
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	



}
