package com.hql.aggregation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;


/**
 * Hello world!
 *
 */
public class App 
{
	private static SessionFactory factory;
    public static void main( String[] args )
    {
       factory = SessionConnect.getSessionFactory();
       Session session = factory.openSession();
       Transaction t = session.beginTransaction();
       /**
        * For HQL
        */
       /*Query query = session.createQuery("select Count from Employees e");
       List<Employees> employees = query.getResultList();
       System.out.println(employees);*/
       
       /**
        * for Native Query
        */
       NativeQuery nq = session.createNativeQuery("select avg(salary) as c from Employees");
       double count = ((BigDecimal)nq.uniqueResult()).doubleValue();
       session.close();
       System.out.println(count);
/*		List employees = new ArrayList();
		employees = session.createQuery("From Employees").list();
		System.out.println("|S.NO|FName|LName|EMP_ID PrimaryKey|");
		Employees e1 = new Employees();
		for(int i = 0 ; i < employees.size(); i ++)
		{
			e1 =(Employees) employees.get(i);
			System.out.println("------------------------");
			System.out.println("| "+ (i+1) + " | "+e1.getFIRST_NAME() + " | " + e1.getLAST_NAME()+" | "+e1.getEMPLOYEE_ID());
		}*/
       
    }
}
