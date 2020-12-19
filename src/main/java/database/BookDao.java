package database;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.PersistenceException;
import javax.persistence.RollbackException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


public class BookDao {
    //CRUD

    public void create(Book book){
        Transaction transaction = null;

        try (Session session = HibernateConfig.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        }catch (IllegalArgumentException | RollbackException e){
            System.err.println("Błąd zapisu encji Book");
            e.printStackTrace();
        }
    }

    public Book getById(long id){
        return null;
    }

//    public Book getByAuthors(String authors){
//        try(Session session = HibernateConfig.getSessionFactory().openSession()){
//            CriteriaBuilder cb = session.getCriteriaBuilder();
//            CriteriaQuery<Book> query = cb.createQuery(Book.class);
//            Root<Book> table = query.from(Book.class);
//
//            Predicate[] predicates = new Predicate[1];
//            predicates[0] = cb.equal(table.get("authors"), authors);
//
//
//            query.select(table).where(predicates);
//
//            Book book = session.createQuery(query).getSingleResult();
//
//            return book;
//        }catch (PersistenceException e){
//            System.err.println("Błąd zapisu encji Book");
//            e.printStackTrace();
//        }
//        return null;
//    }
    public Book getByTitle(String title) {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Book> query = cb.createQuery(Book.class);
            Root<Book> table = query.from(Book.class);

            Predicate[] predicates = new Predicate[1];

            predicates[0] = cb.equal(table.get("title"), title);

            query.select(table).where(predicates);

            Book book = session.createQuery(query).getSingleResult();

            return book;
        } catch (PersistenceException e) {
            System.err.println("Błąd zapisu encji Book");
            e.printStackTrace();
        }
        return null;
    }

    public Book getByIsbnNumber(String isbn_13) {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Book> query = cb.createQuery(Book.class);
            Root<Book> table = query.from(Book.class);

            Predicate[] predicates = new Predicate[1];

            predicates[0] = cb.equal(table.get("isbn_13"), isbn_13);

            query.select(table).where(predicates);

            Book book = session.createQuery(query).getSingleResult();

            return book;

        } catch (PersistenceException e) {
            System.err.println("Błąd zapisu encji Book");
            e.printStackTrace();
        }
        return null;
    }

    public void update(Book book){

    }

    public void delete(long id) {

        Book book = getById(id);
        if (book != null) {

            Transaction transaction = null;
            try {
                Session session = HibernateConfig.getSessionFactory().openSession();
                transaction = session.beginTransaction();
                session.delete(book);
                transaction.commit();
            } catch (IllegalStateException | RollbackException e) {
                System.err.println("Błąd usuwania Currency");
                e.printStackTrace();

                if (transaction != null) {
                    transaction.rollback();
                }

            }
        }
    }

}
