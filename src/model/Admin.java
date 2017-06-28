package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	String nom;
	String prenom;
	String mdp;
	@Id
	String email;

	public Admin(String nom, String prenom, String mdp, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.email = email;
	}

	public Admin() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
