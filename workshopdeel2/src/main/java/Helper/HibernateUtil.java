package Helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private Session currentSession;
	private Transaction currentTransaction;

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	private static SessionFactory getSessionFactory() {
		return new Configuration().configure().buildSessionFactory();
	}

	public Session openCurrentSession() {
		return currentSession = getSessionFactory().openSession();
	}

	public void closeCurrentSession() {
		currentSession.close();
	}

	public Session openSessionWithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}

	public void closeSessionWithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}


}
