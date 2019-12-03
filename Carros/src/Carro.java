//Criando a classe Carro
public class Carro {
	//Atributos
	String cor;
	String modelo;
	String marca;
	int ano_fabricacao;
	
	//Construtor
	public Carro(String xCor, String xModelo, int xAno_Fabricaçao, String xMarca){
		this.cor = xCor;
		this.modelo = xModelo;
		this.ano_fabricacao = xAno_Fabricaçao;
		this.marca = xMarca;
	}
	
	//Metodos
	void exibirDados(){
		System.out.println("A cor do carro é:" + this.cor);
		System.out.println("Ano de fabricação:" + this.ano_fabricacao);
		System.out.println("A Marca do carro é:" + this.marca);
	}
	
}

class TestarCarro{
	//Inicializando
	public static void main(String[] args){
		//Criando Objeto e Adicionando Atributos
		Carro meuCarro = new Carro("Verde","Fusca",1980,"WF");
		Carro meuCarro2 = new Carro ("Cinza","Belina", 1966,"Ford");
		Carro meuCarro3 =new Carro ("Prata","Fiat 147", 1974,"Fiat");
		
		
		//usar Metodo
		
		meuCarro.exibirDados();
		meuCarro2.exibirDados();
		meuCarro3.exibirDados();
		
	}
}