package POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long account_id;
	
	@Column
	private String account_naam;
	
	@Column
	private java.util.Date create_datum;
	
	@ManyToOne
	@JoinColumn(name = "klant_id", nullable = false)
	private Klant klant;

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public String getAccount_naam() {
		return account_naam;
	}

	public void setAccount_naam(String account_naam) {
		this.account_naam = account_naam;
	}

	public java.util.Date getCreate_datum() {
		return create_datum;
	}

	public void setCreate_datum(java.util.Date create_datum) {
		this.create_datum = create_datum;
	}

	public Klant getKlant() {
		return klant;
	}

	public void setKlant(Klant klant) {
		this.klant = klant;
	}

	public String toString() {
		return "AccountId: " + getAccount_id() + "\nAccountnaam: " + getAccount_naam()
			+ "\nAccountDatum: " + getCreate_datum() + "\nKlant: " + getKlant();
	}
}
