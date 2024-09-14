package ar.edu.unahur.po2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutomovilTest {
	//AutomovilMain
	Automovil auto = new Automovil();
	
	//PaqueteChico - 0.125Volumen, 1Kg
	Double altoPC = 0.5;Double anchoPC = 0.5;Double profundidadPC = 0.5;Double pesoPC = 1.0;
	Paquete paqueteChico1 = new Paquete(altoPC, anchoPC, profundidadPC, pesoPC);
	Paquete paqueteChico2 = new Paquete(altoPC, anchoPC, profundidadPC, pesoPC);
	Paquete paqueteChico3 = new Paquete(altoPC, anchoPC, profundidadPC, pesoPC);
	//PaqueteMediano 0.512Volumen, 10Kg
	Double altoPM = 0.8;Double anchoPM = 0.8;Double profundidadPM = 0.8;Double pesoPM = 10.0;
	Paquete paqueteMediano = new Paquete(altoPM, anchoPM, profundidadPM, pesoPM);
	//PaqueteGrande 1.0 Volumen 100kg
	Double altoPG = 1.0;Double anchoPG = 1.0;Double profundidadPG = 1.0;Double pesoPG = 100.0;
	Paquete paqueteGrande1 = new Paquete(altoPG, anchoPG, profundidadPG, pesoPG);
	Paquete paqueteGrande2 = new Paquete(altoPG, anchoPG, profundidadPG, pesoPG);
	Paquete paqueteGrande3 = new Paquete(altoPG, anchoPG, profundidadPG, pesoPG);
	//PaqueteDenso 0.512Volumen, 300kg
	Double altoPD = 0.8;Double anchoPD = 0.8;Double profundidadPD = 0.8;Double pesoPD = 300.0;
	Paquete paqueteDenso1 = new Paquete(altoPD, anchoPD, profundidadPD, pesoPD);
	Paquete paqueteDenso2 = new Paquete(altoPD, anchoPD, profundidadPD, pesoPD);
	@Test
	public void queUnAutomovilPuedaCargarPaquetes() {
		assertTrue(auto.cargar(paqueteChico1, "Morón"));
		assertTrue(auto.cargar(paqueteMediano, "Merlo"));
		assertTrue(auto.cargar(paqueteGrande1, "Haedo"));
	}
	@Test
	public void queUnAutomovilNoPuedaCargarMasDe500kg() {
		assertTrue(auto.cargar(paqueteDenso1, "Morón"));
		assertFalse(auto.cargar(paqueteDenso2, "Morón"));
	}
	@Test
	public void queUnAutomovilNoTengaMasDe_2m3DeCarga() {
		assertTrue(auto.cargar(paqueteGrande1, "Morón"));
		assertTrue(auto.cargar(paqueteGrande2, "Merlo"));
		assertFalse(auto.cargar(paqueteGrande3, "Haedo"));
		
	}
	@Test
	public void queUnAutoSepaResponderLaCantidadDeDestinos() {
		Integer valorEsperado = 1;
		auto.cargar(paqueteChico1, "Morón");
		Integer valorObtenido = auto.cantidadDeDestinos();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queUnAutomovilTengaMasDeUnDestino() {
		Integer valorEsperado = 2;
		assertTrue(auto.cargar(paqueteGrande1, "Morón"));
		assertTrue(auto.cargar(paqueteGrande2, "Merlo"));
		Integer valorObtenido = auto.cantidadDeDestinos();
		assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	public void queLosDestinosDeLosPaquetesNoSeRepitan() {
		Integer valorEsperado = 1;
		assertTrue(auto.cargar(paqueteChico1, "Morón"));
		assertFalse(auto.cargar(paqueteMediano, "Morón"));
		Integer valorObtenido = auto.cantidadDeDestinos();
		assertEquals(valorEsperado, valorObtenido);
		
	}
	@Test
	public void queLosDestinosDeLosPaquetesNoSuperenLosTresDestinos() {
		Integer valorEsperado = 3;
		assertTrue(auto.cargar(paqueteChico1, "Morón"));
		assertFalse(auto.cargar(paqueteChico1, "Morón"));
		assertTrue(auto.cargar(paqueteChico1, "Merlo"));
		assertTrue(auto.cargar(paqueteChico1, "Ituzaingó"));
		assertFalse(auto.cargar(paqueteChico1, "Villa Tesei"));
		Integer valorObtenido = auto.cantidadDeDestinos();
		assertEquals(valorEsperado, valorObtenido);
	}

}
