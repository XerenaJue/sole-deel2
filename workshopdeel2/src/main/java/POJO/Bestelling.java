package POJO;

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

	public void setBestel_nummer(String bestel_nummer) {
		this.bestel_nummer = bestel_nummer;
	}

	public java.util.Date getBesteldDatum() {
		return besteldDatum;
	}

	public void setBesteldDatum(java.util.Date besteldDatum) {
		this.besteldDatum = besteldDatum;
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
