package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //GIVEN
        MedianAdapter medianAdapter = new MedianAdapter();
        Book wiedzmin = new Book("Andrzej Sapkowski", "Wiedźmin", 1990, "1");
        Book wladca = new Book("J.R.R. Tolkien", "Władca Pierścieni", 1954, "2");
        Book diuna = new Book("Frank Herbert", "Diuna", 1985, "3");

        Set<Book> books = new HashSet<>();
        books.add(wiedzmin);
        books.add(wladca);
        books.add(diuna);

        //WHEN
        int median = medianAdapter.publicationYearMedian(books);

        //THEN
        System.out.println(median);
        Assert.assertEquals(1985, median);
    }
}
