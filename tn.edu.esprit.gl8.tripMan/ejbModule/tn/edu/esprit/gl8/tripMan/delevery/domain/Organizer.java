/*package tn.edu.esprit.gl8.tripMan.delevery.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Organizer
 * 
 */
/*
@Entity
@Table(name = "T_ORGANIZER")
public class Organizer implements Serializable {

	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	private List<Trip> trips;

	public Organizer() {
		super();
	}

	public Organizer(String string) {
		this.name = string;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "organizer")
	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

}  */
