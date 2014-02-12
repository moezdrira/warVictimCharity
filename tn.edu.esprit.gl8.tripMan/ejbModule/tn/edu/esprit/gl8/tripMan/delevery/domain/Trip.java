/*package tn.edu.esprit.gl8.tripMan.delevery.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Trip
 * 
 */
/*
@Entity
@Table(name = "T_TRIP")
public class Trip implements Serializable {

	private int id;
	private String destination;
	private Date dateOfDeparture;
	private static final long serialVersionUID = 1L;

	private Organizer organizer;

	public Trip() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDateOfDeparture() {
		return this.dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	@ManyToOne(cascade=CascadeType.PERSIST)
	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}

	public Trip(String destination, Date dateOfDeparture) {
		super();
		this.destination = destination;
		this.dateOfDeparture = dateOfDeparture;
	}

}
*/