/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Test CiudadDAOImplementacion
 */

package co.edu.udea.dao.imp;

//Libreria a utiliozar

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import co.edu.udea.dao.CiudadDAO;
import co.edu.udea.dto.Ciudad;
import co.edu.udea.exception.MyException;

// Anotaciones para correr el test, indicar el tipo de clase y ubicar el archivo de configuracion de spring
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations="classpath:SpringConfig.xml")

public class CIudadDAOImpTest {
	
	// Hace la inyeccion de depencias en el archivo de confihguracion de spring
	@Autowired
	private CiudadDAO ciudadDAO;

	// Condigo que realiza la prueba de obtener una lista de Ciudades sobre CiudadDAOImp y en caso de error captura la excepcion.
	public void testObtener() {
		List <Ciudad> ciudades = null;
		try{
			ciudades = ciudadDAO.obtener();
			assertTrue(ciudades.size()>0);   
			
		}
		catch(MyException e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	// Condigo que realiza la prueba de obtener una ciudad con el parametro codigo de la ciudad y confirma que l nombre sea Medellin sobre CiudadDAOImp y en caso de error captura la excepcion.
	@Test
	public void testObtener1() {
		Ciudad ciudad = null;
		try
		{
			ciudad = ciudadDAO.obtener(1l);
			assertEquals(ciudad.getNombre(),"Medellin");
		}
		catch(MyException e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	

}
