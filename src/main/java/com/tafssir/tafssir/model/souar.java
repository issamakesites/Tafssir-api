package com.tafssir.tafssir.model;
import jakarta.persistence.*;

@Entity
@Table(name = "souar")
public class souar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer NSoura;

	private String nom;
	@Column(name = "makki_madani")
	private String makkiMadani;
/*	public souar() {

	}
*/
	public Integer getNSoura() {
		return NSoura;
	}

	/*public souar(Integer NSoura, String nom, String makkiMadani) {
		this.NSoura = NSoura;
		this.nom = nom;
		this.makkiMadani = makkiMadani;
	}*/

	public String getMakkiMadani() {
		return makkiMadani;
	}

	public void setMakkiMadani(String makkiMadani) {
		this.makkiMadani = makkiMadani;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNSoura(Integer NSoura) {
		this.NSoura = NSoura;
	}
}
