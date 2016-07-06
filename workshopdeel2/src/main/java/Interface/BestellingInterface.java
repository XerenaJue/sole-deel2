package Interface;

import java.io.Serializable;
import java.util.List;

import POJO.Bestelling;

public interface BestellingInterface extends Serializable{
	
	public void save(Bestelling bestelling);
	public void update(Bestelling bestelling);
	public List<Bestelling> findAll();
	public Bestelling findByID(long id);
	public void delete(Bestelling bestelling);

}
