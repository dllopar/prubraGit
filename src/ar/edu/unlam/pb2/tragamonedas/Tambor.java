package ar.edu.unlam.pb2.tragamonedas;

public class Tambor {
	private Integer valor;
	
	public Tambor(Integer valor) {
		this.valor=valor;
	}
	
	public void girar() {
		
		this.valor = (int)(Math.random()*5)+1;
	}
	
	public Integer mostrar() {
		return valor;
		
	}
	
	

}
