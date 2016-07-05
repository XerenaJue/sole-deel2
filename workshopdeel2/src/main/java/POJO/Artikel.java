package POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artikel")
public class Artikel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long artikel_id;
	@Column
	private String artikel_nummer;
	@Column
	private String artikel_omschrijving;
	@Column
	private double artikel_prijs;

	public long getArtikel_id() {
		return artikel_id;
	}

	public void setArtikel_id(long artikel_id) {
		this.artikel_id = artikel_id;
	}

	public String getArtikel_nummer() {
		return artikel_nummer;
	}

	public void setArtikel_nummer(String artikel_nummer) {
		this.artikel_nummer = artikel_nummer;
	}

	public String getArtikel_omschrijving() {
		return artikel_omschrijving;
	}

	public void setArtikel_omschrijving(String artikel_omschrijving) {
		this.artikel_omschrijving = artikel_omschrijving;
	}

	public double getArtikel_prijs() {
		return artikel_prijs;
	}

	public void setArtikel_prijs(double artikel_prijs) {
		this.artikel_prijs = artikel_prijs;
	}

	public String toString() {
		return "ArtikelId: " + getArtikel_id() + "\nArtikelNummer: " + getArtikel_nummer()
			+ "\nArtikelomschrijving: " + getArtikel_omschrijving() + "\nArtikelprijs: " + getArtikel_prijs();
	}
}
