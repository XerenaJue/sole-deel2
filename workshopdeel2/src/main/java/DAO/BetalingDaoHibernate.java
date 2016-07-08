package DAO;

import java.util.List;

import Helper.HibernateUtil;
import POJO.Betaling;

public class BetalingDaoHibernate {
	
	HibernateUtil util = new HibernateUtil();

	public void save(Betaling betaling) {
		util.openCurrentSession();
		util.getCurrentSession().save(betaling);
		util.closeCurrentSession();
		
	}

	public void update(Betaling betaling) {
		util.openSessionWithTransaction();
		util.getCurrentSession().update(betaling);
		util.closeSessionWithTransaction();
		
	}

	public List<Betaling> findAll() {
		util.openCurrentSession();
		List<Betaling> betalingen = (List<Betaling>)util.getCurrentSession().createQuery("FROM " + Betaling.class.getSimpleName()).list();
		util.closeCurrentSession();
		return betalingen;
	}

	public Betaling findByID(long id) {
		util.openCurrentSession();
		Betaling betaling = util.getCurrentSession().get(Betaling.class, id);
		util.closeCurrentSession();
		return betaling;
	}

	public void delete(Betaling betaling) {
		util.openSessionWithTransaction();
		util.getCurrentSession().delete(betaling);
		util.closeSessionWithTransaction();
		
	}

}
