
public class Parente extends Pessoa {
	String NomeBaba;
	String grau_parentesco;

	public String grau_parentesco(){
		if(this.grau_parentesco.equalsIgnoreCase("1�Grau")){
			System.out.println("Filho");
		}
		else if (this.grau_parentesco.equalsIgnoreCase("2�Grau")){
			System.out.println("Neto");
			
		}
		return grau_parentesco;
		}
	}