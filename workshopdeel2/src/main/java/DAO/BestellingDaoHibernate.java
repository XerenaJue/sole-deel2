package DAO;

import java.util.List;

import Helper.HibernateUtil;

public class BestellingDaoHibernate {
	
	HibernateUtil util = new HibernateUtil();
	
	public void save(BestellingDaoHibernate bestelling) {
		util.openCurrentSession();
		util.getCurrentSession().save(bestelling);
		util.closeCurrentSession();
		
	}

	public void update(BestellingDaoHibernate bestelling) {
		util.openCurrentSession();
		util.getCurrentSession().update(bestelling);
		util.closeCurrentSession();
		
	}

	public List<BestellingDaoHibernate> findAll() {
		util.openCurrentSession();
		List<BestellingDaoHibernate> bestellingen = (List<BestellingDaoHibernate>)util.getCurrentSession().createQuery("FROM " + BestellingDaoHibernate.class.getSimpleName()).list();
		util.closeCurrentSession();
		return bestellingen;
	}

	public BestellingDaoHibernate findByID(long id) {
		util.openCurrentSession();
		BestellingDaoHibernate bestelling = util.getCurrentSession().get(BestellingDaoHibernate.class, id);
		util.closeCurrentSession();
		return bestelling;
	}

	public void delete(BestellingDaoHibernate bestelling) {
		util.openCurrentSession();
		util.getCurrentSession().delete(bestelling);
		util.closeCurrentSession();
		
	}

}
