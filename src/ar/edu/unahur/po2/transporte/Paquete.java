package ar.edu.unahur.po2.transporte;

public class Paquete {

	private Double alto;
	private Double ancho;
	private Double profundidad;
	private Double peso;

	public Paquete(Double alto, Double ancho, Double profundidad, Double peso) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.peso = peso;
	}

	public Double getPeso() {
		// TODO Auto-generated method stub
		return this.peso;
	}

	public Double getVolumen() {
		// TODO Auto-generated method stub
		return this.alto * this.ancho * this.profundidad;
	}
}
