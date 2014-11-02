package facade;

import java.util.List;

import BLL.Person.BLL_Employee;
import BLL.Polish.BLL_Brand;
import BLL.Polish.BLL_Finish;
import BLL.Polish.BLL_Polish;
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

	// ############### BRAND ################
	public void insert(Brand b) throws Exception {
		BLL_Brand dao = new BLL_Brand();
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

	public List<Brand> findByFilter(Brand b) {
		DAL_Brand dao = DAL_Factory.getDAL_Brand();
		return dao.findByFilter(b);
	}

	public Brand update(Brand obj) throws Exception {
		BLL_Brand dao = new BLL_Brand();
		return dao.update(obj);
	}

	public void delete(Brand obj) throws Exception {
		BLL_Brand dao = new BLL_Brand();
		dao.delete(obj);
	}

	// ############### FINISH ################
	public void insert(Finish f) throws Exception {
		BLL_Finish bll = new BLL_Finish();
		bll.insert(f);
	}

	public List<Finish> listAllFinish() {
		DAL_Finish dao = DAL_Factory.getDAL_Finish();
		return dao.listAll();
	}

	public Finish findByNameFinish(String name) {
		DAL_Finish dao = DAL_Factory.getDAL_Finish();
		return dao.findByName(name);
	}

	public List<Finish> findByFilter(Finish f) {
		DAL_Finish dao = DAL_Factory.getDAL_Finish();
		return dao.findByFilter(f);
	}

	public Finish update(Finish obj) throws Exception {
		BLL_Finish dao = new BLL_Finish();
		return dao.update(obj);
	}

	public void delete(Finish obj) throws Exception {
		BLL_Finish dao = new BLL_Finish();
		dao.delete(obj);
	}

	// ############### POLISH ################
	public void insert(Polish p) throws Exception {
		BLL_Polish bll = new BLL_Polish();
		bll.insert(p);
	}

	public List<Polish> listAllPolish() {
		DAL_Polish dao = DAL_Factory.getDAL_Polish();
		return dao.listAll();
	}

	public Polish findByNamePolish(String name) {
		DAL_Polish dao = DAL_Factory.getDAL_Polish();
		return dao.findByName(name);
	}

	public List<Polish> findByFilters(Polish p) {
		DAL_Polish dao = DAL_Factory.getDAL_Polish();
		return dao.findByFilters(p);
	}

	public Polish update(Polish obj) throws Exception {
		BLL_Polish bll = new BLL_Polish();
		return bll.update(obj);
	}

	public void delete(Polish obj) throws Exception {
		BLL_Polish bll = new BLL_Polish();
		bll.delete(obj);
	}

	// ############### EMPLOYEE ################
	public void insert(Employee e) throws Exception {
		BLL_Employee bll = new BLL_Employee();
		bll.insert(e);
	}

	public List<Employee> listAllEmployee() {
		DAL_Employee dao = DAL_Factory.getDAL_Employee();
		return dao.listAll();
	}

	public Employee findByNameEmployee(String name) {
		DAL_Employee dao = DAL_Factory.getDAL_Employee();
		return dao.findByName(name);
	}

	public List<Employee> findByFilters(Employee e) {
		DAL_Employee dao = DAL_Factory.getDAL_Employee();
		return dao.findByFilters(e);
	}

	public Employee update(Employee obj) throws Exception {
		BLL_Employee bll = new BLL_Employee();
		return bll.update(obj);
	}

	public void delete(Employee obj) throws Exception {
		BLL_Employee bll = new BLL_Employee();
		bll.delete(obj);
	}

	public Employee isLoginValid(Employee e) throws Exception {
		BLL_Employee bll = new BLL_Employee();
		return bll.isLoginValid(e);
	}

}
