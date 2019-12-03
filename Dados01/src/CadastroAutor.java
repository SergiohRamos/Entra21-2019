import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conexao.Conexao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class CadastroAutor extends JFrame {

	private JPanel contentPane;
	private JTextField txtDT_Cad;
	private JTextField txtCDAutor;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtAutor;
	private JTextField txtDTNasc;
	 JRadioButton rdbtnFem = new JRadioButton ("Fem.");
	 JRadioButton rdbtnMasc = new JRadioButton ("Masc.");
	 private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAutor frame = new CadastroAutor();
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
	public CadastroAutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CDAutor = new JLabel("Codigo:\r\n");
		CDAutor.setBounds(10, 11, 46, 14);
		contentPane.add(CDAutor);
		
		JLabel Autor = new JLabel("Autor:");
		Autor.setBounds(10, 36, 46, 14);
		contentPane.add(Autor);
		
		txtDT_Cad = new JTextField();
		txtDT_Cad.setBackground(Color.YELLOW);
		txtDT_Cad.setForeground(new Color(0, 0, 0));
		txtDT_Cad.setBounds(64, 93, 279, 20);
		contentPane.add(txtDT_Cad);
		txtDT_Cad.setColumns(10);
		
		JButton Bt_Cadatro = new JButton("Cadastrar\r\n");
		Bt_Cadatro.setBackground(Color.MAGENTA);
		Bt_Cadatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			IncluirAutor();			
			}
		});
		Bt_Cadatro.setBounds(10, 227, 89, 23);
		contentPane.add(Bt_Cadatro);
		
		JButton BT_Excluir = new JButton("Excluir");
		BT_Excluir.setBackground(Color.CYAN);
		BT_Excluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ExcluirAutor();
			}
		});
		BT_Excluir.setBounds(109, 227, 89, 23);
		contentPane.add(BT_Excluir);
		
		JSpinner SPI_Consulta = new JSpinner();
		SPI_Consulta.setBackground(Color.ORANGE);
		SPI_Consulta.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				NavegarAutor((int)SPI_Consulta.getValue());
			}
		});
		SPI_Consulta.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		SPI_Consulta.setBounds(10, 176, 46, 20);
		contentPane.add(SPI_Consulta);
		
		JLabel lblConsultar = new JLabel("Consultar");
		lblConsultar.setBounds(64, 179, 77, 14);
		contentPane.add(lblConsultar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(Color.RED);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0); 
			}
		});
		btnSair.setBounds(335, 227, 89, 23);
		contentPane.add(btnSair);
		
		txtCDAutor = new JTextField();
		txtCDAutor.setBackground(Color.YELLOW);
		txtCDAutor.setEditable(false);
		txtCDAutor.setBounds(55, 8, 86, 20);
		contentPane.add(txtCDAutor);
		txtCDAutor.setColumns(10);
		
		
		buttonGroup.add(rdbtnMasc);
		rdbtnMasc.setBackground(Color.YELLOW);
		rdbtnMasc.setBounds(298, 7, 62, 23);
		contentPane.add(rdbtnMasc);
		
		
		buttonGroup.add(rdbtnFem);
		rdbtnFem.setBackground(Color.YELLOW);
		rdbtnFem.setBounds(362, 7, 62, 23);
		contentPane.add(rdbtnFem);
		
		JLabel lblNewLabel = new JLabel("Data Nasc:");
		lblNewLabel.setBounds(10, 61, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCadastro = new JLabel("Cadastro:");
		lblCadastro.setBounds(10, 96, 67, 14);
		contentPane.add(lblCadastro);
		
		txtAutor = new JTextField();
		txtAutor.setBackground(Color.YELLOW);
		txtAutor.setBounds(47, 36, 151, 20);
		contentPane.add(txtAutor);
		txtAutor.setColumns(10);
		
		txtDTNasc = new JTextField();
		txtDTNasc.setBackground(Color.YELLOW);
		txtDTNasc.setBounds(73, 62, 125, 20);
		contentPane.add(txtDTNasc);
		txtDTNasc.setColumns(10);
		
		JLabel lblEsteCampo = new JLabel("* Este campo \u00E9 Obrigatorio!");
		lblEsteCampo.setForeground(Color.RED);
		lblEsteCampo.setBounds(270, 202, 191, 14);
		contentPane.add(lblEsteCampo);
		
		JLabel label = new JLabel("*");
		label.setForeground(Color.RED);
		label.setBounds(151, 11, 12, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("*");
		label_1.setForeground(Color.RED);
		label_1.setBounds(208, 39, 12, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		label_2.setBounds(208, 68, 12, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("*");
		label_3.setForeground(Color.RED);
		label_3.setBounds(348, 96, 12, 14);
		contentPane.add(label_3);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			AlterarAutor();
			}
		});
		btnAlterar.setAction(action);
		btnAlterar.setBounds(220, 227, 89, 23);
		contentPane.add(btnAlterar);
	}
public void IncluirAutor(){
	String vSexo = null;
	if(rdbtnMasc.isSelected()){
		vSexo ="M";
		
	}else if(rdbtnFem.isSelected()){
		vSexo = "F";
	}else{
		vSexo = "?";
	}
	
	Conexao c = new Conexao ();
	try{	
		Statement comando = c.conn.createStatement();
		String q = "";
		q+= "insert into autor(NM_Autor, ID_Sexo, Data_Nascimento)";
		q+= "values ('" +txtAutor.getText() + "',";
		q+= "'" + vSexo + "',";
		q+= "'" + txtDTNasc.getText() + "')";
		
		comando.executeUpdate(q);
		
	}catch (Exception ex){
		System.err.println("FALHA NA INSER플O");
		ex.printStackTrace();
		
	}finally{
		if(c.conn != null){
			try{
				c.conn.close();
				
			}catch (Exception ex){
				System.err.println("Error in connection termination!!");
			}
		}
	}

}

public void ExcluirAutor(){
		
		Conexao c = new Conexao ();
		try{	
			Statement comando = c.conn.createStatement();
			String q = "";
			q+= "delete from autor where CD_Autor = ";
			q+= "'" + txtCDAutor.getText() + "'";
			
			comando.executeUpdate(q);
			
		}catch (Exception ex){
			System.err.println("FALHA NA INSER플O");
			ex.printStackTrace();
			
		}finally{
			if(c.conn != null){
				try{
					c.conn.close();
					
				}catch (Exception ex){
					System.err.println("Error in connection termination!!");
				}
			}
		}

}


public void NavegarAutor(int pCD_Autor){
	
	Conexao c = new Conexao ();
	try{	
		
		String q = ""; 
		q+=	"SELECT CD_Autor, NM_Autor, CD_Livro, Data_Nascimento, ID_Sexo, OBS_Autor, DT_Cadastro, DT_Alteracao ";
		q+= "FROM autor ";
		q+= "WHERE CD_Autor = ? ";
		
	PreparedStatement comando = c.conn.prepareStatement (q);	
	comando.setInt(1,pCD_Autor);	
	ResultSet rs = comando.executeQuery();	
	String ID_Sexo = "";
		
	if(rs.next()){
		txtCDAutor.setText(rs.getString(1));
		txtAutor.setText(rs.getString("NM_Autor"));
		txtDTNasc.setText(rs.getString("Data_Nascimento"));
		txtDT_Cad.setText(rs.getString("DT_Cadastro"));
		ID_Sexo = rs.getString("ID_Sexo");
	}
	else{	
		txtCDAutor.setText("");
		txtAutor.setText("");
		txtDTNasc.setText("");
		txtDT_Cad.setText("");
		}
	rdbtnMasc.setSelected(false);
	rdbtnFem.setSelected(false);
	if(ID_Sexo.equals("F")){
		rdbtnFem.setSelected(true);
		}
	else if(ID_Sexo.equals("M")){
		rdbtnMasc.setSelected(true);
	}
		
	}catch (Exception ex){
		System.err.println("FALHA NA INSER플O");
		ex.printStackTrace();
		
	}finally{
		if(c.conn != null){
			try{
				c.conn.close();
				
			}catch (Exception ex){
				System.err.println("Error in connection termination!!");
			}
		}
	}

}


public void AlterarAutor(int pCD_Autor){
	
	Conexao c = new Conexao ();
	try{	
		
		String q = ""; 
		q+=	"UPDATE autor SET NM_Autor=?, ID_Sexo= ?, Data_Nascimento= ? ";
		q+=	"WHERE CD_Autor = ? ";
		
	PreparedStatement comando = c.conn.prepareStatement (q);	
	comando.setString(1,txtAutor.getText());
	comando.setString(2,);
	comando.setString(3,);
	comando.setInt(4,pCD_Autor);
	ResultSet rs = comando.executeQuery();	
	String ID_Sexo = "";
		
	
	
	}catch (Exception ex){
		System.err.println("FALHA NA INSER플O");
		ex.printStackTrace();
		
	}finally{
		if(c.conn != null){
			try{
				c.conn.close();
				
			}catch (Exception ex){
				System.err.println("Error in connection termination!!");
			}
		}
	}

}


}






}
