package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        return libraryDatabase.listBooksInHandsOf(libraryUser);
    }

    public boolean rentABook(LibraryUser libraryUser, Book book) {

        return true;
    }


}
/*
dariusz-haranczyk Twoja metoda w Library będzie wyglądała tak:
public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
    return libraryDatabase.listBooksInHandsOf(LibraryUser libraryUser);
}
 */