import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;

	import Conexao.Conexao;

	import javax.swing.JLabel;
	import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
	import javax.swing.JRadioButton;
	import java.awt.event.ActionListener;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
	import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;



	public class cadprodutos extends JInternalFrame {

		private JPanel contentPane;
		private JTextField txtCdProduto;
		private JTextField txtDsProduto;
		private JTextField txtQtEstoque;
		private JTextField txtQtEstoqueMin;
		private JTextField txtVlPreco;
		JList<String> AreaDados = new JList<String>();
		

		/**
		 * Launch the application.
		 */
	/*	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
					//	cadprodutos frame = new cadprodutos();
						//frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
*/
		/**
		 * Create the frame.
		 */
		public cadprodutos() {
			setBorder(null);
			setTitle("Cadastrar");
			setMaximizable(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 531, 403);
			contentPane = new JPanel();
			contentPane.setBackground(Color.BLACK);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel CdProduto = new JLabel("CD_PRODUTO:");
			CdProduto.setForeground(Color.WHITE);
			CdProduto.setBounds(10, 11, 106, 14);
			contentPane.add(CdProduto);
			
			txtCdProduto = new JTextField();
			txtCdProduto.setBounds(146, 8, 86, 20);
			contentPane.add(txtCdProduto);
			txtCdProduto.setColumns(10);
			
			JLabel DsProduto = new JLabel("DS_PRODUTO:");
			DsProduto.setForeground(Color.WHITE);
			DsProduto.setBounds(10, 36, 106, 14);
			contentPane.add(DsProduto);
			
			txtDsProduto = new JTextField();
			txtDsProduto.setBounds(146, 39, 86, 20);
			contentPane.add(txtDsProduto);
			txtDsProduto.setColumns(10);
			
			JLabel QtEstoque = new JLabel("QT_ESTOQUE:");
			QtEstoque.setForeground(Color.WHITE);
			QtEstoque.setBounds(10, 71, 106, 14);
			contentPane.add(QtEstoque);
			
			txtQtEstoque = new JTextField();
			txtQtEstoque.setBounds(146, 68, 86, 20);
			contentPane.add(txtQtEstoque);
			txtQtEstoque.setColumns(10);
			
			JLabel QtEstoqueMin = new JLabel("QT_ESTOQUE_MIN:");
			QtEstoqueMin.setForeground(Color.WHITE);
			QtEstoqueMin.setBounds(10, 101, 126, 14);
			contentPane.add(QtEstoqueMin);
			
			txtQtEstoqueMin = new JTextField();
			txtQtEstoqueMin.setColumns(10);
			txtQtEstoqueMin.setBounds(146, 99, 86, 20);
			contentPane.add(txtQtEstoqueMin);
			
			JLabel VlPreco = new JLabel("VL_PRE\u00C7O:");
			VlPreco.setForeground(Color.WHITE);
			VlPreco.setBounds(10, 126, 106, 14);
			contentPane.add(VlPreco);
			
			txtVlPreco = new JTextField();
			txtVlPreco.setColumns(10);
			txtVlPreco.setBounds(146, 123, 86, 20);
			contentPane.add(txtVlPreco);
			
			JButton botInserir = new JButton("INSERIR");
			botInserir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				InserirProduto();
				}
			});
			botInserir.setBounds(399, 7, 106, 23);
			contentPane.add(botInserir);
			
			JButton botSair = new JButton("SAIR");
			botSair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				}
			});
			botSair.setBounds(10, 330, 89, 23);
			contentPane.add(botSair);
			
			JButton botConsultar = new JButton("CONSULTAR");
			botConsultar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				ConsultarProduto();
				}
			});
			botConsultar.setBounds(399, 36, 106, 23);
			contentPane.add(botConsultar);
			
			JButton btnAlterar = new JButton("ALTERAR");
			btnAlterar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				AlterarDados();
				}
			});
			btnAlterar.setBounds(399, 67, 106, 23);
			contentPane.add(btnAlterar);
			
			JButton btnLimpar = new JButton("Limpar");
			btnLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				LimparConsulta();
				}
			});
			btnLimpar.setBounds(220, 330, 89, 23);
			contentPane.add(btnLimpar);
			
			JLabel lblLembreseDe = new JLabel("* Lembre-se de \r\nlimpar a cosulta ;)");
			lblLembreseDe.setForeground(new Color(255, 51, 0));
			lblLembreseDe.setBounds(319, 331, 218, 20);
			contentPane.add(lblLembreseDe);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 163, 177, 140);
			contentPane.add(scrollPane);
			
			
			scrollPane.setViewportView(AreaDados);
			
		}

		void InserirProduto(){
			Conexao c = new Conexao();
			try{
				String q = " INSERT INTO produto " +
						   "(CD_Produto, DS_PRODUTO, QT_ESTOQUE, QT_ESTOQUE_MIN, VL_PRECO	) " +
						   " values (? , ?, ?, ?, ?)";
			
			PreparedStatement comando = c.conn.prepareStatement(q);
			comando.setString(1, txtCdProduto.getText());
			comando.setString(2, txtDsProduto.getText());
			comando.setString(3, txtQtEstoque.getText());
			comando.setString(4, txtQtEstoqueMin.getText());
			comando.setString(5, txtVlPreco.getText());
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
		
		void ConsultarProduto(){
			Conexao c = new Conexao();
			String q = "";
			String w = "";
			// -----------------------------------------------------------------------------------------------------
			q += "SELECT  " +
				 " p.CD_PRODUTO, p.DS_PRODUTO, p.QT_ESTOQUE, p.QT_ESTOQUE_MIN, p.VL_PRECO " +
				 " From produto p";
			
			// ------------------------------------------------------------------------------------------------------
			if (!txtCdProduto.getText().isEmpty()) {
				w = "p.CD_PRODUTO = " + txtCdProduto.getText();
			}

			if (!txtDsProduto.getText().isEmpty()) {
				if (w.isEmpty()){
					w = "p.DS_PRODUTO like '%" + txtDsProduto.getText() + "%'";
				} else {
					w += " and lp.DS_PRODUTO like '%" + txtDsProduto.getText() + "%'";	
				}			
			}
			// ----------------------------------------------------------------------------------------------
			if (!txtQtEstoque.getText().isEmpty()) {
				if (w.isEmpty()) {
					w = "p.QT_ESTOQUE = " + txtQtEstoque.getText();
				} else {
					w += " and p.QT_ESTOQUE = " + txtQtEstoque.getText();
				}
			}

			// ------------------------------------------------------------------------------------------------------
			if (!txtQtEstoqueMin.getText().isEmpty()) {
				if (w.isEmpty()) {
					w = "p.QT_ESTOQUE_MIN = " + txtQtEstoqueMin.getText();
				} else {
					w += " and p.QT_ESTOQUE_MIN = " + txtQtEstoqueMin.getText();
				}
			}
			//-------------------------------------------------------------------------------	
			if (!txtVlPreco.getText().isEmpty()) {
				if (w.isEmpty()) {
					w = "p.VL_PRECO = " + txtVlPreco.getText();
				} else {
					w += " and p.VL_PRECO = " + txtVlPreco.getText();
				}
			}
			
			//---------------------------------------------------------------------------------------------------
			if (!w.isEmpty()) {
				q += " WHERE " + w;
			}
			q += " order by p.DS_PRODUTO";
			System.out.println(q);			
			// ----------------------------------------------------------------------------
			try {
				PreparedStatement comando = c.conn.prepareStatement(q);

				ResultSet rs = comando.executeQuery();
				DefaultListModel<String> dfl = new DefaultListModel<String>();

			
				
				
				if (rs.next()) {
					txtCdProduto.setText(rs.getString("p.CD_PRODUTO"));
					txtDsProduto.setText(rs.getString("p.DS_PRODUTO"));
					txtQtEstoque.setText(rs.getString("p.QT_ESTOQUE"));
					txtQtEstoqueMin.setText(rs.getString("p.QT_ESTOQUE_MIN"));
					txtVlPreco.setText(rs.getString("p.VL_PRECO"));
					
				} else {
					txtCdProduto.setText("");
					txtDsProduto.setText("");
					txtQtEstoque.setText("");
					txtQtEstoqueMin.setText("");
					txtVlPreco.setText("");
				}
				
				DefaultListModel<String> dfl1 = new DefaultListModel<String>();
				
				while (rs.next()) {
					dfl1.addElement(rs.getString("p.DS_PRODUTO"));
					
				}
				AreaDados.setModel(dfl1);
				
			} catch (Exception ex) {
				System.err.println("FALHA NA INSERÇÃO(BOX)");
				System.err.println(q);
				ex.printStackTrace();
			} finally {
				if (c.conn != null) {
					try {
						c.conn.close();
					} catch (Exception ex) {
						System.err.println("Erro");
					}
				}
			}

		
		
		}

		private void LimparConsulta() {
			txtCdProduto.setText("");
			txtDsProduto.setText("");
			txtQtEstoque.setText("");
			txtQtEstoqueMin.setText("");
			txtVlPreco.setText("");
		}
			
		private void AlterarDados(){
			Conexao c = new Conexao();
			String q = "";
			
			try {
			q = "UPDATE produto ";
			q += "SET  DS_PRODUTO = ? ,  VL_PRECO = ? ";
			q += "WHERE CD_PRODUTO = ? ";
			
			PreparedStatement comando = c.conn.prepareStatement(q);
			comando.setString(1, txtDsProduto.getText());
			comando.setString(2, txtVlPreco.getText());
			comando.setString(3, txtCdProduto.getText());
			comando.executeUpdate();
			
			

		} catch (Exception ex) {
			System.err.println("FALHA NA INSERÇÃO");
			ex.printStackTrace();
		} finally {
			if (c.conn != null) {
			}try {
					c.conn.close();

		}catch (Exception ex) {
					System.err.println("Error in connection termination!!");
				}
			}
		}
	}
			
	

		
	
	
		
		
	
