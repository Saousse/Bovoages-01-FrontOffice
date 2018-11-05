package fr.gtm.bovoyages.facades;

import javax.ejb.EJB;

import fr.gtm.bovoyages.dao.ClientDAO;

import fr.gtm.bovoyages.entities.Client;



public class ClientFacade {
	
	@EJB private ClientDAO dao;
	

	
	public Client save(Client client) {
		return dao.save(client);
	}

	public void delete(Client client) {
		dao.delete(client);
	}

	public void upddate(Client client) {
		dao.update(client);
	}

//	public Client getClientId(int id) {	
//		
//		return dao.getClientById(id);
//	}

}

