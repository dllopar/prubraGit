package ar.edu.unlam.pb2.tragamonedas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TamborTest {
	@Test
	public void testQueCuandoSeaCreadoValgaUno() {
		//preparacion
		Integer valorInicial=1;
		Tambor miTambor = new Tambor(valorInicial);
		Integer valorEsperado=1;
		//ejecucion
		Integer valorObtenido = miTambor.mostrar();
		//contrastacion
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void testQueCuandoGireYSoliciteValorSeaEntreUnoYCinco() {
		//preparacion
		Integer valorInicial=1;
		Tambor miTambor = new Tambor(valorInicial);
		Integer menor=1;
		Integer mayor=5;
		Integer valorObtenido =valorInicial;
		//ejecucion
		miTambor.girar();
		valorObtenido=miTambor.mostrar();
		//contrastacion
		assertTrue((menor<=valorObtenido)&&(mayor>=valorObtenido));
	}	

}
