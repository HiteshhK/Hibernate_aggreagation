package com.hql.aggregation;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionConnect {
	private static SessionFactory factory;
	public static SessionFactory getSessionFactory() {
		try 
		{
			if(factory == null) {
				Configuration cfg = new Configuration().configure("/com/hql/aggregation/hibernate.cfg.xml");
				factory = cfg.buildSessionFactory();
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factory;
	}
}
