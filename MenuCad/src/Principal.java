import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private cadprodutos CadProdutos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Menu Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpces = new JMenu("Opc\u00F5es");
		menuBar.add(mnOpces);
		
		contentPane = new JPanel();
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			CadProdutos.setVisible(true);
			}
		});
		mnOpces.add(mntmCadastrar);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mnOpces.add(mntmConsultar);
		
		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mnOpces.add(mntmAlterar);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout (0,0));
		
		cadprodutos cadproduto = new cadprodutos();
		cadproduto.setMaximizable(false);
		cadproduto.setSize(100, 200);
		cadproduto.setVisible(false);
		contentPane.add(cadproduto, BorderLayout.CENTER);
		
		
	}
}
