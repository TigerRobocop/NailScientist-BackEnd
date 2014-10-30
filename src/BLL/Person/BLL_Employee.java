package BLL.Person;

import DAL.DAL_Factory;
import DAL.Person.DAL_Employee;
import basicas.person.Employee;

public class BLL_Employee {

	public BLL_Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee isLoginValid(Employee e) throws Exception{
		DAL_Employee dao = DAL_Factory.getDAL_Employee();
		if (e.getLogin() == null) {
			throw new Exception("LOGIN não pode estar nulo");
		}
		if (e.getLogin().trim().equals("")) {
			throw new Exception("Informe o LOGIN");
		}
		if (e.getPassword() == null) {
			throw new Exception("SENHA não pode estar nulo");
		}
		if (e.getPassword().trim().equals("")) {
			throw new Exception("Informe a senha");
		}		
		
		Employee retorno = dao.isLoginValid(e);
		
		if (retorno == null) {
			throw new Exception("LOGIN inválido");
		}
		
		return retorno;
	}
	

}
