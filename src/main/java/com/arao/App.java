package com.arao;

import org.hibernate.classic.Session;

import com.arao.common.user.User;
import com.arao.persistence.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();
        user.setName("arao_2");
        user.setEmailId("arao_2@arao.com");
        user.setPassword("arao");
        user.setIsMale(true);
        session.save(user);
        session.getTransaction().commit();
    }
}
