/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Clase DireccionId
 */

package co.edu.udea.dto;

//Libreria a utiliozar

import java.io.Serializable;

//En esta clase ese encuentra el constructor y los metodos de acceso y modificacion de la clase DireccionId
public class DireccionId implements Serializable {
	private Long codigo;
	private Cliente cliente;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
