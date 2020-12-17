package http.database;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.jaxb.cfg.spi.JaxbCfgHibernateConfiguration;

public class BookDao {
    //CRUD

    public void create(Book book){
        Transaction transaction = null;

        try (Session session = HibernateConfig.getSessionFactory().openSession()) {

        }
    }

}
