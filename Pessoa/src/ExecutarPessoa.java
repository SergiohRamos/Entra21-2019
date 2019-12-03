
public class ExecutarPessoa {

	//metodos
	public static void main(String[] args) {
		Pessoa xPessoa = new Pessoa("Sérgio Henrique Ramos", "M",
				                    "hramos.sergio@gmail.com", 17);
		
	
		Pessoa xPessoJuridica = new PessoaJuridica ("Tiba", "M", "Tiburcio@gmail.com",23, "123456789");		
		((PessoaJuridica) xPessoJuridica).ImprimeNomeCNPJ();
		xPessoJuridica.exibirDados();
		Pessoa xPessoaFisica = new PessoaFisica ("Sergio", "M", "sergiohenriqueramos222@gmail.com",18,"169.114.187-15");
		((PessoaFisica) xPessoaFisica).ImprimeNomeCPF();
		xPessoaFisica.exibirDados();
		xPessoa.exibirDados();
		xPessoa.retornaIdade();
		System.out.println(xPessoa.retornaGenero());
	}



	
	

	
	
}
