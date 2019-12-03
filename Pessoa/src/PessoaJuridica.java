
public class PessoaJuridica extends Pessoa {

	public PessoaJuridica(String nome, String sexo, String email, int idade, String cnpj) {
		super(nome, sexo, email, idade);
		System.out.println("CRIANDO PESSOA JURIDICA");
		this.CNPJ = cnpj;
	}

	// Atributos
	String CNPJ;

	// metodos
	public void ImprimeNomeCNPJ() {
		System.out.println("Nome do fornecedor é: " + this.nome + "/nCNPJ: " + this.CNPJ);
		System.out.println("*************************************************************");
		System.out.println();
	}

}
