package DAO;

import java.util.List;

import Helper.HibernateUtil;
import POJO.Bestelling;

public class BestellingDaoHibernate {
	
	HibernateUtil util = new HibernateUtil();
	
	public void save(Bestelling bestelling) {
		util.openCurrentSession();
		util.getCurrentSession().save(bestelling);
		util.closeCurrentSession();
		
	}

	public void update(Bestelling bestelling) {
		util.openSessionWithTransaction();
		util.getCurrentSession().update(bestelling);
		util.closeSessionWithTransaction();
		
	}

	public List<Bestelling> findAll() {
		util.openCurrentSession();
		List<Bestelling> bestellingen = (List<Bestelling>)util.getCurrentSession().createQuery("FROM " + Bestelling.class.getSimpleName()).list();
		util.closeCurrentSession();
		return bestellingen;
	}

	public Bestelling findByID(long id) {
		util.openCurrentSession();
		Bestelling bestelling = util.getCurrentSession().get(Bestelling.class, id);
		util.closeCurrentSession();
		return bestelling;
	}

	public void delete(Bestelling bestelling) {
		util.openSessionWithTransaction();
		util.getCurrentSession().delete(bestelling);
		util.closeSessionWithTransaction();
		
	}

}
