package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Autor1", "Title1", 1923, "001"));
        books.add(new Book("Autor1", "Title2", 1933, "002"));
        books.add(new Book("Autor2", "Title3", 2000, "003"));
        books.add(new Book("Autor3", "Title4", 2007, "004"));
        books.add(new Book("Autor4", "Title5", 2001, "005"));
        books.add(new Book("Autor4", "Title6", 1999, "006"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println(median);
        assertEquals(median, 2000);
    }
}
