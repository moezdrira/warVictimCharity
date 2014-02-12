package tn.edu.esprit.gl8.worVictimeChqrity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: user
 * 
 */
@Entity
public class User implements Serializable {

	private int cin;
	private String name;
	private String country;
	private int age;
	private java.util.List<Donate> donates;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	@Id
	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@OneToMany(mappedBy = "user")
	public java.util.List<Donate> getDonates() {
		return donates;
	}

	public void setDonates(java.util.List<Donate> donates) {
		this.donates = donates;
	}

}
