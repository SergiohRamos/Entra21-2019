
public class CursoSuperior extends Curso{

	public String CentroAcademico;
	public double PercCotista;
	
	
	public CursoSuperior(String dis, double carg, String prof) {
		super(dis, carg, prof);
		
	}
	//public void listar(String chaveAcesso){
		///if(chaveAcesso.equals("XPTO")){
			//System.out.println(this.getDisciplina());
			//System.out.println(this.getCarga());
			//System.out.println(this.getProfessor());
			//System.out.println(this.CentroAcademico);
			//System.out.println(this.PercCotista);
		//}
	//}

	public String retornaDados(){
		return this.getDisciplina()		+"\n" +
				this.getCarga()	 		+"\n" +
				this.getProfessor()		+"\n" +
				this.CentroAcademico	+"\n" +
				this.PercCotista;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
