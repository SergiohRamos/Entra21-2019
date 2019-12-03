package calculadora;

public class Calc {
	//Atributos.
	double Num1;
	double Num2;
	String Operação;
	
	//construtor
	Calc(double xnum1,String xope, double xnum2){
		this.Num1 		= 	xnum1;
		this.Num2 		= 	xnum2;
		this.Operação 	= 	xope;
		
	}
	
	
	//metodos
	double calcular(){
		switch(this.Operação){
		case "+":
			return somar();
		case "-":
			return subtrair();
		case"*":
			return multiplicar();
		case "/":
			return dividir();
		default:
			return 0;
			
		}
	}
	
	double somar() {
		
			return this.Num1 + this.Num2;
	}

	double subtrair(){
		
			return this.Num1 - this.Num2;
	}
		
	double multiplicar(){
		
			return this.Num1 * this.Num2;
			
	}
	
	double dividir(){
		if(Num2 == 0){
			System.out.println("É impossivel dividir algum número por 0!!" );
	}	
			return this.Num1/this.Num2;
	
			
}	
	
}
		