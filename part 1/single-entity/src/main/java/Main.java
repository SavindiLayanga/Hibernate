import entity.Book;
import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setISBN(001);
        book.setName("Amma");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //insert a book
        session.persist(book);

        //search book by ID
        Book book1 = session.get(Book.class, "001");
        System.out.println(book1.toString());

        //update book
        book.setName("Amma");
        session.update(book);

        //delete book
        session.remove(book);

        transaction.commit();

        session.close();
    }
}
