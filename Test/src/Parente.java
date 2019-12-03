
public class Parente extends Pessoa {
	String NomeBaba;
	String grau_parentesco;

	public String grau_parentesco(){
		if(this.grau_parentesco.equalsIgnoreCase("1ºGrau")){
			System.out.println("Filho");
		}
		else if (this.grau_parentesco.equalsIgnoreCase("2ºGrau")){
			System.out.println("Neto");
			
		}
		return grau_parentesco;
		}
	}