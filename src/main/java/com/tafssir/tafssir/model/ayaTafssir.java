package com.tafssir.tafssir.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ayaTafssir {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer nAya;

	private Integer nTafsir;

	private String texte;

	private String soura;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getnAya() {
		return nAya;
	}

	public void setnAya(Integer nAya) {
		this.nAya = nAya;
	}

	public Integer getnTafsir() {
		return nTafsir;
	}

	public void setnTafsir(Integer nTafsir) {
		this.nTafsir = nTafsir;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getSoura() {
		return soura;
	}

	public void setSoura(String soura) {
		this.soura = soura;
	}
}
