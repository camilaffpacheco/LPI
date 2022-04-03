package locadoraCarro;

public class Carro {

	String marca;
	String modelo;
	String cor;
	String placa;
	String anoFabricacao;
	String precoPorDia;
	
	public Carro(String marca, String modelo, String cor, String placa, String anoFabricacao, String precoPorDia) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.precoPorDia = precoPorDia;
	}
	
	public Carro() {
		
	}
	
	public void visualizarCarro(Carro carro) {
		System.out.println(
			"INFORMAÇÕES DO CARRO" + "\r\n" +
			"Marca: " + carro.marca + "\r\n" +
			"Modelo: " + carro.modelo + "\r\n" +
			"Cor: " + carro.cor + "\r\n" +
			"Placa " + carro.placa + "\r\n" +
			"Ano da Fabricação: " + carro.anoFabricacao + "\r\n" +
			"Preço por dia: " + carro.precoPorDia + "\r\n" 
		);
	}
	
	public void verPrecoPorDia(String placa, String precoPorDia) {
		System.out.println("O carro de placa " + placa + " custa R$" + precoPorDia + " por dia");
	}
	
	public void verAnoFabricacao(String placa, String anoFabricacao) {
		System.out.println("O carro de placa " + placa + " foi fabricado em " + anoFabricacao);
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getPrecoPorDia() {
		return precoPorDia;
	}

	public void setPrecoPorDia(String precoPorDia) {
		this.precoPorDia = precoPorDia;
	}

	public static void main(String args[]) {
		Carro C1 = new Carro("Hyundai", "HB20", "Prata", "EPL-1796", "2010", "700.50");
		
		Carro C2	= new Carro("Volkswagen", "Gol", "Preto", "GDB2C95", "2022", "102.90");
		
		C1.visualizarCarro(C1);
		C1.verPrecoPorDia(C1.placa, C1.precoPorDia);
		C1.verAnoFabricacao(C1.placa, C1.anoFabricacao);
		
		C2.visualizarCarro(C2);
		C2.verPrecoPorDia(C2.placa, C2.precoPorDia);
		C2.verAnoFabricacao(C2.placa, C2.anoFabricacao);
	}
}
