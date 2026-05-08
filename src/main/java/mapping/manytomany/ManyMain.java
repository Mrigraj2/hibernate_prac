package mapping.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class ManyMain {

    public static void main(String[] args) {
        Engineer e1 = new Engineer();
        e1.setEid(1);
        e1.setName("Mrigraj");
        e1.setStack("DevOps");

        Engineer e2 = new Engineer();
        e2.setEid(2);
        e2.setName("Riya");
        e2.setStack("HPC");

        Engineer e3 = new Engineer();
        e3.setEid(3);
        e3.setName("Aman");
        e3.setStack("JavaScript");

        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();

        l1.setLid(101);
        l1.setLaptop_name("XPERION");
        l1.setBrand("DELL");

        l2.setLid(102);
        l2.setLaptop_name("ROG");
        l2.setBrand("ASUS");

        l3.setLid(103);
        l3.setLaptop_name("MACBOOK AIR");
        l3.setBrand("APPLE");

        e1.setLaptops(Arrays.asList(l1,l2));
        e2.setLaptops(Arrays.asList(l2,l3));
        e3.setLaptops(Arrays.asList(l1,l3));

        l1.setEngineers(List.of(e1,e3));
        l2.setEngineers(List.of(e1,e2));
        l3.setEngineers(List.of(e2,e3));


        SessionFactory sf = new Configuration()
                .addAnnotatedClasses(Engineer.class)
                .addAnnotatedClasses(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction tc = session.beginTransaction();

        session.persist(l1);session.persist(l2);session.persist(l3);
        session.persist(e1);session.persist(e2);session.persist(e3);

        tc.commit();

        session.close();
    }
}
