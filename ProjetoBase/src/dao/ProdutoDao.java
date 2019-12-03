package dao;

import java.sql.PreparedStatement;
import beans.ProdutoBean;
import conexao.Conexao;

public class ProdutoDao {

	//Cadastrar
	public void cadastrar(ProdutoBean p) {
		
		//Obter a conexão
		Conexao c = new Conexao();
		
		//Tentativa
		try {
			
			String sql = "INSERT INTO produtos (DS_PRODUTO, VL_PRECO) VALUES (?, ?)";
			PreparedStatement pstmt = c.conn.prepareStatement(sql);
			pstmt.setString(1, p.getProduto());
			pstmt.setDouble(2, p.getValor());
			pstmt.execute();
			
		}catch(Exception e) {}
		
	}
	
}
