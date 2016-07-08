package DAO;

import java.util.List;

import Helper.HibernateUtil;
import POJO.Betaalwijze;

public class BetaalwijzeDaoHibernate {
	
	HibernateUtil util = new HibernateUtil();
	
	public void save(Betaalwijze betaalwijze) {
		util.openCurrentSession();
		util.getCurrentSession().save(betaalwijze);
		util.closeCurrentSession();
		
	}

	public void update(Betaalwijze betaalwijze) {
		util.openSessionWithTransaction();
		util.getCurrentSession().update(betaalwijze);
		util.closeSessionWithTransaction();
		
	}

	public List<Betaalwijze> findAll() {
		util.openCurrentSession();
		List<Betaalwijze> betaalwijzen = (List<Betaalwijze>)util.getCurrentSession().createQuery("FROM " + Betaalwijze.class.getSimpleName()).list();
		util.closeCurrentSession();
		return betaalwijzen;
	}

	public Betaalwijze findByID(long id) {
		util.openCurrentSession();
		Betaalwijze betaalwijze = util.getCurrentSession().get(Betaalwijze.class, id);
		util.closeCurrentSession();
		return betaalwijze;
	}

	public void delete(Betaalwijze betaalwijze) {
		util.openSessionWithTransaction();
		util.getCurrentSession().delete(betaalwijze);
		util.closeSessionWithTransaction();
		
	}

}
