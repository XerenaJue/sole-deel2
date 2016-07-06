package Service;

import java.util.List;

import DAO.KlantDaoHibernate;
import POJO.Klant;

public class KlantService {
	
	private static KlantDaoHibernate klantDao;
	
	public KlantService() {
		klantDao = new KlantDaoHibernate();
	}
	
	public void save(Klant klant) {
		klantDao.save(klant);
	}
	public void delete(Klant klant) {
		klantDao.delete(klant);
	}
	public void update(Klant klant) {
		klantDao.update(klant);
	}
	public Klant findById(long id) {
		return klantDao.findByID(id);
	}
	public List<Klant> findAll() {
		return klantDao.findAll();
	}

}
