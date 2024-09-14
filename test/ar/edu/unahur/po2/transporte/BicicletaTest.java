package ar.edu.unahur.po2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletaTest {
	//PaqueteChico
	Double altoPC = 0.1;
	Double anchoPC = 0.1;
	Double profundidadPC = 0.1;
	Double pesoPC = 0.1;
	Paquete paqueteChico = new Paquete(altoPC, anchoPC, profundidadPC, pesoPC);
	//Bicicleta Main
	Bicicleta bici = new Bicicleta();

	@Test
	public void queSePuedaCargarUnPaquetePequenio() {
		Boolean valorEsperado = true;		
		Boolean valorObtenido = bici.cargar(paqueteChico, "Hurlingham");
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queNoSePuedaSuperarElLimiteDePaquetes() {
		Integer valorEsperado = 2;
		// Alto, ancho, profundidad, peso
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 0.1);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 0.1);

		assertTrue(bici.cargar(paqueteChico, "Hurlingham"));
		assertTrue(bici.cargar(p2, "Hurlingham"));
		assertFalse(bici.cargar(p3, "Hurlingham"));
		Integer valorObtenido = bici.getCantidadDePaquetes();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queNoSePuedaCargarConPesoExcedido() {
		// Alto, ancho, profundidad, peso
		Paquete p1 = new Paquete(0.5, 0.5, 0.5, 15.1);
		assertFalse(bici.cargar(p1, "Hurlingham"));
	}
	@Test
	public void queNoSePuedaCargarConVolumenExcedido() {
		// Alto, ancho, profundidad, peso
		Paquete p1 = new Paquete(0.9, 0.9, 0.9, 15.1);
		assertFalse(bici.cargar(p1, "Hurlingham"));
	}
	@Test
	public void queNoSePuedaCargarDestinosDistintos() {
		String valorEsperado = "Hurlingham";
		// Alto, ancho, profundidad, peso
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 0.1);
		assertTrue(bici.cargar(paqueteChico, "Hurlingham"));
		assertFalse(bici.cargar(p2, "El Palomar"));
		String valorObtenido = bici.getDestino();
		assertEquals(valorEsperado, valorObtenido);
		
	}

}
