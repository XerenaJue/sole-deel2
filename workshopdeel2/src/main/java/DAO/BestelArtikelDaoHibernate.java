package DAO;

import java.util.List;

import Helper.HibernateUtil;
import POJO.BestelArtikel;

public class BestelArtikelDaoHibernate {
	
	HibernateUtil util = new HibernateUtil();
	
	public void save(BestelArtikel bestelArtikel) {
		util.openCurrentSession();
		util.getCurrentSession().save(bestelArtikel);
		util.closeCurrentSession();
		
	}

	public void update(BestelArtikel bestelArtikel) {
		util.openSessionWithTransaction();
		util.getCurrentSession().update(bestelArtikel);
		util.closeSessionWithTransaction();
		
	}

	public List<BestelArtikel> findAll() {
		util.openCurrentSession();
		List<BestelArtikel> bestelArtikelen = (List<BestelArtikel>)util.getCurrentSession().createQuery("FROM " + 
				BestelArtikel.class.getSimpleName()).list();
		util.closeCurrentSession();
		return bestelArtikelen;
	}

	public BestelArtikel findByID(long id) {
		util.openCurrentSession();
		BestelArtikel adres = util.getCurrentSession().get(BestelArtikel.class, id);
		util.closeCurrentSession();
		return adres;
	}

	public void delete(BestelArtikel bestelArtikel) {
		util.openSessionWithTransaction();
		util.getCurrentSession().delete(bestelArtikel);
		util.closeSessionWithTransaction();
		
	}

}
