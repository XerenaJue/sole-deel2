package POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "betaalwijze")
public class Betaalwijze {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long betaalwijze_id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "betaalwijze")
	private BetaalwijzeType betaalType;

	public long getBetaalwijze_id() {
		return betaalwijze_id;
	}

	public void setBetaalwijze_id(long betaalwijze_id) {
		this.betaalwijze_id = betaalwijze_id;
	}

	public BetaalwijzeType getBetaalType() {
		return betaalType;
	}

	public void setBetaalType(BetaalwijzeType betaalType) {
		this.betaalType = betaalType;
	}
	public String toString() {
		return "BetaalwijzeId: " + getBetaalwijze_id() + "\nBetaaltype: " + getBetaalType();
	}
}
