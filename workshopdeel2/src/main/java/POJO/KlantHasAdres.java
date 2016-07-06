package POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="klant_has_adres")
public class KlantHasAdres {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long klant_has_adres_id;
	
	@ManyToOne
	@JoinColumn(name = "klant_klant_id", nullable = false)
	private Klant klant;
	
	@ManyToOne
	@JoinColumn(name = "adres_adres_id", nullable = false)
	private Adres adres;
	
	@Enumerated(EnumType.STRING)
	@JoinColumn(name = "adres_adres_type_id", nullable = false)
	private AdresTypeType adresType;

	public long getKlant_has_adres_id() {
		return klant_has_adres_id;
	}

	public void setKlant_has_adres_id(long klant_has_adres_id) {
		this.klant_has_adres_id = klant_has_adres_id;
	}

	public Klant getKlant() {
		return klant;
	}

	public void setKlant(Klant klant) {
		this.klant = klant;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public AdresTypeType getAdresType() {
		return adresType;
	}

	public void setAdresType(AdresTypeType adresType) {
		this.adresType = adresType;
	}
	
	@Override
	public String toString() {
		return "KlantAdresId: " + getKlant_has_adres_id() + "\nKlant: " + getKlant()
			+ "\nAdres: " + getAdres() + "\nAdresType: " + getAdresType();
	}

}
