
public class CadastroVeiculo {

	public static void main(String[] args) {
		Carro ObjetoCarro = new Carro();
		ObjetoCarro.Nome = "Lancer";
		ObjetoCarro.Fabricante = "Mitsubishi";
		ObjetoCarro.Cor = "Prata";
		ObjetoCarro.AnoDeFabrica��o = 2015;
		ObjetoCarro.QtdPortas = 4;
		ObjetoCarro.QtdRodas = 5;
		System.out.println("Nome: " + ObjetoCarro.Nome);
		System.out.println("Fabricante: " + ObjetoCarro.Fabricante);
		System.out.println("Cor: " + ObjetoCarro.Cor);
		System.out.println("AnoFabrica��o: " + ObjetoCarro.AnoDeFabrica��o);
		System.out.println("QtdPortas: " + ObjetoCarro.QtdPortas);
		System.out.println("QtdRodas: " + ObjetoCarro.QtdRodas);
		System.out.println();
		System.out.println("*****************************************************************************");
		
		
		Moto ObjetoMoto = new Moto();
		ObjetoMoto.Nome = "Ninja 400";
		ObjetoMoto.Fabricante = "Kawasaki";
		ObjetoMoto.Cor = "Verde";
		ObjetoMoto.AnoDeFabrica��o = 1984;
		ObjetoMoto.QtdPortas = 0;
		ObjetoMoto.QtdRodas = 2;
		System.out.println("Nome: " + ObjetoMoto.Nome);
		System.out.println("Fabricante: " + ObjetoMoto.Fabricante);
		System.out.println("Cor: " + ObjetoMoto.Cor);
		System.out.println("AnoFabrica��o: " + ObjetoMoto.AnoDeFabrica��o);
		System.out.println("QtdPortas: " + ObjetoMoto.QtdPortas);
		System.out.println("QtdRodas: " + ObjetoMoto.QtdRodas);
		System.out.println();
		System.out.println("*****************************************************************************");
		
		Caminh�o ObjetoCaminh�o = new Caminh�o();		
		ObjetoCaminh�o.Nome = "Cargo 816";
		ObjetoCaminh�o.Fabricante = "Ford";
		ObjetoCaminh�o.Cor = "Vermelho";
		ObjetoCaminh�o.AnoDeFabrica��o = 2013;
		ObjetoCaminh�o.QtdPortas = 2;
		ObjetoCaminh�o.QtdRodas = 6;
		System.out.println("Nome: " + ObjetoCaminh�o.Nome);
		System.out.println("Fabricante: " + ObjetoCaminh�o.Fabricante);
		System.out.println("Cor: " + ObjetoCaminh�o.Cor);
		System.out.println("AnoFabrica��o: " + ObjetoCaminh�o.AnoDeFabrica��o);
		System.out.println("QtdPortas: " + ObjetoCaminh�o.QtdPortas);
		System.out.println("QtdRodas: " + ObjetoCaminh�o.QtdRodas);
		System.out.println();
		System.out.println("*****************************************************************************");
		
		�nibus ObjetoOnibus = new �nibus();
		ObjetoOnibus.Nome = "�nibus";
		ObjetoOnibus.Fabricante = "Mercedes Benz";
		ObjetoOnibus.Cor = "Prata";
		ObjetoOnibus.AnoDeFabrica��o = 2000;
		ObjetoOnibus.QtdPortas = 3;
		ObjetoOnibus.QtdRodas = 8;
		System.out.println("Nome: " + ObjetoOnibus.Nome);
		System.out.println("Fabricante: " + ObjetoOnibus.Fabricante);
		System.out.println("Cor: " + ObjetoOnibus.Cor);
		System.out.println("AnoFabrica��o: " + ObjetoOnibus.AnoDeFabrica��o);
		System.out.println("QtdPortas: " + ObjetoOnibus.QtdPortas);
		System.out.println("QtdRodas: " + ObjetoOnibus.QtdRodas);
		System.out.println();
		System.out.println("*****************************************************************************");
	}

}
