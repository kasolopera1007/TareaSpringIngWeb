/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Interfas UsuarioDAO
 */

package co.edu.udea.dao;

//Libreria a utiliozar

import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;

//Metodo que obtiene un usuario teniendo como parametro un usuario logueado
public interface UsuarioDAO {

	public Usuario obtener(String login) throws MyException; 
}