package DAO;

import java.util.List;

import Helper.HibernateUtil;
import Interface.KlantInterface;
import POJO.Klant;

public class KlantDaoHibernate implements KlantInterface {
	
	HibernateUtil util = new HibernateUtil();

	public void save(Klant klant) {
		util.openCurrentSession();
		util.getCurrentSession().save(klant);
		util.closeCurrentSession();

	}

	public void update(Klant klant) {
		util.openSessionWithTransaction();
		util.getCurrentSession().update(klant);
		util.closeSessionWithTransaction();
	}

	public List<Klant> findAll() {
		util.openCurrentSession();
		List<Klant> klanten = (List<Klant>) util.getCurrentSession().createQuery("FROM " + Klant.class.getSimpleName()).list();
		util.closeCurrentSession();
		return klanten;
	}

	public Klant findByID(long id) {
		util.openCurrentSession();
		Klant klant = util.getCurrentSession().get(Klant.class, id);
		util.closeCurrentSession();
		return klant;
	}

	public void delete(Klant klant) {
		util.openSessionWithTransaction();
		util.getCurrentSession().delete(klant);
		util.closeSessionWithTransaction();

	}
	
	
}
