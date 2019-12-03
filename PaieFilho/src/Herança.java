import java.util.Date;

public class Herança {

	public static void main(String[] args) {
		Pai ObjetoPai = new Pai();
		ObjetoPai.Nome = "Josevildo";
		ObjetoPai.DataNascimento= new Date();
		System.out.println(ObjetoPai.Nome);
		System.out.println("-------------------------------------------------");		
		Filho ObjetoFilho = new Filho();
		ObjetoFilho.Nome = "Josevaldo";
		System.out.println(ObjetoFilho.Nome);
		ObjetoFilho.DataNascimento = new Date();
		ObjetoFilho.NomePediatra = "Bia";
		

	}

}
