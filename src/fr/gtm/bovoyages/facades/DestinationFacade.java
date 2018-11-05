package fr.gtm.bovoyages.facades;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.gtm.bovoyages.dao.DatesVoyageDAO;
import fr.gtm.bovoyages.dao.DestinationDAO;
import fr.gtm.bovoyages.dao.VoyageurDAO;
import fr.gtm.bovoyages.entities.DatesVoyage;
import fr.gtm.bovoyages.entities.Destination;
import fr.gtm.bovoyages.entities.Voyageur;

@Stateless
public class DestinationFacade {

	@EJB
	private DestinationDAO dao;
	@EJB
	private DatesVoyageDAO daoDV;
	@EJB
	private VoyageurDAO daoV;

	public Destination save(Destination destination) {
		return dao.save(destination);
	}

	public void remove(Destination destination) {
		dao.remove(destination);
	}

	public void update(Destination destination) {
		dao.update(destination);
	}

	public List<Destination> getAllDestinations() {
		return dao.getAllDestinations();
	}
	
	public Destination getDestinationById(int id) {
		return dao.getDestinationById(id);
	}
	
	public Destination getDestinationByIdForAdmin(int id) {
		Destination d = dao.getDestinationById(id);
		Destination destination = new Destination(d.getRegion(), d.getDescription());
		destination.setId(d.getId());
		destination.setDatesVoyages(dao.getDatesVoyages(d));
		return destination;
	}
					
	
	public DatesVoyage getDatesVoyageById(int id){
		return dao.getDatesVoyageById(id);
	}
	
	public List<DatesVoyage> getDatesVoyagesById(int id) {
		return daoDV.getDatesVoyagesById(id);
	}

	public List<DatesVoyage> getDatesVoyages(Destination destination) {
		return dao.getDatesVoyages(destination);
	}

	public Destination getDestinationByDateVoyage(int id) {
		return dao.getDestinationByDateVoyage(id);
	}
								
	public List<DatesVoyage> getDatesVoyages(int id) {
		Destination destination = dao.getDestinationById(id);
		return dao.getDatesVoyages(destination);
	}
//	public List<Voyageur> getVoyageur(int id){
//		Voyageur voyageur = daoV.getVoyageurById(id);
//		
//		return daoV.getVoyageur(voyageur);
//		
//	}

}
