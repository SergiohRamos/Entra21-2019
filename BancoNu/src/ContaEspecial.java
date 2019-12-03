
public class ContaEspecial extends Conta {
	ContaEspecial(int NumeroConta, String TitularConta, double LimiteConta) {//Parametro 1,2 e 3
		super(NumeroConta, TitularConta);
		double bonus = 1.1;
		this.LimiteCredito = LimiteConta * bonus;
		
	}

	private double LimiteCredito;
	public double saldo;

	public double getLimiteCredito() {
		return LimiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		LimiteCredito = limiteCredito;
	}
	
	double getSaldoEspecial() {
		return this.getSaldo() + this.LimiteCredito;
	}
}
