package IteratorsAndComparators.Library;

import IteratorsAndComparators.Book.Book;

import java.util.Iterator;

public class Library implements Iterable<Book>{

    private class LibIterator implements Iterator<Book> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.length;
        }

        @Override
        public Book next() {
            return books[index++];
        }
    }

    private Book[] books;

    public Library(Book... book) {
        books = book;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }
}
