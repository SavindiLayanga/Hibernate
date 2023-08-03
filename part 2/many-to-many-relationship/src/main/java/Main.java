import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthorId("a001");
        author.setName("Martin Wickramasinghe");

        Author author2 = new Author();
        author2.setAuthorId("a002");
        author2.setName("Kumarathunga Munidasa");

        Book book = new Book();
        book.setISBN(001);
        book.setName("Amma");

        Book book1 = new Book();
        book1.setISBN(002);
        book1.setName("hathpana");

        List<Author> authorList = new ArrayList<>();
        authorList.add(author);
        authorList.add(author2);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(book1);

        author.setBookList(bookList);
        author2.setBookList(bookList);

        book.setAuthorList(authorList);
        book1.setAuthorList(authorList);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(author);
        session.persist(author2);
        session.persist(book);
        session.persist(book1);

        transaction.commit();
        session.close();
    }
}
