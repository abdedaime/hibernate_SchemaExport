package com.app.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author hicham-pc
 *
 */

@Entity
@Table(name = "Employe")
public class Employe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	@ManyToOne
	@JoinColumn(referencedColumnName = "Id_Depart", name = "departement")
	private Departement departement;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public Employe(int id, String nom, String prenom, Departement departement) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.departement = departement;
	}

	public Employe(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		
		
	}
	public Employe() {
		super();
	}
	
	
}
