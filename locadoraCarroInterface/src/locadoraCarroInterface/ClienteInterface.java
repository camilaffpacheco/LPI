package locadoraCarroInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import locadoraCarro.Cliente;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ClienteInterface {
	
	Cliente cliente = new Cliente();
	ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	private JFrame frmLocadoraDeCarros;
	private JTextField txtNome;
	private JLabel lblModelo;
	private JTextField txtCPF;
	private JLabel lblCadastrarCarro;
	private JLabel lblCor;
	private JTextField txtDataNasc;
	private JLabel lblPlaca;
	private JTextField txtRG;
	private JLabel lblAnoDeFabricao;
	private JTextField txtEndereco;
	private JButton btnLimpar;
	private JButton btnVer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteInterface window = new ClienteInterface();
					window.frmLocadoraDeCarros.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClienteInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLocadoraDeCarros = new JFrame();
		frmLocadoraDeCarros.setTitle("Locadora de Carros");
		frmLocadoraDeCarros.setBounds(100, 100, 546, 415);
		frmLocadoraDeCarros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLocadoraDeCarros.getContentPane().setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(98, 67, 202, 20);
		frmLocadoraDeCarros.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblMarca = new JLabel("Nome:");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarca.setBounds(42, 68, 46, 14);
		frmLocadoraDeCarros.getContentPane().add(lblMarca);
		
		lblModelo = new JLabel("CPF:");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblModelo.setBounds(310, 68, 46, 14);
		frmLocadoraDeCarros.getContentPane().add(lblModelo);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(366, 67, 120, 20);
		frmLocadoraDeCarros.getContentPane().add(txtCPF);
		
		lblCadastrarCarro = new JLabel("Cadastro de Clientes");
		lblCadastrarCarro.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCadastrarCarro.setBounds(164, 11, 212, 35);
		frmLocadoraDeCarros.getContentPane().add(lblCadastrarCarro);
		
		lblCor = new JLabel("Data de Nascimento:");
		lblCor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCor.setBounds(42, 117, 158, 14);
		frmLocadoraDeCarros.getContentPane().add(lblCor);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setColumns(10);
		txtDataNasc.setBounds(200, 116, 100, 20);
		frmLocadoraDeCarros.getContentPane().add(txtDataNasc);
		
		lblPlaca = new JLabel("RG:");
		lblPlaca.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlaca.setBounds(310, 117, 63, 14);
		frmLocadoraDeCarros.getContentPane().add(lblPlaca);
		
		txtRG = new JTextField();
		txtRG.setColumns(10);
		txtRG.setBounds(366, 116, 120, 20);
		frmLocadoraDeCarros.getContentPane().add(txtRG);
		
		lblAnoDeFabricao = new JLabel("Endere\u00E7o:");
		lblAnoDeFabricao.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnoDeFabricao.setBounds(42, 164, 176, 14);
		frmLocadoraDeCarros.getContentPane().add(lblAnoDeFabricao);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(42, 189, 444, 20);
		frmLocadoraDeCarros.getContentPane().add(txtEndereco);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(Color.GREEN);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cliente.setNome(txtNome.getText());
				cliente.setCPF(txtCPF.getText());
				cliente.setRG(txtRG.getText());
				cliente.setDataNasc(txtDataNasc.getText());
				cliente.setEndereco(txtEndereco.getText());
				
				listaClientes.add(cliente);
				
				txtNome.setText("");
				txtCPF.setText("");
				txtRG.setText("");
				txtDataNasc.setText("");
				txtEndereco.setText("");
					
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastrar.setBounds(42, 326, 120, 23);
		frmLocadoraDeCarros.getContentPane().add(btnCadastrar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtCPF.setText("");
				txtDataNasc.setText("");
				txtRG.setText("");
				txtEndereco.setText("");
			}
		});
		btnLimpar.setBackground(Color.RED);
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpar.setBounds(183, 326, 120, 23);
		frmLocadoraDeCarros.getContentPane().add(btnLimpar);
		
		btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente.visualizarCliente(cliente);
			}
		});
		btnVer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVer.setBackground(new Color(65, 105, 225));
		btnVer.setBounds(324, 326, 120, 23);
		frmLocadoraDeCarros.getContentPane().add(btnVer);
	}
}
