package basicas.service;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;

import basicas.person.Client;
import basicas.person.Employee;
import basicas.polish.Polish;

@Entity
public class Scheduling {

	public Scheduling() {
		// TODO Auto-generated constructor stub
	}

	@Id
	int id;

	@OneToOne
	@JoinColumn(name = "id_client")
	Client client;

	@OneToOne
	@JoinColumn(name = "id_employee")
	Employee employee;

	Date timeScheduling;
	Date timeAppointment;

	@Type(type = "yes_no")
	boolean isConfirmed;

	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name="id_appointment") Appointment appointment;
	 */

	String comments;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "inventory_control", 
	joinColumns = { @JoinColumn(name = "id_schedule") }, 
	inverseJoinColumns = { @JoinColumn(name = "id_polish") 
	})
	Collection<Polish> polishList;

	public Date getTimeScheduling() {
		return timeScheduling;
	}

	public void setTimeScheduling(Date timeScheduling) {
		this.timeScheduling = timeScheduling;
	}

	public Date getTimeAppointment() {
		return timeAppointment;
	}

	public void setTimeAppointment(Date timeAppointment) {
		this.timeAppointment = timeAppointment;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	/*
	 * public Appointment getAppointment() { return appointment; } public void
	 * setAppointment(Appointment appointment) { this.appointment = appointment;
	 * }
	 */

}
