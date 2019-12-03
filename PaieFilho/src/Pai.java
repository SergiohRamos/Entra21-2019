import java.util.Date;

public class Pai {
	String Nome;
	Date DataNascimento;
	Date DataCadastro;

	int idade() {
		return 0;
	}

	public Pai() {
		this.DataCadastro = new Date();
		System.out.println("CLASSE 'Pai' -> MÉTODO CONSTRUTOR.");
	}

}
