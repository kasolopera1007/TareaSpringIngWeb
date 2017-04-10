/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Interfas ClienteDAO
 */

package co.edu.udea.dao;

//Libreria a utiliozar

import java.util.List;
import co.edu.udea.dto.Cliente;
import co.edu.udea.exception.MyException;

public interface ClienteDAO {

	
	//Metodo que obtiene una lista de clientes
	public List<Cliente> obtener()  throws MyException;
	
	//Metodo que se encarga de gusradar un cliente nuevo
	public void guardar(Cliente cliente) throws MyException;
}
