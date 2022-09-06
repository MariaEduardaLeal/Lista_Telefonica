import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LigContatoEvento {
	static ContatoDAO dao = new ContatoDAO();
	static Connection conexao = dao.conectaDB();
//	static ContatoCRUD contato =new ContatoCRUD();
//	static EventoCRUD evento = new EventoCRUD();
	public static void main(String[] args) {
		criarLigacao("Eduarda", "jantar dia 13 de agosto");
		listarLigacao();
	}
	
	public static void criarLigacao( String nome, String descricao) {
		try {
			PreparedStatement prep = conexao.prepareStatement("INSERT INTO contato_has_evento(contato_idcontato,evento_idevento,nome, descricao_evento ) VALUES ((idcontato) ,null,?, ?)");
			prep.setString(1, nome);
			prep.setString(2, descricao);
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void listarLigacao() { 
		ResultSet contato_has_evento;
		try {
			contato_has_evento = conexao.createStatement().
					executeQuery("SELECT * FROM contato_has_evento");
			while(contato_has_evento.next()) {
				System.out.println(contato_has_evento.getInt("contato_idcontato")+ "-"
						                                    + ( "evento_idevento") + "\n Você tem um evento no com"
						                                    + ("nome") + " "
						                                    + ("\ndescricao_evento"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
}
