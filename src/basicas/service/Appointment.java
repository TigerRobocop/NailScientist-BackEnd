package basicas.service;

import java.util.Collection;


import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import basicas.polish.Polish;


//@Entity
public class Appointment{

	public Appointment() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	int id;
	
	@OneToOne
	@JoinColumn(name="id_scheduling")
	Scheduling scheduling;
	

	
	
	String comments;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="inventory_control",
	joinColumns={@JoinColumn(name="id_appointment")},
	inverseJoinColumns={@JoinColumn(name="id_polish")})
	Collection<Polish> polishList;
	
/*	public Collection<Polish> getProductsUsed() {
		return productsUsed;
	}
	public void setProductsUsed(Collection<Polish> productsUsed) {
		this.productsUsed = productsUsed;
	}
	*/
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

}
