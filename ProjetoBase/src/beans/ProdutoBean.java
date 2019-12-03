package beans;

public class ProdutoBean {

	//Atributos que a tabela do banco terá
	private int codigo;
	private String produto;
	private double valor;
	
	//Set e Get
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
