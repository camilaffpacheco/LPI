package Prova;

public class Sofas { 

    private String cor;
    private String tamanho;
    private Double preco;

    public Sofas(String cor, String tamanho, Double preco){
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }
    
    public void verSofas(Sofas sofa) {
    	System.out.println(
    			"Cor: " + sofa.cor + "\r\n" +
    			"Tamanho: " + sofa.tamanho + "\r\n" +
    			"Preço: " + sofa.preco 
    	);
    }
    
    public void verTamanhoCor(String tamanho, String cor) {
    	System.out.println("O sofá de cor: " + cor + "tem tamanho: " + tamanho);
    }
    
    public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public static void main(String args[]) {
    	Sofas S1 = new Sofas("Cinza", "180 cm", 1856.80);
    	Sofas S2 = new Sofas("Branco", "200 cm", 2040.90);
		
		S1.verSofas(S1);
		S1.verTamanhoCor(S1.tamanho, S1.cor);
		
		S2.verSofas(S2);
		S2.verTamanhoCor(S2.tamanho, S2.cor);
	}
    

}
