package basicas.service;




import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import basicas.person.Client;
import basicas.person.Employee;

//@Embeddable
public class SchedulingPK  { //implements Serializable

	public SchedulingPK() {
		// TODO Auto-generated constructor stub
	}
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_employee")
	Employee employee;
	
	@ManyToOne
	(fetch=FetchType.EAGER)
	@JoinColumn(name="id_client")
	Client client;

}
