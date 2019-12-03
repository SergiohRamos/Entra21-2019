import java.util.Scanner;

public class letraporletra {

	public static void main(String[] args) {
		//Escrever uma palavra e ler letra por letra

		
		Scanner s = new Scanner(System.in);
		String palavra = "";				
		System.out.println("Digite uma palavra");
		palavra = s.next();
		for(int i=0;i<palavra.length();i++){
		System.out.println(palavra.substring(0,i+1));
		}
		
		
		
		s.close();
	}

}
