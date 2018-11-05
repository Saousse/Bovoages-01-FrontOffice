package fr.gtm.bovoyages.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.bovoyages.entities.Commercial;




@Singleton
public class CommercialDAO {
	@PersistenceContext(name="bovoyages") private EntityManager em;

	public CommercialDAO() {
		
	}
	
	public Commercial getCommercial(String username, String password){
		List<Commercial> commercials = em.createNamedQuery("allCommercials",Commercial.class)
				.setParameter("username", username)
				.setParameter("password",password)
				.getResultList();
		if (commercials == null || commercials.size() == 0) {
			return null;
		}
		return commercials.get(0);

	}
}
