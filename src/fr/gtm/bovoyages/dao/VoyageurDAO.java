package fr.gtm.bovoyages.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.bovoyages.entities.DatesVoyage;
import fr.gtm.bovoyages.entities.Destination;
import fr.gtm.bovoyages.entities.Voyageur;

@Singleton
public class VoyageurDAO {

	@PersistenceContext(name="bovoyages") private EntityManager em;
	public VoyageurDAO() {

	}

	public Voyageur save(Voyageur voyageur) {
		em.persist(voyageur);
		return voyageur;
	}

	public void delete(Voyageur voyageur) {
		Voyageur voyageur1 = em.find(Voyageur.class, voyageur.getId());
		em.remove(voyageur1);
	}

	public void update(Voyageur voyageur) {
		em.merge(voyageur);
	}
	
	public Voyageur getVoyageurById(int id) {
		return em.find(Voyageur.class, id);
	}

//	public List<Voyageur> getVoyageur(Voyageur voyageur) {
//		Destination v = em.find(Destination.class, voyageur.getId());
//		List<Voyageur> voyageurs = new ArrayList<>();
//		for (Voyageur voyageur1 : v.getVoyageur()) {
//			voyageurs.add(voyageur1);
//		}
//		return voyageurs;
//	
		
	}


	

