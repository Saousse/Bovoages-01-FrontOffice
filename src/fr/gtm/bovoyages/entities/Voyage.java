package fr.gtm.bovoyages.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voyages")
public class Voyage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_voyage")
	private long id;
	@Column(name = "region")
	private String region;
	@Column(name = "descriptif")
	private String descriptif;
    @OneToOne(cascade=CascadeType.ALL)
	private DatesVoyage datesVoyage;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "voyages_voyageurs", joinColumns = @JoinColumn(name = "fk_voyage"), inverseJoinColumns = @JoinColumn(name = "fk_voyageur"))
	private List<Voyageur> voyageurs = new ArrayList<>();

	public Voyage() {
	}

	public Voyage(String region, String descriptif) {
		this.region = region;
		this.descriptif = descriptif;
	}

	public Voyage(String region, String descriptif, DatesVoyage datesVoyage) {
		this.region = region;
		this.descriptif = descriptif;
		this.datesVoyage = datesVoyage;
	}

	public Voyage(String region, String descriptif, DatesVoyage datesVoyage, List<Voyageur> voyageurs) {
		this.region = region;
		this.descriptif = descriptif;
		this.datesVoyage = datesVoyage;
		this.voyageurs = voyageurs;
	}

	public void addVoyageur(Voyageur voyageur) {
		voyageurs.add(voyageur);
	}

	public double getPrixHT() {
		return voyageurs.size() * datesVoyage.getPrixHT();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public List<Voyageur> getVoyageurs() {
		return voyageurs;
	}

	public void setVoyageurs(List<Voyageur> voyageurs) {
		this.voyageurs = voyageurs;
	}

	public DatesVoyage getDatesVoyage() {
		return datesVoyage;
	}

	public void setDatesVoyage(DatesVoyage datesVoyage) {
		this.datesVoyage = datesVoyage;
	}

}
