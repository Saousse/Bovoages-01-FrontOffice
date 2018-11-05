package fr.gtm.bovoyages.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.bovoyages.entities.DatesVoyage;
import fr.gtm.bovoyages.entities.Destination;

@Singleton
public class DatesVoyageDAO {
	@PersistenceContext(name = "bovoyages")
	private EntityManager em;

	public DatesVoyageDAO() {

	}

	public List<DatesVoyage> getDatesVoyagesById(int id) {
		Destination destination = em.find(Destination.class, id);
		List<DatesVoyage> datesVoyages = new ArrayList<>();
		for (DatesVoyage datesVoyage : destination.getDatesVoyages()) {
			datesVoyages.add(datesVoyage);
		}
		return datesVoyages;
	}

	public DatesVoyage getDatesVoyageById(int id) {
		DatesVoyage datesVoyage = em.find(DatesVoyage.class, id);
		return datesVoyage;
	}
	public List<DatesVoyage> getDatesVoyagesByDestination(Destination destination){	
	List<DatesVoyage> datesVoyages = em.createNamedQuery("DatesByDestination",DatesVoyage.class).getResultList();
    return datesVoyages;
	}

	public List<DatesVoyage> getDatesVoyages(Destination destination) {
		Destination d = em.find(Destination.class, destination.getId());
		List<DatesVoyage> datesVoyages = new ArrayList<>();
		for (DatesVoyage datesVoyage : d.getDatesVoyages()) {
			datesVoyages.add(datesVoyage);
		}
		return datesVoyages;
	}
	

// <---------------------------------------------------------------------------------------------------->
// <------------------------------------------C-R-U-D--------------------------------------------------->
// <---------------------------------------------------------------------------------------------------->

	public void saveOrUpdate(DatesVoyage datesVoyage) {
		if (datesVoyage.getId() == 0) {
			save(datesVoyage);
		} else {
			update(datesVoyage);
		}
	}
	
	public DatesVoyage save(DatesVoyage datesVoyage) {
		em.persist(datesVoyage);
		return datesVoyage;
	}

	public void update(DatesVoyage datesVoyage) {
		em.merge(datesVoyage);
	}

	public void remove(DatesVoyage datesVoyage) {
		DatesVoyage dv1 = em.find(DatesVoyage.class, datesVoyage.getId());
		em.remove(dv1);
	}

}
