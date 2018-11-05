package fr.gtm.bovoyages.facades;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import fr.gtm.bovoyages.dao.VoyageDAO;
import fr.gtm.bovoyages.entities.Voyage;

@Singleton
public class VoyageFacade {

	@EJB private VoyageDAO dao;

	public VoyageFacade() {

	}
	
	public Voyage save(Voyage voyage) {
		return dao.save(voyage);
	}

	public void delete(Voyage voyage) {
		dao.delete(voyage);
	}

	public void update(Voyage voyage) {
		dao.update(voyage);
	}

	public Voyage getVoyageById(String idStr) {
		
		int id = Integer.parseInt(idStr);
		return dao.getVoyageById(id);
	}
}
