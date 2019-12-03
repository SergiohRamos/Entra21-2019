
public class calk {
	// Atributos
	double Num1;
	double Num2;

	// Construtor
	calk(double xNum1, double xNum2) {
		this.Num1 = xNum1;
		this.Num2 = xNum2;
	}

	// Metodos
	double soma() {
		return this.Num1 + this.Num2;
	}

	double subtrair() {
		return this.Num1 - this.Num2;
	}

	double multiplicar() {
		return this.Num1 * this.Num2;
	}

	double dividir(int Num1) {
		if ((this.Num2 + Num1 == 0)) {
			System.out.println("ERRO!!! Imposivel dividir por 0");
			return this.Num1;
		
		} else {
			return this.Num1 / (this.Num2 + Num1);
		}
		

	}
}
