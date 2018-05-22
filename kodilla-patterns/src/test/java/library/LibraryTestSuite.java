package library;

import com.kodilla.patterns.library.Book;
import com.kodilla.patterns.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("title1", "author1", LocalDate.of(2001, 4, 23));
        Book book2 = new Book("title2", "author2", LocalDate.of(2003, 3, 21));
        Book book3 = new Book("title3", "author3", LocalDate.of(1985, 12, 10));

        Library library = new Library("Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        System.out.println(library);
        //When
        //Then
        Assert.assertEquals(3, library.getBooks().size());

    }
}
