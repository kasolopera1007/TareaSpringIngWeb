/**
 * Author: Oscar Camilo Lopera Lopera 1.152.439.790
 * Ingenieria Web
 * Clase ClienteDAOImplementacion
 */

package co.edu.udea.dao.imp;

//Libreria a utiliozar

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import co.edu.udea.dao.ClienteDAO;
import co.edu.udea.dto.Cliente;
import co.edu.udea.exception.MyException;


public class ClienteDAOImp implements ClienteDAO{
	
private SessionFactory sessionFactory;
	
	

	//Mtodo que retorna una sessionFactory
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	//Metodo que ingresa los parametros de un sessionFactory
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//Implementacion del metodo que obtiene una lista de clientes y en caso de error captura la excepcion.
	@Override
	public List<Cliente> obtener() throws MyException {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Session session= null;
		Criteria criteria =null;
		
		try{
			session = sessionFactory.getCurrentSession();
			criteria = session.createCriteria(Cliente.class);
			criteria.addOrder(Order.asc("fechaCreacion"));  //ordenar criteria
			clientes = criteria.list();
		}catch(HibernateException e)
		{
			throw new MyException("Error consultando la lista de clientes", e);
		}
		return clientes;
	}

	
	//Implementacion del metodo que se encarga de gusradar un cliente nuevo y en caso de error captura la excepcion.
	@Override
	public void guardar(Cliente cliente) throws MyException {
		// TODO Auto-generated method stub
				Session session = null;
				//Transaction tx = null;
				
				try{
					session = sessionFactory.openSession();
					session.save(cliente);
					session.flush();
				}catch(HibernateException e)
				{
					throw new MyException("Ocurrió un error guardando el cliente",e);
				}
		
	}

}
