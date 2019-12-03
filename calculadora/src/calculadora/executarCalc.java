package calculadora;

public class executarCalc {

	public static void main(String[] args) {
		Calc minhacalc = new Calc(15,"*", 15);	
		System.out.println("Resultado: " + minhacalc.calcular());

	}

}
