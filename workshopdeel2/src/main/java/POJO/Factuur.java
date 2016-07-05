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
@Table(name = "factuur")
public class Factuur {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long factuur_id;
	
	@Column
	private String factuur_nummer;
	
	@Column
	private java.util.Date factuurDatum;
	
	@OneToMany(mappedBy = "factuur", targetEntity = Betaling.class, fetch = FetchType.LAZY)
	private Set<Betaling> betalingSet;
	
	@ManyToOne
	@JoinColumn(name = "bestelling_id")
	private Bestelling bestelling;

	public long getFactuur_id() {
		return factuur_id;
	}

	public void setFactuur_id(long factuur_id) {
		this.factuur_id = factuur_id;
	}

	public String getFactuur_nummer() {
		return factuur_nummer;
	}

	public void setFactuur_nummer(String factuur_nummer) {
		this.factuur_nummer = factuur_nummer;
	}

	public java.util.Date getFactuurDatum() {
		return factuurDatum;
	}

	public void setFactuurDatum(java.util.Date factuurDatum) {
		this.factuurDatum = factuurDatum;
	}

	public Set<Betaling> getBetalingSet() {
		return betalingSet;
	}

	public void setBetalingSet(Set<Betaling> betalingSet) {
		this.betalingSet = betalingSet;
	}

	public Bestelling getBestelling() {
		return bestelling;
	}

	public void setBestelling(Bestelling bestelling) {
		this.bestelling = bestelling;
	}
	@Override
	public String toString() {
		return "FactuurId: " + getFactuur_id() + "\nFactuurnummer: " + getFactuur_nummer()
			+ "\nFactuurdatum: " + getFactuurDatum() + "\nBestelling: " + getBestelling()
			+ "\nBetaling: " + getBetalingSet();
	}
}
