package calculadora;

public class Calc {
	//Atributos.
	double Num1;
	double Num2;
	String Opera��o;
	
	//construtor
	Calc(double xnum1,String xope, double xnum2){
		this.Num1 		= 	xnum1;
		this.Num2 		= 	xnum2;
		this.Opera��o 	= 	xope;
		
	}
	
	
	//metodos
	double calcular(){
		switch(this.Opera��o){
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
			System.out.println("� impossivel dividir algum n�mero por 0!!" );
	}	
			return this.Num1/this.Num2;
	
			
}	
	
}
		