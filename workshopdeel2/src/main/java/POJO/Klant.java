package POJO;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "klant")
public class Klant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long klant_id;
	@Column(nullable = false)
	private String voornaam;
	@Column(nullable = false)
	private String achternaam;
	@Column
	private String tussenvoegsel;
	@Column(nullable = false)
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Bestelling.class, mappedBy = "klant", orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<Bestelling> bestellingSet;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Bestelling.class, mappedBy = "klant", orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<Factuur> factuurSet;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Account.class, mappedBy = "klant", orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<Account> accountSet;
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = KlantHasAdres.class, mappedBy = "klant", orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<KlantHasAdres> adresSet;

	public long getKlant_id() {
		return klant_id;
	}

	public void setKlant_id(long klant_id) {
		this.klant_id = klant_id;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public String getTussenvoegsel() {
		return tussenvoegsel;
	}

	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Bestelling> getBestellingSet() {
		return bestellingSet;
	}

	public void setBestellingSet(Set<Bestelling> bestellingSet) {
		this.bestellingSet = bestellingSet;
	}

	public Set<Factuur> getFactuurSet() {
		return factuurSet;
	}

	public void setFactuurSet(Set<Factuur> factuurSet) {
		this.factuurSet = factuurSet;
	}

	public Set<Account> getAccountSet() {
		return accountSet;
	}

	public void setAccountSet(Set<Account> accountSet) {
		this.accountSet = accountSet;
	}

	public Set<KlantHasAdres> getAdresSet() {
		return adresSet;
	}

	public void setAdresSet(Set<KlantHasAdres> adresSet) {
		this.adresSet = adresSet;
	}
	
	public String toString() {
		return "Voornaam: " + getVoornaam() + "\nAchternaam: " + getAchternaam()
			+ "\nTussenvoegsel: " + getTussenvoegsel() + "\nEmail: " + getEmail();
	}

}
