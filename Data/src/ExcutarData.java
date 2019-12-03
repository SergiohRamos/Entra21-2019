import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class ExcutarData extends JFrame {

	private JPanel contentPane;
	private JTextField TxData;
	private final Action action = new SwingAction();
	private JTextField Dia;
	private JTextField Mes;
	private JTextField Ano;
	private JButton BotLerData;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcutarData frame = new ExcutarData();
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
	public ExcutarData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 178, 191);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TxData = new JTextField();
		TxData.setToolTipText("Coloque a data");
		TxData.setBackground(Color.GRAY);
		TxData.setBounds(16, 87, 86, 20);
		contentPane.add(TxData);
		TxData.setColumns(10);
		
		
		JButton BotOk = new JButton("Ler Data");
		BotOk.setToolTipText("Ler a Data");
		BotOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Date DataDigitada = new Date();
			SimpleDateFormat Formato =new SimpleDateFormat("dd/MM/yyyy");
			try {
				DataDigitada = Formato.parse(TxData.getText());
			} catch (ParseException e) {			
				e.printStackTrace();
			}
			System.out.println(DataDigitada);
			}
		});
		BotOk.setAction(action);
		BotOk.setBackground(Color.BLACK);
		BotOk.setBounds(16, 118, 89, 23);
		contentPane.add(BotOk);
		
		Dia = new JTextField();
		Dia.setBounds(10, 11, 26, 20);
		contentPane.add(Dia);
		Dia.setColumns(10);
		
		Mes = new JTextField();
		Mes.setBounds(46, 11, 26, 20);
		contentPane.add(Mes);
		Mes.setColumns(10);
		
		Ano = new JTextField();
		Ano.setBounds(82, 11, 26, 20);
		contentPane.add(Ano);
		Ano.setColumns(10);
		
		BotLerData = new JButton("Ler Data");
		BotLerData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TxData.setText(
								Dia.getText() + "/" +
									Mes.getText() + "/" +
										Ano.getText());
			}
		});
		BotLerData.setBounds(16, 42, 89, 23);
		contentPane.add(BotLerData);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Ok");
			putValue(SHORT_DESCRIPTION, "Ler a data");
		}
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
}
