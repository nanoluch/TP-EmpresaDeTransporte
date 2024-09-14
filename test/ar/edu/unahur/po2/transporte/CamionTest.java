package ar.edu.unahur.po2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CamionTest {

	//AutomovilMain
		Camion camion = new Camion();
		
		//PaqueteChico - 0.125Volumen, 1Kg
		Double altoPC = 0.5;Double anchoPC = 0.5;Double profundidadPC = 0.5;Double pesoPC = 1.0;
		Paquete paqueteChico1 = new Paquete(altoPC, anchoPC, profundidadPC, pesoPC);
		//PaqueteMediano 0.512Volumen, 10Kg
		Double altoPM = 0.8;Double anchoPM = 0.8;Double profundidadPM = 0.8;Double pesoPM = 10.0;
		Paquete paqueteMediano = new Paquete(altoPM, anchoPM, profundidadPM, pesoPM);
		//PaqueteGrande 1.0 Volumen 100kg
		Double altoPG = 1.0;Double anchoPG = 1.0;Double profundidadPG = 1.0;Double pesoPG = 100.0;
		Paquete paqueteGrande1 = new Paquete(altoPG, anchoPG, profundidadPG, pesoPG);
		Paquete paqueteGrande2 = new Paquete(altoPG, anchoPG, profundidadPG, pesoPG);
		Paquete paqueteGrande3 = new Paquete(altoPG, anchoPG, profundidadPG, pesoPG);
		//PaqueteDenso 0.512Volumen, 300kg
		Double altoPD = 0.8;Double anchoPD = 0.8;Double profundidadPD = 0.8;Double pesoPD = 7_000.0;
		Paquete paqueteDenso1 = new Paquete(altoPD, anchoPD, profundidadPD, pesoPD);
		Paquete paqueteDenso2 = new Paquete(altoPD, anchoPD, profundidadPD, pesoPD);
		Paquete paqueteDenso3 = new Paquete(altoPD, anchoPD, profundidadPD, pesoPD);
		
		//PaqueteNoDenso 8Volumen, 300kg
		Double altoPND = 2.0;Double anchoPND = 2.0;Double profundidadPND = 2.0;Double pesoPND = 300.0;
		Paquete paqueteNoDenso1 = new Paquete(altoPND, anchoPND, profundidadPND, pesoPND);
		Paquete paqueteNoDenso2 = new Paquete(altoPND, anchoPND, profundidadPND, pesoPND);
		Paquete paqueteNoDenso3 = new Paquete(altoPND, anchoPND, profundidadPND, pesoPND);
		
		
		@Test
		public void queUnCamionPuedaCargarPaquetes() {
			assertTrue(camion.cargar(paqueteChico1, "Morón"));
			assertTrue(camion.cargar(paqueteMediano, "Morón"));
			assertTrue(camion.cargar(paqueteGrande1, "Morón"));
		}
		@Test
		public void queUnCamionNoPuedaCargarMasDe16_000kg() {
			assertTrue(camion.cargar(paqueteDenso1, "Morón"));
			assertTrue(camion.cargar(paqueteDenso2, "Morón"));
			assertFalse(camion.cargar(paqueteDenso3, "Morón"));
		}
		@Test
		public void queUnCamionNoTengaMasDe20m3DeCarga() {
			assertTrue(camion.cargar(paqueteNoDenso1, "Morón"));
			assertTrue(camion.cargar(paqueteNoDenso2, "Morón"));
			assertFalse(camion.cargar(paqueteNoDenso3, "Morón"));
			
		}
		@Test
		public void queUnCamionSepaResponderLaCantidadDeDestinos() {
			Integer valorEsperado = 1;
			camion.cargar(paqueteChico1, "Morón");
			Integer valorObtenido = camion.cantidadDeDestinos();
			assertEquals(valorEsperado, valorObtenido);
		}
		
		@Test
		public void queUnCamionTengaMasDeUnDestino() {
			Integer valorEsperado = 2;
			assertTrue(camion.cargar(paqueteGrande1, "Morón"));
			assertTrue(camion.cargar(paqueteGrande2, "Merlo"));
			Integer valorObtenido = camion.cantidadDeDestinos();
			assertEquals(valorEsperado, valorObtenido);
		}
		

}
