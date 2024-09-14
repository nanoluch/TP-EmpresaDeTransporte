package ar.edu.unahur.po2.transporte;

import java.util.LinkedList;

public class Automovil extends Transporte{


	private Double pesoActual = 0.0;
	private Double pesoMaximo = 500.0;
	private Double volumenActual = 0.0;
	private Double volumenMaximo = 2.0;
	private LinkedList<Object> destinos = new LinkedList<Object>();
	
	@Override
	protected Boolean cargar(Paquete paquete, String destino) {
		if(this.sePuedeCargar(paquete, destino)) {			
			this.paquetes .add(paquete);
			this.pesoActual += paquete.getPeso();
			this.volumenActual += paquete.getVolumen();
			this.destinos.add(destino);
			return true;
		}
		return false;
	}

	protected Boolean sePuedeCargar(Paquete paquete, String destino) {
		Boolean pesoValido =  pesoActual + paquete.getPeso() <= this.pesoMaximo;
		Boolean volumenValido = volumenActual  + paquete.getVolumen() <= this.volumenMaximo ;
		return pesoValido && volumenValido && this.destinoValido(destino);
	}

	private boolean destinoValido(String destino) {
		if(!destinos.contains(destino)) {
			return this.cantidadDeDestinos() < 3;
		}
		return false;
	}

	public Integer cantidadDeDestinos() {
		
		return destinos.size();
	}

}
