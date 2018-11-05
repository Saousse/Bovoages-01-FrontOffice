package fr.gtm.bovoyages.dto;

import java.io.Serializable;

import fr.gtm.bovoyages.entities.Destination;

public class DestinationDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private final int id;
	private String region;
	private String description;
	private String imageVignette;
	private DatesVoyageDTO datesVoyagePromo;
	
	public DestinationDTO(Destination destination) {
		this.id = destination.getId();
		this.region = destination.getRegion();
		this.description = destination.getDescription();
	}

	public int getId() {
		return id;
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

	public String getImageVignette() {
		return imageVignette;
	}

	public void setImageVignette(String imageVignette) {
		this.imageVignette = imageVignette;
	}

	public DatesVoyageDTO getDatesVoyagePromo() {
		return datesVoyagePromo;
	}

	public void setDatesVoyagePromo(DatesVoyageDTO datesVoyagePromo) {
		this.datesVoyagePromo = datesVoyagePromo;
	}

	
	
}
