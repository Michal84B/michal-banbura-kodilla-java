package com.kodilla.testing.library;

import org.junit.*;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {
    LibraryDatabase libraryDatabaseMock;
    BookLibrary bookLibrary;
    List<Book> resultListOfBooks;
    @Before
    public void before(){
        libraryDatabaseMock = mock(LibraryDatabase.class);
        bookLibrary = new BookLibrary(libraryDatabaseMock);
        resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
    }
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        assertTrue(false);
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        assertTrue(false);
    }
}
