package falta;

import javax.swing.JOptionPane;

public class faltou {

	public static void main(String[] args) {
		String nome;
		
		
		nome = JOptionPane.showInputDialog("Qual � o seu nome?");
				System.out.println(nome);
		JOptionPane.showMessageDialog(null, "Ol�: "+ nome, "Titulo Janela", JOptionPane.ERROR_MESSAGE);

	//JOptionPane.INFORMATION_MESSAGE;
	//JOptionPane.Question_MESSAGE;
	//JOptionPane.WARNING_MESSAGE;
	//JOptionPane.OK_CANCEL_OPTION;
	//JOptionPane.YES_NO_CANCEL_OPTION;
	
	
	
	
	
	}

}
