package Interface;

import java.io.Serializable;
import java.util.List;

import POJO.Betaalwijze;

public interface BetaalwijzeInterface extends Serializable{
	
	public void save(Betaalwijze betaalwijze);
	public void update(Betaalwijze betaalwijze);
	public List<Betaalwijze> findAll();
	public Betaalwijze findByID(long id);
	public void delete(Betaalwijze betaalwijze);

}
