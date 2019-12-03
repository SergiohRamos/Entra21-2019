import java.util.Scanner;

public class ExecCalk {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double Num1Var;
		double Num2Var;
		String ope = "";
		double res = 0;
		// entrada
		System.out.println("Digite o 1º numero:");
		Num1Var = s.nextDouble();
		System.out.println("Digite o 2º numero:");
		Num2Var = s.nextDouble();
		System.out.println("Qual operação você deseja:");
		ope = s.next();

		// processamento

		calk k = new calk(Num1Var, Num2Var);
		boolean calculou = true;
		switch (ope) {
		case "+":
			res = k.soma();
			break;
		case "-":
			res = k.subtrair();
			break;
		case "*":
			res = k.multiplicar();
			break;
		case "/":
			res = k.dividir(1);
			break;
			default:
				System.out.println("Operação invalida");
				calculou = false;
		}
		System.out.println("Resultado: " + res);

		s.close();
	}	
}
