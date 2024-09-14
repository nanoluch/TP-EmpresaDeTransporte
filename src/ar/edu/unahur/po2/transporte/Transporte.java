package ar.edu.unahur.po2.transporte;

import java.util.LinkedList;

public abstract class Transporte {
	protected LinkedList<Paquete> paquetes = new LinkedList<Paquete>();
	
	protected abstract Boolean cargar(Paquete paquete, String destino);
	protected abstract Boolean sePuedeCargar(Paquete paquete, String destino);
}
