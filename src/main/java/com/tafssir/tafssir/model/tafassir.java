package com.tafssir.tafssir.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tafassir")
public class tafassir {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer NTafsir;
	private String nom;
	private Integer an;
	private String nom_S;
	private Integer approuve;

	private String description;

	public Integer getnTafsir() {
		return NTafsir;
	}

	public void setnTafsir(Integer nTafsir) {
		this.NTafsir = nTafsir;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getAn() {
		return an;
	}

	public void setAn(Integer an) {
		this.an = an;
	}

	public String getNom_S() {
		return nom_S;
	}

	public void setNom_S(String nom_S) {
		this.nom_S = nom_S;
	}

	public Integer getApprouve() {
		return approuve;
	}

	public void setApprouve(Integer approuve) {
		this.approuve = approuve;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
