import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EventoCRUD {
	static ContatoDAO dao = new ContatoDAO();
	static Connection conexao = dao.conectaDB();
	
	
	public static void main(String[] args) {
		
		listarEvento();
	}
	
	
	
	public static void criarEvento( String descricao, String data_evento) {
		try {
			PreparedStatement prep = conexao.
					prepareStatement("INSERT INTO evento(idevento , data_evento, descricao ) VALUES (null , ?, ?)");
			prep.setString(1, data_evento);
			prep.setString(2, descricao);
			prep.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void listarEvento() {
		ResultSet evento ;
		
		try {
			evento = conexao.createStatement().
					executeQuery("SELECT * FROM evento");
			while(evento.next()){
				System.out.println(evento.getInt("idevento") + " - "+ "\nData do evento : "+
						          evento.getDate("data_evento") + " " + "\nDecrição do evento : "+
			                      evento.getString("descricao")
						);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	public static void atualizarDescricaoEvento(int idevento, String descricao) {
		try {
			PreparedStatement prep = conexao.
					prepareStatement("UPDATE evento SET descricao = ?  WHERE idevento = ?");
			prep.setString(1, descricao);
			prep.setInt(2, idevento);
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void atualizarDataEvento(int idevento, String data) {
		try {
			PreparedStatement prep = conexao.
					prepareStatement("UPDATE evento SET data_evento = ?  WHERE idevento = ?");
			prep.setString(1, data);
			prep.setInt(2, idevento);
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void deletarEvento(int idevento) {
		try {
			PreparedStatement prep = conexao.prepareStatement("DELETE from evento WHERE idevento = ?");
			prep.setInt(1, idevento);
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
