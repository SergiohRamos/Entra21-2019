
import java.util.Scanner;

public class BrasilNumberOne {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Manda o primeiro numero INTEIRO");
		int A = s.nextInt();		
		System.out.println("Manda o segundo numero INTEIRO");
		int B = s.nextInt();
		System.out.println("Manda o terceiro numero INTEIRO");
		int C = s.nextInt();	
		
		
		if (A > B && A> C  ){
			System.out.println(A +" � maior fei");
			
		}else if (B > A && B > C ){
			System.out.println(B+" � maior bro ");
							
		}else{
			System.out.println(C +" � o mais grande");
		}s.close();
						
}		
}