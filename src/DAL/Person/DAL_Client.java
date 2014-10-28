package DAL.Person;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import basicas.person.Client;
import DAL.DAL_Generic;

public class DAL_Client extends DAL_Generic<Client>{

	public DAL_Client(EntityManager em) {
		super(em);
	}
	@SuppressWarnings("unchecked")
	public List<Client> listAll(){
		List<Client> retorno = null;
		
		try {
			Query q = getEntityManager().createNamedQuery("Client.findAll");
			retorno = q.getResultList();
		} catch(PersistenceException e){
			System.out.println(e.getMessage());
		}		
		return  retorno;
	}
	
	public Client findByName(String name){
		Client retorno = null;
		
		try {
			Query q = getEntityManager().createNamedQuery("Client.findByName");
		q.setParameter("name", name);
			retorno = (Client)q.getSingleResult();
		} catch(PersistenceException e){
			System.out.println(e.getMessage());
		}		
		return  retorno;
	}

}
