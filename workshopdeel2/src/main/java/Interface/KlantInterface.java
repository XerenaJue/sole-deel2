package Interface;

import java.io.Serializable;
import java.util.List;

import POJO.Klant;

public interface KlantInterface extends Serializable{
	
	public void save(Klant klant);
	public void update(Klant klant);
	public List<Klant> findAll();
	public Klant findByID(long id);
	public void delete(Klant klant);

}
