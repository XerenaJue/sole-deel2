package POJO;

import java.util.Date;
import java.util.Random;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bestelling")
public class Bestelling {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long bestelling_id;

	@Column
	private String bestel_nummer;

	@Column
	private java.util.Date besteldDatum;

	@OneToMany(mappedBy = "bestelling", targetEntity = BestelArtikel.class, fetch = FetchType.EAGER)
	private Set<BestelArtikel> bestelArtikelSet;

	@OneToMany(mappedBy = "bestelling", targetEntity = Factuur.class, fetch = FetchType.LAZY)
	private Set<Factuur> factuurSet;

	@ManyToOne
	@JoinColumn(name = "klant_klant_id", nullable = false)
	private Klant klant;

	public long getBestelling_id() {
		return bestelling_id;
	}

	public void setBestelling_id(long bestelling_id) {
		this.bestelling_id = bestelling_id;
	}

	public String getBestel_nummer() {
		return bestel_nummer;
	}

	public void setBestel_nummer() {
		
		int length = 10;
		Random random = new Random();
		String characters = "ABCDEFGHIJLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < length; i++) {
			sb.append(characters.charAt(random.nextInt(characters.length())));
		}
		bestel_nummer = sb.toString();
	}

	public java.util.Date getBesteldDatum() {
		return besteldDatum;
	}

	public void setBesteldDatum() {
		this.besteldDatum = new Date();
	}

	public Klant getKlant() {
		return klant;
	}

	public void setKlant(Klant klant) {
		this.klant = klant;
	}

	public Set<BestelArtikel> getBestelArtikelSet() {
		return bestelArtikelSet;
	}

	public void setBestelArtikelSet(Set<BestelArtikel> bestelArtikelSet) {
		this.bestelArtikelSet = bestelArtikelSet;
	}

	public Set<Factuur> getFactuurSet() {
		return factuurSet;
	}

	public void setFactuurSet(Set<Factuur> factuurSet) {
		this.factuurSet = factuurSet;
	}
	public String toString() {
		return "BestellingId: " + getBestelling_id() + "\nBestelnummer: " + getBestel_nummer()
			+ "\nBesteldatum: " + getBesteldDatum() + "\nArtikelen: " + getBestelArtikelSet()
			+ "\nFacturen: " + getFactuurSet() + "\nKlant: " + getKlant();
	}
}
