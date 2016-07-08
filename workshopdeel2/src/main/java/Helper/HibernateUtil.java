package Helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
		private Session currentSession;
	        private static SessionFactory sessionFactory;
		private Transaction currentTransaction;
		private static StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//haal een sessie op uit de sessionFactory
		public Session openCurrentSession() {
			return currentSession = getSessionFactory().openSession();		
		}
		
		//haal een sessie op en open een nieuwe transactie
		public Session openSessionWithTransaction() {
			currentSession = getSessionFactory().openSession();
			currentTransaction = currentSession.beginTransaction();
			return currentSession;
		}
		
		public void closeCurrentSession() {
			currentSession.close();		
		}
		
		public void closeSessionWithTransaction() {
			currentTransaction.commit();
			currentSession.close();
		}

		
		public static void DestroyRegistery() {
			StandardServiceRegistryBuilder.destroy( registry );
		}
		
		private static SessionFactory getSessionFactory() {		
			if (sessionFactory == null) {
	                    sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	                }
			return sessionFactory;
		}

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
	}

