import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args)
    {
        College s = new College(18,"Roger",21);

        College c = null;

        System.out.print(s.toString());

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClasses(College.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();
//        Transaction ts = session.beginTransaction();
//        session.persist(s);
//        ts.commit();
        c=session.find(College.class,18);
        session.close();
        sf.close();
        System.out.println(c);


    }
}
