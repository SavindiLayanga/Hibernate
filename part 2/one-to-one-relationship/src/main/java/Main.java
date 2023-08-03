import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book=new Book();
        book.setISBN(001);
        book.setName("Amma");

        Author author=new Author();
        author.setAuthorId("a001");
        author.setName("Martin Wikramasinghe");

        author.setbook(book);
        Session session=FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(book);
        session.persist(author);

        transaction.commit();
        session.close();
    }
}
