import java.util.Scanner;

public class ExecProduto {

	public static void main(String[] args) {
		Produto xProduto = new Produto (123,"Sabão","Kg",1,10,12,10 );
		xProduto.ListaVenda(10, 5);
		xProduto.ListaCadastro();
		System.out.println(xProduto.AumentoPrecoV(40));
		System.out.println(xProduto.ConsultarPrecoVenda());
		xProduto.Vender(9);
	
	}

}
