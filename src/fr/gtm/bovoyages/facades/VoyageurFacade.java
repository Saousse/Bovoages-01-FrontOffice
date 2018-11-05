package fr.gtm.bovoyages.facades;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import fr.gtm.bovoyages.dao.VoyageurDAO;
import fr.gtm.bovoyages.entities.Voyageur;

@Singleton
public class VoyageurFacade {
	
	@EJB private VoyageurDAO dao;
	
	public VoyageurFacade() {

	}
	
	public Voyageur save(Voyageur voyageur) {
		return dao.save(voyageur);
	}

	public void delete(Voyageur voyageur) {
		dao.delete(voyageur);
	}

	public void upddate(Voyageur voyageur) {
		dao.update(voyageur);
	}

//	public Voyageur getVoyageurById(String idStr) {
//		
//		int id = Integer.parseInt(idStr);
//		return dao.getVoyageurById(id);
//	}

}
