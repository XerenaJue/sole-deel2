package Interface;

import java.io.Serializable;
import java.util.List;

import POJO.Betaling;

public interface BetalingInterface extends Serializable{
	
	public void save(Betaling betaling);
	public void update(Betaling betaling);
	public List<Betaling> findAll();
	public Betaling findByID(long id);
	public void delete(Betaling betaling);

}
