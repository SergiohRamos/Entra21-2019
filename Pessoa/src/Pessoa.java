
public class Pessoa {
	private static final boolean InicialMaiusculo = true;
	// Atributos
	String nome;
	String sexo;
	String email;
	int idade;

	// Construtor
	public Pessoa(String nome, String sexo, String email, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.idade = idade;
		System.out.println("ConstrutorPessoa");
	}

	// Metodos
	void exibirDados() {
		System.out.println("O Nome da pessoa é:" + this.nome);
		System.out.println("O Sexo da pessoa é:" + this.sexo);
		System.out.println("O E-mail da pessoa é:" + this.email);
		System.out.println("A Idade da pessoa é:" + this.idade);
		System.out.println(retornaIdade());
		System.out.println("**********************************************************");
		System.out.println();

	}

	int retornaIdade() {
		return this.idade;
	}

	String retornaGenero() {
		String TextoGenero;
		if (this.idade < 13) {
				TextoGenero = "menino";
		} else if (this.idade < 18)
			if (this.sexo.equalsIgnoreCase("F"))
				TextoGenero = "moça";
			else
			if (this.sexo.equalsIgnoreCase("S"))
				TextoGenero = "menina";
			else
				TextoGenero = "rapaz";
		else if (this.sexo.equalsIgnoreCase("F"))
			TextoGenero = "mulher";
		else
			TextoGenero = "homem";

		if (InicialMaiusculo)
			TextoGenero = TextoGenero.substring(0, 1).toUpperCase() + TextoGenero.substring(1);
		return TextoGenero;
	}

}
