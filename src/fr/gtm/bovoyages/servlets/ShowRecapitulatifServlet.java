package fr.gtm.bovoyages.servlets;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.bovoyages.dao.ClientDAO;
import fr.gtm.bovoyages.entities.Client;
import fr.gtm.bovoyages.entities.DatesVoyage;
import fr.gtm.bovoyages.entities.Destination;
import fr.gtm.bovoyages.entities.Voyageur;
import fr.gtm.bovoyages.facades.DestinationFacade;



@WebServlet("/ShowRecapitulatifServlet")
public class ShowRecapitulatifServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
		@EJB private DestinationFacade ds;
		@EJB private ClientDAO dao;
		

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			String idStr1 = request.getParameter("idDestination");
			String idStr2 = request.getParameter("idDatesVoyage");
		// idStr3 = request.getParameter("idVoyageur");
			int id1 = Integer.parseInt(idStr1);
			int id2 = Integer.parseInt(idStr2);
		//	int id3 = Integer.parseInt(idStr3);
			DatesVoyage datesVoyage = ds.getDatesVoyageById(id2);
			Destination destination = ds.getDestinationByDateVoyage(id1);
		//	List<Voyageur> voyageurs = ds.getVoyageur(id3);
			request.setAttribute("destination", destination);
			request.setAttribute("datesVoyage", datesVoyage);
		//	request.setAttribute("voyageur", voyageurs);
			
	
			
			String nom = request.getParameter("nom");
			String password = request.getParameter("password");
			if(password!=null && !password.isEmpty() && nom!=null && !nom.isEmpty() ) {
				Client client = new Client(nom, password);
				dao.save(client);
			}
		
			Client clients = dao.getAllClient(nom , password);
			request.setAttribute("Client", clients);
			String page = "/show_recapitulatif.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
			rd.forward(request, response);
			
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
