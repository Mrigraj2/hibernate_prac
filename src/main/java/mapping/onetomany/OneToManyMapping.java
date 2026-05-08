package mapping.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OneToManyMapping {

    public static void main(String[] args) {
        Mobile m1 = new Mobile(101,"ASUS",16);
        Mobile m2 = new Mobile(102,"SAMSUNG",8);

        User u1 = new User(1,"Mrigraj", List.of(m1,m2));
        m1.setUser(u1);
        m2.setUser(u1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClasses(Mobile.class, User.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(m1);
        session.persist(m2);
        session.persist(u1);

        tx.commit();
        session.close();
    }
}
