/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Clase Rol
 */

package co.edu.udea.dto;

//En esta clase ese encuentra el constructor y los metodos de acceso y modificacion de la clase Rol
public class Rol {
	private String codigo;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
