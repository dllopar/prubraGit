package ar.edu.unlam.pb2.tragamonedas;

public class Tragamonedas {
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	public Tragamonedas(Tambor tambor1, Tambor tambor2, Tambor tambor3) {
		this.tambor1 = tambor1;
		this.tambor2 = tambor2;
		this.tambor3 = tambor3;
	}
	
	public void activar() {
		this.tambor1.girar();
		this.tambor2.girar();
		this.tambor3.girar();
		
	}
	
	public boolean entregaPremio() {
		return this.tambor1.mostrar().equals(tambor2.mostrar()
				.equals(tambor3.mostrar()));
	}

}
