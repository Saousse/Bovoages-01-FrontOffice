package fr.gtm.bovoyages.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="clients")
@NamedQueries({
    @NamedQuery(name="allClient",query="SELECT c FROM Client c WHERE "
            + "c.nom=:nom and c.password=:password")
})
public class Client {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pk_client")
	private int id;
	@Column(name="nom")
	private String nom;
	private String password;
	
	public Client() {}
	
	public Client(int id) {
		this.id = id ;
	}
	public Client(String nom, String password) {
		this.nom = nom;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	/**
	 * ID de synchronisation avec la clé primaire
	 * <h3>Ne doit pas être mis à jour en dehors du DAO</h3>
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPwd() {
		return password;
	}

	public void setPwd(String password) {
		this.password = password;
	}
	  @Override
	    public String toString() {
	        return "Client [id=" + id + ", nom=" + nom + ", password=" + password + "]";
	
}
}