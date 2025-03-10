package demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
        Alien telusko = new Alien();
        telusko.setAid(101);
        telusko.setAname("Navin");
        telusko.settech("Java");

        Configuration con = new Configuration();
        con.addAnnotatedClass(Alien.class);
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();

        session.persist(telusko);

        tx.commit();

        
    }
}
