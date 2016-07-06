package Interface;

import java.io.Serializable;
import java.util.List;

import POJO.Adres;

public interface AdresInterface extends Serializable {
	
	public void save(Adres adres);
	public void update(Adres adres);
	public List<Adres> findAll();
	public Adres findByID(long id);
	public void delete(Adres adres);

}
