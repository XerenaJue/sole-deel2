package POJO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adres")
public class Adres {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long adres_id;
	@Column
	private String straatnaam;
	@Column
	private String postcode;
	@Column
	private String toevoeging;
	@Column
	private int huisnummer;
	@Column
	private String woonplaats;

	@OneToOne
	@JoinColumn(name = "adres_type_id")
	private AdresType adresType;

	public long getAdres_id() {
		return adres_id;
	}

	public void setAdres_id(long adres_id) {
		this.adres_id = adres_id;
	}

	public String getStraatnaam() {
		return straatnaam;
	}

	public void setStraatnaam(String straatnaam) {
		this.straatnaam = straatnaam;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getToevoeging() {
		return toevoeging;
	}

	public void setToevoeging(String toevoeging) {
		this.toevoeging = toevoeging;
	}

	public int getHuisnummer() {
		return huisnummer;
	}

	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}

	public String getWoonplaats() {
		return woonplaats;
	}

	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}

	public AdresType getAdresType() {
		return adresType;
	}

	public void setAdresType(AdresType adresType) {
		this.adresType = adresType;
	}
	
	public String toString() {
		return "Straatnaam: " + getStraatnaam() + "\nHuisnummer: " + getHuisnummer()
			+ "\nToevoeging: " + getToevoeging() + "\nPostcode: " + getPostcode() 
			+ "\nWoonplaats: " + getWoonplaats();
	}

}
