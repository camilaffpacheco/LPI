package locadoraCarro;

public class Cliente {

	String nome;
	String CPF;
	String RG;
	String dataNasc;
	String endereco;
	
	public Cliente(String nome, String CPF,	String RG, String dataNasc, String endereco) {
		this.nome = nome;
		this.CPF = CPF;
		this.RG = RG;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
	}
	
	public void visualizarCliente(Cliente cliente) {
		System.out.println(
			"INFORMAÇÕES DO CLIENTE" + "\r\n" +
			"Nome: " + cliente.nome + "\r\n" +
			"CPF: " + cliente.CPF + "\r\n" +
			"RG: " + cliente.RG + "\r\n" +
			"Data de Nascimento: " + cliente.dataNasc + "\r\n" +
			"Endereço: " + cliente.endereco + "\r\n"
				
		);
	}
	
	public void verEnderecoCliente(String nome, String endereco) {
		System.out.println(nome + " mora no endereço: " + endereco);
	}
	
	public static void main(String args[]) {
		Cliente C1 = new Cliente("Marcia", "360.520.742-80", "60.563.719-5", "01/05/1998",
				"Rua Dois, 300 - Centro");
		
		Cliente C2	= new Cliente("Eduardo", "680.952.852-60", "57.177.496-1", "30/01/1986",
				"Rua Oito, 270 - Centro");
		
		C1.visualizarCliente(C1);
		C1.verEnderecoCliente(C1.nome, C1.endereco);
		
		C2.visualizarCliente(C2);
		C2.verEnderecoCliente(C2.nome, C2.endereco);
	}
	
}
