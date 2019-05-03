///**
// * 
// */
//package com.practice.interview.redhat.webservice;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;
//
///**
// * Hibernate Util file to get session.
// * 
// * @author Arpit
// * @version 1.0
// * @since 2019-02-15
// */
//public class HibernateUtil {
//
//	private static SessionFactory sessionFactory = null;
//
//	static {
//		try {
//			loadSessionFactory();
//		} catch (Exception e) {
//			System.err.println("Exception while initializing hibernate util.. ");
//			e.printStackTrace();
//		}
//	}
//
//	public static void loadSessionFactory() {
//
//		Configuration configuration = new Configuration();
//		configuration.configure("/redhat-hibernate.cfg.xml");
//		configuration.addAnnotatedClass(Customer.class);
//		ServiceRegistry srvcReg = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
//				.buildServiceRegistry();
//		sessionFactory = configuration.buildSessionFactory(srvcReg);
//	}
//
//	public static Session getSession() throws HibernateException {
//
//		Session retSession = null;
//		try {
//			retSession = sessionFactory.openSession();
//		} catch (Throwable t) {
//			System.err.println("Exception while getting session.. ");
//			t.printStackTrace();
//		}
//		if (retSession == null) {
//			System.err.println("session is discovered null");
//		}
//
//		return retSession;
//	}
//}
