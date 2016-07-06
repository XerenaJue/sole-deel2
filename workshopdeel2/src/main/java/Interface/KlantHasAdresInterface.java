package Interface;

import java.io.Serializable;
import java.util.List;

import POJO.KlantHasAdres;

public interface KlantHasAdresInterface extends Serializable {
	
	public void save(KlantHasAdres klantAdres);
	public void update(KlantHasAdres klantAdres);
	public List<KlantHasAdres> findAll();
	public KlantHasAdres findByID(long id);
	public void delete(KlantHasAdres klantAdres);

}
