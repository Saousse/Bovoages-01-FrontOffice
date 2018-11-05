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

import fr.gtm.bovoyages.entities.Client;
import fr.gtm.bovoyages.entities.DatesVoyage;
import fr.gtm.bovoyages.entities.Destination;
import fr.gtm.bovoyages.facades.ClientFacade;
import fr.gtm.bovoyages.facades.DestinationFacade;



@WebServlet("/ShowDetailDestinationsServlets")
public class ShowDetailDestinationsServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB private DestinationFacade ds;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String idStr= request.getParameter("id");
		int id=Integer.parseInt(idStr);
		
		Destination destination = ds.getDestinationById(id);
		List<DatesVoyage> datesVoyages = ds.getDatesVoyagesById(id);
		
		request.setAttribute("destination", destination);
		request.setAttribute("datesVoyages", datesVoyages);
		
		
		String page = "/show_detail_destinations.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
