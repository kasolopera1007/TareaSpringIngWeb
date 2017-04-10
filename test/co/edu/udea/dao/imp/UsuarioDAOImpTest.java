/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Test UsuarioDAOImplementacion
 */

package co.edu.udea.dao.imp;


//Libreria a utiliozar

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import co.edu.udea.dao.UsuarioDAO;
import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;

// Anotaciones para correr el test, indicar el tipo de clase y ubicar el archivo de configuracion de spring
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations="classpath:SpringConfig.xml")


public class UsuarioDAOImpTest {
	
	// Hace la inyeccion de depencias en el archivo de confihguracion de spring
	@Autowired
	private UsuarioDAO usuarioDAO;

	// Condigo que realiza la prueba de obtener un usuario sobre UsuarioDAOImp y en caso de error captura la excepcion.
	@Test
	public void testObtener() {
		Usuario usuario = null;
		try
		{
			usuario = usuarioDAO.obtener("elver");
			assertEquals(usuario.getNombres(), "Elver");
			System.out.println("Nombre " + usuario.getNombres() + " Rol:" +usuario.getRol().getNombre());
		}
		catch(MyException e)
		{
			fail(e.getMessage());
		}
	}

}
