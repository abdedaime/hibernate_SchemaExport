package com.app.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 * 
 * @author hicham-pc
 *
 */
@Entity
public class Departement {
	@Id
	@Column(name="Id_Depart")
	
	private String   nom;
	@OneToMany(mappedBy="departement")
	private List<Employe> emplopyees;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Employe> getEmplopyees() {
		return emplopyees;
	}
	public void setEmplopyees(List<Employe> emplopyees) {
		this.emplopyees = emplopyees;
	}
	public Departement(String nom) {
		super();
		this.nom = nom;
	}
	public Departement(String nom, List<Employe> emplopyees) {
		super();
		this.nom = nom;
		this.emplopyees = emplopyees;
	}
	public Departement() {
		super();
	}
	
	

}
