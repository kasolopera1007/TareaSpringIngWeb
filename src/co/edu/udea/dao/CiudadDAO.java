/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Interfas ClienteDAO
 */

package co.edu.udea.dao;

//Libreria a utiliozar

import java.util.List;
import co.edu.udea.dto.Ciudad;
import co.edu.udea.exception.MyException;

public interface CiudadDAO {

		///Metodo que se encarga de obtener una lista de ciudades
		public List<Ciudad> obtener() throws MyException;
		
		//Metodo obtener ciudad segun un codigo y en caso de error captura la excepcion.
		public Ciudad obtener(Long codigo) throws MyException; 
		
		//metodo guardar ciudad teniendo en cuenta el usuario que la crea
		public void guardar(Ciudad ciudad) throws MyException;
}
