//package fr.gtm.bovoyages.facades;
//
//import java.util.List;
//import javax.sql.DataSource;
//import fr.gtm.bovoyages.dao.CommandeDAO;
//import fr.gtm.bovoyages.entities.DatesVoyage;
//import fr.gtm.bovoyages.entities.Destination;
//
//public class CommandeFacade {
//	private CommandeDAO dao;
//
//
//	public CommandeFacade(DataSource dataSource) {
//		dao = new CommandeDAO(dataSource);
//	}
//
//	public List<Destination> getDestinationByCommande(String idStr) {
//		long id = Long.parseLong(idStr);
//		return dao.getDestinationByCommande(id);
//	}
//	public List<DatesVoyage> getDatesVoyageCommande(String idStr) {
//		long id = Long.parseLong(idStr);
//		return dao.getDatesVoyageCommande(id);
//	}
//}
