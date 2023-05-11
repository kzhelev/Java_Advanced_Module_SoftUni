package IteratorsAndComparators.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int compare = o1.getTitle().compareTo(o2.getTitle());

        if (o1.getTitle().compareTo(o2.getTitle()) == 0) {
            compare = o1.getYear() - o2.getYear();
        }
        return compare;
    }
}
