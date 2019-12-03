package Projetos;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conexao.Conexao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;

public class ExercicioLivro extends JFrame {

	private JPanel contentPane;
	private JTextField CampoCodigo;
	private JTextField CampoTitulo;
	private JTextField CampoAno_Lanc;
	private JTextField CampoNum_Ed;
	JTextArea AreaExibicao = new JTextArea();
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioLivro frame = new ExercicioLivro();
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
	public ExercicioLivro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setBounds(10, 11, 46, 14);
		contentPane.add(lblCdigo);

		CampoCodigo = new JTextField();
		CampoCodigo.setBounds(10, 30, 40, 20);
		contentPane.add(CampoCodigo);
		CampoCodigo.setColumns(10);

		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(62, 11, 46, 14);
		contentPane.add(lblTitulo);

		CampoTitulo = new JTextField();
		CampoTitulo.setBounds(60, 30, 102, 20);
		contentPane.add(CampoTitulo);
		CampoTitulo.setColumns(10);

		JLabel lblAnoDeLanamento = new JLabel("Ano de lan\u00E7amento:");
		lblAnoDeLanamento.setBounds(163, 11, 112, 14);
		contentPane.add(lblAnoDeLanamento);

		CampoAno_Lanc = new JTextField();
		CampoAno_Lanc.setBounds(198, 30, 95, 20);
		contentPane.add(CampoAno_Lanc);
		CampoAno_Lanc.setColumns(10);

		JLabel lblNmeroDeEdio = new JLabel("N\u00FAmero de Edi\u00E7\u00E3o");
		lblNmeroDeEdio.setBounds(306, 11, 123, 14);
		contentPane.add(lblNmeroDeEdio);

		CampoNum_Ed = new JTextField();
		CampoNum_Ed.setBounds(303, 30, 126, 20);
		contentPane.add(CampoNum_Ed);
		CampoNum_Ed.setColumns(10);

		AreaExibicao.setBackground(Color.PINK);
		AreaExibicao.setBounds(25, 106, 377, 144);
		contentPane.add(AreaExibicao);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(10, 61, 89, 23);
		contentPane.add(btnConsultar);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparDados();
			}
		});
		btnLimpar.setBounds(337, 61, 89, 23);
		contentPane.add(btnLimpar);
		btnConsultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Pesquisar();
			}
		});
	}

	public void LimparDados() {
		CampoCodigo.setText("");
		CampoTitulo.setText("");
		CampoAno_Lanc.setText("");
		CampoNum_Ed.setText("");
		AreaExibicao.setText("");
	}
	
	public void Pesquisar() {
		Conexao c = new Conexao();

		try {
			String q = "";

			if (!CampoCodigo.getText().isEmpty()) {

				q = "SELECT A.CD_AUTOR, A.NM_AUTOR, L.TIT_LIVRO, L.AN_LANC_LIVRO, L.NR_ED_LIVRO ";
				q += "FROM livro L ";
				q += "JOIN autor_livro AL on AL.CD_LIVRO = L.CD_LIVRO ";
				q += "JOIN autor A on A.CD_AUTOR  = AL.CD_AUTOR ";
				q += "WHERE L.CD_LIVRO LIKE ?";

				PreparedStatement comando = c.conn.prepareStatement(q);
				comando.setString(1, CampoCodigo.getText());
				ResultSet rs = comando.executeQuery();

				if (rs.next()) {
					CampoTitulo.setText(rs.getString("L.TIT_LIVRO"));
					CampoAno_Lanc.setText(rs.getString("L.AN_LANC_LIVRO"));
					CampoNum_Ed.setText(rs.getString("L.NR_ED_LIVRO"));
					AreaExibicao.setText("Cod Autor: " + (rs.getString("A.CD_AUTOR")) + "\n" + "Nome do Autor: "
							+ (rs.getString("A.NM_AUTOR")));
				} else {
					CampoTitulo.setText("");
					CampoAno_Lanc.setText("");
					CampoNum_Ed.setText("");
					AreaExibicao.setText("");
				}
			} 
			else if (!(CampoTitulo.getText().isEmpty())) {

				String Parc = " '%" + CampoTitulo.getText() + "%' "; 
				
				q = "SELECT L.CD_LIVRO, L.TIT_LIVRO, L.AN_LANC_LIVRO, L.NR_ED_LIVRO, A.CD_AUTOR, A.NM_AUTOR ";
				q += "FROM livro L ";
				q += "JOIN autor_livro AL on AL.CD_LIVRO = L.CD_LIVRO ";
				q += "JOIN autor A on A.CD_AUTOR  = AL.CD_AUTOR ";
				q += "WHERE L.TIT_LIVRO LIKE ? ";

				PreparedStatement comando = c.conn.prepareStatement(q);
				comando.setString(1, Parc);
				ResultSet rs = comando.executeQuery();
				
				if (rs.next()) {
					CampoCodigo.setText(rs.getString("L.CD_LIVRO"));
					CampoAno_Lanc.setText(rs.getString("L.AN_LANC_LIVRO"));
					CampoNum_Ed.setText(rs.getString("L.NR_ED_LIVRO"));
					AreaExibicao.setText("Cod Autor: " + (rs.getString("A.CD_AUTOR")) + "\n" + "Nome do Autor: "
							+ (rs.getString("A.NM_AUTOR")));
				} else {
					CampoCodigo.setText("");
					CampoAno_Lanc.setText("");
					CampoNum_Ed.setText("");
					AreaExibicao.setText("");
				}
			} 
			else if (!CampoAno_Lanc.getText().isEmpty()) {

				q = "SELECT L.CD_LIVRO, L.TIT_LIVRO, L.NR_ED_LIVRO, A.CD_AUTOR, A.NM_AUTOR ";
				q += "FROM livro L ";
				q += "JOIN autor_livro AL on AL.CD_LIVRO = L.CD_LIVRO ";
				q += "JOIN autor A on A.CD_AUTOR  = AL.CD_AUTOR ";
				q += "WHERE L.AN_LANC_LIVRO LIKE ? ";

				PreparedStatement comando = c.conn.prepareStatement(q);
				comando.setString(1, CampoAno_Lanc.getText());
				ResultSet rs = comando.executeQuery();

				if (rs.next()) {

					CampoCodigo.setText(rs.getString("L.CD_LIVRO"));
					CampoTitulo.setText(rs.getString("L.TIT_LIVRO"));
					CampoNum_Ed.setText(rs.getString("L.NR_ED_LIVRO"));
					AreaExibicao.setText("Cod Autor: " + (rs.getString("A.CD_AUTOR")) + "\n" + "Nome do Autor: "
							+ (rs.getString("A.NM_AUTOR")));

				} else {
					CampoCodigo.setText("");
					CampoTitulo.setText("");
					CampoNum_Ed.setText("");
					AreaExibicao.setText("");

				}

			}
			else if (!(CampoNum_Ed.getText().isEmpty())){
				
				q  = "SELECT L.CD_LIVRO, L.TIT_LIVRO, L.AN_LANC_LIVRO, A.CD_AUTOR, A.NM_AUTOR ";
				q += "FROM livro L ";
				q += "JOIN autor_livro AL on AL.CD_LIVRO = L.CD_LIVRO ";
				q += "JOIN autor A on A.CD_AUTOR  = AL.CD_AUTOR ";
				q += "WHERE L.NR_ED_LIVRO = ? ";
				
				PreparedStatement comando = c.conn.prepareStatement(q);
				comando.setString(1, CampoNum_Ed.getText());
				ResultSet rs = comando.executeQuery();
				
				if(rs.next()){
					
					CampoCodigo.setText(rs.getString("L.CD_LIVRO"));
					CampoTitulo.setText(rs.getString("L.TIT_LIVRO"));
					CampoAno_Lanc.setText(rs.getString("L.AN_LANC_LIVRO"));
					AreaExibicao.setText("Cod Autor: " + (rs.getString("A.CD_AUTOR")) + "\n" + "Nome do Autor: "
							+ (rs.getString("A.NM_AUTOR")));
				}
				else {
					CampoCodigo.setText("");
					CampoTitulo.setText("");
					CampoAno_Lanc.setText("");
					AreaExibicao.setText("");
					
				}
			}

		} catch (Exception ex) {
			System.out.println("FALHA NA CONSULTA.");
			ex.printStackTrace();
		} finally {
			if (c.conn != null) {
				try {
					c.conn.close();

				} catch (Exception ex) {
					System.err.println("Error in connection termination!!");
				}
			}
		}
	}

}
