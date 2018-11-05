//package fr.gtm.bovoyages.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.sql.DataSource;
//
//import fr.gtm.bovoyages.entities.DatesVoyage;
//import fr.gtm.bovoyages.entities.Destination;
//
//public class CommandeDAO {
//	@PersistenceContext(name = "bovoyages")
//	 private EntityManager em;
//
//	
//
//	public List<DatesVoyage> getDatesVoyageCommande(long id) {
//		List<DatesVoyage> datesVoyages = new ArrayList<>();
//		try (Connection connexion = dataSource.getConnection()) {
//			String sequenceSQL = "SELECT * FROM dates_voyages WHERE pk_date_voyage = ? ";
//			PreparedStatement pstmt = connexion.prepareStatement(sequenceSQL);
//			pstmt.setLong(1, id);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				datesVoyages.add(createDatesVoyageCommande(rs));
//			}
//		} catch (SQLException e) {
//			LOG.log(Level.SEVERE, "Erreur", e);
//		}
//		return datesVoyages;
//	}
//
//	private Destination createDestinationCommande(ResultSet rs) throws SQLException {
//		Destination destination = new Destination();
//		destination.setRegion(rs.getString("region"));
//		return destination;
//	}
//
//	private DatesVoyage createDatesVoyageCommande(ResultSet rs) throws SQLException {
//		DatesVoyage datesVoyages = new DatesVoyage();
//		//datesVoyages.setId_pk(rs.getLong("pk_date_voyage"));
//		datesVoyages.setId(rs.getLong(1));
//		datesVoyages.setDateAller(rs.getDate(2));
//		datesVoyages.setDateRetour(rs.getDate(3));
//		datesVoyages.setPrixHT(rs.getDouble(4));
//		return datesVoyages;
//	}
//}
