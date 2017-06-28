package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Annonce {
	@Id
	@GeneratedValue
	int idA;
	String titre;
	String ville;
	String cathegorie;
	String description;
	int prix;
	boolean image;
	@Temporal(TemporalType.TIMESTAMP)
	Date date;
	@ManyToOne(cascade = CascadeType.REFRESH)
	Membre membre;

	public Annonce(int idA, String titre, String ville, String cathegorie,
			String description, int prix, boolean image, Date date,
			Membre membre) {
		super();
		this.idA = idA;
		this.titre = titre;
		this.ville = ville;
		this.cathegorie = cathegorie;
		this.description = description;
		this.prix = prix;
		this.image = image;
		this.date = date;
		this.membre = membre;
	}
	

	public Annonce() {
		super();
	}


	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCathegorie() {
		return cathegorie;
	}

	public void setCathegorie(String cathegorie) {
		this.cathegorie = cathegorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	public boolean isImage() {
		return image;
	}

	public void setImage(boolean image) {
		this.image = image;
	}



}
