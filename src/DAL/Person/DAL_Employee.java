package DAL.Person;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import basicas.person.Employee;
import DAL.DAL_Generic;

public class DAL_Employee extends DAL_Generic<Employee>{

	public DAL_Employee(EntityManager em) {
		super(em);
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> listAll(){
		List<Employee> retorno = null;
		
		try {
			Query q = getEntityManager().createNamedQuery("Employee.findAll");
			retorno = q.getResultList();
		} catch(PersistenceException e){
			System.out.println(e.getMessage());
		}		
		return  retorno;
	}
	
	public Employee findByName(String name){
		Employee retorno = null;
		
		try {
			Query q = getEntityManager().createNamedQuery("Employee.findByName");
		q.setParameter("name", name);
			retorno = (Employee)q.getSingleResult();
		} catch(PersistenceException e){
			System.out.println(e.getMessage());
		}		
		return  retorno;
	}

}
