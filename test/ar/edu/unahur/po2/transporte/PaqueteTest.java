package ar.edu.unahur.po2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaqueteTest {

	@Test
	public void queUnpaqueteSepaInformarSuPeso() {
		Double alto = 0.1;
		Double ancho = 0.1;
		Double profundo = 0.1;
		Double peso = 0.1;
		Paquete p1 = new Paquete(alto, ancho, profundo, peso);
		
		Double resultadoEsperado = peso;
		Double resultadoObtenido = p1.getPeso();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void queUnPaqueteSepaInformarSuVolumen(){
		Double alto = 1.0;
		Double ancho = 1.0;
		Double profundo = 1.0;
		Double peso = 1.0;
		Paquete p1 = new Paquete(alto, ancho, profundo, peso);
		
		Double resultadoEsperado = 1.0;
		Double resultadoObtenido = p1.getVolumen();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
