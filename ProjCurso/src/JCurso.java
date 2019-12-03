import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JCurso extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeDisciplina;
	private JTextField txtCargaHoraria;
	private JTextField txtNomeProfessor;
	private JButton btnListar;
	private JTextField txtListar;
	private JButton btnNewButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCurso frame = new JCurso();
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
	public JCurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 339);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Disciplina = new JLabel("Disciplina:");
		Disciplina.setBounds(10, 11, 61, 14);
		contentPane.add(Disciplina);

		txtNomeDisciplina = new JTextField();
		txtNomeDisciplina.setBounds(78, 8, 86, 20);
		contentPane.add(txtNomeDisciplina);
		txtNomeDisciplina.setColumns(10);

		JLabel Carga = new JLabel("Carga Horaria:");
		Carga.setBounds(10, 47, 77, 14);
		contentPane.add(Carga);

		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(88, 44, 86, 20);
		contentPane.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);

		JLabel Professor = new JLabel("Professor:");
		Professor.setBounds(10, 84, 61, 14);
		contentPane.add(Professor);

		txtNomeProfessor = new JTextField();
		txtNomeProfessor.setBounds(81, 81, 86, 20);
		contentPane.add(txtNomeProfessor);
		txtNomeProfessor.setColumns(10);

		JButton BotOk = new JButton("OK");
		BotOk.setBackground(Color.GREEN);
		BotOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * String nDisciplina, nProfessor; double nCarga;
				 * 
				 * nDisciplina = txtNomeDisciplina.getText(); nProfessor =
				 * txtNomeProfessor.getText(); nCarga =
				 * Double.parseDouble(txtCargaHoraria.getText());
				 */

				Curso curso = new Curso(txtNomeDisciplina.getText(), Double.parseDouble(txtCargaHoraria.getText()),
						txtNomeProfessor.getText());
				JOptionPane.showMessageDialog(null, "Disciplina: " + curso.getDisciplina() + "/n" + " Carga Horária: "
						+ curso.getCarga() + "/n" + " Professor: " + curso.getProfessor());

			
			}
		});
		BotOk.setBounds(10, 141, 89, 23);
		contentPane.add(BotOk);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(262, 11, 183, 240);
		contentPane.add(txtArea);
		
		btnListar = new JButton("Listar");
		btnListar.setBackground(Color.CYAN);
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CursoSuperior cursoS = new CursoSuperior(
						txtNomeDisciplina.getText(),
						Double.parseDouble(txtCargaHoraria.getText()),
						txtNomeProfessor.getText());
			cursoS.CentroAcademico = "DCE";
			cursoS.PercCotista = 10;
			cursoS.listar(txtListar.getText());
		
			txtArea.setText(retornaDados());
			}
		});
		btnListar.setBounds(10, 191, 89, 23);
		contentPane.add(btnListar);
		
		txtListar = new JTextField();
		txtListar.setBounds(113, 192, 86, 20);
		contentPane.add(txtListar);
		txtListar.setColumns(10);
		
		btnNewButton = new JButton("SAIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);}
		});
		btnNewButton.setBounds(10, 266, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
	}
}
