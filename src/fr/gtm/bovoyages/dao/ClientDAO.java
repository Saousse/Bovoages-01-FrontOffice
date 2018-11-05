package fr.gtm.bovoyages.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.gtm.bovoyages.entities.Client;



@Singleton
public class ClientDAO {
    @PersistenceContext(name="bovoyages") private EntityManager em;

    public ClientDAO() {
        
    }
   public Client getAllClient(String nom , String password){
   	
	   List<Client> clients = em.createNamedQuery("allClient",Client.class)
               .setParameter("nom", nom )
               .setParameter("password", password )
               .getResultList();
        if (clients == null || clients.size() == 0) {
            return null;
        }
       return clients.get(0);

    }
   public Client save(Client client) {
		em.persist(client);
		return client;
	}

	public void delete(Client client) {
		Client voyage1 = em.find(Client.class, client.getId());
		em.remove(voyage1);
	}

	public void update(Client client) {
		em.merge(client);
	}
	
	public Client getClientById(int id) {
		return em.find(Client.class, id);
	}
	

	}
		


