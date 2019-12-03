package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public Connection conn = null;

	public Conexao() {

		try {
			String userName = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/biblio";
			conn = DriverManager.getConnection(url, userName, password);

		} catch (Exception ex) {
			System.out.println("----------------------------------------------------");
			System.out.println("Cannot connect to database server");
			System.out.println("----------------------------------------------------");
			ex.printStackTrace();
		}
	}

}
