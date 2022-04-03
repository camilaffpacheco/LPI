package locadoraCarroInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import locadoraCarro.Carro;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CarroInterface {
	
	Carro carro = new Carro();
	ArrayList<Carro> listaCarros = new ArrayList<Carro>();

	private JFrame frmLocadoraDeCarros;
	private JTextField txtMarca;
	private JLabel lblModelo;
	private JTextField txtModelo;
	private JLabel lblCadastrarCarro;
	private JLabel lblCor;
	private JTextField txtCor;
	private JLabel lblPlaca;
	private JTextField txtPlaca;
	private JLabel lblAnoDeFabricao;
	private JTextField txtAnoFabricacao;
	private JLabel lblPreoPorDia;
	private JTextField txtPreco;
	private JButton btnLimpar;
	private JButton btnVer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarroInterface window = new CarroInterface();
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
	public CarroInterface() {
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
		
		txtMarca = new JTextField();
		txtMarca.setBounds(98, 67, 120, 20);
		frmLocadoraDeCarros.getContentPane().add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarca.setBounds(42, 68, 46, 14);
		frmLocadoraDeCarros.getContentPane().add(lblMarca);
		
		lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblModelo.setBounds(293, 68, 63, 14);
		frmLocadoraDeCarros.getContentPane().add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(366, 67, 120, 20);
		frmLocadoraDeCarros.getContentPane().add(txtModelo);
		
		lblCadastrarCarro = new JLabel("Cadastro de Carros");
		lblCadastrarCarro.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCadastrarCarro.setBounds(170, 11, 202, 35);
		frmLocadoraDeCarros.getContentPane().add(lblCadastrarCarro);
		
		lblCor = new JLabel("Cor:");
		lblCor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCor.setBounds(42, 117, 46, 14);
		frmLocadoraDeCarros.getContentPane().add(lblCor);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(98, 116, 120, 20);
		frmLocadoraDeCarros.getContentPane().add(txtCor);
		
		lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlaca.setBounds(293, 117, 63, 14);
		frmLocadoraDeCarros.getContentPane().add(lblPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		txtPlaca.setBounds(366, 116, 120, 20);
		frmLocadoraDeCarros.getContentPane().add(txtPlaca);
		
		lblAnoDeFabricao = new JLabel("Ano de Fabrica\u00E7\u00E3o:");
		lblAnoDeFabricao.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnoDeFabricao.setBounds(42, 164, 176, 14);
		frmLocadoraDeCarros.getContentPane().add(lblAnoDeFabricao);
		
		txtAnoFabricacao = new JTextField();
		txtAnoFabricacao.setColumns(10);
		txtAnoFabricacao.setBounds(42, 189, 120, 20);
		frmLocadoraDeCarros.getContentPane().add(txtAnoFabricacao);
		
		lblPreoPorDia = new JLabel("Pre\u00E7o por Dia:");
		lblPreoPorDia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPreoPorDia.setBounds(42, 232, 176, 14);
		frmLocadoraDeCarros.getContentPane().add(lblPreoPorDia);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(42, 257, 120, 20);
		frmLocadoraDeCarros.getContentPane().add(txtPreco);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(Color.GREEN);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				carro.setMarca(txtMarca.getText());
				carro.setModelo(txtModelo.getText());
				carro.setCor(txtCor.getText());
				carro.setPlaca(txtPlaca.getText());
				carro.setAnoFabricacao(txtAnoFabricacao.getText());
				carro.setPrecoPorDia(txtPreco.getText());
				
				listaCarros.add(carro);
				
				txtMarca.setText("");
				txtModelo.setText("");
				txtCor.setText("");
				txtPlaca.setText("");
				txtAnoFabricacao.setText("");
				txtPreco.setText("");
					
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastrar.setBounds(42, 326, 120, 23);
		frmLocadoraDeCarros.getContentPane().add(btnCadastrar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMarca.setText("");
				txtModelo.setText("");
				txtCor.setText("");
				txtPlaca.setText("");
				txtAnoFabricacao.setText("");
				txtPreco.setText("");
			}
		});
		btnLimpar.setBackground(Color.RED);
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpar.setBounds(183, 326, 120, 23);
		frmLocadoraDeCarros.getContentPane().add(btnLimpar);
		
		btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carro.visualizarCarro(carro);
			}
		});
		btnVer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVer.setBackground(new Color(65, 105, 225));
		btnVer.setBounds(324, 326, 120, 23);
		frmLocadoraDeCarros.getContentPane().add(btnVer);
	}
}
