import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cad extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cad frame = new Cad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNCadastro = new JLabel("N\u00BA Cadastro:");
		lblNCadastro.setBounds(10, 11, 63, 14);
		contentPane.add(lblNCadastro);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 36, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 61, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(10, 86, 100, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblValorHora = new JLabel("Valor Hora:");
		lblValorHora.setBounds(10, 111, 63, 14);
		contentPane.add(lblValorHora);
		
		JLabel lblHorasTrabalhadas = new JLabel("Horas Trabalhadas:");
		lblHorasTrabalhadas.setBounds(10, 136, 100, 14);
		contentPane.add(lblHorasTrabalhadas);
		
		JButton BCancelar = new JButton("Cancelar");
		BCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		BCancelar.setBounds(10, 227, 89, 23);
		contentPane.add(BCancelar);
	}

}
