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
import javax.swing.ButtonGroup;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Menu extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mnArquivo.add(mntmSalvar);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArquivo.add(mntmAbrir);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmTexto = new JMenuItem("Texto  ");
		mnEditar.add(mntmTexto);
		
		JMenu mnEscolha = new JMenu("Escolha");
		mnEditar.add(mnEscolha);
		
		JMenuItem mntmFormatar = new JMenuItem("Formatar");
		mnEscolha.add(mntmFormatar);
		
		JCheckBoxMenuItem chckbxmntmOpo = new JCheckBoxMenuItem("Op\u00E7\u00E3o1");
		buttonGroup.add(chckbxmntmOpo);
		mnEscolha.add(chckbxmntmOpo);
		
		JCheckBoxMenuItem chckbxmntmOpo_1 = new JCheckBoxMenuItem("Op\u00E7\u00E3o2");
		mnEscolha.add(chckbxmntmOpo_1);
		
		JRadioButtonMenuItem rdbtnmntmRadio = new JRadioButtonMenuItem("Radio 1");
		buttonGroup_1.add(rdbtnmntmRadio);
		mnEscolha.add(rdbtnmntmRadio);
		
		JRadioButtonMenuItem rdbtnmntmRadio_1 = new JRadioButtonMenuItem("Radio 2");
		mnEscolha.add(rdbtnmntmRadio_1);
		
		JMenuItem mntmCopiar = new JMenuItem("Ctrl + C");
		mntmCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_COPY, 0));
		mnEditar.add(mntmCopiar);
		
		JMenuItem mntmRecortarctrl = new JMenuItem("Ctrl + X");
		buttonGroup_1.add(mntmRecortarctrl);
		mntmRecortarctrl.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_CUT, 0));
		mnEditar.add(mntmRecortarctrl);
		
		JMenuItem mntmColarctrl = new JMenuItem("Ctrl + V");
		buttonGroup_1.add(mntmColarctrl);
		mntmColarctrl.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PASTE, 0));
		mnEditar.add(mntmColarctrl);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setBounds(0, 0, 16, 76);
		addPopup(contentPane, popupMenu);
		contentPane.setLayout(null);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
