
public class CadastroVeiculo {

	public static void main(String[] args) {
		Carro ObjetoCarro = new Carro();
		ObjetoCarro.Nome = "Lancer";
		ObjetoCarro.Fabricante = "Mitsubishi";
		ObjetoCarro.Cor = "Prata";
		ObjetoCarro.AnoDeFabricação = 2015;
		ObjetoCarro.QtdPortas = 4;
		ObjetoCarro.QtdRodas = 5;
		System.out.println("Nome: " + ObjetoCarro.Nome);
		System.out.println("Fabricante: " + ObjetoCarro.Fabricante);
		System.out.println("Cor: " + ObjetoCarro.Cor);
		System.out.println("AnoFabricação: " + ObjetoCarro.AnoDeFabricação);
		System.out.println("QtdPortas: " + ObjetoCarro.QtdPortas);
		System.out.println("QtdRodas: " + ObjetoCarro.QtdRodas);
		System.out.println();
		System.out.println("*****************************************************************************");
		
		
		Moto ObjetoMoto = new Moto();
		ObjetoMoto.Nome = "Ninja 400";
		ObjetoMoto.Fabricante = "Kawasaki";
		ObjetoMoto.Cor = "Verde";
		ObjetoMoto.AnoDeFabricação = 1984;
		ObjetoMoto.QtdPortas = 0;
		ObjetoMoto.QtdRodas = 2;
		System.out.println("Nome: " + ObjetoMoto.Nome);
		System.out.println("Fabricante: " + ObjetoMoto.Fabricante);
		System.out.println("Cor: " + ObjetoMoto.Cor);
		System.out.println("AnoFabricação: " + ObjetoMoto.AnoDeFabricação);
		System.out.println("QtdPortas: " + ObjetoMoto.QtdPortas);
		System.out.println("QtdRodas: " + ObjetoMoto.QtdRodas);
		System.out.println();
		System.out.println("*****************************************************************************");
		
		Caminhão ObjetoCaminhão = new Caminhão();		
		ObjetoCaminhão.Nome = "Cargo 816";
		ObjetoCaminhão.Fabricante = "Ford";
		ObjetoCaminhão.Cor = "Vermelho";
		ObjetoCaminhão.AnoDeFabricação = 2013;
		ObjetoCaminhão.QtdPortas = 2;
		ObjetoCaminhão.QtdRodas = 6;
		System.out.println("Nome: " + ObjetoCaminhão.Nome);
		System.out.println("Fabricante: " + ObjetoCaminhão.Fabricante);
		System.out.println("Cor: " + ObjetoCaminhão.Cor);
		System.out.println("AnoFabricação: " + ObjetoCaminhão.AnoDeFabricação);
		System.out.println("QtdPortas: " + ObjetoCaminhão.QtdPortas);
		System.out.println("QtdRodas: " + ObjetoCaminhão.QtdRodas);
		System.out.println();
		System.out.println("*****************************************************************************");
		
		Ônibus ObjetoOnibus = new Ônibus();
		ObjetoOnibus.Nome = "Ônibus";
		ObjetoOnibus.Fabricante = "Mercedes Benz";
		ObjetoOnibus.Cor = "Prata";
		ObjetoOnibus.AnoDeFabricação = 2000;
		ObjetoOnibus.QtdPortas = 3;
		ObjetoOnibus.QtdRodas = 8;
		System.out.println("Nome: " + ObjetoOnibus.Nome);
		System.out.println("Fabricante: " + ObjetoOnibus.Fabricante);
		System.out.println("Cor: " + ObjetoOnibus.Cor);
		System.out.println("AnoFabricação: " + ObjetoOnibus.AnoDeFabricação);
		System.out.println("QtdPortas: " + ObjetoOnibus.QtdPortas);
		System.out.println("QtdRodas: " + ObjetoOnibus.QtdRodas);
		System.out.println();
		System.out.println("*****************************************************************************");
	}

}
