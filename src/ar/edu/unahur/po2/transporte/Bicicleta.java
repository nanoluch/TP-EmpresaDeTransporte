package ar.edu.unahur.po2.transporte;

public class Bicicleta extends Transporte {

	private Double pesoMaximo = 15.0;
	private String destino;
	@Override
	protected Boolean cargar(Paquete paquete, String destino) {
		if (this.destino == null) {
			this.destino = destino;
		}

		if (this.sePuedeCargar(paquete, destino)) {
			this.paquetes.add(paquete);
			return true;
		}
		return false;
	}
	protected Boolean sePuedeCargar(Paquete paquete, String destino) {
		
		return this.paquetes.size() < 2 
				&& paquete.getPeso() <= this.pesoMaximo 
				&& paquete.getVolumen() <= 0.125
				&& this.destino.equals(destino);
	}

	public Integer getCantidadDePaquetes() {
		return this.paquetes.size();
	}

	public String getDestino() {
		return this.destino;
	}

}
