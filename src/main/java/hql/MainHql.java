package hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

public class MainHql {

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setLid(104);
        l1.setLaptop_name("XPS");
        l1.setBrand("DELL");

        SessionFactory sc = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sc.openSession();

        Query<Laptop> query = session.createQuery("FROM Laptop", Laptop.class);

        List<Laptop> laptops = query.getResultList();

        session.close();

        Iterator<Laptop> it = laptops.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
//        System.out.println(laptops);
    }
}
