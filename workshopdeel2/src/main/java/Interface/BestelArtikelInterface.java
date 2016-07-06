package Interface;

import java.io.Serializable;
import java.util.List;

import POJO.BestelArtikel;

public interface BestelArtikelInterface extends Serializable {

	public void save(BestelArtikel bestelArtikel);
	public void update(BestelArtikel bestelArtikel);
	public List<BestelArtikel> findAll();
	public BestelArtikel findByID(long id);
	public void delete(BestelArtikel bestelArtikel);

}
