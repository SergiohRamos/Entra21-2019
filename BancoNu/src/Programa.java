
public class Programa {

	public static void main(String[] args) {
		Conta MinhaConta = new Conta(123456, null);
		String Mensagem;

		Mensagem = MinhaConta.setTitular("Sérgio Ramos");
		if (Mensagem != null) {
			System.out.println("Erro:" + Mensagem);
		} else {
			MinhaConta.setSaldo(1000);

			System.out.println(MinhaConta.getSaldo());

			if (!MinhaConta.Sacar(1000)) {
				System.out.println("Saldo Insuficiente!!!!!!!");
			} else {
				System.out.println(MinhaConta.getSaldo());
			}
			MinhaConta.Depositar(500);
			System.out.println(MinhaConta.getSaldo());
			System.out.println(MinhaConta.getSaldo());
			MinhaConta.email = "hramos.sergio@gmail.com";
			MinhaConta.senha = "Janel123";
			System.out.println(MinhaConta.email);
		}
	
		ContaEspecial ContaEx  = new ContaEspecial (123456,"Ex", 10000);	
		ContaEx.Depositar(1000);
		System.out.println(ContaEx.getSaldoEspecial());
	}	
}
