package Interface;

import java.io.Serializable;
import java.util.List;

import POJO.AdresType;

public interface AdresTypeInterface extends Serializable{
	
	public void save(AdresType adresType);
	public void update(AdresType adresType);
	public List<AdresType> findAll();
	public AdresType findByID(long id);
	public void delete(AdresType adresType);

}
