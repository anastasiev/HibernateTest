package us.study.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.study.dto.Address;
import ua.study.dto.UserDetails;

import java.util.Date;

/**
 * Created by dmytro on 24.02.16.
 */
public class HibernateTest {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();
//        userDetails.setUserId(1); //autoincrement
        userDetails.setUserName("First name");
        userDetails.setDescription("User description goes here");
        userDetails.setJoinDate(new Date());

        Address address = new Address();
        address.setCity("Kyiv");
        address.setPincode("0163");
        address.setState("NY");
        address.setStreet("myStreet");
        userDetails.setAddress(address);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDetails);
        session.getTransaction().commit();
        session.close();

        userDetails = null;
        session = sessionFactory.openSession();
        session.beginTransaction();
        userDetails = session.get(UserDetails.class, 1);
        session.getTransaction().commit();
        session.close();
        System.out.println("Name: " + userDetails.getUserName());

    }
}
