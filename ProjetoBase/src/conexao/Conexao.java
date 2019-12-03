package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	//Atributo de conexao
	public Connection conn = null;
	
	//Construtor
	public Conexao() {
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/produtos", "root", "");
		}catch(Exception erro) {}
		
	}
	
}
