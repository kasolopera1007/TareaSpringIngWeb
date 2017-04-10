/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Test ClienteDAOIMplementacion
 */

package co.edu.udea.dao.imp;

//Libreria a utiliozar

import static org.junit.Assert.*;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import co.edu.udea.dao.ClienteDAO;
import co.edu.udea.dto.Cliente;
import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;

// Anotaciones para correr el test, indicar el tipo de clase y ubicar el archivo de configuracion de spring
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional 
@ContextConfiguration(locations="classpath:SpringConfig.xml") 

public class ClienteDAOImpTest {

	// Hace la inyeccion de depencias en el archivo de confihguracion de spring
	@Autowired
	private ClienteDAO clienteDAO;
	
	// Condigo que realiza la prueba de obtener el listado de clientes sobre ClienteDAOImp y en caso de error captura la excepcion.
	@Test
	public void testObtener() {
		List<Cliente> resultado = null;
		
		try{
			resultado = clienteDAO.obtener();
			for(Cliente cliente:resultado){
			    System.out.println(cliente.getNombres());
			}
			assertTrue(resultado.size()>0);
		}catch(MyException e){
			fail(e.getMessage());
		}
	}

	// Condigo que realiza la prueba de guardar un cliente nuevo guardando como parametro que usuario crea el clienteen ClienteDAOImp y en caso de error captura la excepcion.
	@Test
	public void testGuardar() {
		Cliente cliente = null;
		Usuario usuario= null;
		
		try{
			cliente = new Cliente();
			cliente.setCedula("3344");
			cliente.setNombres("Sandra Viviana");
			cliente.setApellidos("Londono");
			cliente.setEmail("sviviana.londono@udea.edu.co");
			
			usuario = new Usuario();
			usuario.setLogin("elver");
			cliente.setUsuarioCrea(usuario);
			cliente.setFechaCreacion(new Date());
			clienteDAO.guardar(cliente);
			
		}catch(MyException e){
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
