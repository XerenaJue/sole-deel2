package DAO;

import java.util.List;

import Helper.HibernateUtil;
import POJO.Account;

public class AccountDaoHibernate {
	
	HibernateUtil util = new HibernateUtil();
	
	public void save(Account account) {
		util.openCurrentSession();
		util.getCurrentSession().save(account);
		util.closeCurrentSession();
	}
	public void update(Account account) {
		util.openSessionWithTransaction();
		util.getCurrentSession().update(account);
		util.closeSessionWithTransaction();
	}
	public void delete(Account account) {
		util.openSessionWithTransaction();
		util.getCurrentSession().delete(account);
		util.closeSessionWithTransaction();
	}
	public Account findById(long id) {
		util.openCurrentSession();
		Account account = (Account)util.getCurrentSession().get(Account.class, id);
		util.closeSessionWithTransaction();
		return account;
	}
	public List<Account> findAll() {
		util.openCurrentSession();
		List<Account> accounts = (List<Account>)util.getCurrentSession().createQuery("FROM " + Account.class.getSimpleName()).list();
		util.closeCurrentSession();
		return accounts;
	}

}
