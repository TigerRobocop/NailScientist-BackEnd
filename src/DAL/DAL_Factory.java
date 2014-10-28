package DAL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAL.Person.DAL_Client;
import DAL.Person.DAL_Employee;
import DAL.Polish.DAL_Brand;
import DAL.Polish.DAL_Finish;
import DAL.Polish.DAL_Polish;

public abstract class DAL_Factory {

	private static EntityManager manager;
	private static final EntityManagerFactory factory;
	
	static{
		factory = Persistence.createEntityManagerFactory("HibSQLserver");
		if (manager == null || !manager.isOpen()) {
			manager = factory.createEntityManager();
		}		
	}
	
	public static DAL_Brand getDAL_Brand(){
		DAL_Brand dao = new DAL_Brand(manager);
		//dao.setEntityManager();
		return dao;
	}
	
	public static DAL_Finish getDAL_Finish(){
		DAL_Finish dao = new DAL_Finish(manager);
		//dao.setEntityManager();
		return dao;
	}
	
	public static DAL_Polish getDAL_Polish(){
		DAL_Polish dao = new DAL_Polish(manager);
		//dao.setEntityManager();
		return dao;
	}
	
	public static DAL_Employee getDAL_Employee(){
		DAL_Employee dao = new DAL_Employee(manager);
		return dao;
	}
	
	public static DAL_Client getDAL_Client(){
		DAL_Client dao = new DAL_Client(manager);
		return dao;
	}

}
