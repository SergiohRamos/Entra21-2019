package principal;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import beans.ProdutoBean;
import dao.ProdutoDao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroProduto extends JInternalFrame {
	private JTextField txtCdProduto;
	private JTextField txtDsProduto;
	private JTextField txtPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProduto frame = new CadastroProduto();
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
	public CadastroProduto() {
		setClosable(true);
		setResizable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel CD_PRODUTO = new JLabel("Codigo:");
		CD_PRODUTO.setBounds(10, 11, 46, 14);
		getContentPane().add(CD_PRODUTO);
		
		txtCdProduto = new JTextField();
		txtCdProduto.setBounds(66, 8, 86, 20);
		getContentPane().add(txtCdProduto);
		txtCdProduto.setColumns(10);
		
		JLabel DS_PRODUTO = new JLabel("Descri\u00E7\u00E3o:\r\n");
		DS_PRODUTO.setBounds(10, 68, 57, 14);
		getContentPane().add(DS_PRODUTO);
		
		txtDsProduto = new JTextField();
		txtDsProduto.setBounds(66, 65, 86, 20);
		getContentPane().add(txtDsProduto);
		txtDsProduto.setColumns(10);
		
		JLabel VL_PRECO = new JLabel("Pre\u00E7o:");
		VL_PRECO.setBounds(10, 127, 46, 14);
		getContentPane().add(VL_PRECO);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(66, 124, 86, 20);
		getContentPane().add(txtPreco);
		txtPreco.setColumns(10);
		
		JButton botSalvar = new JButton("Salvar");
		botSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ProdutoBean p = new ProdutoBean();
			p.setProduto(txtDsProduto.getText());
			p.setValor(Double.parseDouble(txtPreco.getText()));
			ProdutoDao Dao = new ProdutoDao();
			Dao.cadastrar(p);
			}
		});
		botSalvar.setBounds(10, 236, 89, 23);
		getContentPane().add(botSalvar);

	}
}
