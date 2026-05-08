package mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {

    public static void main(String[] args) {
        //one to one mapping
        Laptop laptop = new Laptop(1,"HP",23);
        Employee employee = new Employee(1,"Trigram",laptop);

        Configuration cfg = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .addAnnotatedClass(Employee.class)
                .configure();

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tc = session.beginTransaction();

        session.persist(laptop);
        session.persist(employee);

        tc.commit();
        System.out.println(tc.getStatus());
        sf.close();

    }
}
