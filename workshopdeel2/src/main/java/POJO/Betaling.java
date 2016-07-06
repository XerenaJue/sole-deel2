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
@Table(name = "betaling")
public class Betaling {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long betaling_id;
	
	@Column
	private java.util.Date betaalDatum;
	
	@ManyToOne
    @JoinColumn(name="betaalwijze_betaalwijze_id", nullable=false, insertable=false, updatable=false)
	private Betaalwijze betalingswijze;
	
	@ManyToOne
	@JoinColumn(name = "klant_klant_id", nullable = false)
	private Klant klant;
	
	@ManyToOne
	@JoinColumn(name = "factuur_id", nullable = false)
	private Factuur factuur;
	
	@Column
	private String betalingsGegevens;

	public long getBetaling_id() {
		return betaling_id;
	}

	public void setBetaling_id(long betaling_id) {
		this.betaling_id = betaling_id;
	}

	public java.util.Date getBetaalDatum() {
		return betaalDatum;
	}

	public void setBetaalDatum(java.util.Date betaalDatum) {
		this.betaalDatum = betaalDatum;
	}

	public Betaalwijze getBetalingswijze() {
		return betalingswijze;
	}

	public void setBetalingswijze(Betaalwijze betalingswijze) {
		this.betalingswijze = betalingswijze;
	}

	public Klant getKlant() {
		return klant;
	}

	public void setKlant(Klant klant) {
		this.klant = klant;
	}

	public Factuur getFactuur() {
		return factuur;
	}

	public void setFactuur(Factuur factuur) {
		this.factuur = factuur;
	}

	public String getBetalingsGegevens() {
		return betalingsGegevens;
	}

	public void setBetalingsGegevens(String betalingsGegevens) {
		this.betalingsGegevens = betalingsGegevens;
	}
	
	public String toString() {
		return "BetalingId: " + getBetaling_id() + "\nBetaaldatum: " + getBetaalDatum()
			+ "\nBetaalwijze: " + getBetalingswijze() + "\nFactuur: " + getFactuur()
			+ "\nKlant: " + getKlant() + "\nBetalings gegevens: " + getBetalingsGegevens();
	}

}
