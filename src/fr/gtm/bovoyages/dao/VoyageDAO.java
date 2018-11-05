package fr.gtm.bovoyages.dao;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.bovoyages.entities.Voyage;

@Singleton
public class VoyageDAO {

	@PersistenceContext(name="bovoyages") private EntityManager em;
		public VoyageDAO() {

	}

	public Voyage save(Voyage voyage) {
		em.persist(voyage);
		return voyage;
	}

	public void delete(Voyage voyage) {
		Voyage voyage1 = em.find(Voyage.class, voyage.getId());
		em.remove(voyage1);
	}

	public void update(Voyage voyage) {
		em.merge(voyage);
	}
	
	public Voyage getVoyageById(int id) {
		return em.find(Voyage.class, id);
	}
	public void saveOrUpdate(Voyage voyage) {
		if(voyage.getId()==0) {
			save(voyage);
		}else {
			update(voyage);
		}	

	}
}
