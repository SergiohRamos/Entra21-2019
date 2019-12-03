package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Conexao {
	public Connection conn = null;
	
	public Conexao(){
	try{
		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost/biblio";
		conn = DriverManager.getConnection(url, userName, password);
		
	}catch (Exception ex){
		System.err.println("----------------------------------------------------");
		System.err.println("Cannot connect to database server ");
		System.err.println("----------------------------------------------------");
		ex.printStackTrace();
	}
	}
}
