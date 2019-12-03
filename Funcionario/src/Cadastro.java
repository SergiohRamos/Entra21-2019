import java.util.Date;
import java.util.Scanner;
public class Cadastro {
				
	//Atributos
	int 		Cadastro;
	String 		CPF;
	String 		Nome;
	Date 		DataNasc;
	double 		ValorHora;
	double 		HorasTrab;
	double 		SalBruto;
	double 		SalLiquido;
	double 		SalFamilia;
	double 		DescINSS;
	boolean	 	PrevPvd;
	double 		ValorPrevPvd;
	
	
	
	//construtor
	Cadastro (int Cadastro,
			  String Nome,
			  String CPF,
			  Date DataNasc,
			  double ValorHora,
			  double HorasTrab){
		this.Cadastro = Cadastro;
		this.Nome = Nome;
		this.CPF = CPF;
		this.DataNasc = DataNasc;
		this.ValorHora = ValorHora;
		this.HorasTrab = HorasTrab;
		this.SalBruto = ValorHora * HorasTrab;
	}
			
			  
			  
	
		
	}
 