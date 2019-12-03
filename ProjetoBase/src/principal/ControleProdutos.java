package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ControleProdutos extends JFrame {

	public ConsultaProdutos consultaProdutos1; 
	public ConsultaProdutos consultaProdutos2; 
	public CadastroProduto cp;
	
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControleProdutos frame = new ControleProdutos();
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
	public ControleProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 393);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnArquivo.add(mntmSalvar);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArquivo.add(mntmAbrir);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmTexto = new JMenuItem("Texto 1");
		mnEditar.add(mntmTexto);
		
		JMenu mnEscolha = new JMenu("Escolha");
		mnEditar.add(mnEscolha);
		
		JMenuItem mntmFormatar = new JMenuItem("Formatar");
		mnEscolha.add(mntmFormatar);
		
		JCheckBoxMenuItem chckbxmntmOpo = new JCheckBoxMenuItem("op\u00E7\u00E3o1");
		mnEscolha.add(chckbxmntmOpo);
		
		JCheckBoxMenuItem chckbxmntmOplo = new JCheckBoxMenuItem("op\u00E7\u00E3o2");
		mnEscolha.add(chckbxmntmOplo);
		
		JRadioButtonMenuItem rdbtnmntmRadio = new JRadioButtonMenuItem("radio 1");
		mnEscolha.add(rdbtnmntmRadio);
		
		JRadioButtonMenuItem rdbtnmntmRadio_1 = new JRadioButtonMenuItem("radio2");
		mnEscolha.add(rdbtnmntmRadio_1);
		
		JMenuItem mntmCopiarctrlc = new JMenuItem("Ctrl + C");
		mntmCopiarctrlc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_COPY, 0));
		mnEditar.add(mntmCopiarctrlc);
		
		JMenuItem mntmRecortarctrl = new JMenuItem("Ctrl + X");
		mntmRecortarctrl.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_CUT, 0));
		mnEditar.add(mntmRecortarctrl);
		
		JMenuItem mntmColarctrlv = new JMenuItem("Ctrl + V");
		mntmColarctrlv.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PASTE, 0));
		mnEditar.add(mntmColarctrlv);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmJanela = new JMenuItem("Janela 1");
		mntmJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				consultaProdutos1.setVisible(true);
			}
		});
		mnNewMenu.add(mntmJanela);
		
		JMenuItem mntmJanela_1 = new JMenuItem("Janela 2");
		mntmJanela_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultaProdutos2.setVisible(true);
			}
		});
	
		mnNewMenu.add(mntmJanela_1);
		
		
		JMenuItem mntmcp = new JMenuItem("Cadastro");
		mntmcp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cp.setVisible(true);
			}
		});
		mnNewMenu.add(mntmcp);
		
		
		
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		consultaProdutos1 = new ConsultaProdutos(); 
		consultaProdutos1.setSize(311, 132);
		consultaProdutos1.setLocation(28, 30);
		contentPane.add(consultaProdutos1);
		
		consultaProdutos2 = new ConsultaProdutos();
		consultaProdutos2.setSize(287, 145);
		consultaProdutos2.setLocation(90, 350);
		contentPane.add(consultaProdutos2);
		
		
		cp = new CadastroProduto();
		cp.setSize(287, 145);
		cp.setLocation(90, 350);
		contentPane.add(cp);

	}
}
