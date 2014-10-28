package DAL.Service;

import javax.persistence.EntityManager;

import basicas.service.Scheduling;
import DAL.DAL_Generic;

public class DAL_Scheduling extends DAL_Generic<Scheduling>{

	public DAL_Scheduling(EntityManager em) {
		super(em);
	}

}
