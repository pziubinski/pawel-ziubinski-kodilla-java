package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Duma i uprzedzenie", "Jane Austen", LocalDate.of(2011, 1, 1));
        Book book2 = new Book("Władca Pierścieni", "JRR Tolkien", LocalDate.of(2012, 2, 2));
        Book book3 = new Book("Zabić drozda", "Harper Lee", LocalDate.of(2013, 3, 3));
        Book book4 = new Book("Rok 1984", "George Orwell", LocalDate.of(2014, 4, 4));

        Library library = new Library("Biblioteka");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Biblioteka skopiowana plytko");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka skopiowana gleboko");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(3, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
