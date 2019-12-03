import java.util.Scanner;

public class Jhonson {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qantos números você quer inserir ?");
		int q = s.nextInt();
			
		int  MA1 = -200000000;
		int  ME1 = 2000000000;
		int  con = 0;	
		int  NA;
		int  MA2 = -2000000000;
		int  ME2 =  2000000000;
				
		while( con < q ){			
			System.out.println("manda o "+ (con + 1 )+ "º número");
			NA = s.nextInt();
			con ++;	
			
			if( NA > MA1 ){
				MA2 = MA1;
				MA1 = NA;
							
			}else if(NA > MA2  ){
				MA2 = NA;				
															
			}
			if (NA < ME1){
				ME1 = NA;
				
			}else if (NA<ME2){
				ME2 = NA;
				
			}
		}
		System.out.println("O maior número é: "+ MA1 + " e o segundo maior número é:"+ MA2 +
				" e o menor número é "+ ME1+" e o segundo menor número é:"+ME2);
		
		s.close();
		
		
		
					

		
	}

}
