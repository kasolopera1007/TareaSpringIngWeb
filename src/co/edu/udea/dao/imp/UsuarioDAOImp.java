/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Clase UsuarioDAOImplementacion
 */

package co.edu.udea.dao.imp;

//Libreria a utiliozar

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import co.edu.udea.dao.UsuarioDAO;
import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;


public class UsuarioDAOImp implements UsuarioDAO{
	
private SessionFactory sessionFactory;
	
	//Metodo que retorna una sessionFactory
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	//Metodo que ingresa los parametros de un sessionFactory
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	//Implementacion del metodo que obtiene un usuario teniendo como parametro un usuario logueado y en caso de error captura la excepcion.
	@Override
	public Usuario obtener(String login) throws MyException {
		Usuario usuario= new Usuario();
		Session session = null;
		try{
			//session = DataSource.getInstance().getSession();
			session = sessionFactory.getCurrentSession();	
			usuario = (Usuario) session.get(Usuario.class,login);
		}
		catch(HibernateException e)
		{
			throw new MyException("Error consultando ciudades", e);
		}
		return usuario;
	}


}
