/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Clase CiudadDAOImplementacion
 */

package co.edu.udea.dao.imp;

//Libreria a utiliozar

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import co.edu.udea.dao.CiudadDAO;
import co.edu.udea.dto.Ciudad;
import co.edu.udea.exception.MyException;


public class CiudadDAOImp implements CiudadDAO{
	
private SessionFactory sessionFactory;
	
	//Metodo que retorna una sessionFactory
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	//Metodo que ingresa los parametros de un sessionFactory
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//Implementacion del metodo que se encarga de obtener una lista de ciudades y en caso de error captura la excepcion.
	@Override
	public List<Ciudad> obtener() throws MyException {
		List<Ciudad> ciudades = new ArrayList<>();
		Session session = null;
		
	try {
		session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Ciudad.class);
		ciudades = criteria.list();
	} 
	catch (HibernateException e) {
		throw new MyException("Error consultando ciudades", e);
		}
	
	return ciudades;
	}

	//Implementacion del metodo obtener ciudad segun un codigo y en caso de error captura la excepcion.
	@Override
	public Ciudad obtener(Long codigo) throws MyException {
		Ciudad ciudad= new Ciudad();
		Session session = null;
		try{
			session = sessionFactory.getCurrentSession();
			ciudad = (Ciudad) session.get(Ciudad.class,codigo);
		}
		catch(HibernateException e)
		{
			throw new MyException("Error consultando ciudades", e);
		}
		return ciudad;
	}

	//Implementacion del metodo guardar ciudad teniendo en cuenta el usuario que la crea y en caso de error captura la excepcion.
	@Override
	public void guardar(Ciudad ciudad) throws MyException {
		Session session = null;
		try
		{
			session = sessionFactory.getCurrentSession();
			session.save(ciudad);
		}
		catch(HibernateException e)
		{
			throw new MyException("Error consultando ciudades", e);
		}
			
	}

}
