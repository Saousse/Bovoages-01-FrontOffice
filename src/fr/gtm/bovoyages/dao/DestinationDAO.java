package fr.gtm.bovoyages.dao;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.bovoyages.entities.DatesVoyage;
import fr.gtm.bovoyages.entities.Destination;

@Singleton
public class DestinationDAO {

	@PersistenceContext(name = "bovoyages")
	private EntityManager em;

	public DestinationDAO() {

	}

	public List<Destination> getAllDestinations() {
		List<Destination> destinations = em.createNamedQuery("allDestinations", Destination.class).getResultList();
		return destinations;
	}

	public Destination getDestinationById(int id) {
		return em.find(Destination.class, id);
	}
	
	public Destination getDestinationByDateVoyage(int id) {
		return em.find(Destination.class, id);
	}

	public List<DatesVoyage> getDatesVoyages(Destination destination) {
		Destination d = em.find(Destination.class, destination.getId());
		List<DatesVoyage> datesVoyages = new ArrayList<>();
		for (DatesVoyage datesVoyage : d.getDatesVoyages()) {
			datesVoyages.add(datesVoyage);
		}
		return datesVoyages;
	}
	
	public DatesVoyage getDatesVoyageById(int id) {
		return em.find(DatesVoyage.class, id);
	}
	

//<---------------------------------------------------------------------------------------------------->
//<------------------------------------------C-R-U-D--------------------------------------------------->	
//<---------------------------------------------------------------------------------------------------->	
	public void saveOrUpdate(Destination destination) {
		if (destination.getId() == 0) {
			save(destination);
		} else {
			update(destination);
		}
	}

	public Destination save(Destination destination) {
		em.persist(destination);
		return destination;
	}

	public void update(Destination destination) {
		em.merge(destination);
	}

	public void remove(Destination destination) {
		Destination d1 = em.find(Destination.class, destination.getId());
		em.remove(d1);
	}

}
