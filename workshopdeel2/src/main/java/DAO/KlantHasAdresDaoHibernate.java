package DAO;

import java.util.List;

import Helper.HibernateUtil;
import POJO.KlantHasAdres;

public class KlantHasAdresDaoHibernate {

	HibernateUtil util = new HibernateUtil();

	public void save(KlantHasAdres klantAdres) {
		util.openCurrentSession();
		util.getCurrentSession().save(klantAdres);
		util.closeCurrentSession();

	}

	public void update(KlantHasAdres klantAdres) {
		util.openSessionWithTransaction();
		util.getCurrentSession().update(klantAdres);
		util.closeSessionWithTransaction();

	}

	public List<KlantHasAdres> findAll() {
		util.openCurrentSession();
		List<KlantHasAdres> klantAdresList = (List<KlantHasAdres>) util.getCurrentSession().createQuery("FROM " + KlantHasAdres.class.getSimpleName())
				.list();
		util.closeCurrentSession();
		return klantAdresList;
	}

	public KlantHasAdres findByID(long id) {
		util.openCurrentSession();
		KlantHasAdres klantAdres = util.getCurrentSession().get(KlantHasAdres.class, id);
		util.closeCurrentSession();
		return klantAdres;
	}

	public void delete(KlantHasAdres klantAdres) {
		util.openSessionWithTransaction();
		util.getCurrentSession().delete(klantAdres);
		util.closeSessionWithTransaction();

	}

}
