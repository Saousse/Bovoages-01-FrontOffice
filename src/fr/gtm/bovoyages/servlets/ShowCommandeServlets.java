package fr.gtm.bovoyages.servlets;

import java.io.IOException;
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
import fr.gtm.bovoyages.facades.DestinationFacade;

@WebServlet("/ShowCommandeServlets")
public class ShowCommandeServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private DestinationFacade ds;
	@EJB 
	private ClientDAO dao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idStr1 = request.getParameter("idDestination");
		String idStr2 = request.getParameter("idDateVoyage");
		int id1 = Integer.parseInt(idStr1);
		int id2 = Integer.parseInt(idStr2);
		DatesVoyage datesVoyage = ds.getDatesVoyageById(id2);
		Destination destination = ds.getDestinationByDateVoyage(id1);

		request.setAttribute("datesVoyage", datesVoyage);
		request.setAttribute("destination", destination);
		
		String nom = request.getParameter("nom");
		String password = request.getParameter("password");
		if(password!=null && !password.isEmpty() && nom!=null && !nom.isEmpty() ) {
			Client client = new Client(nom, password);
			dao.save(client);
		}
	
		Client clients = dao.getAllClient(nom , password);
		request.setAttribute("Client", clients);


		String page = "/show_commande.jsp";

		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
