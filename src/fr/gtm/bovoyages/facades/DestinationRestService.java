package fr.gtm.bovoyages.facades;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.gtm.bovoyages.dao.DestinationDAO;
import fr.gtm.bovoyages.entities.Destination;




@Path("/destinations")
public class DestinationRestService {
	@EJB
	private DestinationDAO dao;

	@Path("id/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Destination getDestinationById(@PathParam("id") int id) {
		return dao.getDestinationById(id);
	}

	@Path("/add")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Destination save(Destination destination) {
		dao.save(destination);
		return destination;
	}
}
