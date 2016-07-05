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
@Table(name = "adres_type")
public class AdresType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long adres_type_id;
	
	@Enumerated(EnumType.STRING)
	private AdresTypeType adres_type;

	public long getAdres_type_id() {
		return adres_type_id;
	}

	public void setAdres_type_id(long adres_type_id) {
		this.adres_type_id = adres_type_id;
	}

	public AdresTypeType getAdres_type() {
		return adres_type;
	}

	public void setAdres_type(AdresTypeType adres_type) {
		this.adres_type = adres_type;
	}
	public String toString() {
		return "AdresTypeId: " + getAdres_type_id() + "\nAdresType: " + getAdres_type();
	}
}
