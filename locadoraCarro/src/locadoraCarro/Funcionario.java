package locadoraCarro;

public class Funcionario {

	String nome;
	String CPF;
	String RG;
	String dataNasc;
	String endereco;
	int codigo;
	Double salario;
	
	public Funcionario(String nome, String CPF,	String RG, String dataNasc, String endereco, int codigo, Double salario) {
		this.nome = nome;
		this.CPF = CPF;
		this.RG = RG;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.codigo = codigo;
		this.salario = salario;
	}
	
	public void salarioFuncionario(String nome, Double salario) {
		System.out.println(nome + " possui um salário de R$" + salario + " mensais");
	}
	
	public void visualizarFuncionario(Funcionario funcionario) {
		System.out.println(
			"INFORMAÇÕES DO FUNCIONÁRIO" + "\r\n" +
			"Nome: " + funcionario.nome + "\r\n" +
			"CPF: " + funcionario.CPF + "\r\n" +
			"RG: " + funcionario.RG + "\r\n" +
			"Data de Nascimento: " + funcionario.dataNasc + "\r\n" +
			"Endereço: " + funcionario.endereco + "\r\n" +
			"Código: " + funcionario.codigo + "\r\n" +
			"Salário: " + funcionario.salario
				
		);
	}
	
	public void documentosFuncionario(String nome, String CPF,	String RG) {
		System.out.println(nome + " possui o CPF de número " + CPF + " e o RG de número " + RG);
	}
	
	public static void main(String args[]) {
		Funcionario F1 = new Funcionario("Camila", "510.350.985-52", "59.505.604-3", "25/10/2000",
				"Rua Um, 100 - Centro", 010, 1782.65);
		
		Funcionario F2	= new Funcionario("Maria", "509.650.852-70", "58.207.426-7", "17/08/1995",
				"Rua Dez, 250 - Centro", 020, 2210.20);
		
		F1.visualizarFuncionario(F1);
		F1.documentosFuncionario(F1.nome, F1.CPF, F1.RG);
		F1.salarioFuncionario(F1.nome, F1.salario);
		
		F2.visualizarFuncionario(F2);
		F2.documentosFuncionario(F2.nome, F2.CPF, F2.RG);
		F2.salarioFuncionario(F2.nome, F2.salario);
	}
}
