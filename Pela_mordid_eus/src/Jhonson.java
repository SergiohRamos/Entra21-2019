import java.util.Scanner;

public class Jhonson {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qantos n�meros voc� quer inserir ?");
		int q = s.nextInt();
			
		int  MA1 = -200000000;
		int  ME1 = 2000000000;
		int  con = 0;	
		int  NA;
		int  MA2 = -2000000000;
		int  ME2 =  2000000000;
				
		while( con < q ){			
			System.out.println("manda o "+ (con + 1 )+ "� n�mero");
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
		System.out.println("O maior n�mero �: "+ MA1 + " e o segundo maior n�mero �:"+ MA2 +
				" e o menor n�mero � "+ ME1+" e o segundo menor n�mero �:"+ME2);
		
		s.close();
		
		
		
					

		
	}

}
