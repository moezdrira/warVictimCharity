package tn.edu.esprit.gl8.worVictimeChqrity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: donate
 *
 */
@Entity

public class Donate implements Serializable {

	
	private int id;
	private String moncom;
	private int frequence;
	private int other;
	private User user;
	private static final long serialVersionUID = 1L;

	public Donate() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getMoncom() {
		return this.moncom;
	}

	public void setMoncom(String moncom) {
		this.moncom = moncom;
	}   
	public int getFrequence() {
		return this.frequence;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}   
	public int getOther() {
		return this.other;
	}

	public void setOther(int other) {
		this.other = other;
	}
	
	@ManyToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
   
}
