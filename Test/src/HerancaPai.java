import java.util.Scanner;

public class HerancaPai {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner (System.in);
		Pessoa ObjPessoa = new Pessoa();
		System.out.println("Digite o nome da Pessoa:");
		ObjPessoa.Nome = s.next();
		System.out.println("Digite o CPF da Pessoa:");
		ObjPessoa.cpf = s.next();
		System.out.println("idade:");
		ObjPessoa.Idade = s.nextInt();
		System.out.println("Altura:");
		ObjPessoa.Altura = s.nextDouble();
		System.out.println("Peso");
		ObjPessoa.Peso = s.nextDouble();
		
		System.out.println("********************************************************");
		
		Parente ObjParente = new Parente();
		System.out.println("Digite o nome do PARENTE:");
		ObjParente.Nome = s.next(); 
		System.out.println("Digite o CPF do PARENTE");;
		ObjParente.cpf = s.next();
		System.out.println("Idade do PARENTE:");
		ObjParente.Idade = s.nextInt();
		System.out.println("Altura do PARENTE:");
		ObjParente.Altura = s.nextDouble();
		System.out.println("Peso do PARENTE");
		ObjParente.Peso = s.nextDouble();
		System.out.println("Baba do PARENTE:");
		ObjParente.NomeBaba = s.next();
		System.out.println("Digite seu grau de parentesco"
				+ " 1º = Filho/ 2º = Neto:");
		ObjParente.grau_parentesco = s.next();
		System.out.println(ObjParente.grau_parentesco);
		System.out.println("Você é parente " + ObjPessoa.Nome);
		
		
		s.close();
	}

	

}
