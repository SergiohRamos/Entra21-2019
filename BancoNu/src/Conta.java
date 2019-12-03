
public class Conta {
	// Atributos
	public int Numero;
	private String Titular;
	protected double Saldo;
	protected String senha;
	protected String email;
	
	//Construtor
	Conta(int NumeroConta ,String TitularConta ){
		this.Numero = NumeroConta;
		this.Titular = TitularConta;
		
	}
	

	// Metodos

	public String setTitular(String Nome) {
		if (this.ValidaTitular(Nome) >= 8) {
			this.Titular = Nome;
			return null;

		}else{
			return "Nome fora de padrão minmo exigido";
		}

	}

	String getTitular() {
		return this.Titular;
	}

	private int ValidaTitular(String Nome) {
		return Nome.length();
	}

	boolean Sacar(double valor) {
		if (this.Saldo < valor) {
			return false;
		} else {
			this.Saldo = this.Saldo - valor;
			return true;
		}
	}

	void Depositar(double quantidade) {
		this.Saldo += quantidade;
	}

	double getSaldo() {
		return this.Saldo;
	}

	void setSaldo(double quantidade) {
		this.Saldo = quantidade;
	}
	void setEmail(String Email){
		if(ValidaEmail(Email)){
			this.email = Email;
		}
	}
	
	
	
	String getEmail(){
		return this.email;
	}
	private boolean ValidaEmail(String Email){
		return Email.contains("@");
		
	}


}
