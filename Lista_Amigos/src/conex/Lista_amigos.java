package conex;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Lista_amigos extends JFrame {

	private JPanel contentPane;
	private JTextField txtCD_Amigo;
	private JTextField txtNM_amigo;
	private JTextField txtNR_Telefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista_amigos frame = new Lista_amigos();
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
	public Lista_amigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 11, 46, 14);
		contentPane.add(lblCodigo);
		
		txtCD_Amigo = new JTextField();
		txtCD_Amigo.setBounds(10, 36, 252, 20);
		contentPane.add(txtCD_Amigo);
		txtCD_Amigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 76, 46, 14);
		contentPane.add(lblNome);
		
		txtNM_amigo = new JTextField();
		txtNM_amigo.setBounds(10, 101, 252, 20);
		contentPane.add(txtNM_amigo);
		txtNM_amigo.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 144, 75, 14);
		contentPane.add(lblTelefone);
		
		txtNR_Telefone = new JTextField();
		txtNR_Telefone.setBounds(10, 169, 252, 20);
		contentPane.add(txtNR_Telefone);
		txtNR_Telefone.setColumns(10);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			IncluirAmigo();
			}
		});
		btnIncluir.setBounds(335, 11, 89, 23);
		contentPane.add(btnIncluir);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(335, 45, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(335, 76, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(335, 110, 89, 23);
		contentPane.add(btnConsultar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			dispose();
			}
		});
		btnSair.setBounds(335, 227, 89, 23);
		contentPane.add(btnSair);
	}

public void IncluirAmigo(){
	conexao c = new conexao();
	try{
		String q = "";
			q = " Insert into amigos ";
			q += "(NM_Amigo, NR_Telefone) ";
			q += " values (?, ?) ";
		
		PreparedStatement comando = c.conn.prepareStatement(q);
		comando.setString(1, txtNM_amigo.getText());
		comando.setString(2, txtNR_Telefone.getText());
		System.out.println(q);
		comando.execute();
	
	}catch (Exception ex){
		System.err.println("FALHA NA INSERÇÃO");
		System.err.println("1");
		ex.printStackTrace();
	}finally{
		if(c.conn != null) {
			try{
				c.conn.close();
			}catch(Exception ex){
				System.err.println ("ERRO NA CONEXÃO");
			}
				
		}
	}
	}
}


// SO TEM ERRO NO PROGRAMA SE VC TESTAR








