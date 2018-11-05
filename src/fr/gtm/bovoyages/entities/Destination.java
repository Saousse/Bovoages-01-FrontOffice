package fr.gtm.bovoyages.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="destinations")
@NamedQueries({
	@NamedQuery(name="allDestinations", query="select d from Destination d")
})
public class Destination implements Serializable {

	private static final long serialVersionUID = -4107628210341425846L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pk_destination")
	private int id;
	private String region;
	private String description;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="images", joinColumns=@JoinColumn(name="fk_destination"))
	@Column(name="image")
	private List<String> images;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_destination")
	private List<DatesVoyage> datesVoyages = new ArrayList<>();
//	private List<Voyageur> voyageur = new ArrayList<>();
	
	public Destination() {}
	
	public Destination(String region, String description) {
		this.region = region;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void addDatesVoyage(DatesVoyage dates) {
		datesVoyages.add(dates);
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<DatesVoyage> getDatesVoyages() {
		return datesVoyages;
	}

	public void setDatesVoyages(List<DatesVoyage> datesVoyages) {
		this.datesVoyages = datesVoyages;
	}
	
	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

//	public List<Voyageur> getVoyageur() {
//		return voyageur;
//	}
//
//	public void setVoyageur(List<Voyageur> voyageur) {
//		this.voyageur = voyageur;
//	}
	
}
