package Interface;

import java.io.Serializable;
import java.util.List;

import POJO.Artikel;

public interface ArtikelInterface extends Serializable{
	
	public void save(Artikel artikel);
	public void update(Artikel artikel);
	public List<Artikel> findAll();
	public Artikel findByID(long id);
	public void delete(Artikel artikel);

}
