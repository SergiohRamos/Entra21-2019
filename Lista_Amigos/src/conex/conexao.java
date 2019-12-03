package conex;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
public Connection conn = null;
	
	public void Conexao(){
	try{
		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost/lista_amigos";
		conn = DriverManager.getConnection(url, userName, password);
		
	}catch (Exception ex){
		System.err.println("----------------------------------------------------");
		System.err.println("Cannot connect to database server ");
		System.err.println("----------------------------------------------------");
		ex.printStackTrace();
	}
	}
}

