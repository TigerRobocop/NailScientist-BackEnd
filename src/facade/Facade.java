package facade;

import java.util.List;

import DAL.DAL_Factory;
import DAL.Person.DAL_Employee;
import DAL.Polish.DAL_Brand;
import DAL.Polish.DAL_Finish;
import DAL.Polish.DAL_Polish;
import basicas.person.Employee;
import basicas.polish.Brand;
import basicas.polish.Finish;
import basicas.polish.Polish;

public class Facade {

	// private EntityManager entityManager;

	public Facade() {

	}

	// ############### BRAND ################
	public void insert(Brand b) {
		DAL_Brand dao = DAL_Factory.getDAL_Brand();
		dao.insert(b);
	}

	public List<Brand> listAllBrand() {
		DAL_Brand dao = DAL_Factory.getDAL_Brand();
		return dao.listAll();
	}

	public Brand findByNameBrand(String name) {
		DAL_Brand dao = DAL_Factory.getDAL_Brand();
		return dao.findByName(name);
	}
	
	public  List<Brand> findByFilter(Brand b){
		DAL_Brand dao = DAL_Factory.getDAL_Brand();
		return dao.findByFilter(b);
	}

	public Brand update(Brand obj) {
		DAL_Brand dao = DAL_Factory.getDAL_Brand();
		return dao.update(obj);
	}

	public void delete(Brand obj) {
		DAL_Brand dao = DAL_Factory.getDAL_Brand();
		dao.delete(obj);
	}

	// ############### FINISH ################
	public void insert(Finish f) {
		DAL_Finish dao = DAL_Factory.getDAL_Finish();
		dao.insert(f);
	}

	public List<Finish> listAllFinish() {
		DAL_Finish dao = DAL_Factory.getDAL_Finish();
		return dao.listAll();
	}

	public Finish findByNameFinish(String name) {
		DAL_Finish dao = DAL_Factory.getDAL_Finish();
		return dao.findByName(name);
	}
	
	public  List<Finish> findByFilter(Finish f){
		DAL_Finish dao = DAL_Factory.getDAL_Finish();
		return dao.findByFilter(f);
	}

	public Finish update(Finish obj) {
		DAL_Finish dao = DAL_Factory.getDAL_Finish();
		return dao.update(obj);
	}

	public void delete(Finish obj) {
		DAL_Finish dao = DAL_Factory.getDAL_Finish();
		dao.delete(obj);
	}

	// ############### POLISH ################
	public void insert(Polish p) {
		DAL_Polish dao = DAL_Factory.getDAL_Polish();
		dao.insert(p);
	}

	public List<Polish> listAllPolish() {
		DAL_Polish dao = DAL_Factory.getDAL_Polish();
		return dao.listAll();
	}

	public Polish findByNamePolish(String name) {
		DAL_Polish dao = DAL_Factory.getDAL_Polish();
		return dao.findByName(name);
	}
	
	public List<Polish> findByFilters(Polish p){
		DAL_Polish dao = DAL_Factory.getDAL_Polish();
		return dao.findByFilters(p);
	}

	public Polish update(Polish obj) {
		DAL_Polish dao = DAL_Factory.getDAL_Polish();
		return dao.update(obj);
	}

	public void delete(Polish obj) {
		DAL_Polish dao = DAL_Factory.getDAL_Polish();
		dao.delete(obj);
	}
	
	// ############### POLISH ################
		public void insert(Employee e) {
			DAL_Employee dao = DAL_Factory.getDAL_Employee();
			dao.insert(e);
		}

		public List<Employee> listAllEmployee() {
			DAL_Employee dao = DAL_Factory.getDAL_Employee();
			return dao.listAll();
		}

		public Employee findByNameEmployee(String name) {
			DAL_Employee dao = DAL_Factory.getDAL_Employee();
			return dao.findByName(name);
		}

		public Employee update(Employee obj) {
			DAL_Employee dao = DAL_Factory.getDAL_Employee();
			return dao.update(obj);
		}

		public void delete(Employee obj) {
			DAL_Employee dao = DAL_Factory.getDAL_Employee();
			dao.delete(obj);
		}
}
