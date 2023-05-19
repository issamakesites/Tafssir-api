package com.tafssir.tafssir.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ayat")
public class ayat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long id;
	private Integer NAya;
	private Integer NSoura;
	private String Aya;
	private String Aya2;
	private String Aya4;
	private String Aya3;
	private Integer NPartie;
	private Integer NHizb;
	private Integer NPage;
	private String makki_madani;

	/*public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}*/

	public Integer getNSoura() {
		return NSoura;
	}

	public void setNSoura(Integer NSoura) {
		this.NSoura = NSoura;
	}

	public String getAya() {
		return Aya;
	}

	public String getMakki_madani() {
		return makki_madani;
	}

	public void setMakki_madani(String makki_madani) {
		this.makki_madani = makki_madani;
	}

	public Integer getNPage() {
		return NPage;
	}

	public void setNPage(Integer NPage) {
		this.NPage = NPage;
	}

	public Integer getNHizb() {
		return NHizb;
	}

	public void setNHizb(Integer NHizb) {
		this.NHizb = NHizb;
	}

	public Integer getNPartie() {
		return NPartie;
	}

	public void setNPartie(Integer NPartie) {
		this.NPartie = NPartie;
	}

	public String getAya3() {
		return Aya3;
	}

	public void setAya3(String aya3) {
		Aya3 = aya3;
	}

	public String getAya4() {
		return Aya4;
	}

	public void setAya4(String aya4) {
		Aya4 = aya4;
	}

	public String getAya2() {
		return Aya2;
	}

	public void setAya2(String aya2) {
		Aya2 = aya2;
	}

	public void setAya(String aya) {
		Aya = aya;
	}

	public Integer getNAya() {
		return NAya;
	}

	public void setNAya(Integer NAya) {
		this.NAya = NAya;
	}
}
