import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class executarfuncionario<xPessoa> {

	public static void main(String[] args) {
		int 		CadastroVar;
		String 		CPFVar;
		String 		NomeVar;
		Date 		DataNasc;
		String		DataNascVar;
		double 		ValorHoraVar;
		double 		HorasTrabVar;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite os dados:");
		CadastroVar = s.nextInt();
		System.out.println("Digite o CPF:");
		CPFVar=s.next();
		System.out.println("Digite o Nome:");
		NomeVar = s.next();
		System.out.println("Digite a data de nascimento:");
		DataNascVar = s.next();
		SimpleDateFormat Formato = new SimpleDateFormat("ddMMyy");
		try {
			DataNasc = Formato.parse(DataNascVar);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Digite o valor recebido por hora:");
		ValorHoraVar= s.nextDouble();
		System.out.println("Digite as Horas trabalhadas:");
		HorasTrabVar= s.nextDouble();
		
		Cadastro Cad = new Cadastro(CadastroVar,CPFVar , NomeVar, null, HorasTrabVar, HorasTrabVar); 
	
	}
		 
			
		
}
