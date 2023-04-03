package Estoque;

public class Camiseta {
	
	private int numeroCamisetas;
	private String tamanho;
	private String camiseta;
	
	public Camiseta(int numeroCamisetas, String tamanho) {
        this.numeroCamisetas = numeroCamisetas;
        this.tamanho = tamanho;
	}
	

	public void setNumeroCamisetas (int numeroCamisetas) {
		this.numeroCamisetas = numeroCamisetas;

	}

	public int getNumeroCamisetas() {
		return numeroCamisetas;
	}
	
	public void setCamiseta(String camiseta){
        this.camiseta = camiseta;
	}
	
	public String getCamiseta(){
        return camiseta;
    }
	
	public String getTamanho(){
        return tamanho;
    }


}
	
	
	
	
	
