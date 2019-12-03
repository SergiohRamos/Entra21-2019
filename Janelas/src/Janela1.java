import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

@SuppressWarnings("serial")
public class Janela1 extends JFrame {

	private JPanel contentPane;
	private JTextField palavra;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela1 frame = new Janela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Janela1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alunos\\Downloads\\superthumb.png"));
		setTitle("Troca Texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 290);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTextArea area2 = new JTextArea();
		area2.setBounds(281, 46, 157, 143);
		area2.setForeground(new Color(139, 0, 0));
		area2.setFont(new Font("Lucida Bright", Font.PLAIN, 16));
		area2.setBackground(new Color(255, 228, 225));
		area2.setLineWrap(true);
		contentPane.add(area2);
		
		JButton botao2 = new JButton("^");
		botao2.setBounds(371, 215, 49, 23);
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String quebralinha = "\n";
				if (area2.getText().equals("")) 
					quebralinha = "";
					area2.setText(area2.getText()+ quebralinha + palavra.getText());
					palavra.setText(null);
					palavra.grabFocus();
			}
		});
		contentPane.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(36, 27, 49, 40);
		label_3.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd465507b1df.png"));
		contentPane.add(label_3);
		botao2.setBackground(new Color(255, 228, 225));
		botao2.setForeground(new Color(255, 0, 51));
		contentPane.add(botao2);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(5, 27, 70, 40);
		label_2.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd465507b1df.png"));
		contentPane.add(label_2);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(281, -6, 68, 70);
		label_5.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd465c57956f.png"));
		contentPane.add(label_5);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(157, 165, 169, 56);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd4660c25cbd.png"));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(380, 0, 84, 75);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd463ff437bf.png"));
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(26, 162, 84, 75);
		label.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd463ff437bf.png"));
		contentPane.add(label);
		
		JLabel lblTroca = new JLabel("Troca");
		lblTroca.setBounds(169, 7, 183, 42);
		lblTroca.setFont(new Font("Lucida Bright", Font.BOLD, 40));
		lblTroca.setForeground(new Color(255, 228, 225));
		contentPane.add(lblTroca);

		
		JTextArea area1 = new JTextArea();
		area1.setBounds(20, 46, 157, 143);
		area1.setForeground(new Color(255, 0, 51));
		area1.setFont(new Font("Lucida Bright", Font.PLAIN, 16));
		area1.setBackground(new Color(255, 228, 225));
		area1.setLineWrap(true);
		contentPane.add(area1);
		
		JButton botao = new JButton("");
		botao.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int notches = e.getWheelRotation();
				if (notches < 0) {
					String n = area1.getText();
					String m = area2.getText();
					area2.setText(n);
					area1.setText(m);
				}
			}
		});
		botao.setBounds(195, 89, 68, 61);
		botao.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd4630c1bc32.png"));
		botao.setForeground(Color.PINK);
		botao.setBackground(new Color(204, 204, 255));
		botao.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = area1.getText();
				String m = area2.getText();
				area2.setText(n);
				area1.setText(m);
			}
		});
		contentPane.add(botao);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(233, 75, 49, 42);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd46469a7482.png"));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(380, 162, 79, 61);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd464e59a2e5.png"));
		contentPane.add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(127, 11, 79, 61);
		label_1.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd464e59a2e5.png"));
		contentPane.add(label_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(26, 0, 49, 40);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd465507b1df.png"));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(142, 191, 68, 70);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd465c57956f.png"));
		contentPane.add(lblNewLabel_4);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(326, 203, 49, 40);
		label_4.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd465507b1df.png"));
		contentPane.add(label_4);
		
		palavra = new JTextField();
		palavra.setBounds(243, 203, 107, 37);
		palavra.setBackground(new Color(255, 228, 225));
		palavra.setForeground(new Color(153, 0, 153));
		contentPane.add(palavra);
		palavra.setColumns(10);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(430, 110, 49, 40);
		label_6.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd465507b1df.png"));
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(93, 197, 49, 40);
		label_7.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd465507b1df.png"));
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(78, 212, 49, 40);
		label_8.setIcon(new ImageIcon("C:\\Users\\Alunos\\Downloads\\bloggif_5cd465507b1df.png"));
		contentPane.add(label_8);
		
	}
}
