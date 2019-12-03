
public class Curso {
	// Atributos
	private String Disciplina;
	private double Carga;
	private String Professor;

	// Construtor
	public Curso(String dis, double carg, String prof) {
		this.Disciplina = dis;
		this.Carga = carg;
		this.Professor = prof;
	}

	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}

	public double getCarga() {
		return Carga;
	}

	public void setCarga(double carga) {
		Carga = carga;
	}

	public String getProfessor() {
		return Professor;
	}

	public void setProfessor(String professor) {
		Professor = professor;
	}

}