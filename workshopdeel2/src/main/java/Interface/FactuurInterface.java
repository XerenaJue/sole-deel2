package Interface;

import java.io.Serializable;
import java.util.List;

import POJO.Factuur;

public interface FactuurInterface extends Serializable {
	
	public void save(Factuur factuur);
	public void update(Factuur factuur);
	public List<Factuur> findAll();
	public Factuur findByID(long id);
	public void delete(Factuur factuur);

}
