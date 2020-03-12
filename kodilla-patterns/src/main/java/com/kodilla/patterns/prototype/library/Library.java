package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book book : books) {
            clonedLibrary.getBooks().add(book);
        }

        return clonedLibrary;
    }

    @Override
    public String toString() {
        String str = name + ":\n";
        int i = 1;
        for(Book book : books) {
            str += "  " + i + ": Author: " + book.author + ", title: " + book.getTitle() + ", year of publication: " + book.getPublicationDate().getYear() +"\n";
            i++;
        }

        return str;
    }
}

