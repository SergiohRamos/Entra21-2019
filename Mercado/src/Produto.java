
public class Produto {
	// Atributos!
	int Codigo;
	String Descricao;
	String UnidadeMedida;
	double EstoqueMin;
	double EstoqueAtual;
	double PrecoVenda;
	double PrecoCompra;
	int Percentual;
	int Venda;

	// Construtor

	public Produto(int cod, String desc, String um, double em, double ea, double pv, double pc) {
		System.out.println("METODO - CONSTRUTOR");
		this.Codigo = cod;
		this.Descricao = desc;
		this.UnidadeMedida = um;
		this.EstoqueMin = em;
		this.EstoqueAtual = ea;
		this.PrecoVenda = pv;
		this.PrecoCompra = pc;
	}

	// Métodos
	double AumentoPrecoV(double Percentual) {
		return this.PrecoVenda * Percentual / 100;
	}

	double ConsultarPrecoVenda() {
		return this.PrecoVenda;

	}

	double consultarEstuquetual() {
		return this.EstoqueAtual;
	}

	void aumentoPrecoVenda(double Percentual) {
		this.PrecoVenda = this.PrecoVenda + (this.PrecoVenda * Percentual / 100);

	}

	void ListaVenda(double qtd, double preco) {
		System.out.println("**********************************");
		System.out.println("cód-Descrição-Punit---PTotal");
		System.out.println(this.Codigo + "-" + this.Descricao + "-" + this.PrecoVenda + "" + qtd + "" + preco);

	}

	void ListaCadastro() {
		System.out.println(this.Codigo);
		System.out.println(this.Descricao);
		System.out.println(this.UnidadeMedida);
		System.out.println(this.EstoqueMin);
		System.out.println(this.EstoqueAtual);
		System.out.println(this.PrecoVenda);
		System.out.println(this.PrecoCompra);
	}

	void Vender(double QtdCompra) {
		double precoTotal = 0;
		if (this.EstoqueAtual >= QtdCompra) {
			precoTotal = QtdCompra * this.PrecoVenda;
			this.EstoqueAtual -= QtdCompra;
			this.ListaVenda(QtdCompra, precoTotal);
		} else {
			System.out.println("Estoque insuficiente do produto" + this.Descricao);
		}
	}
}
