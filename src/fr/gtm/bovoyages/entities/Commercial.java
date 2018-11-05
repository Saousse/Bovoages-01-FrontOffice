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
@Table(name="commercial")
@NamedQueries({
	@NamedQuery(name="allCommercials",query="SELECT c FROM Commercial c WHERE "
			+ "c.username=:username and c.password=:password")
})
public class Commercial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private String username;
	private String password;
	//***************************************************
	public Commercial() {}

	//***************************************************
	
	public Commercial(String username, String password) {
		this.username = username;
		this.password = password;
	}
	//***************************************************
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//****************************************************
	@Override
	public String toString() {
		return "Commercial [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
}
