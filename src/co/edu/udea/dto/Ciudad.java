/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Clase Ciudad
 */

package co.edu.udea.dto;

//En esta clase ese encuentra el constructor y los metodos de acceso y modificacion de la clase Ciudad
public class Ciudad {
	private long codigo;
	private String nombre;
	private String codigoArea;
	
	public long getCodigo(){
		return this.codigo;
	}
	
	public void setCodigo(long codigo){
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	
}
